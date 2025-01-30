package lesson_12_homework.Auth;
import lesson_12_homework.Exception.WrongLoginException;
import java.util.Scanner;


public class UserInputHandler {
    private Scanner scanner;
    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }
    public Login getLoginInput() throws WrongLoginException {
        System.out.print("Введите логин: ");
        String loginInput = scanner.nextLine();
        return new Login(loginInput);
    }
    public String getPassword() {
        return scanner.nextLine();
    }
    public void close() {
        scanner.close();
    }
}