package lesson_16_homework.Task4;

import java.util.Scanner;
import java.util.function.Consumer;

public class CurrencyProcessorConsumer {
    public void processCurrencyConversion() {
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = getValidExchangeRate(scanner);

        Consumer<String> convertToDollars = input -> {
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Неверный формат ввода. Ожидается 'сумма ВУ'.");
            }
            double amount = Double.parseDouble(parts[0].replace(",", "."));
            double dollars = round(amount / exchangeRate);
            System.out.println("Сумма в долларах: " + dollars);
        };

        String input = getValidInput(scanner);
        convertToDollars.accept(input);

        scanner.close();
    }

    private double getValidExchangeRate(Scanner scanner) {
        double exchangeRate;
        while (true) {
            System.out.print("Введите курс доллара к белорусскому рублю: ");
            String input = scanner.nextLine();
            try {
                exchangeRate = Double.parseDouble(input.replace(",", "."));
                if (exchangeRate <= 0) {
                    System.out.println("Курс должен быть положительным числом. Попробуйте снова.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
            }
        }
        return exchangeRate;
    }

    private String getValidInput(Scanner scanner) {
        String input;
        while (true) {
            System.out.print("Введите сумму и валюту (например, '1000 ВУ'): ");
            input = scanner.nextLine();
            if (input.matches("\\d+(\\.\\d+)?\\s+\\w+")) {
                break;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите сумму и валюту в формате 'сумма ВУ'.");
            }
        }
        return input;
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
