package Trie;

public class Basic {
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


    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        
        for(int i = 0; i< words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("thee")); //true
        System.out.println(search("thor")); //false
    }
}
