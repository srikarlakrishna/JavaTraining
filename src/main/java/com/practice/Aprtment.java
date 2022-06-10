package com.practice;

public class Aprtment {
	private static String aprtmentName = "Sri Krishna Apartments";
	private int flatNo; // 4 bytes
	private String owner;
	
	//public abstract void method1();

	public Aprtment(int flatNo, String owner) {
		super();
		this.flatNo = flatNo;
		this.owner = owner;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public static String getAprtmentName() {
		return aprtmentName;
	}

	public static void setAprtmentName(String aprtmentName) {
		Aprtment.aprtmentName = aprtmentName;
	}

	@Override
	public String toString() {
		return "Aprtment [flatNo=" + flatNo + ", owner=" + owner + ", apartmentName = " + aprtmentName + "]";
	}

	public static void main(String[] args) {
		
		
		Aprtment a1 = new Aprtment(101, "krishna");
		System.out.println(a1);

		Aprtment a2 = new Aprtment(102, "RaJ");
		System.out.println(a2);

		Aprtment a3 = new Aprtment(103, "Charan");
		a3.setAprtmentName("Charan Apartments");

		System.out.println(a3);

		System.out.println(a1);

		System.out.println(a2);

	}

}
