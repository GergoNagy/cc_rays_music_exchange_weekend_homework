import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before(){
    guitar = new Guitar("Wood", "Red", "Electric", 240, 350, 9);
  }

  @Test
  public void haStrings(){
    assertEquals(9, guitar.getStrings());
  }

  @Test
  public void canPlay(){
    assertEquals("Aaaa", guitar.play());
  }

  @Test
  public void hasMaterial(){
    assertEquals("Wood", guitar.getMaterial());
  }

  @Test
  public void hasColor(){
    assertEquals("Red", guitar.getColor());
  }

  @Test
  public void hasType(){
    assertEquals("Electric", guitar.getType());
  }

  @Test
  public void buyingPrice(){
    assertEquals(240, guitar.getBuyPrice());
  }

  @Test
  public void sellingPrice(){
    assertEquals(350, guitar.getSellPrice());
  }

  @Test
  public void profitOnSell(){
    assertEquals(110, guitar.calculateMarkup());
  }
    
}