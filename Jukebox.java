import java.util.ArrayList;
import java.util.List;

public class Jukebox {
   Database db;
   int creditCard;
   public Jukebox(){

   }
   public Jukebox(Database db, int creditCard) {
      super();
      this.db = db;
      this.creditCard = creditCard;
   }
   public Database getDb() {
      return db;
   }
   public void setDb(Database db) {
      this.db = db;
   }
   public int getCreditCard() {
      return creditCard;
   }
   public void setCreditCard(int creditCard) {
      this.creditCard = creditCard;
   }
   public boolean isValidCreditCard(){
      if(creditCard>0)
         return true;
      else
         return false;
   }
   void play(int i) {
         Song song=db.getSongList(i);
         song.play();
   }
   void play() {
      for (int index=0;index<db.getSongList().size();index++)
      {
         Song song=db.getSongList(index);
         trace("Currently Playing :"+song.getName());
         song.play();
      }
   }
   private void trace(String s){
      System.out.println(s);
   }


   //Driver
   public static void main(String[] args){
     Song song1=new Song("crickets sounds", "Unknown artist",
           "Unknown album", "Songs/Crickets.mp3", "Mp3", 214);
     Song song2=new Song("iphone ringtone", "Unknown artist",
           "Unknown album", "Songs/iphone-ringtone.mp3", "Mp3", 215);
     Song song3=new Song("crickets sounds 1", "Unknown artist",
           "Unknown album", "Songs/Crickets.mp3", "Mp3", 214);
      List<Song> tempSongList= new ArrayList<Song>();
      tempSongList.add(song1);
      tempSongList.add(song2);
      tempSongList.add(song3);

      Database tempDB= new Database(tempSongList);
      Jukebox j= new Jukebox(tempDB, -123);

      //Validation of Credit Card
      System.out.println("Validity of CC : "+j.isValidCreditCard());
      j.getDb().toString();

      System.out.println("\nDeleting Song @ index 2");
      //Deleting Song @ index 2
      j.getDb().removeSong(2);
      j.getDb().toString();

      System.out.println("Playing the SongList");
      j.play();

      System.out.println("Playing Song @ index 2");
      j.play(2);
   }
}
