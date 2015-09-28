import java.text.DecimalFormat;

public class CheckingAccount extends BankAccount{
	
	
	
	public CheckingAccount(String s)
	{
		strName = s;
	}
	public String getInfo()
	{
		DecimalFormat df = new DecimalFormat();
		return "This checking account of the owner " + strName + " has a balance of $" + df.format(dblBalance);
	}
	public void calcInterest()
	{
		dblBalance = dblBalance * 1.01;
	}
}
