package testwindowssec1;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class myWindow extends JFrame{
	
	Buttonhandler myhandler;
	JButton okButton = new JButton("Okay");
	JButton cancelButton = new JButton("Cancel");
	JButton testButton = new JButton("This is a test button.");
	
	public myWindow()
	{
		//do all the things to create a nice GUI window here.
		this.setSize(200, 300);
		this.setLocation(200, 200);
		this.setTitle("My First Window.");
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.CYAN);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(okButton);
		contentPane.add(cancelButton);
		contentPane.add(testButton);
	}
	public void sethandler(Buttonhandler b)
	{
		myhandler = b;
		okButton.addActionListener(b);
		cancelButton.addActionListener(b);
		testButton.addActionListener(b);
	}
}
