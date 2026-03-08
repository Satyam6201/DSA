package AVLTree;

public class AVLTree {
    static class Node{
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        return root.height;
    }

    static int max (int a, int b) {
        return (a > b) ? a : b;
    }

    // Get Balance Factor of Node

    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation 
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Right rotate subTree rooted with y 
    public static Node rigthRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform Rotation
        x.right = y;
        y.left = T2;

        // Update Heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) 
            root.left =insert(root.left, key);
        else if (key > root.data) 
            root.right = insert(root.right, key);
        else
        return root;  // Duplicate keys are not allowed

        // Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get root balnce factor
        int bf = getBalance(root);

        // Left left case:(LL case)
        if (bf > 1 && key < root.left.data) 
            return rigthRotate(root);
        

        // Right Right Case(RR Case):-
        if (bf < -1 && key > root.right.data) 
            return leftRotate(root);

        // Left Right Case(LR Case):-
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rigthRotate(root);
        }
        // Right Left Case(RL Case):-
        if (bf < -1 && key < root.right.data) {
            root.right = rigthRotate(root.right);
            return leftRotate(root);
        }
        // Return if AVL balanced
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);


        // ANS :- 
        /*
              30
             /  \
            20   40
            / \    \
           10  25   50
        */
        preOrder(root);
    }
}
