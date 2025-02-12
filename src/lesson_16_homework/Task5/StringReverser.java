package lesson_16_homework.Task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class StringReverser {
    public Supplier<String> getInputSupplier() {
        Scanner scanner = new Scanner(System.in);
        return () -> {
            System.out.print("Введите строку: ");
            return scanner.nextLine();
        };
    }

    public String reverseString(Supplier<String> stringSupplier) {
        String input = stringSupplier.get();
        return new StringBuilder(input).reverse().toString();
    }
}
