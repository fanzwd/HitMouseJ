package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.pic;
import controller.GameController;

public class LoginPanel extends JPanel {
	private JLabel titeLablel = new JLabel("登录界面");
	private JLabel accountJLabel = new JLabel("账号：");
	private JLabel pwdJLabel = new JLabel("密码：");
	private JLabel captchaJLabel = new JLabel("验证码:");
	private JTextField jtf_accoun = new JTextField("");
	private JPasswordField jpf_pwdField = new JPasswordField("");
	private JPasswordField jpf_captcha = new JPasswordField("");
	private JButton logButton = new JButton("登录");
	private JButton registerButton = new JButton("注册");
	private GameController gameController;
	
	public LoginPanel(GameController gameController) {
		this.gameController = gameController;
		
		setPreferredSize(new Dimension(400, 400));//面板大小

		setLayout(null);
		titeLablel.setBounds(170, 50, 100, 50);//设置注册界面组件大小
		titeLablel.setFont(new Font("黑体", Font.BOLD, 15));
		titeLablel.setForeground(Color.red);
		add(titeLablel);
		
		accountJLabel.setBounds(105, 100, 50, 50);//设置账号界面组件大小
		accountJLabel.setForeground(Color.red);
		add(accountJLabel);

		pwdJLabel.setBounds(105, 150, 50, 50);//设置密码界面组件大小
		pwdJLabel.setForeground(Color.red);
		add(pwdJLabel);

		captchaJLabel.setBounds(85, 200, 50, 50);//设置验证码界面组件大小
		captchaJLabel.setForeground(Color.red);
		add(captchaJLabel);

		jtf_accoun.setBounds(150, 110, 110, 30);//设置账号文本域组件大小
		add(jtf_accoun);

		jpf_pwdField.setBounds(150, 160, 110, 30);	//设置密码文本域组件大小
		add(jpf_pwdField);

		jpf_captcha.setBounds(150, 210, 111, 30);//设置验证码文本域组件的大小
		add(jpf_captcha);

		logButton.setBounds(75, 260, 100, 35);//设置登录按钮组件大小
		add(logButton);

		registerButton.setBounds(200, 260, 100, 35);//设置注册按钮组件大小
		add(registerButton);

//		setBackground(Color.CYAN);
		
	
	}
	

	//背景图片
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(pic.DL, 0, 0, 400, 400, null);
//		g.drawImage(pic.DS, gameController.getMouse().getX(), gameController.getMouse().getY(), 100, 100, null);
		repaint();
	}
	
	



	public JLabel getTiteLablel() {
		return titeLablel;
	}

	public void setTiteLablel(JLabel titeLablel) {
		this.titeLablel = titeLablel;
	}

	public JLabel getAccountJLabel() {
		return accountJLabel;
	}

	public void setAccountJLabel(JLabel accountJLabel) {
		this.accountJLabel = accountJLabel;
	}

	public JLabel getPwdJLabel() {
		return pwdJLabel;
	}

	public void setPwdJLabel(JLabel pwdJLabel) {
		this.pwdJLabel = pwdJLabel;
	}

	public JLabel getCaptchaJLabel() {
		return captchaJLabel;
	}

	public void setCaptchaJLabel(JLabel captchaJLabel) {
		this.captchaJLabel = captchaJLabel;
	}

	public JTextField getJtf_accoun() {
		return jtf_accoun;
	}

	public void setJtf_accoun(JTextField jtf_accoun) {
		this.jtf_accoun = jtf_accoun;
	}

	public JPasswordField getJpf_pwdField() {
		return jpf_pwdField;
	}

	public void setJpf_pwdField(JPasswordField jpf_pwdField) {
		this.jpf_pwdField = jpf_pwdField;
	}

	public JPasswordField getJpf_captcha() {
		return jpf_captcha;
	}

	public void setJpf_captcha(JPasswordField jpf_captcha) {
		this.jpf_captcha = jpf_captcha;
	}

	public JButton getLogButton() {
		return logButton;
	}

	public void setLogButton(JButton logButton) {
		this.logButton = logButton;
	}

	public JButton getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(JButton registerButton) {
		this.registerButton = registerButton;
	}

}