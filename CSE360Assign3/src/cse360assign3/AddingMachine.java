/*
 * Alyssa Stefencavage 
 * Class number: 70641
 * Assignment 3
 * This class is the revised version of AddingMachine.java
 * from assignment 2, I have changed the instance variables to 
 * have protected visibility and fixed solution.
 */
package cse360assign3;
import java.lang.String;
public class AddingMachine {
	
	protected int total; //changed to protected for assignment 3
	protected String output = "0"; //changed to protected for assignment 3
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value; //added to total
		output = output + " + " + value; //add to output
		
	}
	
	public void subtract (int value) {
		total = total - value; //subtracted from total
		output = output + " - " + value; //add to output

		
	}
	
	public String toString () {
		return output; //returns the string of the history of calculations
	}
	
	public void clear() { //added to assignment 3
		output = "0"; //clear the variables
		total = 0;
		
	}
}
