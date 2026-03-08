package RedBlackTree;

public class RedBlackTree {
    // Java program to implement Red-Black Tree

    private class Node {
        int data;
        Node parent, left, right;
        boolean isRed;

        Node(int data) {
            this.data = data;
            this.isRed = true; // New nodes are always red
            this.left = this.right = this.parent = null;
        }
    }

    private Node root;
    private final Node NIL; // Sentinel NIL node

    public RedBlackTree() {
        NIL = new Node(0);
        NIL.isRed = false;
        root = NIL;
    }

    // Left rotation
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;

        if (y.left != NIL) {
            y.left.parent = x;
        }

        y.parent = x.parent;

        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }

        y.left = x;
        x.parent = y;
    }

    // Right rotation
    private void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;

        if (y.right != NIL) {
            y.right.parent = x;
        }

        y.parent = x.parent;

        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }

        y.right = x;
        x.parent = y;
    }

    // Insert a node
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.left = newNode.right = NIL;

        Node parent = null;
        Node current = root;

        while (current != NIL) {
            parent = current;
            if (newNode.data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        newNode.parent = parent;

        if (parent == null) {
            root = newNode;
        } else if (newNode.data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        newNode.isRed = true;
        fixInsert(newNode);
    }

    // Fix violations after insertion
    private void fixInsert(Node node) {
        while (node.parent != null && node.parent.isRed) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;

                if (uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        leftRotate(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    rightRotate(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;

                if (uncle.isRed) {
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node.parent.parent.isRed = true;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rightRotate(node);
                    }
                    node.parent.isRed = false;
                    node.parent.parent.isRed = true;
                    leftRotate(node.parent.parent);
                }
            }
        }
        root.isRed = false;
    }

    // In-order traversal
    public void inorderTraversal(Node node) {
        if (node != NIL) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void printTree() {
        inorderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        rbt.insert(10);
        rbt.insert(20);
        rbt.insert(30);
        rbt.insert(15);
        rbt.insert(25);
        rbt.insert(5);
        rbt.insert(1);

        System.out.print("In-order traversal of Red-Black Tree: - ");
        rbt.printTree();
    }
}

