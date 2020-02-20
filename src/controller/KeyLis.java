package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyLis extends KeyAdapter {
	
	private GameController gameControl;
	public void KeyLis(GameController gameController) {
		this.gameControl = gameController;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("按下");
		
		switch (e.getKeyCode()) {
		case 37:
			gameControl.getMouse().setX(gameControl.getMouse().getX()+50);
			break;

		default:
			break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyReleased(e);
	}
}
