package com.practice;

public class GrandChild{

	public static void main(String[] args) {
		Parent p = new Parent();
		p.propertyHouse();
		p.propertyLand();
		
		Child c = new Child();
		c.propertyHouse();
		c.propertyLand();
	}

}
