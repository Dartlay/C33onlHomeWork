package lesson_17_homework.Task2;
import java.util.*;
import java.util.stream.Collectors;

public class DataProcessor {
    private Map<Integer, String> dataMap;
    public DataProcessor() {
        dataMap = new HashMap<>();
        dataMap.put(1, "Алиса");
        dataMap.put(2, "Марк");
        dataMap.put(5, "Игорь");
        dataMap.put(8, "Саша");
        dataMap.put(9, "Глеб");
        dataMap.put(13, "Толик");
        dataMap.put(3, "Маша");
        dataMap.put(4, "Вика");
        dataMap.put(6, "Дима");
        dataMap.put(7, "Надя");
        dataMap.put(10, "Петя");
        dataMap.put(11, "Саня");
        dataMap.put(12, "Дима");
    }

    public List<String> getFilteredNames() {
        List<Integer> validIds = Arrays.asList(1, 2, 5, 8, 9, 13);

        return dataMap.entrySet().stream()
                .filter(entry ->
                        validIds.contains(entry.getKey()))
                .filter(entry ->
                        entry.getValue().length() % 2 != 0)
                .map(entry ->
                        new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());
    }
}