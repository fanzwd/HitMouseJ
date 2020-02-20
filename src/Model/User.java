package Model;

import java.util.ArrayList;

public class User {
	private String name;
	private String number;
	private String pwd;
	private ArrayList<User> arrList = new ArrayList<User>();
	
	public User() {
		
	}
	
	public User(String name,String number,String pwd) {
		this.name = name;
		this.number = number;
		this.pwd = pwd;
	}

	public void storageUser() {
		arrList.add(new User(name, number, pwd));
	}

	public boolean lookupUser() {
		boolean l = false;
		for (int i = 0; i < arrList.size(); i++) {
			if(number.equals(arrList.get(i).number)&&pwd.equals(arrList.get(i).pwd)) {
				l = true;
			}
		}
		return l;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "用户：[name=" + name + ", number=" + number +  ", pwd=" + pwd +"]";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public ArrayList getArrList() {
		return arrList;
	}

	public void setArrList(ArrayList arrList) {
		this.arrList = arrList;
	}
	
	
}

