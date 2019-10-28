import java.util.Scanner;
public class Musicmenu{
    static SongsCollection songs = new SongsCollection();

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int option;
    System.out.println("");
        do{
            System.out.println("1- Adicionar Musica");
            System.out.println("2- Remover Musica"); 
            System.out.println("3- "); 
            option = keyboard.nextInt(); 
            switch (option) { 
            case 1:
                System.out.println("Adicionar Musica"); 
        
                break;
            case 2:
                System.out.println("Remover Musica");
       
                break;
            case 3:
                System.out.println("Mostrar as Musicas");
     
                break;
            default:System.out.println("Até amanhã"); 
            }
            
            }while(option!=0);
        }
    }
}
 
/*
 * System.out.println("count= " + songs.count()); int count1 = songs.count();
 * 
 * for (int i = 0; i < songs.count(); i++) { Song song = songs.getSong(i);
 * System.out.println(song.names + song.artists + song.ratings); } }}
 */
