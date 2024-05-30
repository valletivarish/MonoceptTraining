package com.monocept.reflectiontest;

public class ObjectCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		try {
			Class reflectionOfObject = Class.forName("com.monocept.reflectiontest.ReflectionOfObject");
			ReflectionOfObject object1 = (ReflectionOfObject) reflectionOfObject.newInstance();
			ReflectionOfObject object2 = (ReflectionOfObject) object1;
			
			System.out.println(object1.evenOrOdd(20));
			System.out.println(object2.evenOrOdd(17));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	

	}

}
