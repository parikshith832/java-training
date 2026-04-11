package Day15;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leet543 {

    static int diameter = 0; // stores maximum diameter

    // Main function
    public static int diameterOfBinaryTree(TreeNode root) {
        height(root); // compute height and update diameter
        return diameter;
    }

    // Function to calculate height of tree
    private static int height(TreeNode node) {

        if (node == null)
            return 0; // base case

        int left = height(node.left); // left subtree height
        int right = height(node.right); // right subtree height

        // diameter = max path through current node
        diameter = Math.max(diameter, left + right);

        // return height of current node
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        // Sample Tree
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        int result = diameterOfBinaryTree(root);

        System.out.println("Diameter: " + result); // Output: 3
    }
}