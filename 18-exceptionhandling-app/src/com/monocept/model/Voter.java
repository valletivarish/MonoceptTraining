package com.monocept.model;

import com.monocept.exceptions.AgeNotValidException;

public class Voter {
	private String voterName;
	private int voterAge;
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public int getVoterAge() {
		return voterAge;
	}
	public void setVoterAge(int voterAge) {
		this.voterAge = voterAge;
	}
	public Voter(String voterName, int voterAge) {
		super();
		this.voterName = voterName;
		this.voterAge = voterAge;
	}
	public void vote() {
		if(voterAge<18) {
			throw new AgeNotValidException();
		}
		System.out.println(voterName+" has casted a vote");	
	}
}
