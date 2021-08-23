package com.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Computation Problem");
		
		int IS_FULL_TIME=1;
		int WAGE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		
		int empCheck = (int) (Math.floor(Math.random()*10)%2);
		
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			empHrs=8;
		}
		else {
			System.out.println("Employee is absent");
			empHrs=0;
		}
		
		int dailyWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Daily Wage of Employee : "+dailyWage);
		

	}

}
