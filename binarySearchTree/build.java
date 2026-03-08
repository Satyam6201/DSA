package binarySearchTree;

public class build {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node inserte(Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }
        // left side method
        if (root.data > value) {
            root.left = inserte(root.left, value);
        }
        else{
            // Right side 
            root.right = inserte(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {  //5 == 5(key)
            return true;
        }

        if(root.data > key) {  // 5 > key
            return search(root.left, key);
        }
        else{  //5 < key
            return search(root.right, key);
        }
    }
    
    public static void main(String[] args) {

     /*
                     5
                   /   \
                  1     7
                   \
                    3
                   / \
                  2   4
      */
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i = 0; i< values.length; i++) {
            root = inserte(root, values[i]);
        }

        // inOrder(root); //1 2 3 4 5 7 
        // System.out.println();

        int key = 2;
        if (search(root, key)) {
            System.out.println(key + " is found");  //2 is found
        }
        else{
            System.out.println(key + " is not found");
        }
    }
}
