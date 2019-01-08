package 多态;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal boy = new Boy();
        boy.eat();
    }
}
