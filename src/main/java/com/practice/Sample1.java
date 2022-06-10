package com.practice;

public class Sample1 {

	static byte b = 100;
	short _s = 22434;
	public char c = 'c'; // 2bytes --> 16 bits
	private int i = 233434343;
	long l = 34324434343432l;
	float f = 10.23232f;
	double d = 10.0d;
	boolean a = false; // bydefault false
	boolean ba = true;

	public static void getVariables() {
		int sumofVariable = 1000;
		System.out.println("inside getVariables" + b);
	}

	boolean ad = false; // bydefault false
	boolean bda = true;

	private void getData() {
		System.out.println("Inside getData");
	}

	public static void main(String[] args) {
		// System.out.println("inside getVariables" + b);
		Sample obj = new Sample();
		getVariables();
	}

}
