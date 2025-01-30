package lesson_12_homework.Auth;
import lesson_12_homework.Exception.WrongLoginException;
import lesson_12_homework.Exception.WrongPasswordException;

public class UserValidator {
    public void validateUserInput() {
        UserInputHandler inputHandler = new UserInputHandler();
        boolean validLogin = false;
        Login login = null;
        while (!validLogin) {
            try {
                login = inputHandler.getLoginInput();
                validLogin = true;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }
        boolean validPassword = false;
        Password password = null;
        while (!validPassword) {
            try {
                System.out.print("Введите пароль: ");
                String passwordInput = inputHandler.getPassword();
                password = new Password(passwordInput);

                String confirmPasswordInput;
                while (true) {
                    System.out.print("Подтвердите пароль: ");
                    confirmPasswordInput = inputHandler.getPassword();
                    try {
                        password.confirmPassword(confirmPasswordInput);
                        break;
                    } catch (WrongPasswordException e) {
                        System.out.println(e.getMessage());
                    }
                }
                validPassword = true;
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Логин и пароль успешно проверены.");
        inputHandler.close();
      }
    }

