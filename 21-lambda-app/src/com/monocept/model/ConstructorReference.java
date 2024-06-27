package com.monocept.model;

public class ConstructorReference {
	public String name;

	public ConstructorReference(String name) {
		super();
		this.name = name;
	}

	public ConstructorReference() {
		super();
		this.name="Varish";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
