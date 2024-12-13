package tictactoe_game_homework;

import java.util.Random;

public class TicTacToeBot {
    private char[][] gameTable;

    public TicTacToeBot(char[][] gameTable) {
        this.gameTable = gameTable;
    }

    public void makeMove() {
        int[] move = findBestMove();
        if (move != null) {
            gameTable[move[0]][move[1]] = 'O';
        }
    }

    private int[] findBestMove() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable[i][j] == '*') {
                    gameTable[i][j] = 'O';
                    if (checkWin('O')) {
                        return new int[]{i, j};
                    }
                    gameTable[i][j] = '*';
                }
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable[i][j] == '*') {
                    gameTable[i][j] = 'X';
                    if (checkWin('X')) {
                        gameTable[i][j] = 'O';
                        return new int[]{i, j};
                    }
                    gameTable[i][j] = '*';
                }
            }
        }


        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable[row][col] == '*') {
                return new int[]{row, col};
            }
        }
    }

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
        return (gameTable[0][0] == symbol && gameTable[1][1] == symbol && gameTable[2][2] == symbol) ||
                (gameTable[0][2] == symbol && gameTable[1][1] == symbol && gameTable[2][0] == symbol);
    }
}