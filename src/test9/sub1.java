package test9;

public class sub1 extends Base{
    @Override
    public String method1() {
        return "hcc";
    }

    @Override
    public void method2() {
        System.out.println("实现抽象类的重写");
    }
    public void selfMethods() {
        System.out.println("自己的方法");
    }
}
