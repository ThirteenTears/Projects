package support;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*
 * 
 * Sudharsan Iyengar, Lab0, 1/13/2014, CS-250
 * 
 *  // describe the assignment
 */

// imports

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File infile = new File("lab.dat");// connect to a windows file
		
		FileInputStream instream = new FileInputStream(infile);
		
		Scanner input = new Scanner(instream);
		
		int numberofitems = input.nextInt();
		
		item[] data = new item[numberofitems]; // we have an array!
		
		for (int i = 0; i < numberofitems; i++)
		{
			
			data[i] = new item(input.next(), input.nextInt(), input.nextDouble(), input.nextInt());
		}
		
		
		File outinvfile = new File("inventorydb.dat");
		FileOutputStream outinvstream = new FileOutputStream(outinvfile);
		
		ObjectOutputStream outinv = new ObjectOutputStream(outinvstream);
		
		outinv.writeInt(numberofitems);
		
		for (int i = 0; i < numberofitems; i++)
		{
			outinv.writeObject(data[i]);
		}

		outinv.close();
		


	}

}
