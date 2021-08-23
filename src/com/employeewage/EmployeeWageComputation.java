package com.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Computation Problem");
		
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int WORKING_DAYS_MONTH=20;
		final int WORKING_HOURS_MONTH=100;
		int WAGE_PER_HOUR=20;
		int empHrs=0;
		int monthlyWage=0;
		int totalHrs=0;
		int totalDays=0;
		
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
		
		int dailyWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee : "+dailyWage);
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
