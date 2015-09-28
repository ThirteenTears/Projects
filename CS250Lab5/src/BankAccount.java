
public abstract class BankAccount extends Account{
	
	protected double dblBalance;
	
	public void balanceSetter(double dbl)
	{
		dblBalance = dbl;
	}
	
	public abstract void calcInterest();
	
	
}
