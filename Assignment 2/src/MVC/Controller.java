package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import support.item;

public class Controller implements ActionListener {

	private GUI window;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub


		
		JButton ButtonClicked = (JButton) arg0.getSource();
		
		if (ButtonClicked.getText().equals("Search"))
		{
		String tempSearch=	window.IdNumSearchBox.getText();
/*
			for(int i=0; i<Items.length;i++)
			{
			if (tempSearch==Items[i].getName())
			{
				window.InventoryList.setText(Items[i].getName());
				window.ItemData.setText(Items[i].toString());
			}
			else
			{
				window.InventoryList.setText("Item not found");
			}
			}
		*/	
			
			
			
			if (window.High.isSelected())
			{
				window.InventoryList.setToolTipText("High Sort First");
			}
			if (window.Low.isSelected())
			{
				window.InventoryList.setToolTipText("Low Sort First");
			}
		}
/*		if (window.High.isSelected()==true)
		{
			window.InventoryList.setText("High Sort First");
		}
		if (window.Low.isSelected()==true)
		{
			window.InventoryList.setText("Low Sort First");
		}
*/
			
	}

	public void setWindow(GUI Window)
	{
		this.window=Window;
	}
}
