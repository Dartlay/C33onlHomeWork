package lesson_11_homework;

import java.util.Scanner;

public class PalindromeChecker {
    private Scanner scanner = new Scanner(System.in);

    public void checkPalindrome() {
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("Введите номер слова для проверки:");
        int wordIndex = scanner.nextInt();


        String[] words = inputString.split("\\s+");


        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: в строке только " + words.length + " слов. Пожалуйста," +
                    " введите число от 1 до " + words.length + ".");
            return;
        }


        String selectedWord = words[wordIndex - 1];
        System.out.println("Выбранное слово: \"" + selectedWord + "\"");


        if (isPalindrome(selectedWord)) {
            System.out.println("Слово \"" + selectedWord + "\" является палиндромом.");
        } else {
            System.out.println("Слово \"" + selectedWord + "\" не является палиндромом.");
        }
    }

    private boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversedWord);
    }
}
