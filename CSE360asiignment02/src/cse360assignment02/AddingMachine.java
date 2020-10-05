package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history = "0 ";
	  
	public AddingMachine () {
	  total = 0;  // not needed - included for clarity
	}
	  
	public int getTotal () { //returns variable total 
	  return total;
	}
	  
	public void add (int value) { //adds integer variable value to the total variable
		total = total + value;
		history += "+ " + value + " ";
	}

	public void subtract (int value) {//subtracts integer variable value from the total variable
		total = total - value;
		history += "- " + value + " ";
	}

	public String toString () { //returns string of history of the adding and subtracting done to total
		return history;
	}

	public void clear() { //resets total to 0 and resets the history
		history = "0 ";
		total = 0;
	}
}
