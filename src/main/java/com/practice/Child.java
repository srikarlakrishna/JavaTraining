package com.practice;

public class Child extends Parent {
	
	public Child() {
		super();
		System.out.println("child obj created");
	}
	
	
//	@Override
//	public int propertyHouse(int value) {
//		System.out.println("modified child");
//		return super.propertyHouse(value+200);
//	}
	
	
	public int buyedTheGold(){
		System.out.println("Buyed the gold for 5 crs");
		return 50000000;

	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.propertyHouse(10);
		 
		
	}

}
