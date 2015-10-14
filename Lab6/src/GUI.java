import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
	Handler calcHandler;
	JFrame myJFrame = new JFrame();
	
	
	public GUI()
	{
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		JTextArea area = new JTextArea("");
        area.setPreferredSize(new Dimension(100, 100));
        area.setEditable(false);
        panel.add(area);
        
        
        JButton button = new JButton("button");
        panel.add(button);
        
        add(panel);
        add(panel2);
        pack();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		
		
	}
	public void sethandler(Handler b)
	{
		calcHandler = b;
		
	}
	
}
