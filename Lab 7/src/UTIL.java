
public class UTIL {
/*
 * Lab 7 CS250 10/15/15
 * @author Caleb Smith
 * 
 * This class handles searching and sorting.
 */
	//Preforms a linear Search on a given array, for a given number.
	public boolean linearSearch(int[] i, int j)
	{
		boolean found = false;
		for(int k = 0; k < i.length; k++)
		{
			if(i[k] == j)
			{
				found = true;
				break;
			}
			else
				found = false;
		}
		
		return found;
	}
	//Performs a binary Search on a given array for a given number
	public boolean binarySearch(int[] array, int lowerBound, int upperBound, int key)
	{
		boolean found = false;
		int mid = (lowerBound + upperBound)/2;
		while(lowerBound <= upperBound && array[mid] != key)
		{
			if(array[mid] < key)
				lowerBound = mid + 1;
			else
				upperBound = mid - 1;
			mid = (lowerBound + upperBound)/2;
		}
		if(lowerBound > upperBound)
			found = false;
		else
			found = true;
		return found;
	}
	//Performs a selection sort on given array.
	public int[] selectionSort(int[] array)
	{
		int minIndex, length, temp;
		length = array.length;
		for(int startIndex = 0; startIndex <= length - 2; startIndex++)
		{
			minIndex = startIndex;
			for(int i = startIndex + 1; i <= length -1; i++)
			{
				if(array[i] < array[minIndex])
					minIndex = i;
			}
			temp = array[startIndex];
			array[startIndex] = array[minIndex];
			array[minIndex] = temp;
		}
		return array;
	}
	//Performs a bubble sort on a given array.
	public int[] bubbleSort(int[] array)
	{
		int temp, bottom;
		boolean exchanged = true;
		bottom = array.length - 2;
		while(exchanged)
		{
			exchanged = false;
			for(int i = 0; i <= bottom; i++)
			{
				if(array[i] > array[i + 1])
				{
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					exchanged = true;
				}
			}
		}	
		return array;
	}
	//Performs an insertion sort on a given array.
	public int[] insertionSort(int[] array)
	{
		for(int j = 1; j < array.length; j++)
		{
			int key = array[j];
			int i = j - 1;
			while((i > -1) && (array[i] > key))
			{
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		return array;
	}
	
	
	
}
