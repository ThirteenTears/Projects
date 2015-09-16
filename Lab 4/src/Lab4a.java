import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class Lab4a {
	/*
	 * Lab 4 Written by Caleb Smith 9/14/2015, CS - 250
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//Declaring Variables.
		boolean blExit = false;
		int intFracCounter = 0;
		String strFileData = "";
		File inputFile = new File("input4.dat");
		Scanner inFile = new Scanner(inputFile);
		FractionObject[] myFraction = new FractionObject[100];
		String strFracOptions = "";
		
		/*
		 * Loads the File into an array.
		 * Reads how many lines are part of a fraction.
		 * Concats the content of those lines into a string.
		 * Saves into an array a new 'Fraction' formed from string.
		 * Moves on t next fraction if there is one.
		 */
		while(inFile.hasNextLine() == true)
		{
			int intFileLength = Integer.parseInt(inFile.nextLine());
			int intFileCounter = 0;
			while(intFileCounter < intFileLength)
			{
				strFileData = strFileData.concat(" " + inFile.nextLine());
				intFileCounter++;
			}
			myFraction[intFracCounter] = new FractionObject(strFileData);
			intFracCounter++;
			strFileData = "";
		}
		
		//Builds a string of Fraction Names.
		for(int i = 0; i < intFracCounter; i++)
		{
			int intShowNumber = 0;
			intShowNumber = i + 1;
			strFracOptions = strFracOptions.concat(intShowNumber + ". " + myFraction[i].getName() + "\n");
		}
		
		//User Menu.
		while(blExit == false)
		{
			int userInput = 0;
			while(1 == 1)
			{
				try
				{
					userInput = Integer.parseInt(JOptionPane.showInputDialog("Please select an operation by typing the number in front of it.\n 1. Display.\n2. Addition.\n3. Subtraction.\n4. Multiplication.\n5. Division.\n6. Exit."));
					break;
				}
				catch(Exception err)
				{
					JOptionPane.showMessageDialog(null, "Please type in the corresponding number.");
				}
			}
			/*
			 * Handles User Menu Item 1; Displaying a Fraction.
			 * Displays a String of all the Fraction Names.
			 */
			if(userInput == 1)
			{
				while(1 == 1)
				{
					try
					{
						int intUserInput = 0;
						intUserInput = Integer.parseInt(JOptionPane.showInputDialog("Select a fraction to view:\n" + strFracOptions));
						if(intUserInput <= intFracCounter)
						{
							System.out.println(myFraction[intUserInput - 1].getDesc());
							break;
						}
						else
						{
							JOptionPane.showMessageDialog(null, "That is not a valid selection.");
						}
					}
					catch(Exception Err)
					{
						JOptionPane.showMessageDialog(null, "That is not a valid selection.");
					}
				}
			}
			/*
			 * Handles User Menu item 2; adds together two fractions.
			 * Displays Sum in a string.
			 */
			else if(userInput == 2)
			{
				int userInput2 = 0;
				while(1 ==1)
				{
					try
					{
						int num1 = 0;
						int num2 = 0;
						int dem1 = 0;
						int dem2 = 0;
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 1:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num1 = myFraction[userInput2].getNum();
						dem1 = myFraction[userInput2].getDen();
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 2:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num2 = myFraction[userInput2].getNum();
						dem2 = myFraction[userInput2].getDen();
						System.out.println(myFraction[1].addFrac(num1, num2, dem1, dem2));
						break;
					}
					catch(Exception Err)
					{
						JOptionPane.showMessageDialog(null, "Error in Input.\nPlease enter an Integer.");
					}
				}
			}
			/*
			 * Handles User Option 3; Subtracts two fractions
			 * Displays differenct in a string.
			 */
			else if(userInput == 3)
			{
				int userInput2 = 0;
				while(1 ==1)
				{
					try
					{
						int num1 = 0;
						int num2 = 0;
						int dem1 = 0;
						int dem2 = 0;
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 1:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num1 = myFraction[userInput2].getNum();
						dem1 = myFraction[userInput2].getDen();
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 2:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num2 = myFraction[userInput2].getNum();
						dem2 = myFraction[userInput2].getDen();
						System.out.println(myFraction[1].subFrac(num1, num2, dem1, dem2));
						break;
					}
					catch(Exception Err)
					{
						JOptionPane.showMessageDialog(null, "Error in Input.\nPlease enter an Integer.");
					}
				}
			}
			/*
			 * Handles User Option 4; Multiplies two fractions.
			 * Displays output in a string.
			 */
			else if(userInput == 4)
			{
				int userInput2 = 0;
				while(1 ==1)
				{
					try
					{
						int num1 = 0;
						int num2 = 0;
						int dem1 = 0;
						int dem2 = 0;
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 1:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num1 = myFraction[userInput2].getNum();
						dem1 = myFraction[userInput2].getDen();
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 2:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num2 = myFraction[userInput2].getNum();
						dem2 = myFraction[userInput2].getDen();
						System.out.println(myFraction[1].multFrac(num1, num2, dem1, dem2));
						break;
					}
					catch(Exception Err)
					{
						JOptionPane.showMessageDialog(null, "Error in Input.\nPlease enter an Integer.");
					}
				}
			}
			/*
			 * Handles User Option 5; Divides two fractions.
			 * Displays difference in a string.
			 */
			else if(userInput == 5)
			{
				int userInput2 = 0;
				while(1 ==1)
				{
					try
					{
						int num1 = 0;
						int num2 = 0;
						int dem1 = 0;
						int dem2 = 0;
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 1:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num1 = myFraction[userInput2].getNum();
						dem1 = myFraction[userInput2].getDen();
						userInput2 = Integer.parseInt(JOptionPane.showInputDialog("Select fraction 2:\n" + strFracOptions));
						userInput2 = userInput2 - 1;
						num2 = myFraction[userInput2].getNum();
						dem2 = myFraction[userInput2].getDen();
						System.out.println(myFraction[1].divFrac(num1, num2, dem1, dem2));
						break;
					}
					catch(Exception Err)
					{
						JOptionPane.showMessageDialog(null, "Error in Input.\nPlease enter an Integer.");
					}
				}
			}
			//User option 6 exits the program.
			else if(userInput == 6)
			{
				blExit = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "\"" + userInput + "\" is not a valid input.");
			}
		}

	}

}
