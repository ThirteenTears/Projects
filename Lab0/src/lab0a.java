import javax.swing.JOptionPane;
/*
 * Lab 0-A Written by Caleb Smith 8/24/2015, CS - 250
 */
public class lab0a {

	public static void main(String[] args) {
		// Code to complete requirement A.
		
		//Declaration of Variables.
		int i = 1;
		int total = 0;
		int counter = 0;
		int inputvalue = 0;
		int inputvalue2 = 0;
		boolean tryCatch = false;
		String strOutput = "";
		
		//Error catch user's input.
		while(tryCatch == false)
		{
			try{
				inputvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Type in an interger value"));
				tryCatch = true;
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
			}
		}
		tryCatch = false;
		//compile math string.
		while(i < inputvalue + 1)
		{
			if(i == 1)
			{
				strOutput = Integer.toString(i);
			}
			else
			{
				strOutput = strOutput.concat(" + " + Integer.toString(i));
			}
			
			total = total + i;
			i++;
		}		
		strOutput = strOutput.concat(" = " + total);
		System.out.println(strOutput + "\n" + "\n");
		
		//Code for requirement B.
		i = 1;
		//Error check user's input.
		while(tryCatch == false)
		{
			try{
				inputvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type in an integer value"));
				tryCatch = true;
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
			}
		}
		tryCatch = false;
		//Error check user's input.
		while(tryCatch == false)
		{
			try{
				inputvalue2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type in an integer value for width"));
				tryCatch = true;
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
			}
		}
		tryCatch = false;
		strOutput = "";
		while(i <= inputvalue + 1)
		{
			if(counter == inputvalue2 || i == inputvalue + 1)
			{
				System.out.println(strOutput);
				counter = 0;
				strOutput = "";
			}
			
			if(i < 10)
			{
				strOutput = strOutput.concat(" " + Integer.toString(i)+ " ");
			}
			else
			{
				strOutput = strOutput.concat(Integer.toString(i) + " ");
			}
			counter++;
			i++;
		}
		System.out.println("\n");
		
		//Code for requirement C.
		inputvalue = 0;
		total = 0;
		int smallValue = 9999999;
		int largeValue = 0;
		int l = 0;
		strOutput = "";	
		
		do{
			//Error catch user's input.
			while(tryCatch == false)
			{
				try{
					inputvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type in an integer value"));
					tryCatch = true;
				}
				catch(Exception err)
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
				}
			}
			tryCatch = false;
			if(smallValue > inputvalue && inputvalue > 0)
			{
				smallValue = inputvalue;
			}
			if(largeValue < inputvalue)
			{
				largeValue = inputvalue;
			}
			if(inputvalue > 0)
			{
				if(strOutput.length() > 0)
				{
					strOutput = strOutput.concat(" + " + Integer.toString(inputvalue));
				}
				else
				{
					strOutput = Integer.toString(inputvalue);
				}
				
				total = total + inputvalue;
			}
			
		}
		while(inputvalue >= 0);
		System.out.println("The sum of all the values is as follows: " + "\n" + "\n" + strOutput + " = " + total + "\n");
		System.out.println("The smallest number among the inputs is: " + smallValue);
		System.out.println("The largest number among the inputs is: " + largeValue + "\n");
		
		//Code for Requirement D.
		strOutput = JOptionPane.showInputDialog(null, "Please enter all your integers, seperated by any character.");
		String[] aarray = strOutput.split("[^\\d]+");
		strOutput = "";
		total = 0;
		smallValue = 9999999;
		largeValue = 0;
		for(i = 0; i < aarray.length; i++)
		{
			if(strOutput != "" && i < aarray.length)
			{
				strOutput = strOutput.concat(" + ");
			}
			if(smallValue > Integer.parseInt(aarray[i]))
			{
				smallValue = Integer.parseInt(aarray[i]);
			}
			if(largeValue < Integer.parseInt(aarray[i]))
			{
				largeValue = Integer.parseInt(aarray[i]);
			}
			total = total + Integer.parseInt(aarray[i]);
			strOutput = strOutput.concat(Integer.toString(Integer.parseInt(aarray[i])));
		}
		strOutput = strOutput.concat(" = " + total);	
		
		System.out.println("\n" + "The sum of all the value's input is as follows:" + "\n");
		System.out.println(strOutput);
		System.out.println("\n" + "The smallest number among the inputs is: " + smallValue);
		System.out.println("The largest value among the inputs is: " + largeValue + "\n");		
		
		//Code for Requirement E.
				tryCatch = false;
				total = 0;
				counter = 0;
				int a = 0;
				smallValue = 0;
				largeValue = 0;
				strOutput = JOptionPane.showInputDialog(null, "Please enter all your integers, seperated by a space.");
				String[] intsToParse = strOutput.split(" ");
				int[] info = new int[intsToParse.length];
				strOutput = "";
				//Goes through array 'info' and prints all values not equal to 0.
				for (i = 0; i < info.length; i++)
				{
					if(smallValue > Integer.parseInt(aarray[i]))
					{
						smallValue = Integer.parseInt(aarray[i]);
					}
					if(largeValue < Integer.parseInt(aarray[i]))
					{
						largeValue = Integer.parseInt(aarray[i]);
					}
					try
					{
						if(Integer.parseInt(intsToParse[i]) != 0)
						{
							a++;
							info[a] = Integer.parseInt(intsToParse[i]);
							total = total + info[a];
							if(strOutput == "")
							{
								strOutput = strOutput.concat(Integer.toString(info[a]));
							}
							else
							{
								strOutput = strOutput.concat(" + " + info[a]);
							}
						}
					}
					catch(Exception err)
					{
						tryCatch = true;
						counter++;
					}
					a = 0;
				}
				strOutput = strOutput.concat(" = " + total);
				System.out.println("\n" + "The sum of all the value's input is as follows:" + "\n");
				System.out.println(strOutput + "\n");
				if(counter == 0)
				{
					System.out.println("There were no errors in this input!");
				}else if(counter == 1)
				{
					System.out.println("There was 1 input error in the data provided!");
				}else
				{
					System.out.println("There were " + counter + " input errors in the data provided!" + "\n");
				}
				System.out.println("\n" + "The smallest number among the inputs is: " + smallValue);
				System.out.println("The largest value among the inputs is: " + largeValue + "\n");
				
				
	}
}
