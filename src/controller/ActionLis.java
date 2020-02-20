package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.UI;

public class ActionLis implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "toLogin":
			UI.logregJFrame.getLoginpanel().setVisible(true);
			UI.logregJFrame.getRegisterjpanel().setVisible(false);
			UI.showlogregJFrame();
			break;
		
		case "toReg":
			UI.logregJFrame.add(UI.logregJFrame.getRegisterjpanel());
			UI.logregJFrame.getLoginpanel().setVisible(false);
			UI.logregJFrame.getRegisterjpanel().setVisible(true);
			UI.showlogregJFrame();
			break;
		
		case "toGame":
			UI.showhitJFrame();
			break;
			
		default:
			break;
			
			
		}
	}
	
}
