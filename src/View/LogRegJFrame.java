package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controller.ActionLis;
import controller.GameController;
import controller.WindowLis;

public class LogRegJFrame extends JFrame{
	
	private LoginPanel loginpanel;
	private RegisterJPanel registerjpanel = new RegisterJPanel();
	private MyJMenuBar mymenubar = new MyJMenuBar();
	private ActionLis actionLis = new ActionLis();
	private WindowLis windowLis = new WindowLis();
	
	public LogRegJFrame(GameController gameController) {
		loginpanel = new LoginPanel(gameController);
		setTitle("登录注册");	//标题	
		setJMenuBar(mymenubar);		//把菜单栏添加到窗口
//		add(loginpanel,BorderLayout.WEST);		//把登录面板添加到窗口
//		add(registerjpanel,BorderLayout.CENTER);		//把注册面板添加到窗口
		add(loginpanel);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//DISPOSE_ON_CLOSE点击关闭，退出程序	
														//DO_NOTHING_ON_CLOSE弹出的对话框点击了确定，才退出程序，否则不关闭
		mymenubar.getLogItem().addActionListener(actionLis);	//监听登录菜单项
		mymenubar.getRegItem().addActionListener(actionLis);	//监听注册菜单项
		mymenubar.getStartItem().addActionListener(actionLis);	//监听开始菜单项
		
		loginpanel.getLogButton().addActionListener(actionLis); 		//监听登录按钮
		this.addWindowListener(windowLis); 	//监听窗口
		
		setResizable(false); 	//不可改变窗口大小
		pack();
		setVisible(true);	//窗口可见
		setLocationRelativeTo(null); 	//窗口居中
		
	}


	public LoginPanel getLoginpanel() {
		return loginpanel;
	}

	public void setLoginpanel(LoginPanel loginpanel) {
		this.loginpanel = loginpanel;
	}

	public RegisterJPanel getRegisterjpanel() {
		return registerjpanel;
	}

	public void setRegisterjpanel(RegisterJPanel registerjpanel) {
		this.registerjpanel = registerjpanel;
	}

	public MyJMenuBar getMymenubar() {
		return mymenubar;
	}

	public void setMymenubar(MyJMenuBar mymenubar) {
		this.mymenubar = mymenubar;
	}

	public ActionLis getActionLis() {
		return actionLis;
	}

	public void setActionLis(ActionLis actionLis) {
		this.actionLis = actionLis;
	}

	public WindowLis getWindowLis() {
		return windowLis;
	}

	public void setWindowLis(WindowLis windowLis) {
		this.windowLis = windowLis;
	}

	
}
