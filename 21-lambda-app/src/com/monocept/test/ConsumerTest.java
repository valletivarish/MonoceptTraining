package com.monocept.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> consumer=(arg)->{
			int fact=1;
			for(int i=1;i<=arg;i++) {
				fact*=i;
			}
			System.out.println("Factorial of a number "+arg+" : "+fact);
		};
		consumer.accept(5);
		BiConsumer<Integer,Integer> biconsumer=(number1,number2)->{
			System.out.println("Addition of two numbers : "+(number1+number2));
		};
		biconsumer.accept(10,20);
		
		biconsumer=(number1,number2)->{
			System.out.println("Before swapping number 1 is "+number1+" and number 2 is "+number2);
			number1=number1^number2;
			number2=number1^number2;
			number1=number1^number2;
			System.out.println("After swapping number 1 is "+number1+" and number 2 is "+number2);
		};
		biconsumer.accept(10, 20);

	}

}
