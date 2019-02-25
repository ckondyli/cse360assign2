package cse360assign2;
/*
 * Name: Constantina Kondylis
 * 
 * This program acts as a calculator, adding, subtracting,
 * multiplying, and dividing integers. It will show the history 
 * of operations.
 */

public class Calculator
{
	private int total;
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () 
	{
		return total;
	}
	
	public void add (int value) 
	{
		total = total + value;
	}
	
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	public void multiply (int value) 
	{
		total = total * value;
	}
	
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
	}
	
	public String getHistory () 
	{
		return "";
	}
}
