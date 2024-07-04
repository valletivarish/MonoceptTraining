package com.monocept.structural.composite.test;

import com.monocept.structural.composite.model.*;

public class EmployeeTest {

	public static void main(String[] args) {
		IEmployee dev1 = new Developer("1","Varish", "Junior Developer");
		IEmployee dev2 = new Developer("2","John", "Senior Developer");

		IEmployee man1 = new Manager("3","Jack", "DoNet Manager");
		IEmployee man2 = new Manager("4","Dinesh", "AWS Manager");

		CompanyDirectory developerDirectory = new CompanyDirectory();
		developerDirectory.addEmployee(dev1);
		developerDirectory.addEmployee(dev2);

		CompanyDirectory managerDirectory = new CompanyDirectory();
		managerDirectory.addEmployee(man1);
		managerDirectory.addEmployee(man2);

		CompanyDirectory companyDirectory = new CompanyDirectory();
		companyDirectory.addEmployee(developerDirectory);
		companyDirectory.addEmployee(managerDirectory);

		System.out.println("Company Employees:");
		companyDirectory.showEmployeeDetails();
		
		companyDirectory.removeEmployee(man1);
		companyDirectory.showEmployeeDetails();

	}
}
