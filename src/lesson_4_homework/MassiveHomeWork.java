package lesson_4_homework;

import java.util.Scanner;

public class MassiveHomeWork {
    public static void main(String[] args){
        //getRandom(); //Task 1-3
        //getSwapMassive(); //Task 4
        getIncrementCheck(); //Task 5




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
    //Task
    public static void getRandom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int size = getValid(scanner ,"Enter the size of the array : ");
        int[] arry = new int[size];

        //Random method
        System.out.println("Filling by Math.random method");
        System.out.println("------------------------------");
        for (int i = 0; i < size; i++){
            arry[i] = (int) (Math.random() * 100);

        }
        printArray(arry, "In direct order");
        System.out.println("------------------------------");
        printArrayReverse(arry);
        System.out.println("------------------------------");
        getFindMinMax(arry);
        getFindZeroElement(arry);


        /*System.out.println("Filling by Manually method");
        for (int i = 0; i < size; i++){
            System.out.print("Enter an item " + (i + 1) + ":");
            arry[i] = scanner.nextInt();

        }
        printArray(arry);*/
    }

    // Task 1
    private static void printArray(int[] arry, String promt) {
        System.out.print("Massive " + promt + ": ");
        for (int num : arry) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    private static void printArrayReverse(int[] array) {
        System.out.print("Massive Reverss ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //
    // Task 2 + Task 3
    private static void getFindMinMax (int[] array){
        int min = array[0];
        int max = array[0];
        int minIndex = 0 ;
        int maxIndex = 0 ;

     for (int i = 1; i < array.length ; i++  ){
         if(array[i] < min){
          min = array[i];
          minIndex = i ;
         }
         if(array[i] > max){
             max = array[i];
             maxIndex = i;
         }


     }
     System.out.println("Minimum element : " + min + " Index : " + minIndex );
     System.out.println("Maximum element : " + max + " Index : " + maxIndex);
  }
    //Task 3
    private static void getFindZeroElement( int[] array){
        int zeroCount = 0 ;
        boolean zeroElement = false;

        System.out.println("Zero Element");
        for (int i = 0; i< array.length ; i++ ){
            if (array[i] == 0  ){
                System.out.println(array[i] );
                zeroCount++;
                zeroElement = true;

            }
        }
        if (!zeroElement){
            System.out.println("Zero elements are not found");
        }else {
            System.out.println("Number of zero elements: " + zeroCount);
        }
    }
    //Task 4
    public static void getSwapMassive(){
        int[] array  = {1,2,3,4,5};

System.out.println("Massive" + "\n" + "1 2 3 4 5");
        getSwapElement(array);
System.out.println("Swap Massive");
        for (int number : array ){
            System.out.print(+ number + " ");
        }



    }
    public static void getSwapElement(int [] array){
        int massive = array.length;
        for (int i =0 ; i < massive /2; i++){
            int save = array [i];
            array[i] = array [massive - 1 - i];
            array[massive - 1 - i] = save;
        }
    }
    //Task 5
    public static void getIncrementCheck () {
            int size = 10;
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.print("Generated array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            if (isIncreasing(array)) {
                System.out.println("The array is an increasing sequence");
            } else {
                System.out.println("The array is not an increasing sequence");
            }
        }
        public static boolean isIncreasing(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }


