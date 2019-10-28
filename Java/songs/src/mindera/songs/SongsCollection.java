package mindera.songs;

public class SongsCollection {
    public Song[] songs = new Song[100];
    public int count = 0;
    
    public void add(Song song) {
       
        if (count == songs.length) {
            Song[] newSongs = new Song[count * 2];
            for (int i = 0; i < count; i++) {
                newSongs[i] = songs[i];
            }
            songs = newSongs;
        }
        songs[count] = song;
        count++;
    }

    public void remove(int index) {
        for (int i = index; i < songs.length - 1; i++) {
            songs[i] = songs[i + 1];
        }
        count--;
    }

    public Song getSong(int index) {
        return songs[index];
    }

    public int count() {
        return count;
    }
    
}