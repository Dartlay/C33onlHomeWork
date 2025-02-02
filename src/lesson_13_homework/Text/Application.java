package lesson_13_homework.Text;

public class Application {
    public void run() {
        String inputFilePath = "romeo_and_juliet.txt";
        String outputFilePath = "longest_word.txt";
        FileCreator.createInputFile(inputFilePath);
        TextAnalyzer textAnalyzer = new TextAnalyzer(inputFilePath, outputFilePath);
        textAnalyzer.analyzeText();

        System.out.println("Analysis complete. Check 'longest_word.txt' for the result.");
    }
}