import java.util.StringTokenizer;

public class FractionObject {
	public String strName = "";
	public int intNumerator = 0;
	public int intDenominator = 0;
	
	//sets all values to default.
	public FractionObject()
	{
		strName = "";
		intNumerator = 0;
		intDenominator = 0;
	}
	//Constructor from 3 Variables.
	public FractionObject(String name, int num, int dem)
	{
		strName = name;
		intNumerator = num;
		intDenominator = dem;
	}
	//Constructor from String.
	public FractionObject(String input)
	{
		StringTokenizer stk = new StringTokenizer(input);
		strName = stk.nextToken();
		intNumerator = Integer.parseInt(stk.nextToken());
		intDenominator = Integer.parseInt(stk.nextToken());
	}
	//Returns the Fraction.
	public String getFraction()
	{
		String strReturn = intNumerator + "/" + intDenominator;
		return strReturn;
	}
	//Returns the Name.
	public String getName()
	{
		return strName;
	}
	//Returns the Numerator.
	public int getNum()
	{
		return intNumerator;
	}
	//Returns the Denominator
	public int getDen()
	{
		return intDenominator;
	}
	//Sets the Name.
	public void setName(String s)
	{
		strName = s;
	}
	//Sets the Numerator
	public void setNum(int num)
	{
		intNumerator = num;
	}
	//Sets the Denominator
	public void setDen(int dem)
	{
		intDenominator = dem;
	}
	//Gets the description.
	public String getDesc()
	{
		String strReturn = strName + ": " + intNumerator + "/" + intDenominator;
		return strReturn;
	}
	//Adds two fractions together and returns a formatted string.
	public String addFrac(int num1, int num2, int dem1, int dem2)
	{
		String strReturn = "";
		int num3 = 0;
		int dem3 = 0;
		int GCD = 0;
		dem3 = dem1 * dem2;
		num3 = (num1 * dem2) + (num2 * dem1);
		GCD = GCD(num3, dem3);
		strReturn = (num3 / GCD) + "/" + (dem3 / GCD);
		return strReturn;
	}
	//Subtracts one fraction from another, and returns a formatted string.
	public String subFrac(int num1, int num2, int dem1, int dem2)
	{
		String strReturn = "";
		int num3 = 0;
		int dem3 = 0;
		int GCD = 0;
		dem3 = dem1 * dem2;
		num3 = (num1 * dem2) - (num2 * dem1);
		GCD = GCD(num3, dem3);
		
		GCD = Math.abs(GCD);
		strReturn = (num3 / GCD) + "/" + (dem3 / GCD);
		return strReturn;
	}
	//Multiplies two fractions together and returns a formatted string.
	public String multFrac(int num1, int num2, int dem1, int dem2)
	{
		String strReturn = "";
		int num3 = 0;
		int dem3 = 0;
		int GCD = 0;
		dem3 = dem1 * dem2;
		num3 = (num1 * dem2) * (num2 * dem1);
		dem3 = dem3 * dem3;
		GCD = GCD(num3, dem3);
		strReturn = (num3 / GCD) + "/" + (dem3 / GCD);
		return strReturn;
	}
	//Divides two fractions and returns a formatted string.
	public String divFrac(int num1, int num2, int dem1, int dem2)
	{
		String strReturn = "";
		int num3 = 0;
		int dem3 = 0;
		int GCD = 0;
		dem3 = dem1 * num2;
		num3 = num1 * dem2;
		GCD = GCD(num3, dem3);
		strReturn = (num3 / GCD) + "/" + (dem3 / GCD);
		return strReturn;
	}
	//Calculates the greatest common denominator.
	public int GCD(int a, int b)
	{
		return b == 0 ? a : GCD(b, a % b);
	}
}
