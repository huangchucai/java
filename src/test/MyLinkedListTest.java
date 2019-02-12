package test;

import mycollection.MyArrayList;
import mycollection.MyLinkedList;

import java.util.Iterator;

public class MyLinkedListTest {
    void testCase() {
        // Arrange

        // act

        // asserts
    }

    public void testAdd() {
        // Arrange
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Act
        list.add(1);
        list.add(4);
        list.add(2, 8);
        // Asserts
        // assertEqual(1, list.get(0));
        assertEqual(3, list.size());
        assertEqual(8, list.get(2));
        assertEqual(-1, list.indexOf(2));
        assertEqual(0, list.indexOf(1));
    }

    public void testRemove() {
        // Arrange
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(2, 8);

        // Act
        list.removeFirst();
        list.remove(2);
        list.remove((Integer)9);

        // Asserts
        assertEqual(4, list.get(0));
        assertEqual(8, list.get(2));

    }

    public void testEmpty() {
        // Arrange
        MyArrayList list = new MyArrayList();
        list.add(1);
        // Asserts
        assertEqual(false, list.isEmpty());

        // Act
        list.remove(1);
        // Asserts
        assertEqual(true, list.isEmpty());
    }

    public void testSize() {
        // Arrange
        MyArrayList list = new MyArrayList();
        list.add(1);
        // Act
        int size = list.size();

        // Asserts
        assertEqual(1, size);
    }

    public void testIndexOf() {
        // Arrange
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(1,"yx");
        // act
        int index = list.indexOf("yx");
        // Asserts
        assertEqual(1, index);

    }

    public void testFor() {
        // Arrange
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(7);
        // list.forEach(System.out::println);
        for(Object obj: list) {
            System.out.println(obj);
        }
    }

    public void testItr() {
        // Arrange
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(71);
        list.add(10);
        Iterator iterList = list.iterator();
        // list.forEach(System.out::println);
        while(iterList.hasNext()) {
            int num = (int) iterList.next();
            System.out.println(num);
        }


    }
    private void assertEqual(Object expect, Object actual) {
        if (!expect.equals(actual)) {
            throw new AssertionError("expect is not equal with actual~~~ expect:" + expect + "   "
                    + " actual: " + actual);
        }
        System.out.println("expect is  equal with actual~~~~ expect:" + expect + "    "
                + "actual: " + actual);
    }

    public static void main(String[] args) {
        MyLinkedListTest test = new MyLinkedListTest();
        // test.testAdd();
        test.testRemove();
        // test.testFor();
        // test.testIndexOf();
       // test.testSize();
       // test.testAdd();
       // test.testRemove();
       // test.testEmpty();

    }
}
