package vip.company.Model;

public class UrlNewsReader extends NewsReader {
    @Override
    public News readNews(String path) {
        return new News("从网络中读取", "test");
    }
}
