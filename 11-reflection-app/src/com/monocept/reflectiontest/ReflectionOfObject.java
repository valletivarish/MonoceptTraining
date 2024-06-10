package com.monocept.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionOfObject {

	public static void main(String[] args) {
		Class<Object> objectClass = Object.class;
		
//		Constructor constructors[]=objectClass.getConstructors();
//		
//		for(Constructor constructor:constructors ) {
//			System.out.println(constructor.getName());
//			System.out.println(constructor.getParameterCount());
//			System.out.println(constructor.hashCode());
//		}
		Method methods[]=objectClass.getMethods();
		for(Method method:methods) {
			System.out.println(method);
			System.out.print(method.getName()+" ");
			System.out.print(method.getParameterCount());
			System.out.println();
		}
	}

	public String evenOrOdd(int i) {
		if(i%2==0) 
			return "even";
		return "odd";
		
	}
}
