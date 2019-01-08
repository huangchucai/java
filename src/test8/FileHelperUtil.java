package test8;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileHelperUtil {
    public static void copy (File file1, File file2) {
        try {
            String content = FileUtils.readFileToString(file1, "UTF-8");
            FileUtils.writeStringToFile(file2, content, "UTF-8");
        } catch (IOException e) {
            System.out.println("文件找不到");
        }
    }
    public static void main(String[] args) throws IOException {
        File file1 = new File("res/test.txt");
        File file2 = new File("res/output.txt");
        copy(file1, file2);
    }
}
