package com.monocept.structural.facade.model;

public class HotelReception {
	public void getIndianMenu(){
		IHotel hotel=new IndianHotel();
		IMenu menu=hotel.getMenu();
		menu.displayMenu();
	}
	public void getChineseMenu() {
		IHotel hotel=new ChineseHotel();
		IMenu menu=hotel.getMenu();
		menu.displayMenu();
	}
}
