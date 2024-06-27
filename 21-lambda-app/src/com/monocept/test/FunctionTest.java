package com.monocept.test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.monocept.model.ConstructorReference;

public class FunctionTest {

	public static void main(String[] args) {
		System.out.println("Example of function interface");
		Function<String,Integer> function = (string)->{
			return string.length();
		};
		System.out.println("The length of the given string is "+function.apply("Varish"));
		System.out.println("\nExample of bifunction interface");
		BiFunction<String,String,Double> bifunction=(string1,string2)->{
			System.out.println((double)(string1+string2).length());
			return null;
		};
		System.out.println("Concatenation of string1 and string2 is "+bifunction.apply("Mono","cept"));
		System.out.println("\nExample of Unary operator interface");
		
		UnaryOperator<String> unaryoperator=(string)->{
			return "* "+string+" *";
		};
		System.out.println(unaryoperator.apply("POC"));
		
		System.out.println("\nExample of Binary operator interface");
		BinaryOperator<String> binaryoperator=(string1,string2)->{
			return string1+string2;
		};
		System.out.println(binaryoperator.apply("POC ","on Function Interface"));
		
		System.out.println("\nExample of passing static method as parameter");
		Function<String,Integer> method=FunctionTest::getLength;
		System.out.println(method.apply("Varish"));
		
		System.out.println("\nExample of passing constructor as parameter");
		Function<String,ConstructorReference> constructor=ConstructorReference::new;
		ConstructorReference obj=constructor.apply("Varish");
		System.out.println("Name :"+obj.getName());
		
	}
	private static Integer getLength(String string) {
		return string.length();
	}
}
