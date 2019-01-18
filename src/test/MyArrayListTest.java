package test;

import mycollection.MyArrayList;

public class MyArrayListTest {
    void testCase() {
        // Arrange

        // act

        // asserts
    }

    public void testAdd() {
        // Arrange
        MyArrayList list = new MyArrayList();

        // Act
        list.add(1);
        list.add("hcc");
        list.add(2.2);
        list.add(4);
        list.add(3, 8);
        // Asserts
        assertEqual(1, list.get(0));
        assertEqual("hcc", list.get(1));
        assertEqual(2.2, list.get(2));
        assertEqual(8, list.get(3));
        assertEqual(4, list.indexOf(4));
    }

    public void testRemove() {
        // Arrange
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add("hcc");
        list.add(2.2);

        // Act
        list.remove(0);

        // Asserts
        assertEqual("hcc", list.get(0));

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

    private void assertEqual(Object expect, Object actual) {
        if (!expect.equals(actual)) {
            throw new AssertionError("expect is not equal with actual~~~ expect:" + expect + "   "
                    + " actual: " + actual);
        }
        System.out.println("expect is  equal with actual~~~~ expect:" + expect + "    "
                + "actual: " + actual);
    }

    public static void main(String[] args) {
        MyArrayListTest test = new MyArrayListTest();
        test.testIndexOf();
//        test.testSize();
//        test.testAdd();
//        test.testRemove();
//        test.testEmpty();

    }
}
