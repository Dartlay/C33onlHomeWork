package lesson_11_homework;

import java.util.HashSet;
import java.util.Scanner;

public class StringProcessor {
    private String[] strings = new String[3];
    private Scanner scanner = new Scanner(System.in);


    private void inputStrings() {
        System.out.println("Введите 3 строки:");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
    }

   //Task 1
    public void findShortestAndLongestStrings() {
        inputStrings();
        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println("Самая короткая строка: \"" + shortest + "\" (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: \"" + longest + "\" (длина: " + longest.length() + ")");
    }

   // Task 2
    public void sortStringsByLength() {
        inputStrings();
        String[] sortedStrings = strings.clone();
        java.util.Arrays.sort(sortedStrings, (a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("Строки в порядке возрастания длины:");
        for (String str : sortedStrings) {
            System.out.println(str + " (длина: " + str.length() + ")");
        }
    }

   // Task 3
    public void printStringsShorterThanAverage() {
        inputStrings();
        double averageLength = 0;

        for (String str : strings) {
            averageLength += str.length();
        }
        averageLength /= strings.length;

        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println(str + " (длина: " + str.length() + ")");
            }
        }
    }

    // Task 4
    public void findUniqueCharacterWord() {
        inputStrings();
        for (String str : strings) {
            if (isUniqueCharacters(str)) {
                System.out.println("Первое слово с уникальными символами: \"" + str + "\"");
                return;
            }
        }
        System.out.println("Нет слов с уникальными символами.");
    }

    private boolean isUniqueCharacters(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

   // Task 5
    public void maskString() {
        System.out.println("Введите строку для завуалирования:");
        String input = scanner.nextLine();
        StringBuilder masked = new StringBuilder();

        for (char c : input.toCharArray()) {
            masked.append(c).append(c);
        }

        System.out.println("Завуалированная строка: \"" + masked.toString() + "\"");
    }
}
