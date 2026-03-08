package binaryTree;

public class heightOfTree {
    static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }

        // Height of the tree:- O(n)
        
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            // calculater max height:-
            int maxHeight = Math.max(leftHeight, rightHeight) + 1;
            return maxHeight;
        }

        // Total no. of Nodes:-O(n)

        public static int count(Node root){
            if(root ==  null) {
                return 0;
            }

            int leftCount = count(root.left); // 
            int rightCount = count(root.right);

            int treeCount = leftCount + rightCount + 1;
            return treeCount;
        }

        // Sum of the Node :-

        public static int sumOfNode(Node root){
            if(root == null){
                return 0;
            }
            int leftRootSum = sumOfNode(root.left);
            int rightRootSum = sumOfNode(root.right);

            int totalSum = leftRootSum + rightRootSum + root.data;
            return totalSum;
        }
    }

    
    public static void main(String[] args) {

            //        1
            //       /  \
            //      2     3
            //     / \   / \
            //    4   5 6   7

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);


            //        1
            //       /  \
            //      2     3
            //     / \   
            //    4   5 
            //         \
            //          6
            //           \
            //            7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // System.out.println(root.height(root));

        // System.out.println(root.count(root));
        
        System.out.println(root.sumOfNode(root));
    }
}
