
public class Main {

	public static void main(String[] args) {
		BankAccount[] arrData = new BankAccount[5];
		
		arrData[0] = new CheckingAccount("John");
		arrData[1] = new CheckingAccount("Alicia");
		arrData[2] = new CheckingAccount("Mary");
		arrData[3] = new SavingsAccount("John");
		arrData[4] = new SavingsAccount("Alicia");
		
		arrData[0].balanceSetter(2500);
		arrData[1].balanceSetter(5460.25);
		arrData[2].balanceSetter(12450.66);
		arrData[3].balanceSetter(9543.44);
		arrData[4].balanceSetter(2562.22);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(arrData[i].getInfo());
		}
		System.out.println();
		
		for(int i = 0; i < arrData.length; i++)
		{
			arrData[i].calcInterest();
			System.out.println(arrData[i].getInfo());
		}
		
		
		
	}

}
