import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 *
 * @author Quan Zhou
 */
public class SongTest {
    private Song testSong1, testSong2;
    public SongTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        testSong1 = new Song("crickets sounds", "Unknown artist",
                     "Unknown album", "../Songs/Crickets.mp3", "Mp3", 214);
        testSong2 = new Song("iphone ringtone", "Unknown artist",
              "Unknown album", "../Songs/iphone-ringtone.mp3", "Mp3", 215);
    }

    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIsLong1() {
       System.out.println("Running testIsLong1...");
       assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
     }

     @Test
     public void testIsLong2() {
       System.out.println("Running testIsLong2...");
       assertEquals("Song is long if length is more than 50",true,testSong2.isLong());
     }

     @Test
     public void testSetGetName() {
       System.out.println("Running testSetGetName...");
       assertEquals("Song1's name should be crickets sounds","crickets sounds",testSong1.getName());
       testSong1.setName("New Name");
       assertEquals("Song1's name now should be New Name","New Name",testSong1.getName());
     }

     @Test
     public void testSetGetArtist() {
       System.out.println("Running testSetGetArtist...");
       assertEquals("Song1's Artist should be Unknown artist","Unknown artist",testSong1.getArtist());
       testSong1.setArtist("New Artist");
       assertEquals("Song1's name now should be New Artist","New Artist",testSong1.getArtist());
     }

     @Test
     public void testSetGetAlbum() {
       System.out.println("Running testSetGetAlbum...");
       assertEquals("Song1's name should be Unknown album","Unknown album",testSong1.getAlbum());
       testSong1.setAlbum("New Album");
       assertEquals("Song1's name now should be New Album","New Album",testSong1.getAlbum());
     }
}
