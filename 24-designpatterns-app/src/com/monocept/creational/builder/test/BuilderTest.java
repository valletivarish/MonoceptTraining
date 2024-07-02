package com.monocept.creational.builder.test;

import com.monocept.creational.builder.model.Person;

public class BuilderTest {

	public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setName("Varish")
                .build();
		System.out.println(person);
		Person person2 = new Person.PersonBuilder()
                .setAge(10)
                .build();
		System.out.println(person2);

	}

}
