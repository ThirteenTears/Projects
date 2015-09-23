import java.util.StringTokenizer;
public class Polynomial {
<<<<<<< HEAD
	public String[] arrPoly = new String[21];
	int counter = 0;
	public Polynomial(String input)
	{
		
		StringTokenizer stk = new StringTokenizer(input);
		while(stk.hasMoreTokens() == true)
		{
			arrPoly[counter] = stk.nextToken();
			counter++;
		}
	}
	public String toString()
	{
		String strReturn = "";
		strReturn = arrPoly[0] + "(";
		for(int i = 1; i < 22; i++)
		{
			if(i % 2 == 0)
			{
				if(Integer.parseInt(arrPoly[i]) > 1 && Integer.parseInt(arrPoly[i +1]) > 0)
				{
					strReturn = strReturn.concat("^" + arrPoly[i] + " + ");
				}
				else if(Integer.parseInt(arrPoly[i]) > 1 && Integer.parseInt(arrPoly[i + 1]) < 0)
				{
					strReturn = strReturn.concat("^" + arrPoly[i] + " - ");
				}
				else if(Integer.parseInt(arrPoly[i]) == 1)
				{
					if(Integer.parseInt(arrPoly[i + 1]) > 0)
					{
						strReturn = strReturn.concat(" + ");
					}
					else if(Integer.parseInt(arrPoly[i + 1]) < 0)
					{
						strReturn = strReturn.concat(" - ");
					}
					else
					{
						strReturn = strReturn.concat(")");
						break;
					}
				}
				else if(Integer.parseInt(arrPoly[i]) == 0)
				{
					strReturn = strReturn.concat(")");
					break;
				}
			}
			if(i % 2 != 0)
			{
				if(Integer.parseInt(arrPoly[i + 1]) > 0)
				{
					if(arrPoly[i] == "1")
					{
						strReturn = strReturn.concat("X");
					}
					else
					{
						strReturn = strReturn.concat(Math.abs(Integer.parseInt(arrPoly[i])) + "X");
					}
				}
				else
				{
					strReturn = strReturn.concat(Math.abs(Integer.parseInt(arrPoly[i])) + "");
				}
			}
		}
		return strReturn;
=======
	public String polynomial = "";
	
	public void Polynomial()
	{
		polynomial = "";
	}
	public void Polynomial(String s)
	{
		polynomial = s;
	}
	public String getPolynomial()
	{
		return polynomial;
	}
	public String evalPoly(int i)
	{
		return "test";
	}
	public String readPoly(int i)
	{
		return "test";
>>>>>>> origin/master
	}
	
}

