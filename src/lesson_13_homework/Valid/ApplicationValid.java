package lesson_13_homework.Valid;
import java.io.File;
import java.util.Scanner;

public class ApplicationValid {
    public void runValid() {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "";
        boolean validPath = false;


        String os = System.getProperty("os.name").toLowerCase();
        String examplePath;

        if (os.contains("win")) {
            examplePath = "documents.txt";
        } else if (os.contains("mac") || os.contains("nix") || os.contains("nux")) {
            examplePath = "documents.txt";
        } else {
            examplePath = "documents.txt";
        }
        while (!validPath) {
            System.out.println("Введите путь к входному файлу (например, " + examplePath + "): ");
            inputFilePath = scanner.nextLine();
            File file = new File(inputFilePath);
            if (file.exists() && file.isFile()) {
                validPath = true;
            } else {
                System.out.println("Ошибка: файл не найден. Пожалуйста, проверьте путь и попробуйте снова.");
            }
        }
        String validOutputFilePath = "valid_documents.txt";
        String invalidOutputFilePath = "invalid_documents.txt";

        DocumentValidator validator = new DocumentValidator(inputFilePath,
                validOutputFilePath, invalidOutputFilePath);
        validator.validateDocuments();

        System.out.println("Validation complete. Check 'valid_documents.txt'" +
                " and 'invalid_documents.txt' for results.");
    }
}
