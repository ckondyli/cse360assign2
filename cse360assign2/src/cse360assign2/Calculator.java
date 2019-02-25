package cse360assign2;
import java.util.*;

/*
 * Name: Constantina Kondylis
 * 
 * This program acts as a calculator, adding, subtracting,
 * multiplying, and dividing integers. It will show the history 
 * of operations.
 */

public class Calculator
{
	/*
	 * data
	 */
	private int total;
	private ArrayList myAL;
	//private ArrayList ans;
	
	/*
	 * constructor
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		myAL = new ArrayList();		//arraylist to store values and operators 
		//ans = new ArrayList();
		myAL.add(0);				//add 0 to the first spot in arraylist
	}
	
	
	/*
	 * methods
	 * 
	 * getTotal: returns arithmetic total of all inputs
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * add: adds an input value to the total.
	 * adds value to the arraylist
	 */
	public void add (int value) 
	{
		total = total + value;
		myAL.add(" + ");
		myAL.add(value);
	}
	
	/*
	 * subtract: subtracts an input value to the total.
	 * adds the value to the arraylist
	 */
	public void subtract (int value) 
	{
		total = total - value;
		myAL.add(" - ");
		myAL.add(value);
	}
	
	
	/*
	 * multiply: multiplies an input value to the total.
	 * adds the value to the arraylist
	 */
	public void multiply (int value) 
	{
		total = total * value;
		myAL.add(" * ");
		myAL.add(value);
	}
	
	/*
	 * divide: divides the total by the input value parameter.
	 * adds the value to the arraylist
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		
		else
		{
			total = total / value;
		}
		myAL.add(" / ");
		myAL.add(value);
	}
	
	/*
	 * getHistory: iterates through arraylist containing all 
	 * input values and operators, and prints these values and operators.
	 * Prints new line for formatting purposes 
	 */
	public String getHistory () 
	{
		for (int i=0; i<myAL.size(); i++)
			System.out.print(myAL.get(i));
		System.out.println();
		return null;
	}
	
}
