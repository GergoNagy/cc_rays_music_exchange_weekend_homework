package instrument_management;
import behaviours.*;
import java.util.*;

public class Shop {

  String name;
  ArrayList<Playable> instrument;
  ArrayList<Sellable> stock;

  public Shop(String name){
    this.name = name;
    this.instrument = new ArrayList<Playable>();
    this.stock = new ArrayList<Sellable>();
  }

  public String getName(){
    return this.name;
  }

  public void canPlayInTheShop(Playable playable){
    this.instrument.add(playable);
  }

  public int stockCount(){
    return this.stock.size();
  }

  public void stock(Sellable sellable){
    this.stock.add(sellable);
  }

  public void removeOneFromStock(Sellable sellable){
    this.stock.remove(sellable);
  }
}