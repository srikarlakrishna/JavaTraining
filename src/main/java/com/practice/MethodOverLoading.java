package com.practice;

public class MethodOverLoading {

	byte value = 10;

	public byte propertyLand(byte value) {
		System.out.println("giving 10 cr property to child byte type " + value);
		return 100;
	}

	private short propertyLand(short value) {
		System.out.println("giving 10 cr property to child short type " + value);
		return value;
	}
	
	public byte propertyLand(int value) {
		System.out.println("giving 10 cr property to child byte type " + value);
		return 100;
	}

//	public char propertyLand(char value) {
//		System.out.println("giving 10 cr property to child car type " +value);
//		return value;
//	}

	private long propertyLand(long cost) {
		System.out.println("giving 10 cr property to child cost in long" + cost);
		return cost;
	}

	public float propertyLand(float cost) {
		System.out.println("giving 10 cr property to child cost in float" + cost);
		return cost;
	}

	public double propertyLand(double interest) {
		System.out.println("giving 10 cr property to child cost in double " + interest);
		return interest;
	}

	public double propertyHouse() {
		System.out.println("giving 2 cr property to child");
		return 20000000;
	}

	public static void main(String[] args) {
		MethodOverLoading p = new MethodOverLoading();
//		p.propertyHouse();
//		p.propertyLand();
		p.propertyLand(10);
		p.propertyLand('c');
		p.propertyLand(10.0);
	}
}
