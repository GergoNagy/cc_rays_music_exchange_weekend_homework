import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class DrumTest {

  Drum drum;

  @Before
  public void before(){
    drum = new Drum("Plastic", "Yello", "Damroo",12);
  }

  @Test
  public void hasDrums(){
    assertEquals(12, drum.getDrums());
  }

  @Test
  public void canPlay(){
    assertEquals("Dumm dumm dumm", drum.play());
  }
}