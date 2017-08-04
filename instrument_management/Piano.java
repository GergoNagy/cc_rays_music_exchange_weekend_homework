package instrument_management;
import behaviours.*;

public class Piano extends Instrument  {

  int numberOfKeys;

  public Piano(String material, String color, String type, int buyPrice, int sellPrice, int numberOfKeys){
    super(material, color, type, buyPrice, sellPrice);
    this.numberOfKeys = numberOfKeys;
  }

  public int getKeys(){
    return this.numberOfKeys;
  }

  public String play(){
    return "Dandadadaannn";
  }
}