import javax.swing.JOptionPane;

public class Main 
{
	/*
	 * Test1A Written by Caleb Smith 9/16/2015, CS - 250
	 */
	public static void main(String[] args)
	{
		String strUserInput = "";
		int spaceCount = 0;
		int vowelCount = 0;
		strUserInput = JOptionPane.showInputDialog("Please type in a sentance.");
		for (char c : strUserInput.toCharArray()) {
		    if (c == ' ') {
		         spaceCount++;
		    }
		}
		for (char c : strUserInput.toCharArray()) {
		    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
		         vowelCount++;
		    }
		}
		System.out.println("The number of spaces in your sentence is: " + spaceCount);
		System.out.println("The number of vowels in your sentence is: " + vowelCount);
		System.out.println("The number of digits in your sentence is: " + strUserInput.replaceAll("\\D", " ").length());
	}


}


