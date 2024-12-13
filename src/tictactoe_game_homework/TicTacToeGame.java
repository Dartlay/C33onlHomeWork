package tictactoe_game_homework;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_STANDART = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    private char[][] gameTable;
    private char firstPlayer;

    public static void main(String[] args) {
        StartGame();
    }

    public static void StartGame() {
        TicTacToeGame game = new TicTacToeGame();
        game.WelcomeText();
        game.playOrNot();
        game.gameTable = game.createInitializeTable();
        game.drawTable();
        game.firstPlayer = game.chooseFirstPlayer();
        game.playGame();
    }

    public void WelcomeText() {
        System.out.println(ANSI_GREEN + "-------------------------------WELCOME TO TIC-TAC-TOE GAME----------" +
                "--------------------");
        System.out.println("This is the instruction:");
        System.out.println();
        System.out.println("\tThe game will draw a table.");
        System.out.println("\tAfter it decides who starts the first.");
        System.out.println("\tIf a player starts the game - X.");
        System.out.println("\tIf a AI starts the game, the player will use - O.");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------" +
                "-------" + ANSI_STANDART);
    }

    public void playOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_GREEN + "If you want to start the game Y/y if you want to exit N/n : " + ANSI_STANDART);
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Y")) {
            System.out.println();
            System.out.println(ANSI_GREEN + "---------------The game Start-------------------" + ANSI_STANDART);
        } else if (userInput.equalsIgnoreCase("N")) {
            System.out.println(ANSI_GREEN + "You're out of the game, Bye-Bye." + ANSI_STANDART);
            System.exit(0);
        } else {
            System.out.println(ANSI_GREEN + "Incorrect entry. Please enter Y/y or N/n." + ANSI_STANDART);
            playOrNot();
        }
    }

    public char[][] createInitializeTable() {
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }

    public void drawTable() {
        System.out.println(ANSI_YELLOW);
        for (char[] outer : gameTable) {
            for (char inner : outer) {
                System.out.print("\t" + inner + " ");
            }
            System.out.println();
        }
        System.out.println(ANSI_STANDART);
    }

    private char chooseFirstPlayer() {
        Random random = new Random();
        char firstPlayer = random.nextBoolean() ? 'X' : 'O';

        if (firstPlayer == 'X') {
            System.out.println(ANSI_GREEN + "The first player to start is: " + ANSI_STANDART + ANSI_YELLOW + "(X)"
                    + ANSI_STANDART);
        } else {
            System.out.println(ANSI_GREEN + "The first one to start is the bot: " + ANSI_STANDART + ANSI_YELLOW + "(O)"
                    + ANSI_STANDART);
        }

        return firstPlayer;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        TicTacToeBot bot = new TicTacToeBot(gameTable);
        if (firstPlayer == 'O') {
            bot.makeMove();
            drawTable();
        }

        while (true) {
            System.out.print(ANSI_GREEN + "Enter a line (1-3) to place X: " + ANSI_STANDART);
            int row = scanner.nextInt() - 1;

            System.out.print(ANSI_GREEN + "Enter a column (1-3) to place X: " + ANSI_STANDART);
            int col = scanner.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println(ANSI_RED + "Invalid entry! Please enter values from 1 to 3" + ANSI_STANDART);
                continue;
            }

            if (gameTable[row][col] == '*') {
                gameTable[row][col] = 'X';
                drawTable();

                if (checkWin('X')) {
                    System.out.println(ANSI_GREEN + "Congratulations! You won!" + ANSI_STANDART);
                    playOrNot();
                }

                System.out.println( ANSI_GREEN + "A bot walks" + ANSI_STANDART);
                bot.makeMove();
                drawTable();

                if (checkWin('O')) {
                    System.out.println(ANSI_GREEN + "The bot won!" + ANSI_STANDART);
                    playOrNot();
                }

            } else {
                System.out.println(ANSI_RED + "The cell is already occupied! Choose another one" + ANSI_STANDART);
            }
        }
    }
    //Win check
    private boolean checkWin(char symbol) {

        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == symbol && gameTable[i][1] == symbol && gameTable[i][2] == symbol) {
                return true;
            }
        }


        for (int i = 0; i < 3; i++) {
            if (gameTable[0][i] == symbol && gameTable[1][i] == symbol && gameTable[2][i] == symbol) {
                return true;
            }
        }


        if (gameTable[0][0] == symbol && gameTable[1][1] == symbol && gameTable[2][2] == symbol) {
            return true;
        }
        if (gameTable[0][2] == symbol && gameTable[1][1] == symbol && gameTable[2][0] == symbol) {
            return true;
        }

        return false;

    }
}