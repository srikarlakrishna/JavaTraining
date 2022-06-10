package com.practice;

public class GrandChild2 extends Child {

	
	@Override
	public int propertyHouse() {
		// TODO Auto-generated method stub
		return super.propertyHouse();
	}

//	@Override
//	public int propertyLand() {
//		System.out.println("modified the property with acras to ventures");
//		return 200000000;
//	}

	@Override
	public int buyedTheGold() {
		System.out.println("purchased the extra gold for 15 crs");
		return 50000000;
	}

	public static void main(String[] args) {

		GrandChild2 c = new GrandChild2();
		c.propertyHouse();
		c.propertyLand();
		c.buyedTheGold();

		// Polymorphysm
//		Parent p = new GrandChild();
//		p.propertyHouse();
//		p.propertyLand();

	}

}
