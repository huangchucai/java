package test8;

import java.io.*;

/*
*

创建一个File类用于表示文件. 然后这个类能够满足以下几个功能:
拥有一个构造方法, 接收一个字符串, 表示硬盘中文件的路径. 表示创建的File对象对应的硬盘中的文件;
拥有一个readToString(); 方法, 功能是读取文件内容, 然后返回一个String;
拥有一个writeString(String content); 方法, 功能是写入一个字符串到文件中;
创建一个FileHelper类,其中只有一个静态方法 copy, 其功能为:

接受两个参数, 参数类型都为File: file1, file2.
意思为把file1的内容写入到file2中.

*/
public class FileFirst {
    public String path;

    public FileFirst(String path) {
        this.path = path;
    }

    public String readToString() throws IOException {
        String str = "";
        String line = null;
        FileReader is = new FileReader(this.path);
        BufferedReader buffer = new BufferedReader(is);
        try {
            while ((line = buffer.readLine()) != null) {
                str += line + "\n";
            }
        } catch (IllegalArgumentException e) {
            System.out.println("文件错误");
        } finally {
            buffer.close();
            is.close();
        }
        return str;
    }

    public void writeString(String content) throws IOException {
        FileOutputStream os = new FileOutputStream(this.path);
        OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
        PrintWriter print = new PrintWriter(writer);
        print.print(content);
        print.close();
        os.close();
    }
}
