public class SongsCollection {
    private static Song[] songs = new Song[10];
    private static int count = 0;

    public static void add(Song song) {
        songs[count] = song;
        count++;
    }
    public static void remove(int index) {
        for (int i = index; i < songs.length - 1; i++) {
            songs[i] = songs[i + 1];
        }
        count--;
    }
    public static Song getSong(int index) {
        return songs[index];
    }
    public static int count() {
        return count;
    }
}
