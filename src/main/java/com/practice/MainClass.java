package com.practice;

public class MainClass {

	public static void main(String[] args) {
		// Sample variableName/Reference Variable of = new Sample();
		Sample sampleObj = new Sample();
		System.out.println(sampleObj.c);
		
		System.out.println(Sample.b);
		//System.out.println(Sample.c);

		
		Sample.getVariables();
		
		/*
		 * Sample sample1 = new Sample(); System.out.println(sample1.d);
		 * System.out.println(sample1.l);
		 * 
		 * Sample sample2 = new Sample(); System.out.println(sample2.c);
		 * System.out.println(sample2.b);
		 * 
		 * Sample sample3 = new Sample(); System.out.println(sample3.d);
		 * System.out.println(sample3.l);
		 */

	}

}
