package lesson_16_homework.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BirthdayCalculator {
    public void calculateHundredYearsOld() {
        Scanner scanner = new Scanner(System.in);
        String inputDate = "";
        while (true) {
            System.out.print("Введите вашу дату рождения (в формате дд-мм-гггг): ");
            inputDate = scanner.nextLine();
            if (isValidDate(inputDate)) {
                break;
            } else {
                System.out.println("Некорректная дата. Пожалуйста, введите дату в формате дд-мм-гггг.");
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(inputDate, formatter);
        LocalDate hundredYearsLater = birthDate.plusYears(100);
        System.out.println("Вам исполнится 100 лет: " + hundredYearsLater.format(formatter));

        scanner.close();
    }
    private boolean isValidDate(String date) {
        if (!date.matches("\\d{2}-\\d{2}-\\d{4}")) {
            return false;
        }
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
}
