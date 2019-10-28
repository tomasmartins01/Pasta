package mindera.songs;

import java.util.Scanner;

public class MusicMenu {

    public static void main(String[] args) {
        SongsCollection songs = new SongsCollection();
        Scanner keyboard = new Scanner(System.in);
        int option;
        System.out.println("");
       
        System.out.println("Qual é o seu username?");
        User.username = keyboard.nextInt();
        
        do {
            System.out.println("1 - Adicionar Musica");
            System.out.println("2 - Remover Musica");
            System.out.println("3 - Mostrar as Musicas");
            System.out.println("0 - Sair");
            
            switch (option) {
            case 1:
                System.out.println("");
                
                System.out.println("Adicionar Musica");
                SongsActions.addSong(songs);
                break;
            case 2:
                System.out.println("");
                System.out.println("Remover Musica");

                 SongsActions.removeSong();
                break;
            case 3:
                System.out.println("");
                System.out.println("Mostrar as Musicas");

                SongsActions.ShowCollection(songs);

                break;
            case 4:
                System.out.println("");
                System.out.println("Like");

                break;
            case 0:
                System.out.println("");
                System.out.println("Até amanhã");
                break;
            default:
                System.out.println("");
                System.out.println("Esta opção não existe!");
            }

        } while (option != 0);
    }
}