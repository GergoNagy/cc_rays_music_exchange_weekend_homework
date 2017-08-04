package instrument_management;
import behaviours.*;

public class Piano {

  int numberOfKeys;

  public Piano(int numberOfKeys){
    this.numberOfKeys = numberOfKeys;
  }

  public int getKeys(){
    return this.numberOfKeys;
  }

  public String play(){
    return "Dandadadaannn";
  }
}