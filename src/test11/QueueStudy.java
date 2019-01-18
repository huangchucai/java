package test11;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(3);
        // 取出first 但是不删除
        int age = queue.peek();
        System.out.println(age);
        // 取出first 并删除
        int age2 = queue.poll();
        int age3 = queue.poll();
        System.out.println(age2);
        System.out.println(age3); // 3
    }
}
