package vip.company.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNews extends News {
    public FileNews() {
    }

    public FileNews(String title, String content) {
        super(title, content);
    }

    public void read(String path) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(new File(path)));
            title = buffer.readLine();
            content = buffer.readLine();
        } catch (IOException e) {
            System.out.println("找不到文件");
        }
    }

    @Override
    public String display() {
        return super.display() + "from子类";
    }
}
