package lesson_12_homework;
import lesson_12_homework.Auth.UserValidator;
public class UserMain {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validateUserInput();
    }
}
