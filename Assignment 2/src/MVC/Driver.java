package MVC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import support.item;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub


		
		GUI Window = new GUI();
		Window.setVisible(true);
		Controller MyHandler = new Controller();
		Window.setHandler(MyHandler);
		MyHandler.setWindow(Window);
	}

}
