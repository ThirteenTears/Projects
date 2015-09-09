import java.util.Arrays;
import java.util.Random;
public class Lab2a {
	/*
	 * Lab 0-A Written by Caleb Smith 8/31/2015, CS - 250
	 */
	public static void main(String[] args) {
		int intSmallest = 1000;
		int intLargest = 0;
		int int2small = 1000;
		int int2large = 0;
		int intLpos = 0;
		int intSpos = 0;
		int intLpos2 = 0;
		int intSpos2 = 0;
		int i = 0;
		int[] intArray = new int[24];
		Random generator = new Random();
		
		for(i = 0; i < 24; i++)
		{
			intArray[i] = generator.nextInt(1000);	
		}
		for(i = 0; i < 24; i++)
		{
			if(int2small > intArray[i] && intArray[i] > intSmallest)
			{
				int2small = intArray[i];
				intSpos2 = i;
			}
			if(int2large < intArray[i] && intArray[i] < intLargest)
			{
				int2large = intArray[i];
				intLpos2 = i;
			}
			if(intSmallest > intArray[i])
			{
				intSmallest = intArray[i];
				intSpos = i;
			}
			if(intLargest < intArray[i])
			{
				intLargest = intArray[i];
				intLpos = i;
			}
			
		}
		int j = 0;
		int[] intArraySorted = new int[24];
		for(i = 0; i < 24; i++)
		{
			while(intArray[i] <= intArraySorted[j]);
			{
				j++;
			}
			
			
		}
		
		
		
		System.out.println("The smallest value in the array is: " + intSmallest + ". [" + intSpos + "]");
		System.out.println("The largest value in the array is: " + intLargest + ". [" + intLpos + "]");
		System.out.println("The second smallest value in the array is: " + int2small + ". [" + intSpos2 + "]");
		System.out.println("The second largest value in the array is: " + int2large + ". [" + intLpos2 + "]");
		System.out.println("The median value in the array is: ");

	}

}
