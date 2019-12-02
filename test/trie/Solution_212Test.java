package trie;

import org.junit.Test;
import trie.Solution_212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution_212Test {
    private Solution_212 solution = new Solution_212();

    @Test
    public void findWords() {
        String[] words = {"oath", "pea", "eat", "rain"};
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        List<String> result = solution.findWords(board, words);
        List<String> expected = new ArrayList<>(Arrays.asList("eat", "oath"));
        for (String word : result) {
            assertTrue(expected.contains(word));
        }
    }
}