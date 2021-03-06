package com.rex.crm.db.model;

// Generated 2013-5-4 16:44:24 by Hibernate Tools 4.0.0

/**
 * Contact generated by hbm2java
 */
public class Contact implements java.io.Serializable {

	private Integer id;
	private String name;
	private String branch;
	private String department;
	private String duty;
	private String gender;
	private String mobilephone;
	private String telWork;
	private String title;
	private int accountId;

	public Contact() {
	}

	public Contact(String name, int accountId) {
		this.name = name;
		this.accountId = accountId;
	}

	public Contact(String name, String branch, String department, String duty,
			String gender, String mobilephone, String telWork, String title,
			int accountId) {
		this.name = name;
		this.branch = branch;
		this.department = department;
		this.duty = duty;
		this.gender = gender;
		this.mobilephone = mobilephone;
		this.telWork = telWork;
		this.title = title;
		this.accountId = accountId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getTelWork() {
		return this.telWork;
	}

	public void setTelWork(String telWork) {
		this.telWork = telWork;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}
