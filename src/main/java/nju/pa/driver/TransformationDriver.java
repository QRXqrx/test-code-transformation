package nju.pa.driver;

import nju.pa.exception.InvalidCmdOptionException;
import nju.pa.transform.CodeTransformer;
import nju.pa.transform.TestCodeSplitter;
import nju.pa.transform.TestCodeTransformer;
import nju.pa.util.IOUtil;

import java.io.File;
import java.io.IOException;
import java.util.*;

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

    static {
        paramsMap.put("-d", EMPTY_PARAM); // -d: A directory which contains .java files want transforming.
        paramsMap.put("-f", EMPTY_PARAM); // -f: A single file which wants transforming.
        paramsMap.put("-c", EMPTY_PARAM); // -c: In generated java file: comment on or off (true or false).
        paramsMap.put("-s", EMPTY_PARAM); // -s: Split test code source into the form the each class only contains one test annotated method.
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

        // Process options.
        boolean commentOn = true;
        if(!emptyOption("-c"))
            commentOn = Boolean.parseBoolean(paramsMap.get("-c"));
        // Collect all test java files that need to be transformed.
        List<File> allTestJavaFiles = new ArrayList<>();
        if(!emptyOption("-d")) {
            String dirPath = paramsMap.get("-d");
            List<File> testJavaFiles = IOUtil.getAllFilesBySuffix(dirPath, IOUtil.JAVA_SUFFIX);
            allTestJavaFiles.addAll(testJavaFiles);
        }
        if(!emptyOption("-f")) {
            String javaPath = paramsMap.get("-f");
            allTestJavaFiles.add(new File(javaPath));
        }
        // Decide which code transformer to use.
        boolean useSplitter = false;
        if(!emptyOption("-s"))
            useSplitter = Boolean.parseBoolean(paramsMap.get("-s"));
        if(useSplitter) {
            // Split all test java files.
            TestCodeSplitter splitter = new TestCodeSplitter();
            for (File testJavaFile : allTestJavaFiles) {
                splitter.setJavaFile(testJavaFile);
                splitter.output(commentOn);
            }
        } else {
            // Transform all test java files.
            TestCodeTransformer transformer = new TestCodeTransformer();
            for (File testJavaFile : allTestJavaFiles) {
                transformer.setJavaFile(testJavaFile);
                System.out.println(String.format("[LOG] Now process [%s]", testJavaFile.getAbsolutePath()));
                try {
                    IOUtil.writeContentIntoFile(testJavaFile, transformer.transformToSrc(commentOn));
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(String.format("[LOG] Write content to [%s] failed.", testJavaFile.getAbsolutePath()));
                    System.exit(-1);
                }
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
                        "As default, generated java file will contains comment to show some lines's original code.")
                .append(NEW_LINE)
                .append("\t -s: Split test code source into the form the each class only " +
                        "contains one test annotated method. (true or false)");
        return msgBuilder.toString();
    }

}
