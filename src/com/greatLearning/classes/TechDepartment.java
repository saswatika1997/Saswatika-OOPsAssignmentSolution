package com.greatLearning.classes;

public class TechDepartment extends SuperDepartment{
	
	String departmentName = "Tech Department";
	String todaysWork = "Complete Coding of Module 1";
	String workDeadline = "Complete by EOD";
	String techStackInformation = "Core Java";
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		return todaysWork;
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public String getWorkDeadline() {
		return workDeadline;
	}
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	public String getTechStackInformation() {
		return techStackInformation;
	}
	public void setTechStackInformation(String techStackInformation) {
		this.techStackInformation = techStackInformation;
	}
	
	
	/*
	 * String departmentName() { return "Tech Department"; }
	 * 
	 * String getTodaysWork() { return "Complete Coding of Module 1"; }
	 * 
	 * String getWorkDeadline() { return "Complete by EOD"; }
	 * 
	 * String getTechStackInformation() { return "Core Java"; }
	 */
}
