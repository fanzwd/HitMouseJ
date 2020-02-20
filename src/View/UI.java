package View;

import controller.GameController;

public class UI {
	
	public static LogRegJFrame logregJFrame;
	public static HitJFrame hitJFrame;
	
	public UI(GameController gameController) {
		// TODO Auto-generated constructor stub
		logregJFrame = new LogRegJFrame(gameController);
		hitJFrame = new HitJFrame(gameController);
		
	}

	public static void showlogregJFrame() {
		logregJFrame.setVisible(true);
		hitJFrame.setVisible(false);
	}
	
	public static void showhitJFrame() {
		logregJFrame.setVisible(false);
		hitJFrame.setVisible(true);
	}

}
