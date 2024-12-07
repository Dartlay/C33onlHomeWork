package game_homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GusGuessWordHomeWork {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_Standart = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        startGame();
    }
    public static void startGame(){
        welcome();
        playOrNot();

    }
    public static void welcome(){
        System.out.println(ANSI_GREEN);
        System.out.println("---------------Welcome to Guess a Word Game by TMS.-------------------");
        System.out.println();
        System.out.println("The instructions are the following :");
        System.out.println("If you enter a letter, we will check if there is a match.");
        System.out.println("If there is, we open it on the table and game moves on.");
        System.out.println("If not, repeat and try to guess a letter.");
        System.out.println("If you have guessed all letters, you HAVE WON.");
        System.out.println("If you enter two or more characters than we check a word fully.");
        System.out.println("If you guessed the word, you HAVE WON.");
        System.out.println("If not, you continue the game.");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------" + ANSI_Standart);

    }
    public static void playOrNot(){
            Scanner scanner = new Scanner(System.in);
            System.out.print(ANSI_GREEN+"If you want to start the game Y/y if you want to exit N/n : " + ANSI_Standart);
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Y")) {
                System.out.println();
                System.out.println(ANSI_GREEN +"---------------The game Start-------------------"  + ANSI_Standart);
                playGame();
            } else if (userInput.equalsIgnoreCase("N")) {
                System.out.println(ANSI_GREEN +"You're out of the game, Bye-Bye."+ ANSI_Standart);
                System.exit(0);
            } else {
                System.out.println( ANSI_GREEN +"Incorrect entry. Please enter Y/y or N/n." + ANSI_Standart);
                playOrNot();
            }
        }
        // Arrys Word
        public static String[] getArraysWord(){
        return new String[]{
                "Apple",
                "Banana",
                "Flat",
                "House",
                "Pineapple",
                "Belarus",
                "Georgia",
                "Infrastructure",
                "Housewife",
                "Feminist",
                "Universe",
                "Galaxy",
                "Stars",
                "Mexico",
                "Watermelon",
                "Housekeeper"
        };
        }
        // Arrys Word
        public static String getHiddenWord(){
            String[] hiddenWord = getArraysWord();
            String selectedWord = hiddenWord[new Random().nextInt(0, hiddenWord.length)];
            char[] openWord = new char[selectedWord.length()];
            Arrays.fill(openWord, 0, openWord.length, '*');
            System.out.println();
            System.out.println(ANSI_GREEN + "Hidden Word: " + new String(openWord) + ANSI_Standart);
            System.out.println();
            return selectedWord;
        }
    public static void printWord(char[] word) {
        for (char element : word) {
            if (element != '*') {
                System.out.print(ANSI_GREEN + element + ANSI_Standart + " ");
            } else {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
        public static void playGame(){
            String selectedWord = getHiddenWord();
            char[] openWord = new char[selectedWord.length()];
            Arrays.fill(openWord, '*');

            char[] guessedLetters = new char[26];
            int guessedCount = 0;

            while (new String(openWord).contains("*")) {
                boolean correctGuess = false;
                boolean alreadyGuessed = false;

                System.out.print("Enter a letter or word:  ");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
                String lowerCaseInput = userInput.toLowerCase();
                if (lowerCaseInput.length() > 1) {
                    if (lowerCaseInput.equalsIgnoreCase(selectedWord)) {
                        System.out.println(ANSI_GREEN + "Congratulations! You guessed the word: " + ANSI_YELLOW + selectedWord);
                        playOrNot();
                    } else {
                        System.out.println(ANSI_RED + "Wrong word. Try it again." + ANSI_Standart);
                        continue;
                    }
                }
                if (lowerCaseInput.length() == 1) {
                    char guessedLetter = lowerCaseInput.charAt(0);
                    for (int i = 0; i < guessedCount; i++) {
                        if (guessedLetters[i] == guessedLetter) {
                            alreadyGuessed = true;
                            break;
                        }
                    }

                    if (alreadyGuessed) {
                        System.out.println(ANSI_RED + "You've already guessed the letter " +"'" + ANSI_YELLOW + guessedLetter + ANSI_GREEN + "'. Try a different letter or word." + ANSI_Standart);
                        continue;
                    }
                    boolean letterFound = false;
                    for (int word = 0; word < selectedWord.length(); word++) {
                        if (Character.toLowerCase(selectedWord.charAt(word)) == guessedLetter) {
                            openWord[word] = selectedWord.charAt(word);
                            letterFound = true;
                        }
                    }
                    if (guessedCount < guessedLetters.length) {
                        guessedLetters[guessedCount] = guessedLetter;
                        guessedCount++;
                    }
                    if (letterFound) {
                        System.out.println(ANSI_GREEN + "The correct letter! Current state of the word: " + ANSI_Standart);
                        printWord(openWord);
                        System.out.println();
                    } else {
                        System.out.println(ANSI_RED + "Wrong letter. Try again." + ANSI_Standart);
                    }
                } else {
                    System.out.println(ANSI_RED + "Please enter one letter or the whole word." + ANSI_Standart);
                }
            }

            System.out.println(ANSI_GREEN + "Congratulations! You guessed the word: " + ANSI_YELLOW + selectedWord);
            playOrNot();
        }
}



