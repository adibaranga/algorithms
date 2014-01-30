package linkedlist.simple;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkListApp {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        linkList.insertFirst(10);
        linkList.insertFirst(20);
        linkList.insertFirst(30);
        linkList.insertFirst(40);
        linkList.insertFirst(50);
        linkList.insertFirst(60);

        linkList.display();

        Link elem = linkList.find(50);
        if (elem != null) {
            System.out.println("Found elem " + elem);
        } else {
            System.out.println("Can't find elem");
        }

        elem = linkList.find(45);
        if (elem != null) {
            System.out.println("Found elem " + elem);
        } else {
            System.out.println("Can't find elem");
        }

        elem = linkList.delete(20);
        if (elem != null) {
            System.out.println("Deleted elem " + elem);
        } else {
            System.out.println("Can't find elem");
        }

        linkList.display();

        elem = linkList.delete(25);
        if (elem != null) {
            System.out.println("Deleted elem " + elem);
        } else {
            System.out.println("Can't find elem");
        }

        linkList.display();
    }
}
