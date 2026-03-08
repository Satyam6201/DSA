package binaryTree;

import java.util.*;

public class Question {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // Qs.1:- (is subRoot is avilable or not)

        public static boolean isIdentity(Node root, Node subRoot){
            if(root == null && subRoot == null){
                return true;
            }
            else if(root == null || subRoot == null || root.data != subRoot.data){
                return false;
            }
            if (!isIdentity(root.left, subRoot.left)) {
                return false;
            }
            if(!isIdentity(root.right, subRoot.right)) {
                return false;
            }
            return true;
        }
        public static boolean isSubTree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if(isIdentity(root, subRoot)) {
                    return true;
                }
            }
            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }
    }
        //Qs.3 Find Kth level of the tree:-

        public static void kthLevel(Node root, int k){
            if(root == null) {
                return;
            }
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            int level = 1;

            while (!q.isEmpty()) {
                int size = q.size();
                if (level == k) {
                    for(int i = 0; i< size; i++) {
                        Node currNode = q.remove();
                        System.out.print(currNode.data + " ");
                    }
                    return;
                }
                for(int i = 0; i< size; i++){
                    Node currNode = q.remove();
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
                level++;
            }
        }

        // Other method of the Kth level:-

        public static void KthLevel(Node root, int level, int k){
            if(root == null) {
                return;
            }

            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            KthLevel(root.left, level + 1, k);
            KthLevel(root.right, level + 1, k);
        }
    //QS.2:-  Top View of the tree :-

    static class Info{
        Node node;  // value
        int hd;   // Horizental Distance (Key{Unique})

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
        public static void topView(Node root){
            Queue <Info> q = new LinkedList<>();
            HashMap <Integer, Node> map = new HashMap<>();

            int min = 0;
            int max = 0;

            // Level order Traversaing:-

            q.add(new Info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info curr = q.remove();
                if(curr == null) {
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if (!map.containsKey(curr.hd)) {  //First time my Horizental distance occure
                        map.put(curr.hd, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);  // min = -1
                    }
                    if(curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);  // max = 2
                    }
                }
            }
            for(int i = min; i<= max; i++) {   // from -1 to 2
                System.out.print(map.get(i).data + " ");
            }
        }

        // QS.4 :- (Lowest common Ancestor)

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {
            if(root == null) {
                return false;
            }

            path.add(root);

            if(root.data == n) {
                return true;
            }
            boolean leftPath = getPath(root.left, n, path);
            boolean rightPath = getPath(root.right, n, path);

            if (leftPath || rightPath) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node lowestCommonAncestor(Node root, int n1, int n2) {  //O(n)
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // last common Ancestor:-
            int i = 0;
            for(; i< path1.size() && i< path2.size(); i++){
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i-1);
            return lca;
        }


        // Other method:-

        public static Node lowestCommonAncestor2(Node root, int n1, int n2) {

            if(root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lowestCommonAncestor2(root.left, n1, n2);
            Node rightLca = lowestCommonAncestor2(root.right, n1, n2);

            // if both value is in leftLca:-
            if (rightLca == null) {
                return leftLca;
            }
            // if both value is in rightLca:-
            if (leftLca == null) {
                return rightLca;
            }
            // If one value is in leftLca & one is in rightLca:-
            return root;
        }


        // QS.5:- (Minimum distance between two node):-

        public static int lcaDistance(Node root, int n) {
            if(root == null) {
                return -1;
            }
            if(root.data == n) {
                return 0;
            }

            int leftDistance = lcaDistance(root.left, n);
            int rightDistance = lcaDistance(root.right, n);

            if (leftDistance == -1 && rightDistance == -1) {
                return -1;
            }
            else if (leftDistance == -1) {
                return rightDistance + 1;
            }
            else{
                return leftDistance + 1;
            }
        }

        public static Node lca(Node root, int n1, int n2) {
            if(root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lca(root.left, n1, n2);
            Node rightLca = lca(root.right, n1, n2);
            
            if (rightLca == null) {
                return leftLca;
            }
            if (leftLca == null) {
                return rightLca;
            }
            return root;
        }

        public static int minDistace(Node root, int n1, int n2) {
            Node lca = lca(root, n1, n2);

            int distance1 = lcaDistance(lca, n1);
            int distance2 = lcaDistance(lca, n2);

            return distance1 + distance2;
        }

        // Qs.6:- Kth Ancestor of the node:-

        public static int KthAncestor(Node root, int n, int k){
            if(root == null) {
                return -1;
            }

            if(root.data == n) {
                return 0;
            }

            int leftDistance = KthAncestor(root.left, n, k);
            int rightDistance = KthAncestor(root.right, n, k);

            if(leftDistance == -1 && rightDistance == -1) {
                return -1;
            }

            int max = Math.max(leftDistance, rightDistance);

            if(max + 1 == k) {
                System.out.println(root.data);
            }
            return max + 1;
        }

        // Qs.7:- (Sum of the node):-

        public static int sumOfNode(Node root) {
            if (root == null) {
                return 0;
            }

            int leftChild = sumOfNode(root.left);
            int rightChild = sumOfNode(root.right);

            int data = root.data;
            int newLeft;
            int newRight;
            if (root.left == null) {
                return 0;
            }
            else{
                newLeft = root.left.data ;
            }
            if (root.right == null) {
                return 0;
            }
            else{
                newRight = root.right.data;
            }
            root.data = newLeft + leftChild + newRight + rightChild;
            return data;
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
            //         1
            //       /   \
            //      2     3
            //     / \   / \
            //    4   5 6   7

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);

            root.right.right = new Node(7);

            // //      2 
            // //     / \   
            // //    4   5
            // Node subRoot = new Node(2);
            // subRoot.left = new Node(4);
            // subRoot.right = new Node(5);

            // System.out.println(root.isSubTree(root, subRoot));  // True
            // topView(root);  // 4 2 1 3 7 
            // kthLevel(root, 3);  //4 5 6 7 
            // KthLevel(root, 1, 2); //2 3 
            // System.out.print(lowestCommonAncestor(root, 4, 5).data);  //2
            // System.out.print(lowestCommonAncestor2(root, 4, 7).data);  //1
            // System.out.print(minDistace(root, 4, 7)); //4
            // KthAncestor(root, 5, 1); // 2

            sumOfNode(root);
            preOrder(root);
    }
}
