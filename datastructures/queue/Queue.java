package queue;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Queue {
    private int[] array;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        array = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        array[++rear] = value;
        nItems++;
    }

    public int remove() {
        int elem = array[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return elem;
    }

    public int peek() {
        return array[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

}
