package com.practice;

public class SwitchCase {

	public static void main(String[] args) {
		int age = 50;
		switch (age) {
		case 50:
			System.out.println("eligible to mrg && vote");
			break;
		case 60:
			System.out.println("eligible to pinchan");
			break;
		case 10:
			System.out.println("not elible for vote");
			break;
		default:
			System.out.println("pls enter correct value");

		}
	}

}
