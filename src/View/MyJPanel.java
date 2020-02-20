package View;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import Model.pic;
import controller.GameController;

public class MyJPanel extends JPanel {
	private GameController gameController;
	public MyJPanel(GameController gameController) {
		this.gameController = gameController;
		setPreferredSize(new Dimension(400,400));	//界面大小
		setLayout(null);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.drawImage(pic.BJ, 0, 0, 400, 400, null);
		g.drawImage(pic.DS, gameController.getMouse().getX(), gameController.getMouse().getY(), 100, 100, null);
		repaint();
	}

}
