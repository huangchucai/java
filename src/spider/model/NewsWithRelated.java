package spider.model;

import java.util.HashMap;
import java.util.Map;

public class NewsWithRelated extends News {
    private HashMap<String, String> related;

    public NewsWithRelated(String title, String content) {
        super(title, content);
        related = new HashMap<>();
    }

    public HashMap<String, String> getRelated() {
        return related;
    }

    public void addRelated(String title, String url) {
        related.put(title, url);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("----------------------------");
        for(Map.Entry<String, String> relate: this.related.entrySet()) {
            System.out.println("|--content--|" + relate.getKey());
            System.out.println("|--url--|" + relate.getValue());
        }
    }
}
