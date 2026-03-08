package Trie;

public class prefixProblem {
    static class Node {
        Node children[] = new Node[26];
        boolean endOfWord = false;
        int freq;

        public Node() {
            for(int i = 0; i< children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    // Insert:-
    public static void insertInprefix(String word) {
        Node curr = root;
        curr.freq = -1;

        for(int level = 0; level< word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            else{
                curr.children[index].freq++;
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }

    // find prefix :-

    public static void findPrefix(Node root, String ans) {  //O(L)

        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }
        
        for(int i = 0; i< root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        for(int i = 0; i< arr.length; i++) {
            insertInprefix(arr[i]);
        }

        root.freq = -1;
        findPrefix(root, "");  
        /*  ANS =
         dog
         dov
         du
         z
        */

    }
}
