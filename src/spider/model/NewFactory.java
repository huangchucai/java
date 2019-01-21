package spider.model;

import java.io.*;
import java.util.ArrayList;

public class NewFactory {
    private File newsDir;

    public NewFactory(String dir) throws Exception {
        newsDir = new File(dir);

        if (!newsDir.exists()) {
            throw new Exception("文件不存在");
        }
        if (!newsDir.isDirectory()) {
            throw new Exception("输入路径不是一个合法目录！");
        }
    }

    // 请求，返回News列表
    public ArrayList<News> fetch() throws IOException {
        ArrayList<News> newsArr = new ArrayList<>();
        File[] files = newsDir.listFiles();
        for (File file : files) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String title = bufferedReader.readLine();
                // 读取空行
                bufferedReader.readLine();

                String content = bufferedReader.readLine();
                bufferedReader.readLine();

                String date = bufferedReader.readLine();
                String related = bufferedReader.readLine();
                if (title != null && content != null) {
                    News news = new News(title, content);
                    // 添加相关的新闻
                    news.addRelated(date, related);
                    newsArr.add(news);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return newsArr;
    }
}
