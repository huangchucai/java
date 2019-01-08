package test9;

public class Main {
    public static void  main(String[] args) {
        Cat cat = new Cat("猫科", 1, "鱼");
        cat.eat();
        cat.setName("薄荷");
        System.out.println(cat.getName());
    }
}
