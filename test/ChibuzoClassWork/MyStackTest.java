package ChibuzoClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    public void myStackIsEmpty() {
        MyStack<Integer> myStack = new MyStack<>();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatSizeOfMyStackIsZero() {
        MyStack<String> myStack = new MyStack<>();
        assertEquals(0, myStack.size());
    }

    @Test
    public void testMyStackCanPush() {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        assertEquals(1, myStack.size());
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatMyStackCannotExceedTheDefaultCapacity() {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        assertThrows(StackOverflowError.class, () -> myStack.push("Victor"));
    }

    @Test
    public void testThatMyStackIsFull() {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        assertTrue(myStack.isFull());
    }

    @Test
    public void testThatMyStackCanPushAndPop() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(2);
        myStack.push(1);
        myStack.pop();
        assertEquals(2, myStack.size());
    }

    @Test
    void testThatMyStackCanPushAndPop2() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(2);
        myStack.push(1);
        myStack.pop();
        assertEquals(2, myStack.size());
        myStack.push(2);
        myStack.pop();
        assertEquals(3, myStack.size());
    }

    @Test
    public void testThatMyStackCannotPopAnEmptyContainer() {
        MyStack<Integer> myStack = new MyStack<>();
        assertThrows(StackUnderFlow.class, myStack::pop);
    }

    @Test
    public void testThatMyStackCanPeek() {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        myStack.peek();
        assertEquals(3, myStack.size());
    }

    @Test
    public void testThatMyStackCanExceedTheDefaultCapacity() {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        assertThrows(StackOverflowError.class, () -> myStack.push("4"));
        assertEquals(3, myStack.size());
    }
}
