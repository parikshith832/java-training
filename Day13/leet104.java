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

public class leet104 {

    // Function to find max depth
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxleft = maxDepth(root.left);
        int maxright = maxDepth(root.right);

        return 1 + Math.max(maxleft, maxright);
    }

    public static void main(String[] args) {
        /*
         * Sample Tree:
         * 1
         * / \
         * 2 3
         * /
         * 4
         * 
         * Expected Depth = 3
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int depth = maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: " + depth);
    }
}
