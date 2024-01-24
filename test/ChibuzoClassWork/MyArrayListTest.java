package ChibuzoClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    public void myArrayListIsEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatSizeOfMyArrayListIsZero() {
        MyArrayList myArrayList = new MyArrayList();
        assertEquals(0, myArrayList.size());
    }

    @Test
    public void testMyArrayListCanAddElement() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Tosin");
        assertEquals(1, myArrayList.size());
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testMyArrayListCanAddMultipleElements() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("42");
        myArrayList.add("15");
        myArrayList.add("7");

        assertEquals(3, myArrayList.size());
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testMyArrayListExpandsCapacity() {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 15; i++) {
            myArrayList.add("Element" + i);
        }

        assertEquals(15, myArrayList.size());
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testMyArrayListContainsElement() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Tosin");
        myArrayList.add("Sharon");

        assertTrue(myArrayList.contains("Tosin"));
        assertFalse(myArrayList.contains("John"));
    }
}
