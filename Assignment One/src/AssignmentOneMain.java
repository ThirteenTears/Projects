import javax.swing.JOptionPane;

public class AssignmentOneMain {
	/*
	 * Assignment 1 Written by Caleb Smith 9/9/2015, CS - 250
	 */
	
	public static void main(String[] args) {
		
		Polynomial poly = new Polynomial();
		Polynomial[] polyArr = new Polynomial[100];
		
		int intUserSelection = 0;
		while(1 == 1)
		{
			//Show user options
			try
			{
			intUserSelection = Integer.parseInt(JOptionPane.showInputDialog("Please Enter 1, 2, 3, 4, 5, or 6." + "\n" + "1. Exit the program. \n2. Output Polynomial. \n3.  Evaluate Polynomial. \n4. Add Polynomials \n5. Subtract Polynomials \n6. Multiply Polynomials"));
			}
			catch(Exception err)
			{
				intUserSelection = 0;
				JOptionPane.showMessageDialog(null, "There was something wrong with the input!");
			}
			//Handle User Selections.
			if(intUserSelection == 1)
				break;
			
			if(intUserSelection == 2)
			{
				System.out.println("Option 2 was selected.");
			}
			if(intUserSelection == 3)
			{
				System.out.println("Option 3 was selected.");
			}
			if(intUserSelection == 4)
			{
				System.out.println("Option 4 was selected.");
			}
			if(intUserSelection == 5)
			{
				System.out.println("Option 5 was selected.");
			}
			if(intUserSelection == 6)
			{
				System.out.println("Option 6 was selected.");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
