package lesson_12_homework.Auth;
import lesson_12_homework.Exception.WrongLoginException;
import java.util.Arrays;
import java.util.List;


public class Login {
    private String login;
    private static final List<String> VALID_DOMAINS = Arrays.asList(
            "@gmail.com",
            "@yahoo.com",
            "@hotmail.com",
            "@outlook.com",
            "@live.com",
            "@mail.ru",
            "@yandex.ru",
            "@yandex.com"
    );
    public Login(String login) throws WrongLoginException {
        setLogin(login);
    }
    public void setLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ") || !isValid(login)) {
            throw new WrongLoginException("Некорректный логин.");
        }
        if (!containsAtSymbol(login)) {
            throw new WrongLoginException("Некорректный логин. Логин должен содержать символ '@'");
        }
        if (!hasValidDomain(login)) {
            throw new WrongLoginException("Некорректный логин. Логин должен содержать доменное имя.");
        }
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
    private boolean isValid(String str) {
        return str.matches("^[a-zA-Z0-9@.]*$");
    }
    private boolean containsAtSymbol(String str) {
        return str.contains("@");
    }
    private boolean hasValidDomain(String str) {
        return VALID_DOMAINS.stream().anyMatch(str::endsWith);
    }
}

