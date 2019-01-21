package caseFile;

public class MyArray {
    private int[] array;
    private int len;
    public MyArray() {
//        array = new int[100];
        len = 0;
    }
    public void add(int x) {
        array[len++] = x;
    }
    public int[] printArray() {
        return array;
    }

    public int max() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
