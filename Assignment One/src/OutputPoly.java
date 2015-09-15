import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OutputPoly {
	
	
	public String outputPoly(Integer i) throws FileNotFoundException
	{
		File inputfile = new File("poly.dat");
		Scanner infile = new Scanner(inputfile);
		StringTokenizer stk = new StringTokenizer(infile.nextLine());
		String[] strPoly = new String[40];
		String strReturn = "";
		int counter = 0;
		
		for(int j = 0; j < 40; j++)
		{
			strPoly[j] = "0";
		}
		for(int j = 0; j < i; j++)
		{
			if(infile.hasNextLine() == true)
			{
				stk = new StringTokenizer(infile.nextLine());
			}
			else
			{
				j = i;
				strReturn = "Polynomial does not exist.";
			}
		}	
		int intTokenCount = stk.countTokens();
		for(int j = 0; j < intTokenCount; j++)
		{
			strPoly[j] = stk.nextToken();			
		}
		
		
		
		for(int j = 1; j <= intTokenCount; j++)
		{
			if( j == 1)
			{
				strReturn = strReturn.concat(strPoly[j]);
			}
			int l = j + 1;
			int k = Integer.parseInt(strPoly[l]);
			
			if(j % 2 == 0)
			{				
				if(k > 1)
				{
					strReturn = strReturn.concat(" + " + strPoly[l]);
				}
				
				else
				{
					strReturn = strReturn.concat(" - " + strPoly[l]);
				}
			}
			else if(j % 2 != 0)
			{
				if(k > 1)
				{
					strReturn = strReturn.concat("X^" + k);
				}
				else if(k == 1)
				{
					strReturn = strReturn.concat("X");
				}
			}
		}
		
		
		
		
		return strReturn;
	}
	
}
