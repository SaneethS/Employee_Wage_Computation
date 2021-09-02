package com.employeewage;

public class EmployeeWageComputation {
	
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	private static int empHrs=0;
	private static int monthlyWage=0;
	
	private static int empCheck = (int) (Math.floor(Math.random()*10)%3);
	
	public void attendance() {
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
	}
	
	public void companyWage(int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth ) {
		int dailyWage = empHrs * wagePerHour;
		System.out.println("Daily Wage of Employee : "+dailyWage);
		
		for(int i=0;i<workingDaysPerMonth ;i++) {
			switch(empCheck) {
				case IS_FULL_TIME: empHrs=8;
							break;
				case IS_PART_TIME: empHrs=4;
							break;
				default: empHrs=0;
		
			}
			int dailyWageSwitch = empHrs * wagePerHour;
			monthlyWage += dailyWageSwitch;
		}
		System.out.println("Wage of Employee per Month: "+monthlyWage);
		
		int totalHrs=0;
		int totalDays=0;
		
		if(!(empHrs == 0)) {
			while(totalHrs<workingHoursPerMonth && totalDays<workingDaysPerMonth ) {
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
				
			}
			
			int totalWage = totalHrs * wagePerHour;
			System.out.println("Total Wage of Employee: "+totalWage);
		}
	}
}
