import java.util.Scanner;
public class ejercicio3a {

    public static void main(String[] args){

        boolean[][] board = {
                {true, true, true, true, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };


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