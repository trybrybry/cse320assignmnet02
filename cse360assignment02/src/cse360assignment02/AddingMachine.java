package cse360assignment02;

public class AddingMachine {
  private int total;
  private String s;
  
  // constructor 
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    s = "0";
  }
  
  // getter to retrieve total 
  public int getTotal () {
	  
    return total;
  }
  
  // mutator adds to total 
  public void add (int value) {
	  total = total + value;
	  s = s + " + " + value;
  }

  // mutator subtracts from total 
  public void subtract (int value) {
	  total = total - value;
	  s = s + " - " + value;
  }
  // getter prints out data in a string format
  public String toString () {
    return s;
  }
  
  // mutator clears data 
public void clear() {
	  total = 0;
	  s = "0";
  }
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  AddingMachine calculator = new AddingMachine();
	  calculator.add(4);
	  calculator.subtract(2);
	  calculator.add(5);
	  System.out.println(calculator.toString());
	  System.out.println(calculator.getTotal());
	}

}
