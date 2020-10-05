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
public class JukeBoxTest {
    private Jukebox testJB;
    private Database db;
    private java.util.List songListJB;
    private Song song1,song2;
    private int ccn=123;

    public JukeBoxTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      song1 = new Song("crickets sounds", "Unknown artist",
                   "Unknown album", "../Songs/Crickets.mp3", "Mp3", 214);
      song2 = new Song("iphone ringtone", "Unknown artist",
                   "Unknown album", "../Songs/iphone-ringtone.mp3", "Mp3", 215);


      ArrayList<Song> songListJB =  new ArrayList<Song>();
      songListJB.add(song1);
      songListJB.add(song2);

      db = new Database(songListJB);

      testJB = new Jukebox(db,ccn);
    }

    @After
    public void tearDown() {
        testJB = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIsValidCreditCard() {
       System.out.println("Running testIsValidCreditCard...");
       assertEquals("Credit card is valid if value is greater than 0",true,testJB.isValidCreditCard());
     }
}
