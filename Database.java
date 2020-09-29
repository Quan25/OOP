import java.util.ArrayList;
import java.util.List;

public class Database {

private List<Song> songList;

   Database(){
      this.songList=new ArrayList<Song>();
   }
   Database(List<Song> songList){
      this.songList=songList;
   }

   public List<Song> getSongList() {
      return songList;
   }
   public Song getSongList(int index) {
      if(songList.size()>=index)
         return songList.get(index);
      else
         return null;
   }
   public void setSongList(List<Song> songList) {
      this.songList = songList;
   }

   public boolean isEmpty(){
      return this.songList.isEmpty();
   }
   public void addSong(Song song){
      songList.add(song);
   }
   public void removeSong(Song song){
      if(songList.contains(song)){
         songList.remove(song);
      }
   }
   public void removeSong(int index){
         songList.remove(index);
   }
   private void trace(String s){
      System.out.println(s);
   }
   public String toString(){
      System.out.println("Song List:\n================");
      for(int i=0;i<songList.size();i++){
         trace(i+":\t"+songList.get(i).toString());
      }
      return "";
   }

   // Henry's comment
   //   Database does not need to have the functionality of play.
   public void play(int index){
      System.out.println("Playing Song : "+ songList.get(index).toString());
      songList.get(index).play();
   }
   public void play(){
      for(int index=0;index<songList.size();index++)
         play(index);
   }
      //Driver
      public static void main(String[] args){
         Song song1=new Song("crickets sounds", "Unknown artist",
               "Unknown album", "Crickets.mp3", "Mp3", 214);
         Song song2=new Song("iphone ringtone", "Unknown artist",
               "Unknown album", "iphone-ringtone.mp3", "Mp3", 215);
         Song song3=new Song("crickets sounds 1", "Unknown artist",
               "Unknown album", "Crickets.mp3", "Mp3", 214);
         List<Song> tempSongList= new ArrayList<Song>();
         tempSongList.add(song2);
         tempSongList.add(song1);

         Database tempDB= new Database(tempSongList);
         tempDB.toString();
         System.out.println("\nAdding Song ");
         tempDB.addSong(song3);
         tempDB.toString();
         System.out.println("Playing Complete SongList");
         tempDB.play();

         System.out.println("Playing Song @ index 2");
         tempDB.play(2);
      }
}
