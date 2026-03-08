package BTree;

public class BTree {
    // Java program to implement B-Tree
class BTreeNode {
    int[] keys; // Array of keys
    int t; // Minimum degree (defines range for keys)
    BTreeNode[] children; // Array of child pointers
    int n; // Number of keys
    boolean isLeaf; // True if leaf node

    // Constructor
    BTreeNode(int t, boolean isLeaf) {
        this.t = t;
        this.isLeaf = isLeaf;
        this.keys = new int[2 * t - 1]; // Max keys = 2t - 1
        this.children = new BTreeNode[2 * t]; // Max children = 2t
        this.n = 0;
    }

    // Traverse the tree in-order
    public void traverse() {
        int i;
        for (i = 0; i < n; i++) {
            if (!isLeaf) {
                children[i].traverse();
            }
            System.out.print(keys[i] + " ");
        }
        if (!isLeaf) {
            children[i].traverse();
        }
    }

    // Search key in B-Tree
    public BTreeNode search(int k) {
        int i = 0;
        while (i < n && k > keys[i]) {
            i++;
        }
        if (i < n && keys[i] == k) {
            return this;
        }
        if (isLeaf) {
            return null;
        }
        return children[i].search(k);
    }

    // Insert a new key
    public void insertNonFull(int k) {
        int i = n - 1;

        if (isLeaf) {
            while (i >= 0 && keys[i] > k) {
                keys[i + 1] = keys[i];
                i--;
            }
            keys[i + 1] = k;
            n++;
        } else {
            while (i >= 0 && keys[i] > k) {
                i--;
            }
            if (children[i + 1].n == 2 * t - 1) {
                splitChild(i + 1, children[i + 1]);

                if (keys[i + 1] < k) {
                    i++;
                }
            }
            children[i + 1].insertNonFull(k);
        }
    }

    // Split child y of this node at index i
    public void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.t, y.isLeaf);
        z.n = t - 1;

        for (int j = 0; j < t - 1; j++) {
            z.keys[j] = y.keys[j + t];
        }
        if (!y.isLeaf) {
            for (int j = 0; j < t; j++) {
                z.children[j] = y.children[j + t];
            }
        }
        y.n = t - 1;

        for (int j = n; j > i; j--) {
            children[j + 1] = children[j];
        }
        children[i + 1] = z;

        for (int j = n - 1; j >= i; j--) {
            keys[j + 1] = keys[j];
        }
        keys[i] = y.keys[t - 1];
        n++;
    }
}

// BTree class
    BTreeNode root;
    int t; // Minimum degree

    public BTree(int t) {
        this.t = t;
        this.root = null;
    }

    // Insert a key in the B-Tree
    public void insert(int k) {
        if (root == null) {
            root = new BTreeNode(t, true);
            root.keys[0] = k;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                BTreeNode s = new BTreeNode(t, false);
                s.children[0] = root;
                s.splitChild(0, root);
                int i = (s.keys[0] < k) ? 1 : 0;
                s.children[i].insertNonFull(k);
                root = s;
            } else {
                root.insertNonFull(k);
            }
        }
    }

    // Traverse the tree
    public void traverse() {
        if (root != null) {
            root.traverse();
        }
        System.out.println();
    }

    // Search for a key
    public boolean search(int k) {
        return root != null && root.search(k) != null;
    }

// Main class

    public static void main(String[] args) {
        BTree tree = new BTree(3); // B-Tree of order 3

        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(6);
        tree.insert(12);
        tree.insert(30);
        tree.insert(7);
        tree.insert(17);

        System.out.println("In-order traversal of B-Tree:");
        tree.traverse();

        int key = 12;
        System.out.println("Search for key " + key + ": " + (tree.search(key) ? "Found" : "Not Found"));
    }
}
