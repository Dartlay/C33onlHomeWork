package lesson_16_homework;

import lesson_16_homework.Task1.BirthdayCalculator;
import lesson_16_homework.Task2.NumberProcessor;
import lesson_16_homework.Task3.CurrencyProcessor;
import lesson_16_homework.Task4.CurrencyProcessorConsumer;
import lesson_16_homework.Task5.StringReverser;

public class MyMain {
    public static void main(String[] args) {

        /* Task1
        BirthdayCalculator calculator = new BirthdayCalculator();
        calculator.calculateHundredYearsOld();

         */
        /* Task2
        NumberProcessor processor = new NumberProcessor();
        processor.processNumbers();

         */
        /* Task3
        CurrencyProcessor processor = new CurrencyProcessor();
        processor.processCurrencyConversion();

         */
        /* Task4
        CurrencyProcessorConsumer processorConsumer = new CurrencyProcessorConsumer();
        processorConsumer.processCurrencyConversion();

         */
        StringReverser reverser = new StringReverser();
        String reversedString = reverser.reverseString(reverser.getInputSupplier());
        System.out.println("Перевернутая строка: " + reversedString);
    }
}
