package binaryTree;

public class diameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // Height of the Tree:-

        public static int height(Node root){ // O(n)
            if(root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int maxHeight = Math.max(leftHeight, rightHeight) + 1;
            return maxHeight;
        }

        // Diameter of the tree:-

        public static int diameterOfTrees(Node root){  // O(n^2)
            if(root == null) {
                return 0;
            }

            int leftDiameter = diameterOfTrees(root.left);
            int rightDiameter = diameterOfTrees(root.right);

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int selfDiameter = leftHeight + rightHeight + 1;
            int l_r_Diameter = Math.max(leftDiameter, rightDiameter);
            int maxDiameter = Math.max(l_r_Diameter, selfDiameter);
            return maxDiameter;
        }

        // 2nd Approach:-

        static class Info{
            int diameter;
            int ht;

            public Info(int diameter, int ht){
                this.diameter = diameter;
                this.ht = ht;
            }
        }
        public static Info diameter(Node root){
            if(root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int dia = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(dia, ht);
        }
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

        // System.out.println(root.diameterOfTrees(root));   //5
        System.out.println(root.diameter(root).diameter);    //5
        System.out.println(root.diameter(root).ht);          //3

    }
}
