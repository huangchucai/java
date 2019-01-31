package mycollection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private Object[] elementData;
    private int size; // 长度
    private int capacity; // 容量

    public MyArrayList() {
        this(0);
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            this.elementData = new Object[capacity];
        } else if (capacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        } else {
            throw new IllegalArgumentException("Illegal argument capacity: " + capacity);
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // 添加对象到数组中
    public boolean add(Object obj) {
        // 如果是初始化是空的，就需要初始化
        if (elementData == EMPTY_ELEMENT_DATA) {
            elementData = new Object[DEFAULT_CAPACITY];
            capacity = DEFAULT_CAPACITY;
        } else if (elementData.length == capacity) {
            // 添加到容器的最大值了，需要扩容
            resize();
        }
        elementData[size] = obj;
        size++;
        return true;
    }

    // 添加到指定索引的指定元素，并且之后的元素需要向后移动一位
    public void add(int index, Object obj) {
        // 超出边界
        rangeCheck(index);
        // 添加到边界值就需要扩容
        if (size == capacity) {
            resize();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = obj;
        size++;
    }

    private void resize() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        Object[] newElementData = new Object[newCapacity];
        // 把之前的值放入到新创建的数组中
        for (int i = 0; i < elementData.length; i++) {
            newElementData[i] = elementData[i];
        }
        // 更新容量
        capacity = newCapacity;
        // 更新底层数据
        elementData = newElementData;
    }

    // 方法的重载
    // 根据索引删除元素
    public Object remove(int index) {
        // 超出边界
        rangeCheck(index);

        Object val = elementData[index];
        // 覆盖前一位元素，达到删除的目标
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        // 如果已经删除，由于索引的变化，需要置空以前的最后一个元素
        size = size - 1;
        elementData[size] = null;   // -> elementData[--size] = null
        return val;
    }

    // 根据值删除元素
    public boolean remove(Object obj) {
        if (obj == null) {
            for (int index = 0; index < elementData.length; index++) {
                if (elementData[index] == null) {
                    remove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < elementData.length; index++) {
                if (elementData[index].equals(obj)) {
                    remove(index);
                    return true;
                }
            }
        }
        return false;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("The index is out of bounds, index: " +
                    index + " size " + size);
        }
    }

    // 根据索引获取值
    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public void set(int index, Object obj) {
        rangeCheck(index);
        elementData[index] = obj;
    }

    // 根据值获取索引
    public int indexOf(Object obj) {
        if (obj == null) {
            for (int index = 0; index < elementData.length; index++) {
                if (elementData[index] == null) {
                    return index;
                }
            }
        } else {
            for (int index = 0; index < elementData.length; index++) {
                if (elementData[index].equals(obj)) {
                    return index;
                }
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return new Itr();
    };

    private class Itr implements Iterator {
        int cursor; // index of next element to return
        int lastRet = -1; // index of last element returned -1 if no such

        // public Itr() {
        // }

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public Object next() {
            if (cursor > size) {
                throw new NoSuchElementException("没有元素");
            }
            lastRet = cursor;
            cursor = cursor + 1;
            return elementData[lastRet];
        }

        @Override
        public void remove() {
            if (lastRet < 0) {
                throw new IllegalArgumentException();
            }
            MyArrayList.this.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        }
    }
}
