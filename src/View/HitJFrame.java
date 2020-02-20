package View;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import controller.ActionLis;
import controller.GameController;
import controller.KeyLis;
import controller.MouseLis;
import controller.WindowLis;

public class HitJFrame extends JFrame {
	private MyJPanel j1;
	private LoginPanel l1;
	private RightJPanel j2 = new RightJPanel();
	private MyJMenuBar m1 = new MyJMenuBar();
	private ActionLis actionLis = new ActionLis();
	private WindowLis windowlis = new WindowLis();
	private MouseLis mouseLis = new MouseLis();
	private KeyLis keyLis;
	
	public HitJFrame(GameController gameController) { 
		j1 = new MyJPanel(gameController);
		l1 = new LoginPanel(gameController);
//		setSize(300, 200);	//宽300，高200的窗口
		
		setResizable(false);	//设置窗口不可改变大小
		
		setTitle("欢迎来到打地鼠");	//标题
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//点击关闭，退出程序
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		add(j1,BorderLayout.WEST);
		add(j2);
		setJMenuBar(m1);
		
		actionLis = new ActionLis();	//监听的有参构造
		windowlis = new WindowLis();
		mouseLis = new MouseLis();
		keyLis = new KeyLis();

		m1.getLogItem().addActionListener(actionLis);	//注册监听，挂载监听器
		m1.getRegItem().addActionListener(actionLis);
		
		this.addKeyListener(keyLis);
		this.addMouseListener(mouseLis);
		this.addWindowListener(windowlis); 	//监听窗口
		
		this.setFocusable(true);//设置可以获取焦点
		this.requestFocusInWindow();//获取焦点
		
		l1.getLogButton().addActionListener(actionLis);	//注册按钮监听，挂载监听器
		
		
		setResizable(false); 	//不可改变大小
		pack();
		setLocationRelativeTo(null);	//居中
//		setVisible(true);	//可视
	}


}
