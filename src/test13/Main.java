package test13;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) - 'a');
        }
        System.out.println((char) 97);
    }
}
