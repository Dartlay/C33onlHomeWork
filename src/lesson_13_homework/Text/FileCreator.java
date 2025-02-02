package lesson_13_homework.Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void createInputFile(String filePath) {
        String text = "Two households, both alike in dignity, " +
                "In fair Verona, where we lay our scene, " +
                "From ancient grudge break to new mutiny, " +
                "Where civil blood makes civil hands unclean.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}