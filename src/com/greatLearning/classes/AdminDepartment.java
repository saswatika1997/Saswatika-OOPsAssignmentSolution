package com.greatLearning.classes;

public class AdminDepartment extends SuperDepartment {
	
	String departmentName = "Admin Department";
	String todaysWork = "Complete your document Submission";
	String workDeadline = "Complete by EOD";
	
	
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
	

}
