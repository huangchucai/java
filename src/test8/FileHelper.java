package test8;
import java.io.*;
/*
*
*
创建一个FileHelper类,其中只有一个静态方法 copy, 其功能为:
接受两个参数, 参数类型都为File: file1, file2.
意思为把file1的内容写入到file2中.
* */
public class FileHelper {
    public static void copy(File file1, File file2) throws IOException {
            String content = "";
            String line = null;
            FileReader reader = new FileReader(file1);
            BufferedReader buffer = new BufferedReader(reader);
            while((line = buffer.readLine()) != null) {
                content += line + "\n";
            }
            buffer.close();
            reader.close();
            System.out.println(content);
            PrintWriter print = new PrintWriter(file2);
            print.print(content);
            print.close();
    }
    public static void main(String[] args) throws IOException {
        File file1 = new File("res/test.txt");
        File file2 = new File("res/output.txt");
        copy(file1, file2);
    }
}

