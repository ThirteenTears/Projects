package MVC;
import java.io.*;

import java.util.Scanner;
import java.util.StringTokenizer;
import support.item;
import java.util.Arrays;
/*
 * CS-250 10/14/2015 Assignment 2
 * @author Caleb Smith
 * Develop the InventoryManager that should read the file of item objects called inventorydb.dat and provides methods to return information from this inventory.
 */
public class InventoryManager {
	//Variables
	File infile = new File("inventorydb.dat");
	FileInputStream inStream = new FileInputStream(infile);
	ObjectInputStream inObjStream = new ObjectInputStream(inStream);
	int intItems = inObjStream.readInt();
	item[] myitems = new item[intItems];
	
	public InventoryManager() throws FileNotFoundException, IOException
	{
		//Read the file of item objects and store in array.
		
		try
		{
			for(int i = 0; i < intItems; i++)
			{
				myitems[i] = (item) inObjStream.readObject();
			}
		}
		catch(ClassNotFoundException e)
		{
			myitems = null;
			System.out.println("Error: Item classes not found.");
		}
	}
	//Sorters.
	private item sByName(String s)
	{
		item x = null;
		for(int i = 0; i < intItems; i++)
		{
			if(s == myitems[i].getName())
			{
				x = myitems[i];
			}
		}
		return x;
	}
	private item sByNumber(int i)
	{
		item x = null;
		for(int j = 0; j < intItems; j++)
		{
			if(i == myitems[j].getnumber())
			{
				x = myitems[j];
			}
		}
		return x;
	}
	private item sByPrice(double d)
	{
		item x = null;
		for(int i = 0; i < intItems; i++)
		{
			if(d == myitems[i].getPrice())
			{
				x = myitems[i];
			}
		}
		return x;
	}
	private item sByInv(int i)
	{
		item x = null;
		for(int j = 0; j < intItems; j++)
		{
			if(i == myitems[j].getinventory())
			{
				x = myitems[j];
			}
		}
		return x;
	}
	//Getters.
	public String getName(int i)
	{
		return myitems[i].getName();
	}
	public int getNumber(int i)
	{
		return myitems[i].getnumber();
	}
	public double getPrice(int i)
	{
		return myitems[i].getPrice();
	}
	public int getInv(int i)
	{
		return myitems[i].getinventory();
	}
	public String intNumTOname(int i)
	{
		item x = null;
		x = sByInv(i);
		if(x != null)
			return x.getName();
		else
			return "Inventory number \"" + i + "\" is not valid."; 
	}
	public double intNumTOprice(int i)
	{
		item x = null;
		x = sByInv(i);
		if(x != null)
			return x.getPrice();
		else
			return -1; 
	}
	public int intNumTOinv(int i)
	{
		item x = null;
		x = sByInv(i);
		if(x != null)
			return x.getinventory();
		else
			return -1; 
	}
	public String toString(int i)
	{
		item x = sByInv(i);
		return x.toString();
	}
}
