package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RightJPanel extends JPanel {
	
	private JLabel welcomeJL = new JLabel("欢迎玩家：1");	//欢迎界面
	private JLabel mouseJL = new JLabel("【地鼠第1次出现】");	//地鼠出现
	private JLabel timeJL = new JLabel("游戏倒计时：");	//游戏倒计时
	private JLabel hitJL = new JLabel("击中数：【0】次");	//击中数
	private JLabel scoreJL = new JLabel("得分：【0】次");	//得分
	
	
	public RightJPanel() {
		
		setPreferredSize(new Dimension(200,300));	
		setLayout(null);	//自由布局
		setBackground(Color.cyan);	//背景颜色粉色
		
		welcomeJL.setBounds(30, 20, 150, 50);	//欢迎界面的大小
		welcomeJL.setFont(new Font("黑体",Font.BOLD, 20));	//欢迎界面的字体和大小
		add(welcomeJL);
		
		mouseJL.setBounds(30, 50, 150, 50);	//地鼠出现的大小
		mouseJL.setFont(new Font("黑体",Font.BOLD, 15));	//地鼠出现的字体和大小
		add(mouseJL);
		
		timeJL.setBounds(30, 100, 150, 50);	//游戏倒计时的大小
		timeJL.setFont(new Font("黑体",Font.BOLD, 15));	//游戏倒计时的字体和大小
		add(timeJL);
		
		hitJL.setBounds(30, 130, 150, 50);	//击中数的大小
		hitJL.setFont(new Font("黑体",Font.BOLD, 15));	//击中数的字体和大小
		add(hitJL);
		
		scoreJL.setBounds(30, 160, 150, 50);	//得分的大小
		scoreJL.setFont(new Font("黑体",Font.BOLD, 15));	//得分的字体和大小
		add(scoreJL);
		
	}

}
