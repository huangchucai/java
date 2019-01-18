package test11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> gender = new HashMap<String, String>();  // 哈希表实现的一个Map, 声明一个哈希表
        // 增加
        gender.put("hcc", "male");
        gender.put("yx", "woman");
        // 删除
        gender.remove("yx");

        // 查找
        if (gender.containsKey("hcc")) {
            System.out.println(gender.get("hcc"));
        }
        // 修改 （直接覆盖)
        gender.put("yx", "female");
        System.out.println(gender.get("yx"));

    }
}
