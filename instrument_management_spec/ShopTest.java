import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class ShopTest {

  Shop shop;
  Drum drum;

  @Before
  public void before(){
    drum = new Drum("Plastic", "Yello", "Damroo",120, 170,12);
    shop = new Shop("Ray's Music Exchange");
  }

  @Test
  public void hasName(){
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void canPlay(){
    assertEquals("Dumm dumm dumm", drum.play());
  }
}