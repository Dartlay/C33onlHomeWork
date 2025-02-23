package lesson_17_homework;
import lesson_17_homework.Task1.IntegerProcessor;
import lesson_17_homework.Task2.DataProcessor;

import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        getTask1();
        getTask2();
    }

    public static void getTask1 (){
        IntegerProcessor processor = new IntegerProcessor();
        processor.executeProcessing();
    }
    public static void getTask2 (){
        DataProcessor processor = new DataProcessor();
        List<String> reversedNames = processor.getFilteredNames();
        System.out.println("Имена с нечетным количеством букв," +
                " записанные задом наперед: " + reversedNames);
    }
}
