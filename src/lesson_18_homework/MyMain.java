package lesson_18_homework;

import lesson_18_homework.Task1.MinMaxProcessor;
import lesson_18_homework.Task2.SortingManager;
import lesson_18_homework.Task3.ShopManager;

public class MyMain {
    public static void main(String[] args) {
       // getTask1();
       // getTask2();
        getTask3();
    }
    public static void getTask1(){
        new MinMaxProcessor().process();
    }
    public static void getTask2(){
        new SortingManager().runSorting();
    }
    public static void getTask3(){
        new ShopManager().runShop();
    }

}
