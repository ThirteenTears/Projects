package testwindowssec1;

public class testApp {

	public static void main(String[] args) {
		myWindow testWindow = new myWindow();
		testWindow.setVisible(true);
		
		Buttonhandler myhandler = new Buttonhandler();
		testWindow.sethandler(myhandler);
	}
}
