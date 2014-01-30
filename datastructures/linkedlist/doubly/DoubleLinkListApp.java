package linkedlist.doubly;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class DoubleLinkListApp {

    public static void main(String[] args) {

        DoubleLinkList doubleLinkList = new DoubleLinkList();

        doubleLinkList.insertFirst(22);
        doubleLinkList.insertFirst(44);
        doubleLinkList.insertFirst(66);

        doubleLinkList.displayForward();

        doubleLinkList.insertLast(11);
        doubleLinkList.insertLast(33);
        doubleLinkList.insertLast(55);

        doubleLinkList.displayForward();
        doubleLinkList.displayBackward();

        doubleLinkList.deleteFirst();
        doubleLinkList.deleteLast();
        doubleLinkList.delete(11);

        doubleLinkList.displayForward();

        doubleLinkList.insertAfter(22, 77);
        doubleLinkList.insertAfter(33, 88);

        doubleLinkList.displayForward();
    }
}
