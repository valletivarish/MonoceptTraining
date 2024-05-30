package com.monocept.typecasting;

public class WrapperTest {

	public static void main(String[] args) {
		byte number=10;
		Byte numberByte=number;
		changeByteValue(numberByte);
		System.out.println(numberByte);

	}

	private static void changeByteValue(Byte numberByte) {
		numberByte=20;
		
	}

}
