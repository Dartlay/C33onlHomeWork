package lesson_3_homework;

import java.util.Scanner;

public class SequenceHomeWork {
    public static void main(String[] args){
       // getParity();
       //getTemperature();
        // getSquareNumber();
        getWarm();
    }


    //Valid
    private static int getValid(Scanner scanner, String prompt) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                valid = true;
            } else {
                System.out.println("ERROR: Enter an integer.");
                scanner.next();
            }
        }
        return value;
    }
    //Task 1
    public static void getParity(){
        Scanner scanner = new Scanner(System.in);
        int value = getValid(scanner, "Enter a number to check for parity = ");
        if(value % 2 == 0){
            System.out.println("You namber Even ");

        }
        else {
            System.out.println("You namber not Even ");
        }
}
 //Task 2
    public static void getTemperature(){
        Scanner scanner = new Scanner(System.in);
        int value = getValid(scanner, "Enter the temperature = ");
         if (value>-5){
             System.out.println("Warm");

        }else if (value <= -5 && value >= -20 ){
         System.out.println("Normal");
         }else {
             System.out.println("Cold");
         }
    }
    //Task 3
    public static void getSquareNumber(){
        System.out.println("Square numbers from 10 to 20 ");
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println("Square numbers " + i + " = " + square );
    }
    }
    //Task 4
    public static void getWarm(){
        int value = 0;
        System.out.println("Sequence of numbers + 7 ");
        System.out.print("Sequence : ");
        while (value <98){
            value +=7;

            System.out.print( "\t" + value );
        }
    }
    //Har Task
}



