package com.employeewage;

import java.util.*;

public class EmployeeWageComputation implements Company {
	
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	
	private List<CompEmpWage> compEmpWageArray;
	
	public EmployeeWageComputation() {
		compEmpWageArray = new ArrayList<>();
	}
	
	public void addCompanyWage(String companyName,int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		CompEmpWage company = new CompEmpWage(companyName, wagePerHour, workingDaysPerMonth, workingHoursPerMonth);
		compEmpWageArray.add(company);

	}
	
	public int companyWage(CompEmpWage compEmpWage) {
		int empHrs = 0;
		int empCheck = (int) (Math.floor(Math.random()*10)%3);
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			empHrs=8;
		}else if(empCheck == IS_PART_TIME) {
			System.out.println("Employee is present but part time");
			empHrs=4;
		}
		else {
			System.out.println("Employee is absent");
			empHrs=0;
		}
	
		int dailyWage = 0;
		int monthlyWage = 0;
		for(int i=0;i<compEmpWage.workingDaysPerMonth ;i++) {
			switch(empCheck) {
				case IS_FULL_TIME: empHrs=8;
							break;
				case IS_PART_TIME: empHrs=4;
							break;
				default: empHrs=0;
		
			}
			int dailyWageSwitch = empHrs * compEmpWage.wagePerHour;
			monthlyWage += dailyWageSwitch;
		}
		System.out.println("Wage of Employee per Month: "+monthlyWage);
		
		int totalHrs=0;
		int totalDays=0;
		
		if(!(empHrs == 0)) {
			while(totalHrs<compEmpWage.workingHoursPerMonth && totalDays<compEmpWage.workingDaysPerMonth ) {
				totalDays++;
				switch(empCheck) {
				case IS_FULL_TIME: empHrs=8;
							break;
				case IS_PART_TIME: empHrs=4;
							break;
				default: empHrs=0;
		
				}
				totalHrs += empHrs;
				System.out.println("Day "+totalDays+" Hours:"+totalHrs);
				dailyWage = empHrs * compEmpWage.wagePerHour;
				System.out.println("Day "+totalDays+" Wage:"+dailyWage);
				
			}
		}
		return totalHrs * compEmpWage.wagePerHour;
	}
	
	public void computeWage() {
		for(int i = 0 ; i<compEmpWageArray.size() ; i++) {
			CompEmpWage company = compEmpWageArray.get(i);
			company.setTotalEmpWage(this.companyWage(company));
			System.out.println(company);
		}
	}
	
}
