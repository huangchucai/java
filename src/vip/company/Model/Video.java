package vip.company.Model;

public class Video implements Displayable {
    @Override
    public String display() {
        return "播放电影";
    }
    public void OnlyVideo() {
        System.out.println("电影单独拥有");
    }
}
