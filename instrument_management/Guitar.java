package instrument_management;
import behaviours.*;

public class Guitar extends Instrument {
    
  int numberOfStrings;

  public Guitar(String material, String color, String type, int numberOfStrings){
    super(material, color, type);
    this.numberOfStrings = numberOfStrings;
  }

  public int getStrings(){
    return this.numberOfStrings;
  }

  public String play(){
    return "Aaaa";
  }

}