package com.monocept.model;

import java.util.Comparator;

public class EmployeesComparator {
	public static class EmployeesByName implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		}
		
	}
	public static class EmployeeBySalary implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getEmployeeSalary()-o2.getEmployeeSalary());
		}
		
	}
	public static class EmployeesById implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getEmployeeSalary()-o2.getEmployeeSalary());
		}
		
	}
}
