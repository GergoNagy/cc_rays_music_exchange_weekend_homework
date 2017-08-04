import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before(){
    piano = new Piano("Wood", "Black", "Classic", 80);
  }

  @Test
  public void hasKeys(){
    assertEquals(80, piano.getKeys());
  }

  @Test
  public void canPlay(){
    assertEquals("Dandadadaannn", piano.play());
  }

  @Test
  public void hasMaterial(){
    assertEquals("Wood", piano.getMaterial());
  }

  @Test
  public void hasColor(){
    assertEquals("Black", piano.getColor());
  }

  @Test
  public void hasType(){
    assertEquals("Classic", piano.getType());
  }
}