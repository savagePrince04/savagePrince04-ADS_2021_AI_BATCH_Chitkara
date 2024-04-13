package Lec16;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] chessboard = new boolean[n][n];
        Queen(chessboard, 0, n);

    }

    public static void Queen(boolean[][] board, int row, int TotalQueen) {
        if (TotalQueen == 0) {
            Display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                Queen(board, row + 1, TotalQueen - 1);
                board[row][col] = false;
            }
        }
    }

    public static boolean issafe(boolean[][] board, int row, int col) {
        int r = row;
        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}