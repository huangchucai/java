package test9;

public class Animal {
    protected String species;
    protected String food;
    protected int age;

    public Animal(String species, int age, String food) {
        this.species = species;
        this.age = age;
        this.food = food;
    }
    public static void parentsName() {
        System.out.println("动物");
    }
    public void eat() {
        System.out.println("吃:" + this.food);
    }
}
