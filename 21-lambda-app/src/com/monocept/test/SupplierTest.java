package com.monocept.test;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> supplier=()->{
			LocalDate date = LocalDate.now();
			return date.toString();    
		};
		System.out.println(supplier.get());

	}

}
