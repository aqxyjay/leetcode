package tree;

/**
 * https://leetcode-cn.com/problems/binary-tree-upside-down/
 */
public class Solution_156 {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        return upsideDown(null, root);
    }

    private TreeNode upsideDown(TreeNode parent, TreeNode node) {
        if (node == null) {
            return parent;
        }
        TreeNode newNode = upsideDown(node, node.left);
        if (parent != null) {
            node.left = parent.right;
        } else {
            node.left = null;
        }
        node.right = parent;
        return newNode;
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
