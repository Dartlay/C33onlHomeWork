package tictactoe_game_homework;

import java.util.Random;

public class TicTacToeBot {
    private char[][] gameTable;
    private char botSymbol;
    private char playerSymbol;

    public TicTacToeBot(char[][] gameTable) {
        this.gameTable = gameTable;
        this.botSymbol = 'O';
        this.playerSymbol = 'X';
    }

    public void makeMove() {

        if (gameTable[1][1] == '*') {
            gameTable[1][1] = botSymbol;
            return;
        }


        if (gameTable[0][0] == '*') {
            gameTable[0][0] = botSymbol;
            return;
        }
        if (gameTable[0][2] == '*') {
            gameTable[0][2] = botSymbol;
            return;
        }
        if (gameTable[2][0] == '*') {
            gameTable[2][0] = botSymbol;
            return;
        }
        if (gameTable[2][2] == '*') {
            gameTable[2][2] = botSymbol;
            return;
        }


        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (gameTable[row][col] != '*');

        gameTable[row][col] = botSymbol;
    }

    private boolean tryToWin(char symbol) {

        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == symbol && gameTable[i][1] == symbol && gameTable[i][2] == '*') {
                gameTable[i][2] = symbol;
                return true;
            }
            if (gameTable[i][0] == symbol && gameTable[i][2] == symbol && gameTable[i][1] == '*') {
                gameTable[i][1] = symbol;
                return true;
            }
            if (gameTable[i][1] == symbol && gameTable[i][2] == symbol && gameTable[i][0] == '*') {
                gameTable[i][0] = symbol;
                return true;
            }
        }


        for (int i = 0; i < 3; i++) {
            if (gameTable[0][i] == symbol && gameTable[1][i] == symbol && gameTable[2][i] == '*') {
                gameTable[2][i] = symbol;
                return true;
            }
            if (gameTable[0][i] == symbol && gameTable[2][i] == symbol && gameTable[1][i] == '*') {
                gameTable[1][i] = symbol;
                return true;
            }
            if (gameTable[1][i] == symbol && gameTable[2][i] == symbol && gameTable[0][i] == '*') {
                gameTable[0][i] = symbol;
                return true;
            }
        }


        if (gameTable[0][0] == symbol && gameTable[1][1] == symbol && gameTable[2][2] == '*') {
            gameTable[2][2] = symbol;
            return true;
        }
        if (gameTable[0][0] == symbol && gameTable[2][2] == symbol && gameTable[1][1] == '*') {
            gameTable[1][1] = symbol;
            return true;
        }
        if (gameTable[1][1] == symbol && gameTable[2][2] == symbol && gameTable[0][0] == '*') {
            gameTable[0][0] = symbol;
            return true;
        }
        if (gameTable[0][2] == symbol && gameTable[1][1] == symbol && gameTable[2][0] == '*') {
            gameTable[2][0] = symbol;
            return true;
        }
        if (gameTable[0][2] == symbol && gameTable[2][0] == symbol && gameTable[1][1] == '*') {
            gameTable[1][1] = symbol;
            return true;
        }
        if (gameTable[1][1] == symbol && gameTable[2][0] == symbol && gameTable[0][2] == '*') {
            gameTable[0][2] = symbol;
            return true;
        }

        return false;
    }
}