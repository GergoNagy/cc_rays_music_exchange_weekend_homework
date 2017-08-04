package instrument_management;
import behaviours.*;
import java.util.*;

public class Shop {

  String name;
  ArrayList<Playable> instrument;

  public Shop(String name){
    this.name = name;
    this.instrument = new ArrayList<Playable>();
  }

  public String getName(){
    return this.name;
  }

  public void stock(Playable playable){
    this.instrument.add(playable);
  }
}