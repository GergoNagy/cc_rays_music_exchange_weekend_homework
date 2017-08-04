package instrument_management;

public abstract class Instrument {

  String material;
  String color;
  String type;

  public Instrument(String material, String color, String type){
    this.material = material;
    this.color = color;
    this.type = type;
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
}