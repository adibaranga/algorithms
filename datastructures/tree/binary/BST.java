package tree.binary;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/27/14
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class BST {

    private Node root;

    public Node find(int key) {
        Node current = root;

        if (root == null) {
            return null;
        }

        while (current.data != key) {
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;
                if (key < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin() {
        Node current = root;
        if (root == null) {
            return null;
        }

        Node parent = null;
        while (current != null) {
            parent = current;
            current = current.left;
        }
        return parent;
    }

    public Node findMax() {
        Node current = root;
        if (root == null) {
            return null;
        }

        Node parent = null;
        while (current != null) {
            parent = current;
            current = current.right;
        }
        return parent;
    }

    public boolean delete(int key) {
        if (root == null) {
            return false;
        }

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.data != key) {
            parent = current;
            if (key < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }

        //found node to delete: current
        if (current.left == null && current.right == null) {
            // no children, delete leaf
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            // has only left child
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            // has only right child
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            // has left and right children
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    private Node getSuccessor(Node delNode) {
        Node parent = delNode;

        Node successor = delNode;
        Node current = delNode.right;
        while (current != null) {
            parent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != delNode.right) {
            parent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public void traverseInOrder() {
        System.out.println("");
        traverseInOrder(root);
        System.out.println("");
    }

    private void traverseInOrder(Node localRoot) {
        if (localRoot != null) {
            traverseInOrder(localRoot.left);
            System.out.print(localRoot);
            traverseInOrder(localRoot.right);
        }
    }

}
