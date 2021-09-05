package com.employeewage;

public class EmployeeWageComputation {
	
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	
	private int companyCount = 0;
	private CompEmpWage [] compEmpWageArray;
	
	public EmployeeWageComputation() {
		compEmpWageArray = new CompEmpWage[10];
	}
	
	public void addCompanyWage(String companyName,int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		compEmpWageArray[companyCount] = new CompEmpWage(companyName, wagePerHour, workingDaysPerMonth, workingHoursPerMonth);
		companyCount++;
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
		dailyWage = empHrs * compEmpWage.wagePerHour;
		System.out.println("Daily Wage of Employee : "+dailyWage);
		
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
				
			}
		}
		return totalHrs * compEmpWage.wagePerHour;
	}
	
	public void computeWage() {
		for(int i = 0 ; i<companyCount ; i++) {
			compEmpWageArray[i].setTotalEmpWage(this.companyWage(compEmpWageArray[i]));
			System.out.println(compEmpWageArray[i]);
		}
	}
	
}
