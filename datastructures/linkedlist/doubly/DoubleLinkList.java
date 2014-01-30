package linkedlist.doubly;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class DoubleLinkList {
    private Link first;
    private Link last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int data) {
        Link newLink = new Link(data);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }

        last = newLink;
    }

    public Link deleteFirst() {
        if (!isEmpty()) {
            Link temp = first;
            if (first.next == null) {
                last = null;
            } else {
                first.next.previous = null;
            }
            first = first.next;
            return temp;
        }
        return null;
    }

    public Link deleteLast() {
        if (!isEmpty()) {
            Link temp = last;
            if (last.previous == null) {
                first = null;
            } else {
                last.previous.next = null;
            }
            last = last.previous;
            return temp;
        }

        return null;
    }

    public boolean insertAfter(int key, int value) {
        if (!isEmpty()) {
            Link current = first;
            while (current.data != key) {
                current = current.next;
                if (current == null) {
                    return false;
                }
            }

            Link newLink = new Link(value);

            if (current == last) {
                newLink.next = null;
                last = newLink;
            } else {
                newLink.next = current.next;
                current.next.previous = newLink;
            }

            current.next = newLink;
            newLink.previous = current;
            return true;

        }
        return false;
    }

    public Link delete(int key) {
        if (!isEmpty()) {
            Link current = first;
            while (current.data != key) {
                current = current.next;
                if (current == null) {
                    return null;
                }
            }

            Link temp = current;
            if (current == first) {
                first = current.next;
            } else {
                current.previous.next = current.next;
            }

            if (current == last) {
                last = current.previous;
            }
            current.next.previous = current.previous;

            return temp;
        }
        return null;
    }

    public void displayForward() {
        System.out.println("List first -> last: ");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.println("List last -> first: ");
        Link current = last;
        while (current != null) {
            current.display();
            current = current.previous;
        }
        System.out.println("");
    }
}
