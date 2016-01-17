package com.laolang.party.domain;

import java.util.Date;

public class Tuan {

	
	
	
	public Tuan() {
		super();
	}
	
	
	
	public Tuan(String student_id, String group_id) {
		super();
		this.student_id = student_id;
		this.group_id = group_id;
	}



	public Tuan(String student_id, Date application_time, Date apprival_time,
			Date quit_time, String group_id) {
		super();
		this.student_id = student_id;
		this.application_time = application_time;
		this.approval_time = apprival_time;
		this.quit_time = quit_time;
		this.group_id = group_id;
	}
	@Override
	public String toString() {
		return "Tuan [student_id=" + student_id + ", application_time="
				+ application_time + ", apprival_time=" + approval_time
				+ ", quit_time=" + quit_time + ", group_id=" + group_id + "]";
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public Date getApplication_time() {
		return application_time;
	}
	public void setApplication_time(Date application_time) {
		this.application_time = application_time;
	}
	public Date getApprival_time() {
		return approval_time;
	}
	public void setApprival_time(Date apprival_time) {
		this.approval_time = apprival_time;
	}
	public Date getQuit_time() {
		return quit_time;
	}
	public void setQuit_time(Date quit_time) {
		this.quit_time = quit_time;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	private String student_id;
	private Date application_time;
	private Date approval_time;
	private Date quit_time;
	private String group_id;
}
