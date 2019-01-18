package test11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class Bracket {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        Stack<Character> stack =  new Stack<Character>();
        char[] arr = s.toCharArray();
        for(Character c: arr) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if(stack.empty() || (stack.peek() != '{')) {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if(stack.empty() || (stack.peek() != '[')) {
                        return false;
                    }
                    stack.pop();
                    break;
                case ')':
                    if(stack.empty() || (stack.peek() != '(')) {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        System.out.println(bracket.isValidParentheses("{}"));
        System.out.println(bracket.isValidParentheses("(){}[]"));
        System.out.println(bracket.isValidParentheses("()}{}[]"));
        System.out.println(bracket.isValidParentheses("(){}[]}"));
        System.out.println(bracket.isValidParentheses("}"));
    }
}
