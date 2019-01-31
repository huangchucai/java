package spider.model;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class UrlReader {
    // 从url中读取，返回带有related的新闻
    public static NewsWithRelated read(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        // 获取标题内容
        Elements elementTitle = doc.select("title");
        String title = elementTitle.first().text();

        // 获取新闻内容
        Elements elementContent = doc.select("div.summary___3oqrM");
        String content = elementContent.first().text();

        NewsWithRelated news = new NewsWithRelated(title, content);
        // 获取相关性新闻
        Elements relatedElements = doc.select("li.timeline__item___2luxn");
        for (Element element : relatedElements) {
            String relatedTitle = element.select(".content-item___2j97j").text();
            Elements elementsRelatedContent = element.children();


            Element elementRelatedContent = elementsRelatedContent.get(3);
            // 获取a标签中的href, a标签只能通过absUrl
            String relatedUrl = elementRelatedContent.child(0).absUrl("href");
            news.addRelated(relatedTitle, relatedUrl);
        }
        return news;
    }
}
