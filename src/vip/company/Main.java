package vip.company;

import vip.company.Model.*;

public class Main {
    public static void main(String[] args) {
        News news = new News("第一条新闻", "hhhhhhhhhhhhhhh");
        viewNews(news);

        Video video = new Video();
        viewNews(video);

        Lecture lecture = new Lecture();
        viewNews(lecture);


        News newsFromFile = read(new FileNewsReader(), "simple/res.txt");
        viewNews(newsFromFile);

        News newsFromUrl = read(new UrlNewsReader(), "simple/res.txt");
        viewNews(newsFromUrl);

        FileNews fileNews = new FileNews();
        fileNews.read("res/output.txt");
        viewNews(fileNews);

    }

    private static News read(NewsReader reader, String path) {
        return reader.readNews("res/output.txt");
    }
    private static void viewNews(Displayable item) {
        System.out.println(item.display());
        System.out.println("播放完毕");
    }
}
