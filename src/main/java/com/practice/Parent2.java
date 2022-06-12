package com.practice;

public class Parent2 {
	
	public Parent2() {
		
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
		Parent2 p = new Parent2();
		p.propertyHouse(10);
		p.propertyLand();
	}
}
