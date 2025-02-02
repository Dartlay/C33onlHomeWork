package lesson_13_homework.Valid;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocumentValidator {
    private String inputFilePath;
    private String validOutputFilePath;
    private String invalidOutputFilePath;

    public DocumentValidator(String inputFilePath, String validOutputFilePath,
                             String invalidOutputFilePath) {
        this.inputFilePath = inputFilePath;
        this.validOutputFilePath = validOutputFilePath;
        this.invalidOutputFilePath = invalidOutputFilePath;
    }

    public void validateDocuments() {
        List<String> validDocuments = new ArrayList<>();
        List<String> invalidDocuments = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String documentNumber;
            while ((documentNumber = reader.readLine()) != null) {
                if (isValidDocumentNumber(documentNumber)) {
                    validDocuments.add(documentNumber);
                } else {
                    invalidDocuments.add(documentNumber + " - Invalid: must start with 'docnum' or 'contract' " +
                            "and be 15 characters long.");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл не найден. Проверьте правильность пути.");
            return;
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        writeToFile(validOutputFilePath, validDocuments);
        writeToFile(invalidOutputFilePath, invalidDocuments);
    }

    private boolean isValidDocumentNumber(String documentNumber) {
        return documentNumber.length() == 15 && (documentNumber.startsWith("docnum")
                || documentNumber.startsWith("contract"));
    }

    private void writeToFile(String filePath, List<String> documents) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String document : documents) {
                writer.write(document);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
