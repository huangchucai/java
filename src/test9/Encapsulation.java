package test9;
/*
* 1. 简述封装的概念, 思考封装做得好的代码会有什么样的好处? 在涉及类和方法的时候, 如何从封装的角度考虑? 如果有学习工作中遇到的实际例子, 请举例
* 概念：隐藏内部的实现细节，只暴露给用户对应的使用.
* 好处：好的封装可以让我们的代码实现解耦，方便我们对于内部的细节的更新和重构。
* 对于类和方法申明的时候，我们可以提前想到那些是给外部使用的，那些是我们内部方法的传递，提前做好逻辑图进行封装
* 实例： 在JavaScript中把成员变量封装到一个构造函数或者使用单例模式防止修改
* 2. 简述继承的语义, 然后举一个例子来帮助自己理解和记忆
* 3. 写一篇博客总结Java 面向对象的相关语法及其语义. 最好带有例子!

 *
* */
public class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Encapsulation test = new Encapsulation();
        test.setName("hcc");
        System.out.println(test.getName());
    }
}
