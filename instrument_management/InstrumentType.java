package instrument_management;

public enum InstrumentType {
  DRUMS,
  STRINGS,
  KEYBOARD;

  public String toString(){
    switch(this){
      case DRUMS:   return "drums!";
      case STRINGS: return "strings!";
      case KEYBOARD: return "keyboard!";
      default: return "undefined";
    }
  }
}

