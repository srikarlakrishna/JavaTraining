package com.practice;

public class Child2 extends Parent {
	
	@Override
	public int propertyHouse() {
		System.out.println("modified the property with 2 crs now total "
				+ "house cost 4 cr");
		return 4000000;
	}
	
	@Override
	public int propertyLand() {
		System.out.println("modified the property with acras to apartment");
		return 800000000;
	}
	
	public int newBusiness(){
		System.out.println("new Business worth 15 crs");
		return 50000000;
	}

	public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.propertyHouse();
		c.propertyLand();
		c.newBusiness();
	}

}
