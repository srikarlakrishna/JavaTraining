package com.practice;

public class Calculator {
	private int solution;
	private int x;
	private int y;
	
	private static int z;
	
	
	
	public static int getZ() {
		return z;
	}

	public static void setZ(int z) {
		Calculator.z = z;
	}

	private Calculator(){
		
	}

	public int getSolution() {
		return solution;
	}

	public void setSolution(int solution) {
		this.solution = solution;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int addition(int x, int y) {
		return this.x + this.y;
	}

	public int subtraction(int x, int y) {
		return x - y;
	}

	private static int multiplication(int x, int y) {
		return x * y;
	}

	public void division(int x, int y) {
		solution = x / y;
	}

	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.division(10, 20);
		
		int multiplication = multiplication(10,20);
		System.out.println(multiplication);
		System.out.println(Calculator.z);
		
		
		
		
		
//		System.out.println(" addition " + addition);
//		System.out.println(" subtraction " + c.subtraction(10, 20));
//		//System.out.println(" division " + c.division(10, 20));
//		System.out.println(" multiplication " + c.multiplication(10, 20));
	}

}