package controller;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseLis extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		Rectangle rectangle = new Rectangle(0,0,100,100);
		
		if(rectangle.contains(e.getPoint())) {
			System.out.println("区域");
		}
		
		if(rectangle.contains(e.getX(),e.getY())) {
			System.out.println("X/Y");
			System.out.println("X："+e.getX()+",Y:"+e.getY());
		}
	}
}

//		e.getPoint()	//获取鼠标点击的点
//		e.getX()、e.getY()	//获取鼠标点击的X和Y