package com.employeewage;

public class Main {

	public static void main(String[] args) {
		EmployeeWageComputation employee = new EmployeeWageComputation();
		employee.attendance();
		employee.dailyWage();
		employee.monthlyWage();
		employee.daysHoursWage();
	}

}
