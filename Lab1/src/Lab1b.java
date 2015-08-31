import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab1b {
	/*
	 * Lab 0-A Written by Caleb Smith 8/31/2015, CS - 250
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//Declare Variables.
		File inputfile = new File("inp.dat");
		Scanner infile = new Scanner(inputfile);
		int value;
		int lowValue = 0;
		int highValue = 0;
		int between1and4 = 0;
		int oddNumbers = 0;
		int evenNumbers = 0;
		int closest = 9999999;
		while(infile.hasNext() == true)
		{
			infile.nextInt();
			value = infile.nextInt();
			if(value < 200)
			{
				lowValue++;
			}
			if(value > 200)
			{
				highValue++;
			}
			if(value < 400 && value > 100)
			{
				between1and4++;
			}
			if(value % 2 == 0)
			{
				evenNumbers++;
			}
			if(value % 2 != 0)
			{
				oddNumbers++;
			}
			if(Math.abs(250-value) < Math.abs(250-closest))
			{
				closest = value;
			}
			//System.out.println("The value read is " + value);
		}
		infile.close();
		System.out.println("There were " + lowValue + " numbers below 200.");
		System.out.println("There were " + highValue + " numbers above 200.");
		System.out.println("There were " + between1and4 + " numbers between 100 and 400.");
		System.out.println("There were " + evenNumbers + " even numbers.");
		System.out.println("There were " + oddNumbers + " odd numbers.");
		System.out.println("The number closest to was " + closest + ".");
	}

}
