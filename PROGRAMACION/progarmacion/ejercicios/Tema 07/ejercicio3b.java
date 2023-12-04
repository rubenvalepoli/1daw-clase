import java.util.Scanner;
public class ejercicio3b {

    public static void main(String[] args) {

        boolean[][] board0 = {
                {true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };

        boolean[][] board1 = {
                {false, false, false, false, true},
                {false, false, false, true, true},
                {false, false, true, false, true},
                {false, true, false, false, true},
                {true, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true},
                {false, false, false, false, true}
        };

        showBit(board0);
        showBit(board1);
    }

    public static void showBit(boolean[][] board) {
            for (int i = 0;i < board.length; i++) {
            for (int j = 0;j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}