package spider.view;

import spider.model.News;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ViewList {
    private ArrayList<News> newsList;

    public ViewList(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    public void displayNews() {
        for(News newObj: newsList) {
            // 输出相关信息
            System.out.println("title：   " + newObj.getTitle());
            System.out.println("content： " + newObj.getContent());
            HashMap related = newObj.getRelated();
            Set dateSet = related.keySet();
            for(Object date: dateSet) {
                System.out.println("date： " + date);
                System.out.println("related_title： " + related.get(date));
            }
            System.out.println("-----------------");
        }
    }
}
