import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
/*
 * Test1B Written by Caleb Smith 9/16/2015, CS - 250
 */
	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("inp.dat");
		Scanner infile = new Scanner(inputfile);
		int[] testOneInt = new int[20];
		int intSum = 0;
		int intSum2 = 0;
		double dblAvg = 0.0;
		int intRangeCount = 0;
		for(int i = 0; i < 20; i++)
		{
			testOneInt[i] = infile.nextInt();
			intSum += testOneInt[i];
			if(testOneInt[i] > 100 && testOneInt[i] < 200)
			{
				intRangeCount++;
			}
		}
		dblAvg = (intSum / 20);
		System.out.println("The sum of all the values is: " + intSum);
		System.out.println("The average of all the values is: " + dblAvg);
		System.out.println("The number of values between 100 and 200 is: " + intRangeCount);
		
		
		//Calculate Standard Deviation for file.
		double stdev = 0.0;
		for(int i = 0; i < testOneInt.length; i++)
		{
			testOneInt[i] = (int) Math.pow((testOneInt[i] - dblAvg), 2);
			intSum2 = intSum2 + testOneInt[i];
		}
		stdev = intSum2 / (testOneInt.length - 1);
		stdev = Math.sqrt(stdev);
		System.out.println("The standard deviation is:" + stdev);
	}
	

}
