package lesson_5_homework;

import java.util.Scanner;

public class MultiArraysHomeWork {
     public static void main(String[] args) {
        // getTwoDimensionAlarray(); //Task 1
        // getChessboard(); //Task 2
         getSnake(); //Task 3
    }
    public static  void getTwoDimensionAlarray (){
        Scanner scanner = new Scanner(System.in);
        int [] [] arrayMath = new int[5][5];
        for (int outer= 0; outer < 5; outer++) {
            for (int inner = 0; inner < 5; inner++) {
                arrayMath[outer][inner] = (int) (Math.random() * 100);
         }
    }
        for (int outer = 0; outer < 5; outer++) {
            for (int inner = 0; inner < 5; inner++) {
                System.out.print(arrayMath[outer][inner] + " ");
            }
            System.out.println();
     }
        System.out.println("--------------Enter-----------------");

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        for (int outer= 0; outer < 5; outer++) {
            for (int inner = 0; inner < 5; inner++) {
                arrayMath[outer][inner] += userInput;
            }

    }
        for (int outer = 0; outer < 5; outer++) {
            for (int inner = 0; inner < 5; inner++) {
                System.out.print("'" + arrayMath[outer][inner] + "' ");
            }
            System.out.println();
        }
        System.out.println("--------------Sum-----------------");
        int sumArray = 0;
        for (int outer = 0; outer < 5; outer++) {
            for (int inner = 0; inner < 5; inner++) {
                sumArray += arrayMath[outer][inner];
            }
        }

        // Вывод суммы
        System.out.println("The sum of all numbers in the array: " + sumArray);
    }

    public static void getChessboard(){
         char[][] сell = new char[8][8];
        for (int outer= 0; outer < 8; outer++) {
            for (int inner = 0; inner < 8; inner++){
                if((outer + inner) % 2 == 0 ) {
                    сell[outer][inner] = 87;
                } else {
                    сell[outer][inner] = 66;

                }
            }
    }
        System.out.println("--------------Chessboard-----------------");
        for (int outer = 0; outer < 8; outer++) {
            for (int inner = 0; inner < 8; inner++) {
                System.out.print( "'" + сell[outer][inner] + "' ");
            }
            System.out.println();
     }
}



    public static void getSnake(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int string = scanner.nextInt();
        System.out.print("Enter the number of columns of the array: ");
        int columns = scanner.nextInt();
        int[][] array = new int[string][columns];
        int value = 1;
        for (int row = 0; row < string; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < columns; col++) {
                    array[row][col] = value++;
                }
            } else {
                for (int col = columns - 1; col >= 0; col--) {
                    array[row][col] = value++;
                }
            }
        }
        System.out.println( "\u001B[32m"+"~~~D)_-_-_-_-_-_-Snake_-_-_-_-_-_-" + "\u001B[0m");
        System.out.println("Filled array " + string + "x" + columns + " snake: ");
        for (int row = 0; row < string; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(array[row][col] + "\t");
            }
            System.out.println();
        }

        scanner.close();
        System.out.println("\u001B[32m"+"_-_-_-_-_-_-_-Snake_-_-_-_-_-_-|3D~"+"\u001B[0m");
    }
}








