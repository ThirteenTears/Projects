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
				inputvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Type in an interger value."));
				tryCatch = true;
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
			}
		}
		tryCatch = false;
		//Arrange strOutput to meet required output.
		do
		{
			System.out.print(Integer.toString(i));
			total = total + i;
			if(i < inputvalue)
				System.out.print(" + ");
			else
				System.out.print(" = " + total + "\n");
			i++;
		}while(i <= inputvalue);
		
		
		
		//Code for requirement B.
		i = 1;
		//Error check user's input.
		while(tryCatch == false)
		{
			try{
				inputvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type in an integer value for \"N\""));
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
				inputvalue2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type in an integer value for \"W\" width"));
				tryCatch = true;
			}
			catch(Exception err)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
			}
		}
		for(i = 1; i <= inputvalue; i++)
		{
			if(i <= inputvalue)
				System.out.format(" %5d", i);
			if(i % inputvalue2 == 0)
				System.out.println();
		}
		System.out.println("\n");
		
		//Code for requirement C.
		inputvalue = 0;
		total = 0;
		int smallValue = 9999999;
		int largeValue = 0;
		strOutput = "";	
		do{
			//Error catch user's input.
			while(tryCatch == false)
			{
				try
				{
					inputvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please type in an integer value, enter a negative number to stop."));
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
		smallValue = 9999999;
		largeValue = 0;
		strOutput = JOptionPane.showInputDialog(null, "Please enter all your integers, seperated by a space.");
		String[] intsToParse = strOutput.split(" ");
		int[] info = new int[intsToParse.length];
		strOutput = "";
		//Goes through array 'info' and prints all values not equal to 0.				
		for(i = 0; i < info.length; i++)
		{
			try
			{
				info[i] = Integer.parseInt(intsToParse[i]);
				if(info[i] < 0)
				{
					info[i] = 0;
					counter++;
				}
				if(smallValue > info[i] && info[i] > 0)
				{
					smallValue = info[i];
				}
				if(largeValue < info[i])
				{
					largeValue = info[i];
				}
			}
			catch(Exception err)
			{
				counter++;
			}
			total = total + info[i];
			if(info[i] != 0 && i > 0)
			{
				strOutput = strOutput.concat(" + " + Integer.toString(info[i]));
			}
			else if(info[i] != 0)
			{
				strOutput = strOutput.concat(Integer.toString(info[i]));
			}
		}
		strOutput = strOutput.concat(" = " + total);
		System.out.println("\n" + "The sum of all the values input is as follows:" + "\n");
		System.out.println(strOutput + "\n");
		if(counter <= 1)
		{
			if(counter == 1)
			{
				System.out.println("There was 1 input error in the data provided!");
			}
			else
			{
				System.out.println("There were no input errors in the data provided!");
			}
		}
		else
		{
			System.out.println("There were " + counter + " input errors in the data provided!");
		}
		System.out.println("\n" + "The smallest number among the inputs is: " + smallValue);
		System.out.println("The largest number among the inputs is: " + largeValue);
	}	
}
