package com.monocept.enums;

enum Months{
	JANUARY, FEBRUARY, MARCH, APRIL, MAY , JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
public class Season {


	public static void main(String[] args) {
		
		Months month=Months.valueOf("JULY");
		switch(month){
		case DECEMBER:
		case JANUARY:
		case FEBRUARY: System.out.println("The Season is Winter");
		break;
		case MARCH:
		case APRIL:
		case MAY: System.out.println("The Season is Summer");
		break;
		case JUNE: 
		case JULY:
		case AUGUST: System.out.println("The Season is Monsoon");
		break;
		case SEPTEMBER:
		case OCTOBER:
		case NOVEMBER: System.out.println("The Season is Post-monsoon");
	}

	}

}
