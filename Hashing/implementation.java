package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class implementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of key-value pairs
        private int N; // number of buckets
        private LinkedList<Node> bucket[]; //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i = 0; i< 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;

            for(int i = 0; i< ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[N*2];
            N = 2*N;

            for(int i = 0; i< bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for(int i = 0; i< oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for(int j = 0; j< ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value) {  //O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // valid:- -1

            if(di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            else{
                bucket[bi].add(new Node(key, value));
                n++;
            }
            
            double lambda = (double)n/N;
            if (lambda > 2.0) {
                reHash();
            }
        }

        public boolean containsKey(K key) {  //O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // valid:- -1

            if(di != -1) {
               return true;
            }
            else{
               return false;
            }
        }

        public V remove(K key) { //O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // valid:- -1

            if(di != -1) {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public V get(K key) {   //O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInLL(key, bi); // valid:- -1

            if(di != -1) {
                Node node = bucket[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i< bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for(Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 130);
        hm.put("China", 150);
        hm.put("USA", 60);
        hm.put("Nepal", 30);
        hm.put("UK", 55);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
