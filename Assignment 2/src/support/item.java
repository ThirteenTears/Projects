package support;
import java.io.Serializable;

/*
 * 
 *  a description for an item - with name, number, price, inventory
 */

// imports

public class item implements Serializable {

	private String name;
	
	private int number;
	private double price;
	private int inventory;
	
	/**
	 * 
	 * @param n
	 * @param num
	 * @param p
	 * @param inv
	 */
	
	public item(String n, int num, double p, int inv)
	{
		name = n;
		number = num;
		price = p;
		inventory = inv;
	}
	public int getnumber()
	{
		return number;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	
	
	public String toString()
	{
		String result;
		
		result = "The name of the item is " + name + " and its price is $" + price +
				"\n with item number " + number + " and inventory " + inventory; 
		
		return result;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getinventory()
	{
		return inventory;
	}
}
