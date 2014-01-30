package stack;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {

    private int[] array;
    private int maxSize;
    private int top;

    public Stack(int size) {
        array = new int[size];
        maxSize = size;
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize) {
            array[++top] = value;
        }
    }

    public int pop() {
        if (top > -1) {
            return array[top--];
        } else {
            return -1;
        }
    }

    public int peek() {
        if (top > -1) {
            return array[top];
        } else {
            return -1;
        }

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void display() {
        for (int i = 0; i < maxSize; i++) {
            System.out.println(" " + array[i]);
        }
    }

}
