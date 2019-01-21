package spider.model;

import java.util.HashMap;

public class News {
    private String title;
    private String content;
    private HashMap<String, String> related;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
        this.related = new HashMap<String, String>();
    }

    public void addRelated(String date, String related_title) {
        // 添加相关的新闻
        this.related.put(date, related_title);
    }
    public HashMap<String, String> getRelated() {
        return related;
    }

    public String getTitle() {
        return title;
    }


    public String getContent() {
        return content;
    }
}
