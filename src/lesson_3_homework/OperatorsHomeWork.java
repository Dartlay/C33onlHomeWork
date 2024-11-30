package lesson_3_homework;

import java.util.Scanner;

public class OperatorsHomeWork {
    public static void main(String[] args){
        //getCalculatedFormul();
        //getSubtractionNaberFormul();
        //getSubtractionNabersFormul();
        getRounding();


    }
    //Task 1.
    public static void getCalculatedFormul(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have this formula: " + "a=4*(b+c-1)/2");

        /*
        int bValue = getValidC(scanner);
        int cValue = getIntInputB(scanner);
        */
        int bValue = getValid(scanner, "You will enter the value of b: ");
        int cValue = getValid(scanner, "You will enter the value of c: ");
        System.out.println("Your expression looks like this: " + "a=4*" + "(" + bValue + "+" + cValue + "-1)/2");
        System.out.print("a= " + (4 * (bValue + cValue - 1) / 2));

        scanner.close();
    }

    //Valid
    //Эта валидация выглядит очень грамостко и я задался вопросом как можно ее упростить и нашел в интерене Promt
    /* private static int getValidC(Scanner scanner) {
    int value = 0;
    boolean validInput = false;

    while (!validInput) {
        System.out.print("You will enter the value of c: ");
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            validInput = true;
        } else {
            System.out.println("ERROR: Enter an integer.");
            scanner.next();
        }
    }
    return value;
}
private static int getIntInputB(Scanner scanner) {
    int value = 0;
    boolean validInput = false;

    while (!validInput) {
        System.out.print("You will enter the value of b: ");
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
            validInput = true;
        } else {
            System.out.println("ERROR: Enter an integer.");
            scanner.next();
        }
    }
    return value;
} */
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
    private static int getSubtractionValid(Scanner scanner, String prompt) {
            int value = 0;
            boolean valid = false;
            while (!valid) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    value = scanner.nextInt();
                    // Проверка на двузначное число
                    if (value >= 10 && value <= 99) {
                        valid = true; // Ввод корректен, выходим из цикла
                    } else {
                        System.out.println("ERROR: Enter a two-digit integer (between 10 and 99).");
                    }
                } else {
                    System.out.println("ERROR: Enter an integer.");
                    scanner.next(); // Сбрасываем некорректный ввод
                }
            }
            return value;
        }
    private static int getSubtractionNabersValid(Scanner scanner, String prompt) {
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                // Проверка на двузначное число
                if (value >= 100 && value <= 999) {
                    valid = true; // Ввод корректен, выходим из цикла
                } else {
                    System.out.println("ERROR: Enter a two-digit integer (between 100 and 999).");
                }
            } else {
                System.out.println("ERROR: Enter an integer.");
                scanner.next(); // Сбрасываем некорректный ввод
            }
        }
        return value;
    }
    private static int getRoundingValid(Scanner scanner, String prompt){
        double value = 0.0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                valid = true;
            } else {
                System.out.println("ERROR: Enter an Double.");
                scanner.next();
            }
        }
        return (int) Math.round(value);
    }

    //Valid
     //Task 2
    public static void getSubtractionNaberFormul() {
        Scanner scanner = new Scanner(System.in);
        int nValud = getSubtractionValid(scanner, "You will enter the value of n: ");
        System.out.print("Possible combinations n= c(a+b) for n = " + nValud + ": ");
        for (int c = 1; c <= nValud; c++) {
            if (nValud % c == 0) {
                int sum = nValud / c;
                for (int a = 1; a < sum; a++) {
                    int b = sum - a;
                    if (a>0 && a<10 && b>0 && b<10 && c>0 && c<10) {
                        System.out.println("c = " + c + ", a = " + a + ", b = " + b + " -> " + nValud + " = " + c + "(" + a + " + " + b + ")");
                    }
                }
            }
        }
}
    //Task 3
    public static void getSubtractionNabersFormul() {
        Scanner scanner = new Scanner(System.in);
        int nValud = getSubtractionNabersValid(scanner, "You will enter the value of n: ");
        System.out.print("Possible combinations for n = d(a + b + c) where n = " + nValud + ": ");
        for (int d = 1; d <= nValud && d < 100; d++) { // Ensure d < 10
            if (nValud % d == 0) {
                int sum = nValud / d;
                for (int a = 1; a < sum; a++) {
                    for (int b = 1; b < sum; b++) {
                        int c = sum - a - b; // Calculate c based on a and b
                        if (a>0 && a<10 && b>0 && b<10 && c>0 && c <10 && d>0 && d<100) { // Ensure a, b, c < 10
                            System.out.println("d = " + d + ", a = " + a + ", b = " + b + ", c = " + c + " -> " + nValud
                                    + " = " + d + "(" + a + " + " + b + " + " + c + ")");
                        }
                    }
                }
            }
        }
    }
    //Task 4
    public static void getRounding(){
        Scanner scanner = new Scanner(System.in);
        double nValud = getRoundingValid(scanner, "You will enter the value of n: ");
        System.out.print(nValud);

    }
}
