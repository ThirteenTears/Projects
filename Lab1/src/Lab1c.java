import javax.swing.JOptionPane;
import java.text.*;

public class Lab1c {
	/*
	 * Lab 0-A Written by Caleb Smith 8/31/2015, CS - 250
	 */
	public static void main(String[] args) {
		int inputValue;
		int intPrincipal = 0;
		double dblInterestRate = 0;
		double dblMonthlyPayment = 0;
		double dblPrincipalCounter = 0;
		boolean blCorrectInput = false;
		int intMonth = 0;
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
				System.out.println("The value " + testValue + " is prime");
			}
		}
		System.out.println("\n");
		while(blCorrectInput == false)
		{
			try
			{
				intPrincipal = Integer.parseInt(JOptionPane.showInputDialog("Please type in the initial Principal Amount. (Between 3000 and 30000)"));
				blCorrectInput = true;
				if(intPrincipal > 30000 || intPrincipal < 3000)
				{
					blCorrectInput = false;
				}
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter an integer value between 3000 and 30000.");
			}
		}
		blCorrectInput = false;
		while(blCorrectInput == false)
		{
			try
			{
				dblInterestRate = Integer.parseInt(JOptionPane.showInputDialog("Please type in the Interest Rate.  (Between 0 and 20)"));
				blCorrectInput = true;
				if(dblInterestRate < 0 || dblInterestRate > 20)
				{
					blCorrectInput = false;
				}
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid number value.");
			}
		}
		blCorrectInput = false;
		while(blCorrectInput == false)
		{
			try
			{
				dblMonthlyPayment = Integer.parseInt(JOptionPane.showInputDialog("Please type in the Monthly Payment amount."));
				blCorrectInput = true;
				if(dblMonthlyPayment < 500 || dblMonthlyPayment > 2000)
				{
					blCorrectInput = false;
				}
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid number value.");
			}
		}
		blCorrectInput = false;
		
		DecimalFormat df = new DecimalFormat("#.##");
		dblInterestRate = dblInterestRate / 100;
		dblPrincipalCounter = intPrincipal;
		System.out.println("\tInterest Rate\tPrincipal\tMonthlyPayment");
		System.out.println("\t" + dblInterestRate + "\t" + intPrincipal + "\t" + dblMonthlyPayment);
		double dblBalance = dblPrincipalCounter;
		for(int i = 1; i <= 30; i++)
		{
			if(dblBalance <= 0)
			{
				break;
			}
			intMonth++;
			//System.out.print(intMonth + " " + df.format(dblBalance) + " " + df.format((dblBalance * dblInterestRate)) + " " + df.format(dblMonthlyPayment) + " " + df.format((dblMonthlyPayment - (dblBalance * dblInterestRate))) + "\n");
			
			System.out.format(" %5d" + " %10.2f" + " %10.2f" + " %10.2f" + " %10.2f%n", intMonth, dblBalance, (dblBalance * dblInterestRate), dblMonthlyPayment, (dblMonthlyPayment - (dblBalance * dblInterestRate)));
			
			dblBalance = (dblBalance * (dblInterestRate + 1) - dblMonthlyPayment);
			//System.out.format(" %5d", i);
		}
	}
}
