package com.practice;

public class WhileLoopEx {

	public static void main(String[] args) {

		int no = 1;
//		while (no <40) {
//			System.out.println("work");
//			no++;
//		}
//		System.out.println("break");
		
		
		do {
			System.out.println("work");
			no++;	
			if(no==29) {
				break;
			}
			if(no==26) {
				continue;
			}
		}while (no <40);
		
		System.out.println("break");

	}

}
