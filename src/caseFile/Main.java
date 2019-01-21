package caseFile;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(10);
        myArray.add(15);
        System.out.println(Arrays.toString(myArray.printArray()));

    }
}
