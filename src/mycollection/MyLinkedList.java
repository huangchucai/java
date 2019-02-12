package mycollection;

import java.util.Map;
import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    int size = 0;
    Node<E> first; // 第一个元素
    Node<E> last; // 最后一个元素

    public MyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean add(E element) {
        // 之前的最后一个元素等于下一个元素的prev
        Node l = last;
        Node newNode = new Node(l, element, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    public void add(int index, E element) {
        // 检查索引是否合法
        if (!checkPositionIndex(index)) {
            throw new IndexOutOfBoundsException("索引超出边界");
        }
        // 填充到最后一个元素
        if (index == size) {
            linkLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }

    // 根据索引移除Node
    public E remove(int index) {
        // 索引不能等于size
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("索引超出边界");
        }
        // 获取要删除的node
        return unlink(node(index));
    }

    // 删除第一个元素
    public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }

    public boolean remove(Object element) {
        if (element == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (element.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for(Node<E> x = first; x != null; x = x.next) {
                if(x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for(Node<E> x = first; x != null; x = x.next) {
                if(element.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public E get(int index) {
        if (!checkPositionIndex(index)) {
            throw new IndexOutOfBoundsException("索引超出边界");
        }

        return node(index).item;
    }


    public E set(int index, E element) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("索引超出边界");
        }
        Node<E> currentNode = node(index);
        E olaval = currentNode.item;
        currentNode.item = element;
        return olaval;
    }


    // 检查索引是否合法
    private boolean checkPositionIndex(int index) {
        return index <= size && index >= 0;
    }

    // 检查索引是否合法
    private boolean isElementIndex(int index) {
        return index < size && index >= 0;
    }

    // 最后一个元素添加 1. 新建元素 2. 把Node的prev链接到最后一个元素 3. 更新最后一个元素(last)和size以及第一个元素
    private void linkLast(E element) {
        Node l = last;
        Node newNode = new Node(l, element, null);
        last = newNode;
        // 没有元素
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    // 添加不是结尾的元素
    private void linkBefore(E element, Node node) {
        // 获取对应索引的前一个Node
        Node prevNode = node.prev;
        Node newNode = new Node(prevNode, element, node);
        node.prev = newNode;
        // 填充的是第一个元素
        if (prevNode == null) {
            first = newNode;
        } else {
            prevNode.next = newNode;
        }
        size++;
    }



    // 返回对应索引的Node
    private Node<E> node(int index) {
        if (index <= size / 2) {
            Node x = first;
            // 这里不能取等于，因为指的是index - 1节点的next
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    // 取消对应Node的链接
    private E unlink(Node<E> node) {
        E element = node.item;
        Node preNode = node.prev;
        Node nextNode = node.next;
        if(preNode == null) {
            first = nextNode;
        } else {
            preNode.next = nextNode;
            node.prev = null;
        }
        if (nextNode == null) {
            last = preNode;
        } else {
            nextNode.prev = preNode;
            node.next = null;
        }
        node.item = null;
        size--;
        return element;
    }

    private E unlinkFirst(Node<E> node ) {
        // assert f == first && f != null;
        Node nextNode = node.next;
        E nodeval = node.item;
        node.next = null;
        node.item = null;
        node.prev = null;
        first = nextNode;
        if (nextNode == null ) {
            last = null;
        } else {
            nextNode.prev = null;
        }
        size--;
        return nodeval;
    }
    // 内部的储存结构
    private static class Node<E> {
        Node<E> prev;
        Node<E> next;
        E item;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }
}
