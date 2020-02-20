package View;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import Model.pic;
import controller.GameController;

public class MyJPanel extends JPanel {
	private static int []_positionXs = {75, 170, 280};
	private static int []_positionYs = {110, 185, 270};
	
	private GameController gameController;
	private JButton actorBtn;
	private int _positionX = 0;
	private int _positionY = 0;
	
	public MyJPanel(GameController gameController) {
		this.gameController = gameController;
		setPreferredSize(new Dimension(400,400));	//界面大小
//		setLayout(null);
		
		this.actorBtn = new JButton();
//		this.actorBtn.setIcon(pic.D);
		
		TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // task to run goes here
                MyJPanel.this._updatePosition();
            }
        };
        Timer timer = new Timer();
        long delay = 0;
        long intevalPeriod = 1 * 1000;
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.drawImage(pic.BJ, 0, 0, 400, 400, null);
		g.drawImage(pic.DS, _positionX, _positionY, 50, 50, null);
		repaint();
	}
	
	private void _updatePosition() {
		Random r = new Random();
		int positionXIndex = r.nextInt(100)%3;
		int positionYIndex = r.nextInt(100)%3;
		_positionX = _positionXs[positionXIndex];
		_positionY = _positionYs[positionYIndex];
	}

}
