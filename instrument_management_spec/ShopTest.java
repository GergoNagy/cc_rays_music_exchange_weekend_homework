import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class ShopTest {

  Shop shop;
  Drum drum;
  Guitar guitar;

  @Before
  public void before(){
    drum = new Drum("Plastic", "Yello", "Damroo",120, 170,12);
    guitar = new Guitar("Wood", "Red", "Electric", 240, 350, 9);
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

  @Test
  public void hasStock(){
    shop.stock(drum);
    shop.stock(guitar);
    assertEquals(2, shop.stockCount());
  }

  @Test
  public void removeOneFromStock(){
    shop.stock(drum);
    shop.stock(guitar);
    shop.removeOneFromStock(drum);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void countTheAllProfit(){
    shop.stock(drum);
    shop.stock(guitar);
    assertEquals(160, shop.allProfit());
  }
}