package binarySearchTree;

import java.util.ArrayList;

public class deleteNode {
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

    public static Node delete(Node root, int value) {
        if (root.data < value) {
            root.right = delete(root.right, value);
        }
        else if (root.data > value) {
            root.left = delete(root.left, value);
        }
        else{
            // Case 1(for leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2(for one child)
            if (root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            // Case 3(For Two child)
            Node is = findInOrderSeccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node findInOrderSeccessor(Node root) {
        while (root.left != null) {
            root = root.left;
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

     // print In the range :-

     public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        }
        else{  // root.data > k2
            printInRange(root.right, k1, k2);
        }
    }

    // Root to leaf paths:-

    public static void printpath(ArrayList<Integer> path) {
        for(int i = 0; i< path.size(); i++) {
            System.out.print(path.get(i) + " ->");
        }
        System.out.println(" Null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printpath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);

        path.remove(path.size()-1);
    }


    // Valid BST:-

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        // if mix is greater then root
        if(min != null && root.data <= min.data) {
            return false;
        }
        // If root is greater then Max
        if(max != null && root.data >= max.data) {
            return false;
        }
        // checking in left(min = anything, max = root) and right(min = root, max = anything) subTree 
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    // Mirror in BST:-

    public static Node mirrorBst(Node root) {
        if(root == null) {
            return null;
        }

        Node leftSubTree = mirrorBst(root.left);
        Node rightSubTree = mirrorBst(root.right);

        root.left = rightSubTree;
        root.right = leftSubTree;

        return root;
    }

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void main(String[] args) {

           /*
                       8
                     /   \
                    5     10
                   / \      \
                  3   6      11
                 / \           \
                1   4           14  
            */
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11,14};
        Node root = null;

        for(int i = 0; i< values.length; i++) {
            root = inserte(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        // root = delete(root, 4);
        // System.out.println();
        // inOrder(root);

        // printInRange(root, 5, 12);  //5 6 8 10 11
        /* 
        8 ->5 ->3 ->1 -> Null
        8 ->5 ->3 ->4 -> Null
        8 ->5 ->6 -> Null
        */
        // printRootToLeaf(root, new ArrayList<>()); 

        // if (isValidBST(root, null, null)) {
        //     System.out.println("This is Valid BST");
        // }
        // else{
        //     System.out.println("This is inValid BST");
        // }

        
        root = mirrorBst(root); 
        /*
                       8
                     /   \
                    10    5
                   /     / \
                  11    6   3
                 /         /  \
                14        1    4   
        */
        preOrder(root);

    }
}
