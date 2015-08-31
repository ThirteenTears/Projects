import javax.swing.JOptionPane;

public class Lab1c {
	/*
	 * Lab 0-A Written by Caleb Smith 8/31/2015, CS - 250
	 * 
	 */
	public static void main(String[] args) {
		int inputValue;
		inputValue = Integer.parseInt(JOptionPane.showInputDialog("Please type in an interger value."));
		
		for(int testValue =3; testValue <= inputValue; testValue++)
		{
			boolean isprime = true;
			for(int i = 2; i < testValue - 1; i++)
			{
				if(testValue % i == 0)
				{
					isprime = false;
					//System.out.println("The value " + inputValue + " is NOT prime.");
					break;
				}
			}
			if(isprime)
			{
				System.out.println("The value " + testValue + " is prime" + "\n");
				System.out.println("");
			}
		}
	}
}
