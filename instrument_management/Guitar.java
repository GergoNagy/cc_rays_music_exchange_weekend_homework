package instrument_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {
    
  int numberOfStrings;

  public Guitar(String material, String color, String type, int buyPrice, int sellPrice, int numberOfStrings){
    super(material, color, type, buyPrice, sellPrice);
    this.numberOfStrings = numberOfStrings;
  }

  public int getStrings(){
    return this.numberOfStrings;
  }

  public String play(){
    return "Aaaa";
  }

  public int calculateMarkup(){
    return sellPrice - buyPrice;
  }

}