import java.util.Random;

import javax.swing.JOptionPane;

import java.io.*;
/*
 * Lab 7 CS250 10/15/15
 * @author Caleb Smith
 * 
 * This class handles creating a binary file, loading that file, and user interaction.
 */
public class Main {

	public static void main(String[] args) throws IOException
	{
		//Variables
		UTIL myUTIL = new UTIL();
		int[] unsorted = new int[1024];
		int[] SSsorted = new int[1024];
		int[] BBsorted = new int[1024];
		int[] INsorted = new int[1024];
		
		
		//creating Binary File
		File outputFile = new File("data.dat");
		FileOutputStream outStream = new FileOutputStream(outputFile);
		DataOutputStream os = new DataOutputStream(outStream);
		Random randInt = new Random();
		//Creates 1024 Random Integers
		for(int i = 0; i <= 1024; i++)
		{
			os.writeInt(randInt.nextInt(99999) + 1);
		}
		os.close();
		outStream.close();
		
		//Read file and store data.
		File inFile = new File("data.dat");
		FileInputStream inStream = new FileInputStream(inFile);
		DataInputStream dataIn = new DataInputStream(inStream);
		//Store data into Array.
		for(int i = 0; i < 1024; i++)
		{
			unsorted[i] = dataIn.readInt();
		}
		
		//Sort array and report time taken.
		
		//Perform selection sort.
		long timetaken = 0;
		timetaken = System.currentTimeMillis();
		SSsorted = myUTIL.selectionSort(unsorted);
		timetaken = System.currentTimeMillis() - timetaken;
		System.out.println("Time taken for Selection sort was: " + timetaken + " milliseconds.");
		
		//Perform bubble sort.
		timetaken = System.currentTimeMillis();
		BBsorted = myUTIL.bubbleSort(unsorted);
		timetaken = System.currentTimeMillis() - timetaken;
		System.out.println("Time taken for Bubble sort was: " + timetaken + " milliseconds.");
		
		//Perform insertion sort.
		timetaken = System.currentTimeMillis();
		INsorted = myUTIL.insertionSort(unsorted);
		timetaken = System.currentTimeMillis() - timetaken;
		System.out.println("Time taken for Insertion sort was: " + timetaken + " milliseconds.\n");
		//get user input.
		boolean correctInput = false;
		int userInput = 0;
		while(correctInput == false)
		{
			try
			{
				userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer between 1 and 99999."));
				correctInput = true;
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "That is not a valid integer.");
			}
		}
		//do linear search and report time.
		System.out.println("Linear Search results.");
		boolean found = false;
		timetaken = System.currentTimeMillis();
		found = myUTIL.linearSearch(unsorted, userInput);
		timetaken = System.currentTimeMillis() - timetaken;
		if(found == true)
		{
			System.out.println("Your number WAS found in the array. Search took: " + timetaken + " milliseconds.");
		}
		else
		{
			System.out.println("Your number WAS NOT found in the array. Search took: " + timetaken + " milliseconds.\n");
		}
		//Do binary search and report time.
		System.out.println("Binary Search results.");
		timetaken = System.currentTimeMillis();
		found = myUTIL.binarySearch(INsorted, 0, 1024, userInput);
		timetaken = System.currentTimeMillis() - timetaken;
		if(found == true)
		{
			System.out.println("Your number WAS found in the array. Search took: " + timetaken + " milliseconds.");
		}
		else
		{
			System.out.println("Your number WAS NOT found in the array. Search took: " + timetaken + " milliseconds.");
		}	
	}
}
