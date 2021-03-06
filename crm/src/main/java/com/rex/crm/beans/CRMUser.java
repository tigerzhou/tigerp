package com.rex.crm.beans;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CRMUser {
	private int id;
	private String name;
	private String cellPhone;
	private String company;
	private String businessUnit;
	private String department;
	private String division;
	private String employeeNumber;
	private String jobTitle;
	private String email;
	private int cityId;
	private String photo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String emplyeeNumber) {
		this.employeeNumber = emplyeeNumber;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this, CRMUser.class).toString();
	}

	@SuppressWarnings("all")
	public Map toMap(){
		Map map = new HashMap();
		map.put("cellPhone", cellPhone);
		map.put("division", division);
		map.put("department", department);
		map.put("email", email);
		map.put("jobTitle", jobTitle);
		map.put("name", name);
		map.put("id", id);
		map.put("photo", photo);
		return map;
	}
	
	
	   public static Map<String,String> getMappingOfField2ColumnName(){
	        Map<String,String> list = new HashMap<String,String>();
	        list.put("name", "名称");
	        list.put("cellPhone", "电话");
	        list.put("email", "邮箱");
	        list.put("jobTitle", "职位");
	        list.put("division", "部门");
	        return list;
	    }
	    
	    public static List<String> getFieldNames(){
	        List<String> list = new ArrayList<String>();
	        Field[] fields = CRMUser.class.getDeclaredFields(); 
	        for(Field f:fields){
	            list.add(f.getName());
	        }
	        return list;
	    }
	
}
