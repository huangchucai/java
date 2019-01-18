package test11;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // 增加
        stack.push("yx");
        // 取出并删除顶层元素
        String name = stack.pop();
        // 判断是否为空
        System.out.println(stack.empty());
        // 单独的取出元素不删除
        stack.push("hcc");
        String hcc = stack.peek();
        System.out.println(hcc);
        System.out.println(stack.empty());
    }

}
