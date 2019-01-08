package test7;
import java.util.ArrayList;
import java.util.Collection;
// 读入一个字符串(String), 然后反转这个字符串, 然后输出.
// abcdefg  =>  gfedcba
public class second {
    public static String reserve(String str) {
        String result = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char part = str.charAt(length - 1 - i);
            result += part;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reserve("abcdefg"));
    }
}
