package nju.pa.util;

import java.io.*;
import java.nio.file.NotDirectoryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Factory class provide static method of IO operations.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-05-25
 */
public class IOUtil {

    private IOUtil() {}

    public static final String JAVA_SUFFIX = ".java";
    public static final String CLASS_SUFFIX = ".class";
    public static final String TXT_SUFFIX = ".txt";
    public static final String NEW_LINE = System.lineSeparator();

    public static String defaultCharset = "UTF-8";

    /**
     * Get all files that has a suffix as <param>suffix</param>
     * under directory <param>directory</param> recursively.
     *
     * @param directory A directory.
     * @param suffix The type of target files. suffix should start with a '.'.
     * @return A List of target files.
     * @throws IllegalArgumentException When dir doesn't represent a directory.
     *
     * @date 2020-03-18
     */
    public static List<File> getAllFilesBySuffix(File directory, String suffix) {
        if(!directory.isDirectory()) {
            throw new IllegalArgumentException(directory.getAbsolutePath() + " should be a directory!");
        }
        // Give out warning when suffix doesn't start with '.'.
        if(suffix.charAt(0) != '.') {
            System.err.println(
                    "Warning: suffix \"" + suffix + "\" should start with a \".\", system have added for you automatically."
            );
            suffix = "." + suffix;
        }
        // Get all files end with suffix recursively.
        List<File> targetFiles = new ArrayList<>();
        File[] allFiles = directory.listFiles();
        if(allFiles != null) {
            // Add files end with the target suffix recursively.
            for (File file : allFiles) {
                if(file.isDirectory()) {
                    targetFiles.addAll(getAllFilesBySuffix(file.getAbsolutePath(), suffix));
                } else {
                    if(suffixOf(file).equals(suffix)) {
                        targetFiles.add(file);
                    }
                }
            }
        }
        return targetFiles;
    }

    /**
     *  Get all files that has a suffix as <param>suffix</param>
     *  under directory <param>dir</param> recursively.
     *
     * @param dirPath An absolute path of a directory.
     * @param suffix The type of target files. suffix should start with a '.'.
     * @return A List of target files.
     * @throws IllegalArgumentException When dir doesn't represent a directory.
     *
     * @date 2020-02-10
     */
    public static List<File> getAllFilesBySuffix(String dirPath, String suffix) {
        File directory = new File(dirPath);
        return getAllFilesBySuffix(directory, suffix);
    }



    /**
     *
     * @param path A path of a file.
     * @param content The content needed be written into the file.
     * @return The absolute path of written file.
     * @throws IOException when write wrongly.
     *
     * @date 2020-03-18
     */
    public static String writeContentIntoFile(String path, String content) throws IOException {
        if(path == null) {
            throw new IllegalArgumentException("Path should not be null.");
        }
        File file = new File(path);
        return writeContentIntoFile(file, content);
    }

    public static String writeContentIntoFile(File file, String content) throws IOException {
        return writeContentIntoFile(file, content, false);
    }

    public static String writeContentIntoFile(File file, String content, boolean appendOn) throws IOException {
        return writeContentIntoFile(file, content, appendOn, defaultCharset);
    }

    public static String writeContentIntoFile(File file, String content, String charset) throws IOException {
        return writeContentIntoFile(file, content, false, charset);
    }

    public static String writeContentIntoFile(String path, String content, String charset) throws IOException {
        return writeContentIntoFile(new File(path), content, false, charset);
    }

    public static void setDefaultCharset(String charset) {
        defaultCharset = charset;
        System.out.println("[From IOUtil.setDefaultCharset] Now default charset is " + charset);
    }

    public static String writeContentIntoFile(File file, String content, boolean appendOn, String charset)
            throws IOException {
        if(!file.exists()) {
            boolean newFile = file.createNewFile();
            if(newFile) {
                System.out.println("Create new file: " + file.getAbsolutePath());
            } else {
                throw new RuntimeException("Create new file failed!");
            }
        }
        if(!file.canWrite()) {
            throw new IllegalArgumentException(file + ": cannot be written");
        }
        if(!file.isFile()) {
            throw new IllegalArgumentException("Invalid path. Please input file path.");
        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, appendOn), charset));
        bw.write(content);
        bw.newLine();

        bw.close();
        return file.getAbsolutePath();
    }

    public static String writeContentsIntoFile(String path, List<String> contents) throws IOException {
        StringBuilder builder = new StringBuilder(contents.size() * 100);
        contents.forEach((content) -> builder.append(content).append(System.lineSeparator()));
        return writeContentIntoFile(path, builder.toString());
    }

    /**
     * Read all content from a readable file.
     *
     * @param file is a readable file.
     * @param charset charset of the file.
     * @return content of the file.
     * @throws IOException if read wrongly.
     *
     * @date 2020-03-18
     */
    public static String readAllcontent(File file, String charset) throws IOException {
        if(!file.isFile()) {
            throw new IllegalArgumentException("Invalid file. Please input a path of file.");
        }
        if(!file.canRead()) {
            throw new IllegalArgumentException(file.getAbsolutePath() + ": cannot be read");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        StringBuilder contentBuilder = new StringBuilder();
        String line;
        while((line = br.readLine()) != null) {
            contentBuilder.append(line).append(NEW_LINE);
        }
        br.close();
        return contentBuilder.toString();
    }

    /**
     * Read all content from a readable file. Use default charset: UTF-8.
     *
     * @param file is a readable file.
     * @return content of the file.
     * @throws IOException if read wrongly.
     *
     * @date 2020-03-18
     */
    public static String readAllcontent(File file) throws IOException {
        return readAllcontent(file, "UTF-8");
    }

    public static String readAllcontent(String path) throws IOException {
        if(path == null) {
            throw new IllegalArgumentException("Path should not be null.");
        }
        return readAllcontent(new File(path));
    }


    /**
     * Read content from a txt file, one line for one item.
     *
     * @param file A readable file.
     * @return A List of parsing result.
     *
     * @date 2020-03-18
     */
    public static List<String> readContentsLineByLine(File file) throws IOException {
        if(!file.isFile()) {
            throw new IllegalArgumentException("Invalid file. Please input a path of file.");
        }
        if(!file.canRead()) {
            throw new IllegalArgumentException(file.getAbsolutePath() + ": cannot be read");
        }

        List<String> contents = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null) {
            contents.add(line);
        }

        br.close();
        return contents;
    }
    /**
     * Read content from a txt file, one line for one item.
     *
     * @param path A path of a property file, written in a txt file.
     * @return A List of parsing result.
     *
     * @date 2020-03-18
     */
    public static List<String> readContentsLineByLine(String path) throws IOException {
        if(path == null) {
            throw new IllegalArgumentException("Path should not be null.");
        }
        File file = new File(path);
        return readContentsLineByLine(file);
    }

    public static String suffixOf(String filePath) {
        return suffixOf(new File(filePath));
    }

    public static String suffixOf(File file) {
        if(file.isDirectory())
            return "";

        String fileName = file.getName();
        int loc = fileName.lastIndexOf('.');
        if(loc != -1)
            return fileName.substring(loc);

        System.out.println(String.format("File[%s] has no suffix.", fileName));
        return "";
    }

    public static String simpleName(String filePath) {
        return simpleName(new File(filePath));
    }

    public static String simpleName(File file) {
        if(file.isDirectory()) {
            return file.getName();
        }
        return file.getName().replace(suffixOf(file), "");
    }

    public static List<File> listFilesOrEmpty(String dirPath) throws NotDirectoryException {
        return listFilesOrEmpty(new File(dirPath));
    }

    public static List<File> listFilesOrEmpty(File dir) throws NotDirectoryException {
        if(!dir.isDirectory())
            throw new NotDirectoryException(dir.getAbsolutePath());

        File[] files = dir.listFiles();
        if(files == null)
            return new ArrayList<>();
        return Arrays.asList(files);
    }

}
