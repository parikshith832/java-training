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

public class leet236 {

    // Function to find LCA
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // base case: if root is null or matches p/q
        if (root == null || root == p || root == q) {
            return root;
        }

        // search in left and right subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // if both sides return non-null → current node is LCA
        if (left != null && right != null) {
            return root;
        }

        // otherwise return the non-null side
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {

        // Sample Tree
        // 3
        // / \
        // 5 1
        // / \ / \
        // 6 2 0 8
        // / \
        // 7 4

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left; // node 5
        TreeNode q = root.left.right.right; // node 4

        TreeNode lca = lowestCommonAncestor(root, p, q);

        System.out.println("LCA: " + lca.val); // Output: 5
    }
}