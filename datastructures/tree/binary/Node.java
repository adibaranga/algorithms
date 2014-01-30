package tree.binary;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/27/14
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}
