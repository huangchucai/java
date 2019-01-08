package vip.company.Model;

public abstract class NewsReader {
    public abstract News readNews(String path);  // 具有这个功能，但是具体的功能实现，在子类中确定!
    /*
    * 读取新闻的方式
    * 1. 文件  纯文本  word json xml  -> 类
    * 2. 网络  url                   -> 类
    * 3. 标准输入                     -> 类
    * 4. 语音识别                     -> 类
    *
    * 不同的问题，不同的Reader
    * */
}
