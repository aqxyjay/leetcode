package tree;

/**
 * https://leetcode-cn.com/problems/binary-tree-upside-down/
 */
public class Solution_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            invert(root.left);
        }
        if (root.right != null) {
            invert(root.right);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
