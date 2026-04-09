package Day13;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bstmain {
    static Node root = null;

    // insertion
    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        return root;

    }
    // searching

    static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    static Node delete(Node root, int key) {
        if (root == null)
            return null;
        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key < root.data)
            root.right = delete(root.right, key);
        else {
            // case 1: no child
            if (root.left == null && root.right == null)
                return null;
            // case 2: one child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            // case 3: two child
            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);

        }
        return root;
    }

    static Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int values[] = { 50, 30, 70, 20, 40, 60, 80 };
        for (int val : values) {
            root = insert(root, val);
        }
        System.out.print("Inorder: ");
        inorder(root);
        // search
        int searchkey = 40;
        System.out.println("\nSearch " + searchkey + ": " + search(root, searchkey));
        // deleting
        int deletekey = 50;
        root = delete(root, deletekey);
        System.out.print("after deleting:");
        inorder(root);
    }
}
