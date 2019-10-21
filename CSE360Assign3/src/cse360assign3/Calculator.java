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


public class Calculator extends AddingMachine {
	
	//protected int newTotal; //new total for calculator
	
	public Calculator()
	{
		total = 0;
	}
	public void divide(int value) {
		if(value == 0)
		{
			total = 0;
			output = output + " / 0 ";
		}
		else
		{
			total = total / value;
			output = output + " / " + value;
 		}
	}
	
	public void multiply(int value) {
		if(value == 0)
		{
			total = 0;
			output = output + " * 0 ";
		}
		else
		{
			total = total * value;
			output = output + " * " + value;
		}
	}
	
	
	
}
