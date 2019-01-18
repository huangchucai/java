package vip.company.Model;
import java.util.*;

public class News implements Displayable{
    protected String title;
    protected String content;

    public News() {
    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    // 展示
    @Override
    public String display() {
        return title + "\n" + content;
    }
}
