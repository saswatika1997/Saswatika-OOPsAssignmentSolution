package com.greatLearning.classes;

public class HrDepartment extends SuperDepartment {
	
	String departmentName ="HR Department";
	String todaysWork ="Fill today's Timesheet and mark your Attendence";
	String workDeadline = "Complete by EOD";
	String doActivity ="Team Lunch";
	
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
	public String getDoActivity() {
		return doActivity;
	}
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}
	
	/*
	 * String departmentName () { return "Hr Department"; }
	 * 
	 * String getTodaysWork() { return
	 * "Fill today's Marksheet and mark your Attendence"; }
	 * 
	 * String getWorkDeadline() { return "Complete by EOD"; }
	 * 
	 * String doActivity() { return "Team Lunch"; }
	 */
}
