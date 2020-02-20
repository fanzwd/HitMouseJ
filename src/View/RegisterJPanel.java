package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.pic;

public class RegisterJPanel extends JPanel {

	private JLabel titeLablel = new JLabel("注册界面");
	private JLabel accountJLabel = new JLabel("账号：");
	private JLabel pwdJLabel = new JLabel("密码：");
	private JLabel affirmPwdJLabel = new JLabel("确认密码：");
	private JTextField jtf_accoun = new JTextField("");
	private JPasswordField jpf_pwdField = new JPasswordField("");
	private JPasswordField jpf_affirmPwd = new JPasswordField("");
	private JButton resetButton = new JButton("重置");
	private JButton referButton = new JButton("提交");

	public RegisterJPanel() {
		setPreferredSize(new Dimension(400,400));//面板大小

		setLayout(null);
		titeLablel.setFont(new Font("黑体", Font.BOLD, 15));
		titeLablel.setBounds(170, 50, 100, 50);//设置注册界面组件大小
		titeLablel.setForeground(Color.red);
		add(titeLablel);
		
		accountJLabel.setBounds(105, 100, 50, 50);//设置账号界面组件大小
		accountJLabel.setForeground(Color.red);
		add(accountJLabel);

		pwdJLabel.setBounds(105, 150, 50, 50);//设置密码界面组件大小
		pwdJLabel.setForeground(Color.red);
		add(pwdJLabel);

		affirmPwdJLabel.setBounds(85, 200, 105, 50);//设置确认密码界面组件大小
		affirmPwdJLabel.setForeground(Color.red);
		add(affirmPwdJLabel);

		jtf_accoun.setBounds(150, 110, 110, 30);//设置账号文本域组件大小
		add(jtf_accoun);

		jpf_pwdField.setBounds(150, 160, 110, 30);//设置密码文本域组件大小
		add(jpf_pwdField);

		jpf_affirmPwd.setBounds(150, 210, 111, 30);//设置确认密码文本域组件的大小
		add(jpf_affirmPwd);

		resetButton.setBounds(75, 260, 100, 35);//设置重置按钮组件大小
		add(resetButton);

		referButton.setBounds(200, 260, 100, 35);//设置提交按钮组件大小
		add(referButton);

//		setBackground(Color.black); //背景颜色
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

	public JLabel getAffirmPwdJLabel() {
		return affirmPwdJLabel;
	}

	public void setAffirmPwdJLabel(JLabel affirmPwdJLabel) {
		this.affirmPwdJLabel = affirmPwdJLabel;
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

	public JPasswordField getJpf_affirmPwd() {
		return jpf_affirmPwd;
	}

	public void setJpf_affirmPwd(JPasswordField jpf_affirmPwd) {
		this.jpf_affirmPwd = jpf_affirmPwd;
	}

	public JButton getResetButton() {
		return resetButton;
	}

	public void setResetButton(JButton resetButton) {
		this.resetButton = resetButton;
	}

	public JButton getReferButton() {
		return referButton;
	}

	public void setReferButton(JButton referButton) {
		this.referButton = referButton;
	}
	
	//背景图片
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(pic.ZC, 0, 0, 400, 400, null);
		repaint();
	}
	
//	public void randomCodeArr() {
//		codeArr = "";
//		for (int i = 0; i < 4; i++) {
//			int a = (int) (Math.random()*3+1);
//			if(a==1) {
//				codeArr = codeArr+(char)(Math.random()*26+65);
//			}else if(a==2){
//				codeArr = codeArr+(char)(Math.random()*26+97);
//			}else {
//				codeArr = codeArr+(int)(Math.random()*9+1);
//			}
//		}
//	}
}

