package com.greatLearning.main;
import java.util.Scanner;

import com.greatLearning.classes.AdminDepartment;
import com.greatLearning.classes.HrDepartment;
import com.greatLearning.classes.TechDepartment;
public class Driver {
	
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to "+ad.getDepartmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.getIsTodayAHoliday());
		//HrDepartment hd = new HrDepartment();
		
		
		System.out.println("       ");
		
		HrDepartment hd = new HrDepartment();
		System.out.println("Welcome to "+hd.getDepartmentName());
		System.out.println(hd.getDoActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.getIsTodayAHoliday());
		
		System.out.println("       ");
		
		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to "+td.getDepartmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(hd.getIsTodayAHoliday());
		
		
	}

}
