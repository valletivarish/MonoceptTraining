package com.monocept.model;

import java.util.Comparator;

public class InsurancePolicyComparator {
	public static class sortByName implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			return o1.getPolicyHolderName().compareTo(o2.getPolicyHolderName());
		}
		
	}
	public static class sortByAmount implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			return o1.getPolicyAmount()-o2.getPolicyAmount();
		}
		
	}
	public static class sortBydate implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy o1, InsurancePolicy o2) {
			return o1.getPolicyCreationDate().compareTo(o2.getPolicyCreationDate());
		}
		
	}
}
