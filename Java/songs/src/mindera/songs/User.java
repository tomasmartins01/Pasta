package mindera.songs;

public class User{

     String username;
  

     private SongList likedSongs = new SongList();

     void Like(Song song){
         likedSongs.add(song);
         
     }


    }

}