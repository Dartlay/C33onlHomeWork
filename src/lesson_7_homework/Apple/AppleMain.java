package lesson_7_homework.Apple;

public class AppleMain {
    public static void main(String[] args) {
        Apple apple = new Apple("Red");
        System.out.println("Initial color: " + apple.getColor());
        apple.changeColor("Green");
        System.out.println("Updated color: " + apple.getColor());
    }
}