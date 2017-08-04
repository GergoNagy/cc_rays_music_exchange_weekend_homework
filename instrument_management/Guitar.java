package instrument_management;
import behaviours.*;

public class Guitar { //extends Instrument implements Sellable, Playable {
    
  int numberOfStrings;

  public Guitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  public int getStrings(){
    return this.numberOfStrings;
  }

  public String play(){
    return "Aaaa";
  }
}