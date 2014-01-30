package linkedlist.simple;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkList {

    private Link first;

    public void insertFirst(int key) {
        Link newLink = new Link(key);
        newLink.setNext(first);
        first = newLink;
    }

    public Link find(int key) {
        Link current = first;

        while (current != null) {
            if (current.getKey() == key) {
                return current;
            } else {
                current = current.getNext();
            }
        }

        return null;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;

        while (current != null) {
            if (current.getKey() == key) {
                if (current == first) {
                    first = first.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                return current;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        return null;
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
