package trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Leetcode 212
 * https://leetcode-cn.com/problems/word-search-ii/
 */
public class Solution_212 {
    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        int width = board.length;
        int height = board[0].length;
        boolean[][] mark = new boolean[width][height];
        Set<String> result = new HashSet<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                find(board, i, j, width, height, mark, trie.root, result);
            }
        }
        return new ArrayList<>(result);
    }

    private void find(char[][] board, int i, int j, int width, int height, boolean[][] mark, TrieNode node,
                      Set<String> result) {
        if (i < 0 || j < 0 || i >= width || j >= height || mark[i][j]) {
            return;
        }
        node = node.children[board[i][j] - 'a'];
        if (node == null) {
            return;
        }
        if (node.word != null) {
            result.add(node.word);
        }

        mark[i][j] = true;
        find(board, i - 1, j, width, height, mark, node, result);
        find(board, i, j - 1, width, height, mark, node, result);
        find(board, i + 1, j, width, height, mark, node, result);
        find(board, i, j + 1, width, height, mark, node, result);
        mark[i][j] = false;
    }

    class Trie {
        TrieNode root = new TrieNode();

        void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.word = word;
        }
    }

    class TrieNode {
        String word;
        TrieNode[] children = new TrieNode[26];
    }
}
