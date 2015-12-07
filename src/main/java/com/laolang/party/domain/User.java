package com.laolang.party.domain;

public class User {

	public User() {
		super();
	}

	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private String name;
	private String pwd;
}
