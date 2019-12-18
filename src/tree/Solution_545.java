package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/boundary-of-binary-tree/
 */
public class Solution_545 {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        if (root.left == null && root.right == null) {
            return Collections.singletonList(root.val);
        }
        List<Integer> left = findLeft(root);
        List<Integer> leaf = findLeaf(root);
        List<Integer> right = findRightReverse(root);

        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        result.addAll(left);
        result.addAll(leaf);
        result.addAll(right);
        return result;
    }

    private List<Integer> findLeft(TreeNode root) {
        if (root.left == null) {
            return Collections.emptyList();
        }
        List<Integer> left = new ArrayList<>();
        TreeNode node = root;
        while (true) {
            if (node.left != null) {
                left.add(node.left.val);
                node = node.left;
            } else if (node.right != null) {
                left.add(node.right.val);
                node = node.right;
            } else {
                break;
            }
        }
        return left.subList(0, left.size() - 1);
    }

    private List<Integer> findLeaf(TreeNode root) {
        List<Integer> leaf = new ArrayList<>();
        find(root, leaf);
        return leaf;
    }

    private void find(TreeNode node, List<Integer> leaf) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leaf.add(node.val);
            return;
        }
        if (node.left != null) {
            find(node.left, leaf);
        }
        if (node.right != null) {
            find(node.right, leaf);
        }
    }

    private List<Integer> findRightReverse(TreeNode root) {
        if (root.right == null) {
            return Collections.emptyList();
        }
        List<Integer> right = new ArrayList<>();
        TreeNode node = root;
        while (true) {
            if (node.right != null) {
                right.add(node.right.val);
                node = node.right;
            } else if (node.left != null) {
                right.add(node.left.val);
                node = node.left;
            } else {
                break;
            }
        }
        right = right.subList(0, right.size() - 1);
        Collections.reverse(right);
        return right;
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
