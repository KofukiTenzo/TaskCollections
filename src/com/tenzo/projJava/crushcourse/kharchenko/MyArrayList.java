package com.tenzo.projJava.crushcourse.kharchenko;

public class MyArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public MyArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String str) {
            if (size == capacity) {
                grow();
            }
            elements[size] = str;
            size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5 + 1);
        String[] newElements = new String[capacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public boolean remove(String str) {
        String[] copy = new String[capacity];
        boolean chek = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(str)) {
                System.arraycopy(elements, 0, copy, 0, i);
                System.arraycopy(elements, i + 1, copy, i, size - i - 1);
                chek = true;
            }
        }
        if (chek){
            size--;
            elements = copy;
        }
        return chek;
    }

    public int size() {
        return size;
    }
}
