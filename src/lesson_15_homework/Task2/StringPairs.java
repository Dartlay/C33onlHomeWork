package lesson_15_homework.Task2;

import java.util.HashMap;
import java.util.Map;

public class StringPairs {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();


        for (String str : strings) {
            String key = String.valueOf(str.charAt(0));
            String value = String.valueOf(str.charAt(str.length() - 1));
            resultMap.put(key, value);
        }

        return resultMap;
    }
}
