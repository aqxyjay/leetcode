import java.util.*;

public class Solution_126 {
    private Map<String, Set<String>> neighborMap;

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> results = new ArrayList<>();
        if (!wordList.contains(endWord)) {
            return results;
        }
        neighborMap = constructMap(beginWord, endWord, wordList);
        if (neighborMap.isEmpty()) {
            return results;
        }
        Map<String, Set<String>> map = new HashMap<>();
        bfs(map, beginWord, endWord);
        List<String> result = new ArrayList<>();
        result.add(beginWord);
        dfs(map, results, beginWord, endWord, result);
        return results;
    }

    private void dfs(Map<String, Set<String>> map, List<List<String>> results, String word, String endWord,
                     List<String> result) {
        if (word.equals(endWord)) {
            results.add(new ArrayList<>(result));
            return;
        }
        if (!map.containsKey(word)) {
            return;
        }
        for (String neighbor : map.get(word)) {
            result.add(neighbor);
            dfs(map, results, neighbor, endWord, result);
            result.remove(result.size() - 1); // 保证列表为空
        }
    }

    private void bfs(Map<String, Set<String>> map, String beginWord, String endWord) {
        boolean found = false;
        Set<String> marks = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        marks.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Set<String> queueMarks = new HashSet<>();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (!neighborMap.containsKey(word)) {
                    continue;
                }
                Set<String> neighbors = new HashSet<>(neighborMap.get(word));
                Iterator<String> iterator = neighbors.iterator();
                while (iterator.hasNext()) {
                    String neighbor = iterator.next();
                    if (!marks.contains(neighbor)) {
                        if (neighbor.equals(endWord)) {
                            found = true;
                        }
                        queue.offer(neighbor);
                        queueMarks.add(neighbor);
                    } else {
                        iterator.remove();
                    }
                }
                map.put(word, neighbors);
            }
            marks.addAll(queueMarks);
            if (found) {
                break;
            }
        }
    }

    private Map<String, Set<String>> constructMap(String beginWord, String endWord, List<String> wordList) {
        Map<String, Set<String>> map = new HashMap<>();
        if (!wordList.contains(beginWord)) {
            wordList.add(beginWord);
        }
        if (!wordList.contains(endWord)) {
            wordList.add(endWord);
        }
        for (String word1 : wordList) {
            char[] chars1 = word1.toCharArray();
            for (String word2 : wordList) {
                char[] chars2 = word2.toCharArray();
                int diff = 0;
                for (int k = 0; k < chars1.length; k++) {
                    if (chars1[k] != chars2[k]) {
                        diff++;
                    }
                }
                if (diff == 1) {
                    if (map.containsKey(word1)) {
                        map.get(word1).add(word2);
                    }
                    map.putIfAbsent(word1, new HashSet<>(Arrays.asList(word2)));
                }
            }
        }
        return map;
    }
}
