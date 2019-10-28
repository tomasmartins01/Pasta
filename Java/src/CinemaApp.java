import java.util.Scanner;

public class CinemaApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option;
        System.out.println("");
        do {
            System.out.println("1- Vender Bilhete ");
            System.out.println("2- Imprimir Sala de Cinema");
            System.out.println("0- SAIR");
            option = keyboard.nextInt();
            switch (option) {
            case 1:
                System.out.println("VENDER BILHETE");
                CinemasActions.sellTicket();
                break;
            case 2:
                System.out.println("IMPRIMIR SALA DE CINEMA");
                break;
            default:
                System.out.println("Até amanhã");
            }
        } while (option != 0);
    }
}