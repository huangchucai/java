package spider;

import spider.model.NewFactory;
import spider.model.News;
import spider.view.ViewList;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // 地址
        String resources_path = Main.class.getClassLoader().getResource("read_hub").getPath();

        NewFactory newsReader = new NewFactory(resources_path);
        // 获取新闻
        ArrayList<News> news = newsReader.fetch();

        // 展示
        ViewList views = new ViewList(news);
        views.displayNews();
    }
}
