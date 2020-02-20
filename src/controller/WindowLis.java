package controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import View.LogRegJFrame;
import View.UI;

public class WindowLis extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
		int res = JOptionPane.showConfirmDialog(null, "确定退出游戏吗？","系统提示", JOptionPane.YES_NO_OPTION);
		if(res == 0) {
			System.exit(0);
		}
	}	
}
