import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.*;

public class AssignmentOne {
/*
 * Assignment One 9/20/2015, CS - 250
 * @author Caleb Smith
 * 
 * This application stores, and operates on polynomials in the "Polynomial Class"
 * It provides the user with menu driven options to operate on polynomials.
 * 
 */
	
/*
 * Pseudo - Code
 * Create an array of Polynomials.
 * Load polynomials from file into array.
 * Loop through user options.
 * Perform option selected, output result, continue looping.
 */
	
	public static void main(String[] args) throws FileNotFoundException {
		//Declaration of Variables.
		boolean blExit = false;
		int intChoice = 0;
		//Reads saved polynomials from file.
		File inputfile = new File("poly.dat");
		Scanner infile = new Scanner(inputfile);
		//Adds current line of file to a String Tokenizer.
		StringTokenizer stk = new StringTokenizer(infile.nextLine());
		//Creates an array of Polynomials, with a length defined by the file.
		Polynomial[] plyPolys = new Polynomial[Integer.parseInt(stk.nextToken())];
		
		//Creates a polynomial object for each polynomial described in the file, and saves it into the array.
		for(int i = 0; i < plyPolys.length; i++)
		{
			plyPolys[i] = new Polynomial();
			StringTokenizer st = new StringTokenizer(infile.nextLine());
			plyPolys[i].setName(st.nextToken());
			while(st.hasMoreTokens())
			{
				int intCoefficient = Integer.parseInt(st.nextToken());
				plyPolys[i].setArrayPair(Integer.parseInt(st.nextToken()), intCoefficient);
			}
		}		
		//Loops through the user menu until the user selects to exit.
		//All user input is checked.
		while(blExit == false)
		{
			try
			{
				intChoice = Integer.parseInt(JOptionPane.showInputDialog("Please choose an option by typing the cooresponding number.\n1. Output Polynomial.\n2. Evaluate Polynomial.\n3. Add Polynomials.\n4. Subtract Polynomials.\n5. Multiply Polynomials.\n6. Exit."));
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
			}
			//Handles Outputting a Polynomial based off of polynomial name.
			if(intChoice == 1)
			{
				/*
				 * Expected input: Integer 1 - plyPolys.length
				 * input "1" -> plyPolys[1].toString 
				 * input "2" -> plyPolys[2].toString 
				 * input "-#" -> no output
				 * input "!= #" -> no output
				 */
				String strPolys = "";
				int intInput = 0;
				for(int i = 0; i < plyPolys.length; i++)
				{
					strPolys = strPolys.concat((i + 1) + ". " + plyPolys[i].getName() + "\n");
				}
				
				while(intInput == 0)
				{
					try
					{
						intInput = Integer.parseInt(JOptionPane.showInputDialog("Please select a polynomial to display:\n" + strPolys));
						if(intInput > plyPolys.length || intInput < 1)
							plyPolys[plyPolys.length + 1].toString();
					}
					catch(Exception err)
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
						intInput = 0;
					}
				}
				System.out.println(plyPolys[intInput - 1].toString());				
				intChoice = 0;
			}
			/*
			 * Handles evaluating a polynomial selected through user input.
			 * 
			 * Expected input: Integer 1 - plyPolys.length
			 * input "1" -> plyPolys[1].evalPoly(x)
			 * input "2" -> plyPolys[2].evalPoly(x)
			 * input "-#" -> no output
			 * input "!= #" -> no output
			 */
			else if(intChoice == 2)
			{
				String strOutput = "";
				int intInput = 0;
				int intInputEval = 0;
				boolean blContinue = false;
				for(int i = 0; i < plyPolys.length; i++)
				{
					strOutput = strOutput.concat((i + 1) + ". " + plyPolys[i].toString() + "\n");
				}
				while(blContinue == false)
				{
					try
					{
						intInput = Integer.parseInt(JOptionPane.showInputDialog("Please select a polynomial you would lilke to evaluate:\n" + strOutput));
						if(intInput > plyPolys.length || intInput < 1)
							plyPolys[plyPolys.length + 1].toString();
						blContinue = true;
					}
					catch(Exception err)
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
					}
				}
				blContinue = false;
				while(blContinue == false)
				{
					try
					{
						intInputEval = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value for \"X\" to evaluate with " + plyPolys[intInput - 1].toString()));
						blContinue = true;
					}
					catch(Exception err)
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
					}
				}
				System.out.println(plyPolys[intInput - 1].evalPoly(intInputEval));
				intChoice = 0;
			}
			//Handles adding two polynomials selected through a drop down menu.
			else if(intChoice == 3)
			{
				int intChoiceOne = 0;
				int intChoiceTwo = 0;
				JComboBox<String> cb = new JComboBox<String>();
				for(int i = 0; i < plyPolys.length; i++)
				{
					cb.addItem(plyPolys[i].toString());
				}
				JOptionPane.showMessageDialog( null, cb, "Select Polynomial 1.", JOptionPane.PLAIN_MESSAGE);
				intChoiceOne = cb.getSelectedIndex();
				JOptionPane.showMessageDialog( null, cb, "Select Polynomial 2.", JOptionPane.PLAIN_MESSAGE);
				intChoiceTwo = cb.getSelectedIndex();
				Polynomial addPoly = new Polynomial();
				System.out.println(addPoly.addPoly(plyPolys[intChoiceOne].getPolyArr(), plyPolys[intChoiceTwo].getPolyArr()));
				intChoice = 0;
			}
			//Handles subtracting two polynomials selected through a drop down menu.
			else if(intChoice == 4)
			{
				int intChoiceOne = 0;
				int intChoiceTwo = 0;
				JComboBox<String> cb = new JComboBox<String>();
				for(int i = 0; i < plyPolys.length; i++)
				{
					cb.addItem(plyPolys[i].toString());
				}
				JOptionPane.showMessageDialog( null, cb, "Select Polynomial 1.", JOptionPane.PLAIN_MESSAGE);
				intChoiceOne = cb.getSelectedIndex();
				JOptionPane.showMessageDialog( null, cb, "Select Polynomial 2.", JOptionPane.PLAIN_MESSAGE);
				intChoiceTwo = cb.getSelectedIndex();
				Polynomial addPoly = new Polynomial();
				System.out.println(addPoly.subPoly(plyPolys[intChoiceOne].getPolyArr(), plyPolys[intChoiceTwo].getPolyArr()));
				intChoice = 0;
			}
			//Handles multiplying two polynomials selected through a drop down menu.
			else if(intChoice == 5)
			{
				int intChoiceOne = 0;
				int intChoiceTwo = 0;
				JComboBox<String> cb = new JComboBox<String>();
				for(int i = 0; i < plyPolys.length; i++)
				{
					cb.addItem(plyPolys[i].toString());
				}
				JOptionPane.showMessageDialog( null, cb, "Select Polynomial 1.", JOptionPane.PLAIN_MESSAGE);
				intChoiceOne = cb.getSelectedIndex();
				JOptionPane.showMessageDialog( null, cb, "Select Polynomial 2.", JOptionPane.PLAIN_MESSAGE);
				intChoiceTwo = cb.getSelectedIndex();
				Polynomial addPoly = new Polynomial();
				System.out.println(addPoly.multPoly(plyPolys[intChoiceOne].getPolyArr(), plyPolys[intChoiceTwo].getPolyArr()));
				intChoice = 0;
				
			}
			//Handles exiting the program.
			else if(intChoice == 6)
			{
				infile.close();
				blExit = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter an integer, 1 through 6.");
			}
		}
	}
}
