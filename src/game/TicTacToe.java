package game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static char currentPlayer = 'X'; // X = Human, O = Bot

    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Tic-Tac-Toe: You (X) vs Bot (O)");

        while (gameRunning) {
            drawBoard();

            if (currentPlayer == 'X') {
                playerMove(scanner);
            } else {
                botMove();
            }

            if (checkWinner(currentPlayer)) {
                drawBoard();
                if (currentPlayer == 'X') {
                    System.out.println("You win!");
                } else {
                    System.out.println("Bot wins!");
                }
                gameRunning = false;
            } else if (isBoardFull()) {
                drawBoard();
                System.out.println("It's a tie!");
                gameRunning = false;
            } else {
                switchPlayer();
            }
        }

        scanner.close();
    }

    private static void drawBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static void playerMove(Scanner scanner) {
        int row, col;

        while (true) {
            System.out.print("Enter row (0-2) and column (0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void botMove() {
        System.out.println("Bot is playing...");

        // 1. Try to win
        if (makeStrategicMove('O')) return;

        // 2. Block player
        if (makeStrategicMove('X')) return;

        // 3. Random move
        Random random = new Random();
        int row, col;

        while (true) {
            row = random.nextInt(3);
            col = random.nextInt(3);

            if (board[row][col] == ' ') {
                board[row][col] = 'O';
                System.out.println("Bot played at: " + row + " " + col);
                break;
            }
        }
    }

    private static boolean makeStrategicMove(char player) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;

                    if (checkWinner(player)) {
                        if (player == 'X') {
                            board[i][j] = 'O'; // block
                        }
                        System.out.println("Bot played at: " + i + " " + j);
                        return true;
                    }

                    board[i][j] = ' '; // undo move
                }
            }
        }
        return false;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ';
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean checkWinner(char player) {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}