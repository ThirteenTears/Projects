package MVC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

import support.item;

import java.io.FileInputStream;
import java.io.FileInputStream;
import java.util.Arrays;
/*
 * CS-250 10/14/2015 Assignment 2
 * @author Caleb Smith
 * Develop the InventoryManager that should read the file of item objects called inventorydb.dat and provides methods to return information from this inventory.
 */
public class InventoryManager {
	
	public InventoryManager() throws FileNotFoundException, IOException
	{
		File file = new File("inventorydb.dat");
		FileReader fr = new FileReader(file);
		char [] a = new char[50];
	      fr.read(a); // reads the content to the array
	      for(char c : a)
	          System.out.print(c); //prints the characters one by one
	      fr.close();
		
		
		
	}
	
	
}
