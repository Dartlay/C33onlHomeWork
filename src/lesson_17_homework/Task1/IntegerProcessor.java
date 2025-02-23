package lesson_17_homework.Task1;

import java.util.List;

public class IntegerProcessor {
    public int processIntegers(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public void executeProcessing() {
        IntegerListGenerator generator = new IntegerListGenerator();
        List<Integer> integers = generator.generateIntegerList();
        int sum = processIntegers(integers);
        System.out.println("Сумма четных элементов без дубликатов: " + sum);
    }
}
