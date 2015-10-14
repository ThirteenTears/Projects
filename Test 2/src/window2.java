import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class window2 extends JFrame implements ActionListener{
	//handler myHandler;
	
	JButton btnBlue = new JButton("Blue");
	JButton btnYellow = new JButton("Yellow");
	JButton btnExit = new JButton("EXIT");
	Container contentPane = this.getContentPane();
	
	public window2()
	{
		this.setSize(300, 300);
		this.setLocation(500, 200);
		this.setTitle("Window One");
		btnBlue.addActionListener(this);
		btnYellow.addActionListener(this);
		btnExit.addActionListener(this);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(btnBlue);
		contentPane.add(btnYellow);
		contentPane.add(btnExit);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnBlue)
		{
			contentPane.setBackground(Color.BLUE);
		}
		else if(e.getSource() == btnYellow)
		{
			contentPane.setBackground(Color.YELLOW);
		}
		else if(e.getSource() == btnExit)
		{
			System.exit(0);
		}
		
	}
}
