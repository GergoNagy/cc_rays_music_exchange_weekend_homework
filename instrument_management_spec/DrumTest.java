import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class DrumTest {

  Drum drum;

  @Before
  public void before(){
    drum = new Drum("Plastic", "Yello", "Damroo",120, 170,12);
  }

  @Test
  public void hasDrums(){
    assertEquals(12, drum.getDrums());
  }

  @Test
  public void canPlay(){
    assertEquals("Dumm dumm dumm", drum.play());
  }

  @Test
  public void hasMaterial(){
    assertEquals("Plastic", drum.getMaterial());
  }

  @Test
  public void hasColor(){
    assertEquals("Yello", drum.getColor());
  }

  @Test
  public void hasType(){
    assertEquals("Damroo", drum.getType());
  }

  @Test
  public void buyingPrice(){
    assertEquals(120, drum.getBuyPrice());
  }

  @Test
  public void sellingPrice(){
    assertEquals(170, drum.getSellPrice());
  }

}