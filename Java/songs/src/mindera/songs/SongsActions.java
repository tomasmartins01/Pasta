package mindera.songs;

public class SongsActions {

    public static void addSong(SongsCollection songs) {
        Song song = new Song();

        String name = ConsoleAppUtils.askString("Qual é o nome da musica?");
        String artist = ConsoleAppUtils.askString("Qual é o artista?");
        int rating = ConsoleAppUtils.askInt("Qual é o rating?");
        song.names = name;
        song.artists = artist;
        song.ratings = rating;
        songs.add(song);
    }

    public static void removeSong(){
        ShowCollection(songs);
        System.out.println("");

        System.out.println("Index starts in 0!");
        int index = ConsoleAppUtils.askInt("Index");
        songs.remove(index);
        System.out.println("Musica removida com sucesso");
    }    

    public static void ShowCollection(SongsCollection songs) {

        for (int i = 0; i < songs.count(); i++) {
            Song song = songs.getSong(i);
            System.out.println("Musica: " + song.names + " Artista: " + song.artists + " Ratings: " + song.ratings);
            System.out.println("");
        }
    }
}        


