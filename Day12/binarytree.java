package Day12;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        left = right = null;

    }
}

public class binarytree {
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        System.out.print("inorder: ");
        inorder(root);
        System.out.print("\npostorder: ");
        postorder(root);
        System.out.print("\npreorder: ");
        preorder(root);
    }
}
