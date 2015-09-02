import java.util.Random;
public class Lab2a {
	/*
	 * Lab 0-A Written by Caleb Smith 8/31/2015, CS - 250
	 */
	public static void main(String[] args) {
		int intSmallest = 1000;
		int intLargest = 0;
		int intLpos = 0;
		int intSpos = 0;
		int[] intArray = new int[24];
		Random generator = new Random();
		
		for(int i = 0; i < 24; i++)
		{
			intArray[i] = generator.nextInt(1000);
			for(int j = 0; j < 24; j++)
			{
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
		}
		System.out.println("The smallest value in the array is: " + intSmallest);
		System.out.println("The largest value in the array is: " + intLargest);
		
		

	}

}
