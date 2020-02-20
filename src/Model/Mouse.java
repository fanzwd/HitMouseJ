package Model;

import java.awt.Image;

public class Mouse {

	private int x;//X坐标
	private int y;//Y坐标
	private int score;//分数
	private Image image;//老鼠图片
	private boolean isHit;//是否击中
	
	public Mouse() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	
	//设置坐标的方法
	
	//切换图片的方法
}
