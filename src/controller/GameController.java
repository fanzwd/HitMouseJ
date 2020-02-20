package controller;

import Model.Mouse;

public class GameController {

	private Mouse mouse = new Mouse();
	
	public GameController() {
		
	}
	

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
}
