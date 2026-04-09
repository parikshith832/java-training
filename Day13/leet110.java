package Day13;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class leet110 {

    // Function to check if tree is balanced
    public static boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    // Helper function
    private static int check(TreeNode root) {
        if (root == null)
            return 0;

        int left = check(root.left);
        int right = check(root.right);

        // If unbalanced
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        /*
         * Balanced Tree Example:
         * 
         * 1
         * / \
         * 2 3
         * / \
         * 4 5
         * 
         * Output: true
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        boolean result = isBalanced(root);
        System.out.println("Is tree balanced? " + result);
    }
}
