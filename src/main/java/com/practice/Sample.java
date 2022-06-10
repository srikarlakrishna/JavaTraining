package com.practice;

class G_Parent {
	int gp1;

	public int getGp1() {
		return gp1;
	}

	public void setGp1(int gp1) {
		this.gp1 = gp1;
	}

	public G_Parent(int gp1) {
		this.gp1 = gp1;
	}

}

class Parent3 extends G_Parent {
//	public Parent3(int gp1) {
//		super(gp1);
//	}
	int p1;
	int p2;
	public Parent3(int gp1, int p1, int p2) {
		super(gp1);
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
}

public class Sample extends Parent3 {
	
	public Sample(int gp1, int p1, int p2) {
		super(gp1, p1, p2);
	}

	public static void main(String[] args) {
		Sample s = new Sample(10,20,30);
		System.out.println("hi ");
	}
}
