import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.*;

public class AssignmentOne {
/*
 * Assignment One 9/20/2015, CS - 250
 * @author Caleb Smith
 */
	public static void main(String[] args) throws FileNotFoundException {
		boolean blExit = false;
		int intChoice = 0;
		String strNextLine = "";
		File inputfile = new File("poly.dat");
		Scanner infile = new Scanner(inputfile);
		strNextLine = infile.nextLine();
		StringTokenizer stk = new StringTokenizer(strNextLine);
		intChoice = Integer.parseInt(stk.nextToken());
		Polynomial[] plyPolys = new Polynomial[intChoice];
		intChoice = 0;

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
			if(intChoice == 1)
			{
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
			else if(intChoice == 6)
			{
				blExit = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter an integer, 1 through 6.");
			}
			
		}

	}

}
