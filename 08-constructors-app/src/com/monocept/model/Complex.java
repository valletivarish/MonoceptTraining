package com.monocept.model;

public class Complex {
	private int real;
	private int imaginary;
	private int sumReal;
	private int sumImaginary;

	public Complex(int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex() {
	}
	public void setReal(int real) {
		this.real=real;
	}
	public int getReal() {
		return real;
	}
	public void setImaginary(int imaginary) {
		this.imaginary=imaginary;
	}
	public int getImaginary() {
		return imaginary;
	}

}
