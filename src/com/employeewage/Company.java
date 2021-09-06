package com.employeewage;

public interface Company {
	
	public void addCompanyWage(final String companyName,final int wagePerHour, final int workingDaysPerMonth, 
			final int workingHoursPerMonth);
	
	public void computeWage();
}
