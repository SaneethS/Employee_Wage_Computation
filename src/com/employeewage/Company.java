package com.employeewage;

public interface Company {
	
	public void addCompanyWage(String companyName, int wagePerHour, int workingDaysPerMonth, 
			 int workingHoursPerMonth);
	
	public void computeWage();
	
	public int getCompanyTotalWage(String companyName);
}
