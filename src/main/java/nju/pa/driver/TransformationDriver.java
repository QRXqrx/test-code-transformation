package nju.pa.driver;

import nju.pa.exception.InvalidCmdOptionException;
import nju.pa.transform.TestCodeTransformer;
import nju.pa.util.IOUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main class, Driver will drive the whole transformation process.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class TransformationDriver {

    private static final String EMPTY_PARAM = "";
    private static final String NEW_LINE = System.lineSeparator();
    // option - param
    private static final Map<String, String> paramsMap = new HashMap<>();

//    private static final String CHARSET = "ISO-8859-1";
//    private static final String CHARSET = "KSC5601";
//    private static final String CHARSET = "UTF-8";

    static {
        paramsMap.put("-d", EMPTY_PARAM); // -d: A directory which contains .java files want transforming.
        paramsMap.put("-f", EMPTY_PARAM); // -f: A single file which wants transforming.
        paramsMap.put("-c", EMPTY_PARAM); // -c: In generated java file: comment on or off(true or false).
    }

    public static void main(String[] args) {
        // Parse cmd params.
        for(int i = 0 ; i < args.length; i += 2) {
            String option = args[i];
            if(!isCmdOption(option))
                throw new InvalidCmdOptionException(exceptionMsg(option));
            // TODO - Change this part if param classes is enlarged.
            paramsMap.put(option, args[i + 1]);
        }

        System.out.println("[paramsMap]" + paramsMap);

        boolean commentOn = true;
        if(!emptyOption("-c"))
            commentOn = Boolean.parseBoolean(paramsMap.get("-c"));

        if(!emptyOption("-d")) { // -d is not empty
            String dirPath = paramsMap.get("-d");
            List<File> testJavaFiles = IOUtil.getAllFilesBySuffix(dirPath, IOUtil.JAVA_SUFFIX);
            // Transform all java files.
            TestCodeTransformer transformer = new TestCodeTransformer();
            for (File testJavaFile : testJavaFiles) {
                transformer.setJavaFile(testJavaFile);
                System.out.println(String.format("[LOG] Now process [%s]", testJavaFile.getAbsolutePath()));
                try {
                    IOUtil.writeContentIntoFile(testJavaFile, transformer.transformToSrc(commentOn));
//                    IOUtil.writeContentIntoFile(testJavaFile, transformer.transformToSrc(commentOn), CHARSET);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(String.format("[LOG] Write content to [%s] failed.", testJavaFile.getAbsolutePath()));
                    System.exit(-1);
                }
            }
        }

        if(!emptyOption("-f")) { // -d is not empty
            String javaPath = paramsMap.get("-f");
            TestCodeTransformer transformer = new TestCodeTransformer(javaPath);
            System.out.println(String.format("[LOG] Now process %s", javaPath));
            try {
                IOUtil.writeContentIntoFile(javaPath, transformer.transformToSrc(commentOn));
//                IOUtil.writeContentIntoFile(javaPath, transformer.transformToSrc(commentOn), CHARSET);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(String.format("[LOG] Write content to [%s] failed.", javaPath));
                System.exit(-1);
            }
        }

    }

    private static boolean emptyOption(String option) {
        return EMPTY_PARAM.equals(paramsMap.get(option));
    }

    private static boolean isCmdOption(String arg) {
        Set<String> cmdSet = paramsMap.keySet();
        return cmdSet.contains(arg);
    }

    private static String exceptionMsg(String invalidOption) {
        StringBuilder msgBuilder = new StringBuilder(100);
        msgBuilder.append(invalidOption).append(" is not a valid option, please use:")
                .append(NEW_LINE)
                .append("\t -d : A directory which contains .java files want transforming.")
                .append(NEW_LINE)
                .append("\t -f : A single file which wants transforming.")
                .append(NEW_LINE)
                .append("\t -c: In generated java file: comment on or off(true or false). " +
                        "As default, generated java file will contains comment to show some lines's original code.");
        return msgBuilder.toString();
    }

}
