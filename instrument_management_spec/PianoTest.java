import static org.junit.Assert.*;
import org.junit.*;
import instrument_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before(){
    piano = new Piano(80);
  }

  @Test
  public void hasKeys(){
    assertEquals(80, piano.getKeys());
  }

  @Test
  public void canPlay(){
    assertEquals("Dandadadaannn", piano.play());
  }
}