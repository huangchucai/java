package vip.company.Model;

public class FileNewsReader extends NewsReader {
    @Override
    public News readNews(String path) {
        // 从文件中读取, 解析
        return new News("从文件中读取", "test");
    }
}
