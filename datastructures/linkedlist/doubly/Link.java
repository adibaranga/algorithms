package linkedlist.doubly;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Link {
    int data;
    Link previous;
    Link next;

    public Link(int data) {
        this.data = data;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
