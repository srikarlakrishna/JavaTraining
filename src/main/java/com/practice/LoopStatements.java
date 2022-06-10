package com.practice;

public class LoopStatements {

	public static void main(String[] args) {
		// driver 7AM --> 8PM
		// 2 Hr journey for each round trip
		// 13 --> 1 lunch --> 12 hrs --> 6 round trips
		// Traffic, Conditions Driver health issues.....>2 delay --> 5

		// unary operator --> i++, i--
		// i=i+1 or i++
		// initialization, condition, execution, increment/decrement opt
		for (int i = 1; i <= 100; i++) {
			System.out.println("round no " + i);

			if (i == 6) {
				System.out.println("duty completed, off for the day");
				break;
			}
//			
//			if(i>6) {
//				System.out.println("extra rounds "+ (i-6));
//			}
		}

	}

}
