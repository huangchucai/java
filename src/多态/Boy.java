package 多态;

public class Boy extends Animal {
    @Override
    public void eat() {
        System.out.println("Boy eat");
    }

    @Override
    public void speak() {
        System.out.println("Boy speak");
    }
}
