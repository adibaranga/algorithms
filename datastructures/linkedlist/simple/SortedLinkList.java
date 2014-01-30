package linkedlist.simple;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortedLinkList {

    private Link first;

    public void insert(int key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.getKey()) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            first = newLink;
        } else {
            previous.setNext(newLink);
        }
        newLink.setNext(current);
    }

    public Link delete() {
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        Link current = first;

        System.out.println("");
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }

        System.out.println("");
    }
}
