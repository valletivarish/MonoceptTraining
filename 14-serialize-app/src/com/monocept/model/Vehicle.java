package com.monocept.model;

import java.io.Serializable;

public class Vehicle implements Serializable {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
