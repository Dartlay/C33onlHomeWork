package lesson_14_homework.Task1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    private static final Scanner scanner = new Scanner(System.in);

    public static void removeDuplicates() {
        System.out.println("Введите набор чисел через запятую (например, 1,2,3,4,5,5): ");
        String input = scanner.nextLine();


        String[] numbers = input.split(",");
        Set<String> uniqueNumbers = new LinkedHashSet<>();

        for (String number : numbers) {
            uniqueNumbers.add(number.trim());
        }


        String result = String.join(", ", uniqueNumbers);
        System.out.println("Уникальные числа: " + result);
    }
}
