package com.employeewage;

public class EmployeeWageComputation {
	
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	private static final int WORKING_DAYS_MONTH=20;
	private static final int WORKING_HOURS_MONTH=100;
	private static final int WAGE_PER_HOUR=20;
	private static int empHrs=0;
	private static int monthlyWage=0;
	private static int totalHrs=0;
	private static int totalDays=0;
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
	
	public void dailyWage() {
		int dailyWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee : "+dailyWage);
	}
	
	public void monthlyWage(){
		for(int i=0;i<WORKING_DAYS_MONTH;i++) {
			switch(empCheck) {
				case IS_FULL_TIME: empHrs=8;
							break;
				case IS_PART_TIME: empHrs=4;
							break;
				default: empHrs=0;
		
			}
			int dailyWageSwitch = empHrs * WAGE_PER_HOUR;
			monthlyWage += dailyWageSwitch;
		}
		System.out.println("Wage of Employee per Month: "+monthlyWage);
	}
	
	public void daysHoursWage() {
		while(totalHrs<WORKING_HOURS_MONTH && totalDays<WORKING_DAYS_MONTH) {
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
		
		int totalWage = totalHrs * WAGE_PER_HOUR;
		System.out.println("Total Wage of Employee: "+totalWage);
		
		

	}

}
