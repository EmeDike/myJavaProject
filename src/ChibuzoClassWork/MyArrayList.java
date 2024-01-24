

package ChibuzoClassWork;

import java.util.Arrays;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] array;
    private int size;

    public MyArrayList() {
        this.array = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(String element) {
        ensureCapacity();
        array[size++] = element;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public boolean contains(String value) {
     for (String element : array){
         if (element == value) return true;
     }
     return false;
    }
}
