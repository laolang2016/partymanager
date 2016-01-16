package com.laolang.party.domain;

public class User {


	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int level, String name, String pwd) {
		super();
		this.user_level = level;
		this.user_id = name;
		this.user_pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [level=" + user_level + ", name=" + user_id + ", pwd=" + user_pwd + "]";
	}
	public int getLevel() {
		return user_level;
	}
	public void setLevel(int level) {
		this.user_level = level;
	}
	public String getName() {
		return user_id;
	}
	public void setName(String name) {
		this.user_id = name;
	}
	public String getPwd() {
		return user_pwd;
	}
	public void setPwd(String pwd) {
		this.user_pwd = pwd;
	}
	private int user_level;
	private String user_id;
	private String user_pwd;
}
