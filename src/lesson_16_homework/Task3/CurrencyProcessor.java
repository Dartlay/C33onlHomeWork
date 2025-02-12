package lesson_16_homework.Task3;

import java.util.Scanner;
import java.util.function.Function;

public class CurrencyProcessor {
    public void processCurrencyConversion() {
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = getValidExchangeRate(scanner);

        Function<Double, Double> convertToDollars = amount -> round(amount / exchangeRate);

        double amountToConvert = getValidAmount(scanner);
        double dollars = convertToDollars.apply(amountToConvert);
        System.out.println("Сумма в долларах: " + dollars);

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

    private double getValidAmount(Scanner scanner) {
        double amount;
        while (true) {
            System.out.print("Введите сумму в Белорусских рублях для конвертации в Доллары: ");
            String input = scanner.nextLine();
            try {
                amount = Double.parseDouble(input.replace(",", "."));
                if (amount < 0) {
                    System.out.println("Сумма не может быть отрицательной. Попробуйте снова.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
            }
        }
        return amount;
    }
    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

