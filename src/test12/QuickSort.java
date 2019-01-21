package test12;

import java.util.ArrayList;

public class QuickSort {
    public static void qsort(Integer left , Integer right, ArrayList<Integer> input) {
        if (input.size() <= 1 || left >= right ) {
            return;
        }
        int i = left, j = right;
        int temp = input.get(left);
        while (i < j) {
            while (i < j && input.get(i) > temp) {
                i++;
            }
            while (i < j && input.get(i) < temp) {
                j--;
            }
            if (i < j) {
                int mid = input.get(i);
                input.set(i, input.get(i));
                input.set(j, mid);
            }
        }
        if( left < i) {
            qsort(left, i, input);
        }
        if( i < right) {
            qsort(j, right, input);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        qsort(0, arr.size() - 1, arr);
        System.out.println(arr);
    }
}
