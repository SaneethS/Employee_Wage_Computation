package com.employeewage;

import java.util.List;

public class CompEmpWage {
	
	public String companyName;
	public int wagePerHour;
	public int workingDaysPerMonth;
	public int workingHoursPerMonth;
	public int totalEmpWage;

	CompEmpWage(String companyName,int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth){
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Employee wage in company named "+companyName+" is = "+totalEmpWage+"\n\n";
	}
	
	
}
