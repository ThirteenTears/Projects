import java.util.Random;
import java.io.File;
import java.io.PrintWriter;
/*
 * Lab 0-A Written by Caleb Smith 8/31/2015, CS - 250
 * Write an application that users Random class from java.util.* and generates 100 random numbers – in the range from 0 to 400 and write to text file inp.dat.
 */

public class Lab1a {
	public static void main(String[] args) throws Exception { //bunting the exception to the caller of this method
		//Declare Variables.
		Random generator = new Random();
		File inputfile = new File("inp.dat");
		PrintWriter prt = new PrintWriter(inputfile);
		
		for(int i = 0; i < 100; i++)
		{
			prt.println(generator.nextInt(400));
		}
		prt.close();
	}
}
