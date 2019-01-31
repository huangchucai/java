package spider;

import spider.model.*;
import spider.view.ViewList;

import java.util.*;

public class Main {
    private static final int MAX_NUM = 20;
    public static void main(String[] args) throws Exception {
        // // 地址
        // String resources_path = Main.class.getClassLoader().getResource("read_hub").getPath();
        //
        // NewFactory newsReader = new NewFactory(resources_path);
        // // 获取新闻
        // ArrayList<News> news = newsReader.fetch();
        // ArrayList<Viewable> viewables = new ArrayList<>();
        // viewables.addAll(news);
        // // 展示
        // ViewList views = new ViewList(viewables);
        // views.displayNews();

        // URL获取
        String startUrl = "https://readhub.cn/topic/7JNG8OhTkGI";
        int count = 0;
        // 根据related的URL继续获取
        // 广度优先搜索
        Queue<NewsWithRelated> newsQueue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        // 所有的展示存放
        ArrayList<Viewable> arrayList = new ArrayList<>();

        NewsWithRelated startNews = UrlReader.read("https://readhub.cn/topic/7JNG8OhTkGI");
        newsQueue.add(startNews);
        stack.add(startUrl);

        while ((!newsQueue.isEmpty()) && count <= MAX_NUM) {
            NewsWithRelated currentNews = newsQueue.poll();
            arrayList.add(currentNews);
            count++;
            for (Map.Entry<String, String> related : currentNews.getRelated().entrySet()) {
                String url = related.getValue();
                if(!stack.contains(url)) {
                    NewsWithRelated nextNews = UrlReader.read(url);
                    newsQueue.add(nextNews);
                    arrayList.add(nextNews);
                }
            }
        }
        System.out.println(count);
        ViewList viewList = new ViewList(arrayList);
        viewList.displayNews();
    }
}
