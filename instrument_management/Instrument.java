package instrument_management;

public abstract class Instrument {

  String material;
  String color;
  String type;
  int buyPrice;
  int sellPrice;

  public Instrument(String material, String color, String type, int buyPrice, int sellPrice){
    this.material = material;
    this.color = color;
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String getMaterial(){
    return this.material;
  }

  public String getColor(){
    return this.color;
  }

  public String getType(){
    return this.type;
  }

  public int getBuyPrice(){
    return this.buyPrice;
  }

  public int getSellPrice(){
    return this.sellPrice;
  }
}