package cse360assignment02;


public class AddingMachine {

  private int total;
  String toString;

  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    toString = new String("0");
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  toString+=(" + "+value);
  }

  public void subtract (int value) {
	  total = total - value;
	  toString+=(" - "+value);
  }

  public String toString () {
	  return toString;
  }

  public void clear() {
		    total = 0;  
		    toString = new String("0");
  	}
 }


