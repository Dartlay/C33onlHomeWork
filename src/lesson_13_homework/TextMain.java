package lesson_13_homework;

import lesson_13_homework.Text.Application;
import lesson_13_homework.Valid.ApplicationValid;

public class TextMain {
    public static void main(String[] args) {
       // Application app = new Application();
       // app.run(); // Romeo and Juliet
        ApplicationValid appValid = new ApplicationValid();
        appValid.runValid(); // Valid Documents
    }
}
