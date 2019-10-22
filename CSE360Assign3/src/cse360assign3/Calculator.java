/*
 * Alyssa Stefencavage 
 * Class number: 70641
 * Assignment 3
 * This class inherits from AddingMachine,
 * it will also include multiplication, division,
 * and power
 */
package cse360assign3;
import java.lang.String;


public class Calculator extends AddingMachine { //use extend her inheritance 
	
	//protected int newTotal; //new total for calculator
	
	public Calculator() //set total to zero
	{
		total = 0;
	}
	public void divide(int value) { 
		if(value == 0)
		{
			total = 0; //if zero make total zero
			output = output + " / 0 "; //add to output
		}
		else
		{
			total = total / value; //if not zero divide
			output = output + " / " + value; //add to output
 		}
	}
	
	public void multiply(int value) {
		if(value == 0) 
		{
			total = 0; //if zero set total to zero
			output = output + " * 0 "; //add to output
		}
		else
		{
			total = total * value; //if not zero multiply
			output = output + " * " + value; //add to output
		}
	}
	
	
	
}
