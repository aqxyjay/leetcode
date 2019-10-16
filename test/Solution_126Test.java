import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_126Test {
    private Solution_126 solution = new Solution_126();

    @Test
    public void test001() {
        String begin = "qa";
        String end = "sq";
        List<String> words = new ArrayList<>(
                Arrays.asList("si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av",
                        "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po",
                        "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb",
                        "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di",
                        "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn",
                        "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq",
                        "ye"));
        List<List<String>> result = solution.findLadders(begin, end, words);
        assertFalse(result.isEmpty());
    }

    @Test
    public void test002() {
        String begin = "hit";
        String end = "cog";
        List<String> words = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        List<List<String>> result = solution.findLadders(begin, end, words);
        assertFalse(result.isEmpty());
    }

    @Test
    public void test003() {
        String begin = "talk";
        String end = "tail";
        List<String> words = new ArrayList<>(Arrays.asList("talk", "tons", "fall", "tail", "gale", "hall", "negs"));
        List<List<String>> result = solution.findLadders(begin, end, words);
        assertTrue(result.isEmpty());
    }
}