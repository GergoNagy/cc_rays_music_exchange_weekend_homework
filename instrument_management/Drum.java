package instrument_management;
import behaviours.*;

public class Drum {

  int numberOfDrums;

  public Drum(int numberOfDrums){
    this.numberOfDrums = numberOfDrums;
  }

  public int getDrums(){
    return this.numberOfDrums;
  }

  public String play(){
    return "Dumm dumm dumm";
  }
}