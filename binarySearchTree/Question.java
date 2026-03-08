package binarySearchTree;

import java.util.ArrayList;

public class Question {
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
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // QS.1 :- (Create a BST In the sorted Array):-

    public static Node createBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end)/ 2;
        Node root = new Node(arr[mid]);  // root = 8

        root.left = createBST(arr, start, mid-1);  // create left Node
        root.right = createBST(arr, mid+1, end);  // Create Right Node

        return root;
    }

    // Qs.2:- (Convert Bst to Balance BST):-

    public static void getInOrder(Node root, ArrayList<Integer> inOrder) {
        if(root == null) {
            return;
        }

        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);
    }

    public static Node balanceTree(ArrayList<Integer> inOrder, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(inOrder.get(mid));

        root.left = balanceTree(inOrder, start, mid-1);
        root.right = balanceTree(inOrder, mid+1, end);
        return root;
    }

    public static Node balanceBST(Node root) {  //O(n)
        // Inorder Sequence :-
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        // Balance The tree(sorted in the order)
        root = balanceTree(inOrder, 0, inOrder.size()-1);
        return root;
    }


    // QS:3 :- Size of the largest BST:-

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    // QS.4:- (Merge 2 BST):-

    public static void inOrderBST(Node root, ArrayList<Integer> inOrder) {
        if (root == null) {
            return;
        }
        inOrderBST(root.left, inOrder);
        inOrder.add(root.data);
        inOrderBST(root.right, inOrder);
    }

    public static Node balanceBST(ArrayList<Integer> arr, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = balanceBST(arr, start, mid-1);
        root.right = balanceBST(arr, mid+1, end);

        return root;
    }
    public static Node MergeBST(Node root1, Node root2){
        // Step 1:- Inorder Sequence 1 :-

        ArrayList<Integer> inOrder1 = new ArrayList<>();
        inOrderBST(root1, inOrder1);

        // Step 2:- InOrder sequence 2:-
        ArrayList<Integer> inOrder2 = new ArrayList<>();
        inOrderBST(root2, inOrder2);


        // Step 3:-Merge

        int i = 0;
        int j = 0;
        ArrayList<Integer> finaArr = new ArrayList<>();

        while (i < inOrder1.size() && j < inOrder2.size()) {
            if (inOrder1.get(i) <= inOrder2.get(j)) {
                finaArr.add(inOrder1.get(i));
                i++;
            }
            else{
                finaArr.add(inOrder2.get(j));
                j++;
            }
        }
        while (i< inOrder1.size()) {
            finaArr.add(inOrder1.get(i));
            i++;
        }

        while (j< inOrder2.size()) {
            finaArr.add(inOrder2.get(j));
            j++;
        }
        // Step 4:- Balance BST:-
        return balanceBST(finaArr, 0, finaArr.size()-1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        /*
                     8
                   /   \
                  5     11
                 / \   /  \
                3   6 10   12
         */
        // Node root = createBST(arr, 0, arr.length-1);
        // preOrder(root);


        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);

        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);

         /*
                     8
                   /   \
                  5     11
                 / \   /  \
                3   6 10   12
         */
        // root = balanceBST(root);
        // preOrder(root);


        // QS.3:-

        /*
                    50
                 /     \
                30      60
               /  \    /  \
              5    20 45   70
                           / \
                          65  80
         */
        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.right = new Node(80);
        // root.right.right.left = new Node(65);
        
        // // ANS:- sixe = 5
        // /*
        //             60
        //            /  \
        //           45   70
        //                / \
        //               65  80
        //  */
        
        // Info info = largestBST(root);
        // System.out.print("Max Value = " + maxBST);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = MergeBST(root1, root2);
        preOrder(root);
    }
}
