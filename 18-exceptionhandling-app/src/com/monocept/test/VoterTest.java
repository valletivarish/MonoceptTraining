package com.monocept.test;

import com.monocept.exceptions.AgeNotValidException;
import com.monocept.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		try {
		Voter voter1 = new Voter("varish",21);
		voter1.vote();
		Voter voter2 = new Voter("ajay" , 17);
		voter2.vote();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}

}
