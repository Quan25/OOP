import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author Quan Zhou
 */
public class DatabaseTest {

   private ArrayList<Song> songList;
   private Song testSong1,testSong2;
   private Database testDB;

    public DatabaseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        songList =  new ArrayList<Song>();

        testSong1 = new Song("crickets sounds", "Unknown artist",
                     "Unknown album", "../Songs/Crickets.mp3", "Mp3", 214);
        testSong2 = new Song("iphone ringtone", "Unknown artist",
                     "Unknown album", "../Songs/iphone-ringtone.mp3", "Mp3", 215);

        songList.add(testSong1);
        songList.add(testSong2);

        testDB = new Database(songList);
    }



    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSongListIfEmpty() {
       System.out.println("Running testSongList...");
       assertEquals("SongList if empty should have 0 elements", false ,testDB.isEmpty());
     }

     @Test
     public void testAddSongToDatabase() {
       System.out.println("Running testAddSongToDatabase...");
       assertEquals("Before adding a new song, there should only be 2 songs in the database", 2 ,testDB.getSongList().size());
       testDB.addSong(testSong1);
       assertEquals("After adding a new song, there should be 3 songs in the database", 3 ,testDB.getSongList().size());
     }

     @Test
     public void testRemoveSongFromDatabase() {
       System.out.println("Running testRemoveSongFromDatabase...");
       assertEquals("Before removing a new song, there should only be 2 songs in the database", 2 ,testDB.getSongList().size());
       testDB.removeSong(testSong1);
       assertEquals("After removing a new song, there should be 1 songs in the database", 1 ,testDB.getSongList().size());
     }

     @After
     public void tearDown() {
         songList = null;
         testDB = null;
     }
}
