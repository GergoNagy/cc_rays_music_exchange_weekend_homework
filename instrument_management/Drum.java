package instrument_management;
import behaviours.*;

public class Drum extends Instrument  {

  int numberOfDrums;

  public Drum(String material, String color, String type, int buyPrice, int sellPrice, int numberOfDrums){
    super(material, color, type, buyPrice, sellPrice);
    this.numberOfDrums = numberOfDrums;
  }

  public int getDrums(){
    return this.numberOfDrums;
  }

  public String play(){
    return "Dumm dumm dumm";
  }
}