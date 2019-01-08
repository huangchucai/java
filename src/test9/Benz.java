package test9;

public class Benz implements Car{

    @Override
    public void run() {
        System.out.println("速度很快");
    }

    @Override
    public String seat() {
        return "4人座位、2人座位";
    }
}
