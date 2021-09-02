package com.employeewage;

public class Main {

	public static void main(String[] args) {
		EmployeeWageComputation employee1,employee2  ;
		employee1  = new EmployeeWageComputation();
		employee2  = new EmployeeWageComputation();
		
		System.out.println("Wage of employee of company-1\n\n");
		employee1.attendance();
		System.out.println("");
		employee1.companyWage(20, 20, 100);
		System.out.println("\n--------------------------\n");
		
		
		System.out.println("Wage of employee of company-2\n\n");
		employee1.attendance();
		System.out.println("");
		employee2.companyWage(40, 28, 120);
		System.out.println("\n--------------------------\n");
	}

}
