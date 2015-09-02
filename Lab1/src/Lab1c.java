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
		dblInterestRate = dblInterestRate / 100;
		dblPrincipalCounter = intPrincipal;
		System.out.format(" %20s" + " %15s" + " %20s%n","Interest Rate", "Principal", "Monthly Payment");
		System.out.format(" %15s" + " %20s" + " %20s%n%n", Double.toString((dblInterestRate * 100)) + "%", "$" + Double.toString(intPrincipal), "$" + Double.toString(dblMonthlyPayment));
		System.out.format(" %5s %10s %10s %10s %10s%n%n", "Month", "Balance($)", "Interest($)", "Payment($)", "Payment on Pinciple($)");
		double dblBalance = dblPrincipalCounter;
		for(int i = 1; i <= 30; i++)
		{
			if(dblBalance <= 0)
			{
				System.out.println(" \n" + "You can pay off the principal in " + intMonth + " months!");
				dblBalance = 0;
				break;
			}
			intMonth++;			
			System.out.format(" %2d" + " %10.2f" + " %10.2f" + " %12.2f" + " %15.2f%n", intMonth, dblBalance, (dblBalance * (dblInterestRate / 12)), dblMonthlyPayment, (dblMonthlyPayment - (dblBalance * (dblInterestRate / 12))));
			dblBalance = (dblBalance * ((dblInterestRate / 12) + 1) - dblMonthlyPayment);
		}
		if(dblBalance > 0)
		{
			System.out.println("\n" + "You will need more than 30 months to pay off the principal.");
		}
	}
}
