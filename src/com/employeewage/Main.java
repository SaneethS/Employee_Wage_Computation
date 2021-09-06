package com.employeewage;

public class Main {

	public static void main(String[] args) {
		EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
		
		employeeWageComputation.addCompanyWage("jio", 20, 25, 100);
		employeeWageComputation.addCompanyWage("Nike", 30, 28, 120);
		
		employeeWageComputation.computeWage();
		
		int jioWage = employeeWageComputation.getCompanyTotalWage("jio");
		System.out.println("Total Wage of queried company : "+jioWage);

	}

}
