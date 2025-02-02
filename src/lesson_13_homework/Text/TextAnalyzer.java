package lesson_13_homework.Text;
import java.io.*;



public class TextAnalyzer {
    private String inputFilePath;
    private String outputFilePath;
    public TextAnalyzer(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }
    public void analyzeText() {
        String longestWord = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s.,!?]+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            writeLongestWord(longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeLongestWord(String longestWord) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("The longest word is: " + longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
