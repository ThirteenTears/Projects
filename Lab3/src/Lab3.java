import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * Lab 3 Written by Caleb Smith 9/9/2015, CS - 250
 */
public class Lab3 {
	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("stock.dat");
		Scanner infile = new Scanner(inputfile);
		Stock[] myStock = new Stock[100];
		int intCounter = 0;
		int i = 0;
		String strUserInput = "";
		Stock stockSmallest = new Stock();
		Stock stockLargest = new Stock();
		Stock stockVLowest = new Stock();
		stockSmallest.setPrice(9999999.0);
		stockLargest.setPrice(0.0);
		stockVLowest.setVolume(9999999);
		
		//Load stock.dat into an array.
		while(infile.hasNext() == true)
		{
			myStock[intCounter] = new Stock(infile.nextLine());
			intCounter++;
		}
		//Find the Stock with the lowest price, highest price, and lowest volume.
		for(i = 0; i < myStock.length && myStock[i] != null; i++)
		{
			if(stockSmallest.getPrice() > myStock[i].getPrice())
			{
				stockSmallest = myStock[i];
			}
			if(stockLargest.getPrice() < myStock[i].getPrice())
			{
				stockLargest = myStock[i];
			}
			if(stockVLowest.getVolume() > myStock[i].getVolume())
			{
				stockVLowest = myStock[i];
			}
		}
		System.out.println("The stock with the lowest price is: " + stockSmallest.getDesc());
		System.out.println("The stock with the highest price is: " + stockLargest.getDesc());
		System.out.println("The stock with the lowest volume is: " + stockVLowest.getDesc());
		
		strUserInput = JOptionPane.showInputDialog("Please enter a 4 didget Stock Name to search.");
		strUserInput = strUserInput.toUpperCase();
		for(i = 0; i < myStock.length && myStock[i] != null; i++)
		{
			if(strUserInput.equals(myStock[i].getName()))
			{
				System.out.println("\n" + myStock[i].getValue());
				break;
			}
		}
		if(myStock[i] == null)
		{
			System.out.println("\n" + "The stock: " + strUserInput + " does not exist!");
		}
		infile.close();
	}
}
