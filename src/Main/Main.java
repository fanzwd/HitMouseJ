package Main;

import View.HitJFrame;
import View.UI;
import controller.GameController;

public class Main {

	public static void main(String[] args) {
		new UI(new GameController());
	}
}
