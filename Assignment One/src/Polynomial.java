/*
 * Polynomial Class.
 * 
 * @author Caleb Smith
 */
import java.util.StringTokenizer;
public class Polynomial {
	//Data members.
	private String strName = "";
	private String strPoly = "";
	private int[] arrPoly = new int[21];
	
	//Constructors
	public Polynomial()
	{
		strName = "";
		strPoly = "";
		for(int i = 0; i < 21; i++)
		{
			arrPoly[i] = 0;
		}
	}
	public Polynomial(String name, String poly)
	{
		strName = name;
		strPoly = poly;
		StringTokenizer stk = new StringTokenizer(strPoly);
		for(int i = 0; i <= 40; i++)
		{
			int intCoefficient = Integer.parseInt(stk.nextToken());
			arrPoly[Integer.parseInt(stk.nextToken())] = intCoefficient;
		}
	}
	//Get methods.
	public String getName()
	{
		return strName;
	}
	public String getPoly()
	{
		return strPoly;
	}
	public String getArrayPair(int pos)
	{
		String strOutput = arrPoly[pos] + " " + pos;
		return strOutput;
	}
	public int[] getPolyArr()
	{
		return arrPoly;
	}
	//Set methods.
	public void setArrayPair(int pos, int value)
	{
		arrPoly[pos] = value;
	}
	public void setName(String input)
	{
		strName = input;
	}
	public void setPoly(String input)
	{
		strPoly = input;
	}
	//To String Method.
	public String toString()
	{
		boolean blFirst = false;
		for(int i = 20; i >= 0; i--)
		{
			if(arrPoly[i] != 0 && i != 0&& blFirst == false)
			{
				blFirst = true;
				if(arrPoly[i] == 1)
				{
					if(i == 1)
						strPoly = "X";
					else
						strPoly = "X^" + i;
				}
				else
				{
					if(i == 1)
						strPoly = arrPoly[i] + "X";
					else
						strPoly = arrPoly[i] + "X^" + i;
				}
					
			}
			else if(i == 0 && arrPoly[i] != 0)
			{
				if(arrPoly[i] > 0)
					strPoly = strPoly.concat(" + " + arrPoly[i]);
				else
					strPoly = strPoly.concat(" - " + Math.abs(arrPoly[i]));
			}
			else if(i == 1 && arrPoly[i] != 0)
			{
				if(arrPoly[i] > 1)
					strPoly = strPoly.concat(" + " + arrPoly[i] + "X");
				else if(arrPoly[i] < 1)
					strPoly = strPoly.concat(" - " + Math.abs(arrPoly[i]) + "X");
				else
					strPoly = strPoly.concat(" + X");
			}
			else if(arrPoly[i] != 0)
			{
				if(arrPoly[i] > 0)
					strPoly = strPoly.concat(" + " + arrPoly[i] + "X^" + i);
				else
					strPoly = strPoly.concat(" - " + Math.abs(arrPoly[i]) + "X^" + i);
			}
		}
		return strPoly;
	}
	//Evaluate polynomial.
	public String evalPoly(int input)
	{
		String strOutput = "";
		double total = 0;
		
		for(int i = 20; i >= 0; i--)
		{
			total = total + (Math.pow(input, i) * arrPoly[i]);
		}
		strOutput = Double.toString(total);
		return strOutput;
	}
	//Add two polynomials.
	public String addPoly(int[] a, int [] b)
	{
		String strOutput = "";
		for(int i = 0; i <=20; i++)
		{
			arrPoly[i] = a[i] + b[i];
		}
		strOutput = toString();
		return strOutput;
	}
	//Subtract two polynomials.
	public String subPoly(int[] a, int [] b)
	{
		String strOutput = "";
		for(int i = 0; i <=20; i++)
		{
			arrPoly[i] = a[i] - b[i];
		}
		strOutput = toString();
		if(strOutput == "")
			strOutput = "0";
		return strOutput;
	}
	//Multiply two polynomials.
	public String multPoly(int[]a, int[] b)
	{
		String strOutput = "";
		boolean blFirst = false;
		int[] mulPoly = new int[41];
		for(int i = 0; i <= 20; i++)
		{
			for(int j = 0; j <= 20; j++)
			{
				int intDegree = i + j;
				mulPoly[intDegree] += a[i] * b[j];
			}
		}
		for(int i = 40; i >= 0; i--)
		{
			if(i > 1 && blFirst ==  true)
			{
				if(mulPoly[i] > 1)
					strOutput = strOutput.concat(" + " + mulPoly[i] + "X^" + i);
				if(mulPoly[i] == 1)
					strOutput = strOutput.concat(" + X^" + i);
				if(mulPoly[i] < -1)
					strOutput = strOutput.concat(" - " + Math.abs(mulPoly[i]) + "X^" + i);
				if(mulPoly[i] == -1)
					strOutput = strOutput.concat(" - X^" + i);
			}
			if(i == 1 && blFirst == true)
			{
				if(mulPoly[i] > 1)
					strOutput = strOutput.concat(" + " + mulPoly[i] + "X");
				if(mulPoly[i] == 1)
					strOutput = strOutput.concat(" + X");
				if(mulPoly[i] == -1)
					strOutput = strOutput.concat(" - X");
				if(mulPoly[i] < -1)
					strOutput = strOutput.concat(" - " + Math.abs(mulPoly[i]) + "X");
			}
			if(i == 0 && blFirst == true)
			{
				if(mulPoly[i] > 0)
					strOutput = strOutput.concat(" + " + mulPoly[i]);
				if(mulPoly[i] < 0)
					strOutput = strOutput.concat(" - " + Math.abs(mulPoly[i]));				
			}
			if(blFirst == false && mulPoly[i] != 0)
			{
				blFirst = true;
				if(i > 1)
				{
					if(mulPoly[i] > 1)
						strOutput = mulPoly[i] + "X^" + i;
					if(mulPoly[i] == 1)
						strOutput = "X^" + i;
				}
				if(i == 1)
				{
					if(mulPoly[i] > 1)
						strOutput = mulPoly[i] + "X";
					if(mulPoly[i] == 1)
						strOutput = "X";
				}
				if(i == 0)
					strOutput = Integer.toString(mulPoly[i]);
			}
		}
		return strOutput;
	}
}

