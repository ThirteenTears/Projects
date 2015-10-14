import javax.swing.JButton;


public class Main {
/*
 * Test-2 - 10/14/2015
 * @author Caleb Smith
 * 
 * Java app that manages two windows, each with 3 buttons, that effect the color of their own specific window.
 */
	public static void main(String[] args) {
		window myWindow = new window();
		myWindow.setVisible(true);
		
		window2 myWindow2 = new window2();
		myWindow2.setVisible(true);
	}

}
