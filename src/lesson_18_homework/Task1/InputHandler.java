package lesson_18_homework.Task1;

import java.util.Scanner;


public class InputHandler {
    private Scanner scanner;
    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public int[] getInputArray() {
        int n = getPositiveIntegerInput("Введите количество элементов в массиве: ");
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = getIntegerInput("Элемент " + (i + 1) + ": ");
        }

        return array;
    }

    private int getPositiveIntegerInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();


                if (input.isEmpty()) {
                    System.out.println("Ошибка: Поле не может быть пустым.");
                    continue;
                }
                if (input.contains(" ")) {
                    System.out.println("Ошибка: Ввод не должен содержать пробелов.");
                    continue;
                }
                int number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите целое число.");
            }
        }
    }

    private int getIntegerInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Ошибка: Поле не может быть пустым.");
                    continue;
                }
                if (input.contains(" ")) {
                    System.out.println("Ошибка: Ввод не должен содержать пробелов.");
                    continue;
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите целое число.");
            }
        }
    }
}
