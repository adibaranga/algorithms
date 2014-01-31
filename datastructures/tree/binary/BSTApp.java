package tree.binary;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/27/14
 * Time: 10:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class BSTApp {

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(12);
        bst.insert(37);
        bst.insert(43);
        bst.insert(34);
        bst.insert(88);
        bst.insert(93);
        bst.insert(97);
        bst.insert(10);
        bst.insert(60);

        Node node = bst.find(43);
        if (node != null) {
            System.out.println("Found node " + node.data);
        } else {
            System.out.println("Couldn't find this node, but should be in tree!!!!");
        }


        node = bst.find(12);
        if (node != null) {
            System.out.println("Found node " + node.data);
        } else {
            System.out.println("Couldn't find this node, but should be in tree!!!!");
        }

        node = bst.find(93);
        if (node != null) {
            System.out.println("Found node " + node.data);
        } else {
            System.out.println("Couldn't find this node, but should be in tree!!!!");
        }

        node = bst.find(38);
        if (node != null) {
            System.out.println("Found node " + node.data + " but should not be in tree!");
        } else {
            System.out.println("Couldn't find this node");
        }

        Node minNode = bst.findMin();
        System.out.println("Found min " + minNode.data);

        Node maxNode = bst.findMax();
        System.out.println("Found max " + maxNode.data);

        bst.traverseInOrder();

        boolean deleted = bst.delete(34);
        System.out.println("Deleted node 34: " + deleted);
        bst.traverseInOrder();

        deleted = bst.delete(65);
        System.out.println("Deleted node 65: " + deleted);
        bst.traverseInOrder();

        deleted = bst.delete(75);
        System.out.println("Deleted node 75: " + deleted);
        bst.traverseInOrder();

        deleted = bst.delete(25);
        System.out.println("Deleted node 25: " + deleted);
        bst.traverseInOrder();

    }
}
