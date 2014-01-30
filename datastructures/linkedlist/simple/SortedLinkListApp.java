package linkedlist.simple;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortedLinkListApp {

    public static void main(String[] args) {
        SortedLinkList sortedLinkList = new SortedLinkList();

        sortedLinkList.insert(33);
        sortedLinkList.insert(11);
        sortedLinkList.insert(66);
        sortedLinkList.insert(22);
        sortedLinkList.insert(44);

        sortedLinkList.display();

        sortedLinkList.insert(1);
        sortedLinkList.insert(100);

        sortedLinkList.display();

        sortedLinkList.delete();
        sortedLinkList.display();
        sortedLinkList.delete();
        sortedLinkList.display();

    }
}
