package test9;

public class Cat extends Animal {
    private String name;
    public Cat(String species, int age, String food) {
        super(species, age, food);
        super.parentsName();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void rename(String name) {
        System.out.println("重写一");
    }
    public void rename(int age) {
        System.out.println("重写二");
    }
}
