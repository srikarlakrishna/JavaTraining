package com.practice;

public class Parent {
	
	public Parent() {
		
	}
	int a;
	//public --> default--> protected --> private
	public final int propertyLand() {
		System.out.println("giving 10 cr property to child");
		return 100000000;
	}

	public int propertyHouse(int value) {
		System.out.println("giving 2 cr property to child");
		return value;
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.propertyHouse(10);
		p.propertyLand();
	}
}
