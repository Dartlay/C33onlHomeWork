package lesson_12_homework.Auth;
import lesson_12_homework.Exception.WrongPasswordException;
public class Password {
    private String password;
    public Password(String password) throws WrongPasswordException {
        setPassword(password);
    }
    public void setPassword(String password) throws
            WrongPasswordException {
        if (password.length() < 8 || password.contains(" ")
                || !containsUpperCase(password) || !containsDigit(password)) {
            throw new WrongPasswordException("Некорректный пароль. Пароль должен содержать " +
                    "не менее 8 символов, не содержать пробелов, содержать хотя бы одну заглавную букву и одну цифру.");
        }
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void confirmPassword(String confirmPassword) throws WrongPasswordException {
        if (!this.password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают. Пожалуйста, попробуйте снова.");
        }
    }

    private boolean containsUpperCase(String str) {
        return str.chars().anyMatch(Character::isUpperCase);
    }

    private boolean containsDigit(String str) {
        return str.chars().anyMatch(Character::isDigit);
    }
}