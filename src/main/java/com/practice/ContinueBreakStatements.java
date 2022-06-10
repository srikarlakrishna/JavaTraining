package com.practice;

public class ContinueBreakStatements {

	public static void main(String[] args) {
		boolean flag=false;
		// outer loop
	/*	for (int i = 1; i <= 3; i++) { // i =1, 2 3*3 ->9
			// inner loop
			for (int j = 1; j <= 3; j++) { // j=1
				if (i == 2 && j == 2) {
					flag=true;
					// using break statement inside the inner loop
					break;
				}
				System.out.println(i + " " + j);
			}
			if(flag=true) {
				break;
			}
		} */
		
		//Lable concept
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					// using break statement with label
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}

}
