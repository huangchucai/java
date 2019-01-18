package test8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Set;

public class test {
    public static void main(String[] args) throws IOException {
//        FileFirst file = new FileFirst("./res/test.txt");
//        file.writeString("黄楚才fsfsdfsdfsd\nsdfsdfsdfsdfsdf");
//        System.out.println(file.readToString());
        Character[] leftBracket = {'{', '[', '('};
        char[] leftBracket2 = {'{', '[', '('};
        //System.out.println(leftBracket);
        //System.out.println(leftBracket2);
        ArrayList arrayList = new ArrayList();
//        arrayList.add('{');
        arrayList.add('[');
        arrayList.add(1, "hcc");
        System.out.println(arrayList.indexOf("hcc"));

        ArrayList arrayList2 = new ArrayList();
        //System.out.println(arrayList.contains('{'));
        //System.out.println(arrayList.size());
//        System.out.println(Arrays.asList(leftBracket2).contains('{'));
//        System.out.println(Arrays.asList(leftBracket2).size());
//        System.out.println(Arrays.asList(leftBracket).get(0).getClass());
//        System.out.println(Arrays.asList(leftBracket2).get(0).getClass());

    }
}
