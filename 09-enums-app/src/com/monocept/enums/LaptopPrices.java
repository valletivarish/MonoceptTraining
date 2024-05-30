package com.monocept.enums;

public class LaptopPrices {
	
	enum Laptop{
		MACBOOK(2000), WINDOWS(1000), XPS(2200), SURFACE(1800), THINKPAD(1500);
		
		private int price;
		Laptop(int price) {
			this.price=price;
		}
		
		public void setPrice(int price) {
			this.price=price;
		}
		public int getPrice() {
			return price;
		}
		
		
	}

	public static void main(String[] args) {
		
		Laptop macbook=Laptop.MACBOOK;
		macbook.setPrice(2400);
		for(Laptop laptop: Laptop.values()) {
			System.out.println(laptop+" : "+laptop.price);
		}
	}

}
