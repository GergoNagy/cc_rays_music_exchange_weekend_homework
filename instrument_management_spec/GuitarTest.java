import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before(){
    guitar = new Guitar("Wood", "Red", "Electric", 9);
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
    
}