package lesson_16_homework.Task2;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberProcessor {
    private List<Integer> filterPositiveNumbers(Integer[] numbers) {

        Predicate<Integer> isPositive = number -> number > 0;
        return Arrays.stream(numbers)
                .filter(isPositive)
                .collect(Collectors.toList());
    }
    public void processNumbers() {
        Integer[] numbers = {-10, 15, 0, -3, 22, 7, -1, 5};
        List<Integer> positiveNumbers = filterPositiveNumbers(numbers);
        System.out.println("Положительные числа: " + positiveNumbers);
    }
}