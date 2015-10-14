import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount{

	
	public SavingsAccount(String s)
	{
		strFirstName = s;
	}
	public String getInfo()
	{
		DecimalFormat df = new DecimalFormat();
		return "This savings account of the owner " + strFirstName + " has a balance of $" + df.format(dblBalance);
	}
	public void calcInterest()
	{
		dblBalance = dblBalance * 1.05;
	}
}
