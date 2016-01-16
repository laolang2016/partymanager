package com.laolang.party.domain;

import java.util.Date;

public class Tuanzz {

	
	
	
	public Tuanzz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tuanzz(String group_id, String group_name, Date commence_time) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
		this.commence_time = commence_time;
	}
	@Override
	public String toString() {
		return "Tuanzz [group_id=" + group_id + ", group_name=" + group_name
				+ ", commence_time=" + commence_time + "]";
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public Date getCommence_time() {
		return commence_time;
	}
	public void setCommence_time(Date commence_time) {
		this.commence_time = commence_time;
	}
	private String group_id;
	private String group_name;
	private Date commence_time;
}
