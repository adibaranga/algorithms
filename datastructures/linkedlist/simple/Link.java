package linkedlist.simple;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Link {

    private int key;
    private Link next;

    public Link(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " " + key;
    }
}
