package lesson_15_homework.Task1;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            resultMap.put(word, countMap.get(word) >= 2);
        }

        return resultMap;
    }
}

