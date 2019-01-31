package JsoupStudy;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.size());
        Document doc = Jsoup.connect("https://readhub.cn/topic/7JR6yMLQc8H").get();
        Elements element = doc.select("div[class^=relatedEventContainer]");
        Elements elements = element.first().children();
        for (Element elt : elements) {
            String date = elt.select("div[class^=date]").text();
            String url = elt.child(0).attr("abs:href");
            // System.out.println(date);
            // System.out.println(url);
        }
    }
}
