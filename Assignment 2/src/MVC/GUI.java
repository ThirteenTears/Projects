package MVC;

import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import support.item;
/*
 * Things GUI will need
 * Two radio buttons for sorting high low price [+]
 * input field for Item number Search[+]
 * search button[+]
 * display box for inventory list/inventory data[+]
 */
public class GUI extends JFrame {
	
	Controller MyHandler;
	JRadioButton High = new JRadioButton("High sort");
	JRadioButton Low = new JRadioButton("Low sort");
	JTextField IdNumSearchBox = new JTextField("Search");
	JButton Search = new JButton("Search");
	JList InventoryList = new JList();
	JTextField ItemData = new JTextField("Data Here");
	

	
	public GUI()
	{
		this.setSize(600, 400);
		this.setLocation(500, 600);
		this.setTitle("Inventory Manager");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		Container GUIguts = this.getContentPane();
		GUIguts.setLayout(new BoxLayout(GUIguts, EXIT_ON_CLOSE));
		GUIguts.add(Search);
		GUIguts.add(IdNumSearchBox);
		GUIguts.add(High);
		GUIguts.add(Low);
		GUIguts.add(InventoryList);
		GUIguts.add(ItemData);
		ButtonGroup HiLo = new ButtonGroup();
			HiLo.add(High);
			HiLo.add(Low);
	}
	public void setHandler(Controller b)
	{
		MyHandler= b;
		Search.addActionListener(b);
	}
}
