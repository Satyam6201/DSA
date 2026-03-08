package Trie;

public class Question {
    static class Node{
        Node children[] = new Node[26];  //'a' to 'z'
        boolean endOfWord = false;

        Node() {
            for(int i = 0; i< 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

            // Insert:-

    public static void insert(String word) {  //  O(L)
        Node curr = root;

        for(int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {  // place where element is insert is Empty 
                curr.children[index] = new Node();  // Insert the element
            }
            curr = curr.children[index]; // curr = new node 
        }
        curr.endOfWord = true;
    }

            // Search:- 

    public static boolean search(String key) {  //O(L)
        Node curr = root;

        for(int level = 0; level< key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (curr.children[index] == null) {
                return false;   //index is empty then it is false
            }
            curr = curr.children[index];
        }
        return curr.endOfWord == true;  
    }

    // QS.1 (Word Break Problem):-

    public static boolean wordBreak(String key) {
        // Base condition:-
        if (key.length() == 0) {
            return true;
        }
        for(int i = 1; i<= key.length(); i++) {
            //subString(beg index, last index)
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }


    // QS.3:- (StartWith Problem) :-

    public static boolean startWith(String prefix) {
        Node curr = root;

        for(int i = 0; i< prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
    
    // QS.4:- (count unique substring):-

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for(int i = 0; i< 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    
    public static void main(String[] args) {

        // QS.1 (Word Break Problem):-

        /* 
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i< arr.length; i++) {
            insert(arr[i]);
        }
        
        String key = "ilikesamsung";
        System.out.println(wordBreak(key)); //true

        String keys = "ilikeicecream";
        System.out.println(wordBreak(keys));  //false

        */

        // QS.3(StartWith Problem):- 

        /* 
        String arr[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "ap";
        String prefix2 = "moon";

        for(int i = 0; i< arr.length; i++) {
            insert(arr[i]);
        }

        System.out.println(startWith(prefix1));   //true
        System.out.println(startWith(prefix2));   //false
        */

        // QS.4:- (count unique substring):-

        String str = "ababa";

        for(int i = 0; i< str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNode(root));
    }
}
