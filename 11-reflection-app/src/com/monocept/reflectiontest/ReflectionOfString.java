package com.monocept.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionOfString {

	public static void main(String[] args) {
		try {
			Class stringClass =Class.forName("java.lang.String");
			System.out.println(stringClass.toString());
			
			Method methods[]=stringClass.getMethods();
			
			Constructor constructors[]=stringClass.getConstructors();
			
			for(Constructor constructor : constructors) {
				System.out.println(constructor.toString() + "\t" + constructor.getParameterCount());
			}
			
			for(Method method:methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
