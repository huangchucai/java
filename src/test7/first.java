package test7;

/*
*
读入一个数字N, 输出以这个数字开始的乘法表, 乘数 N x i 必须按 N x i = result 的格式输出,并且占一行.
输入格式:
一个正整数: N, 2 <= N <= 20

输入例子:
* */
public class first {
    public static void multiply(int n) {
        if(n >= 2 && n <= 20) {
            for (int i = 1; i<=10; i++) {
                int result = n * i;
                System.out.println(n + "*" + i + " = " + result);
            }
        } else {
            System.out.println("请输入大于1小于21的整数");
        }
    }
    public static void main(String[] args) {
        multiply(21);
    }
}
