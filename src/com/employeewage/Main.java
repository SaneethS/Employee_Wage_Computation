package com.employeewage;

public class Main {

	public static void main(String[] args) {
		EmployeeWageComputation jio = new EmployeeWageComputation("Jio", 25, 28, 120);
		jio.companyWage();
		System.out.println("-------------------------------------");
		EmployeeWageComputation tata = new EmployeeWageComputation("Tata", 20, 24, 90);
		tata.companyWage();
	}

}
