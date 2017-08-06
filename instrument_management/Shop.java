package instrument_management;
import behaviours.*;
import java.util.*;

public class Shop {

  InstrumentType type;
  String name;
  ArrayList<Playable> instrument;
  ArrayList<Sellable> stock;
  

  public Shop(InstrumentType type, String name){
    this.type = type;
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

  public int allProfit(){
    int profit = 0 ;
    for (int i = 0; i < this.stock.size() ; i++ ) {
      profit += this.stock.get(i).calculateMarkup();
    }
    return profit;
  }

  public InstrumentType getType() {
    return this.type;
  }
}