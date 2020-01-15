package me.hamed.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedList<T extends Comparable<T>> implements List<T> {
    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(o))
                return true;
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        counter = 0;
    }

    @Override
    public T get(int index) {
        Node<T> temp = head;
        int idx = 0;
        while (temp != null && idx != index) {
            temp = temp.next;
            idx++;
        }
        if (idx < this.size()) {
            assert temp != null;
            return temp.data;
        } else {
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", idx, size()));
        }
    }

    @Override
    public T set(int index, T element) {
        Node<T> temp = head;
        int idx = 0;
        while (temp != null && idx != index) {
            temp = temp.next;
            idx++;
        }
        if (idx < this.size()) {
            assert temp != null;
            final T data = temp.getData();
            temp.setData(element);
            return data;
        } else {
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", idx, size()));
        }
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean add(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node<>(data);
        }
        counter++;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Helper();
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int counter = 0;


    private class Helper implements Iterator<T> {
        Node<T> temp = head;

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public T next() {
            final T data = temp.getData();
            temp = temp.next;
            return data;
        }
    }
}
