import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[] pos = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

        Scanner scanner = new Scanner(System.in);
        char turn = 'X';
        int input;
        while (true) {
            do{
            System.out.println("Insere a posição: ");
            input = scanner.nextInt();

            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

            pos[input - 1] = turn;

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            if (pos[0] == turn && pos [1] == turn && pos [2] == turn 
                || pos[3] == turn && pos [4] == turn && pos [5] == turn
                || pos[6] == turn && pos [7] == turn && pos [8] == turn
                || pos[6] == turn && pos [3] == turn && pos [0] == turn
                || pos[7] == turn && pos [4] == turn && pos [1] == turn
                || pos[8] == turn && pos [5] == turn && pos [2] == turn
                || pos[6] == turn && pos [4] == turn && pos [2] == turn
                || pos[8] == turn && pos [4] == turn && pos [0] == turn) {

                    System.out.println(turn + " Ganhou o Jogo");
                    break;
            }
            if (turn == 'X') {

                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
        }

    }
}