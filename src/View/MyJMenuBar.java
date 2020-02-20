package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyJMenuBar extends JMenuBar {
	private JMenu opr_menu = new JMenu("操作");
	private JMenuItem logItem = new JMenuItem("登录");
	private JMenuItem regItem = new JMenuItem("注册");
	private JMenu game_menu = new JMenu("游戏");
	private JMenuItem startItem = new JMenuItem("开始");
	private JMenuItem suspendItem = new JMenuItem("暂停");
	private JMenuItem exitItem = new JMenuItem("退出");
	private JMenu about_menu = new JMenu("关于");
	private JMenu gameJMenuItem = new JMenu("关于游戏");
	private JMenuItem authorJMenuItem = new JMenuItem("关于作者");
	private JMenuItem ryze_menu = new JMenuItem("版权所属");
	private JMenuItem leesin_menu = new JMenuItem("ME");

	public MyJMenuBar() {
		add(opr_menu);
		opr_menu.add(logItem);	//将菜单项加到菜单
		opr_menu.add(regItem);
		add(game_menu);
		game_menu.add(startItem);
		game_menu.add(suspendItem);
		game_menu.add(exitItem);
		add(about_menu);
		about_menu.add(gameJMenuItem);
		about_menu.add(authorJMenuItem);
		gameJMenuItem.add(ryze_menu);
		gameJMenuItem.add(leesin_menu);
		
		logItem.setActionCommand("toLogin");//监听指令
		regItem.setActionCommand("toReg");
		startItem.setActionCommand("toGame");
		
	
	}

	public JMenu getOpr_menu() {
		return opr_menu;
	}

	public void setOpr_menu(JMenu opr_menu) {
		this.opr_menu = opr_menu;
	}

	public JMenuItem getLogItem() {
		return logItem;
	}

	public void setLogItem(JMenuItem logItem) {
		this.logItem = logItem;
	}

	public JMenuItem getRegItem() {
		return regItem;
	}

	public void setRegItem(JMenuItem regItem) {
		this.regItem = regItem;
	}

	public JMenu getGame_menu() {
		return game_menu;
	}

	public void setGame_menu(JMenu game_menu) {
		this.game_menu = game_menu;
	}

	public JMenuItem getStartItem() {
		return startItem;
	}

	public void setStartItem(JMenuItem startItem) {
		this.startItem = startItem;
	}

	public JMenuItem getSuspendItem() {
		return suspendItem;
	}

	public void setSuspendItem(JMenuItem suspendItem) {
		this.suspendItem = suspendItem;
	}

	public JMenuItem getExitItem() {
		return exitItem;
	}

	public void setExitItem(JMenuItem exitItem) {
		this.exitItem = exitItem;
	}

	public JMenu getAbout_menu() {
		return about_menu;
	}

	public void setAbout_menu(JMenu about_menu) {
		this.about_menu = about_menu;
	}

	public JMenu getGameJMenuItem() {
		return gameJMenuItem;
	}

	public void setGameJMenuItem(JMenu gameJMenuItem) {
		this.gameJMenuItem = gameJMenuItem;
	}

	public JMenuItem getAuthorJMenuItem() {
		return authorJMenuItem;
	}

	public void setAuthorJMenuItem(JMenuItem authorJMenuItem) {
		this.authorJMenuItem = authorJMenuItem;
	}

	public JMenuItem getRyze_menu() {
		return ryze_menu;
	}

	public void setRyze_menu(JMenuItem ryze_menu) {
		this.ryze_menu = ryze_menu;
	}

	public JMenuItem getLeesin_menu() {
		return leesin_menu;
	}

	public void setLeesin_menu(JMenuItem leesin_menu) {
		this.leesin_menu = leesin_menu;
	}


}
