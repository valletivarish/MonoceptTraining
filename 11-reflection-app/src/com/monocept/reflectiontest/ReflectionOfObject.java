package com.monocept.reflectiontest;

import java.lang.reflect.Constructor;

public class ReflectionOfObject {

	public static void main(String[] args) {
		Class<Object> objectClass = Object.class;
		
		Constructor constructors[]=objectClass.getConstructors();
		
		for(Constructor constructor:constructors ) {
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());
			System.out.println(constructor.hashCode());
		}
	}

	public String evenOrOdd(int i) {
		if(i%2==0) 
			return "even";
		return "odd";
		
	}
}
