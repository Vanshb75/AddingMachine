package cse360assignment02;


public class AddingMachine {
	 public static void main(String[] args){
		 	AddingMachine  myAddingMachine = new AddingMachine();
	        myAddingMachine.add (4); 
	        myAddingMachine.subtract (2); 
	        myAddingMachine.add(5);
	        System.out.println(myAddingMachine.toString());
	  
	    }
  private static int total;
  static String toString;

  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    toString = new String("0");
  }

  public int getTotal () {
    return total;
  }
  
  public static void add (int value) {
	  total = total + value;
	  toString+=(" + "+value);
  }

  public static void subtract (int value) {
	  total = total - value;
	  toString+=(" - "+value);
  }

  public String toString () {
	  return toString;
  }

  public void clear() {
		    total = 0;  
		    toString = "0";
  	}
 }


