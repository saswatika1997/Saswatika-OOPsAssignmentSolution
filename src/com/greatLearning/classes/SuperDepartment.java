package com.greatLearning.classes;

public class SuperDepartment {
	
	String departmentName = "Super Department";
	String todaysWork = "No Work as of now";
	String workDeadline ="Nil";
	String isTodayAHoliday ="Today is not a holiday";
	

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
	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
	
	
	/*String departmentName()
	{
		return "Super Department";
	}

	String getTodaysWork() 
	{
		return "No Work as of now";
	}
	
	String getWorkDeadline()
	{
		return "Nil";
	}
	
	String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}*/
}

