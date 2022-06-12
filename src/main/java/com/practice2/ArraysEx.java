package com.practice2;

public class ArraysEx {

	private int a = 10; // --> 4 bytes
//	private int b = 20;
//	private int c = 30;
//	private int d = 40;

	private static String name = "krishna";

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		ArraysEx.name = name;
	}

	public static void main(String[] args) {
//		ArraysEx e = new ArraysEx();
//		System.out.println(e.getA());
//		System.out.println(ArraysEx.getName());

		int[] array = new int[5];
		array[0] = 20; // 1
		array[1] = 30; // 2
		array[2] = 40; // 3
//		array[3]=50;
//		array[4]=50;

		String[] strArray = new String[5];
		strArray[0] = "";
		strArray[1] = null;
		// strArray[2]=2;

		// System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
		}

		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		// printing 2D array
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
