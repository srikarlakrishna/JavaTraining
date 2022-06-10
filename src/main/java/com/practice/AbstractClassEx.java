package com.practice;

public abstract class AbstractClassEx {
	// we can't create object directly
	public final int var = 20;
	public int var1=40;


	public int getVar() {
		return var;
	}
	
	
//	public void setVar(int var) {
//		this.var = var;
//	}

	public AbstractClassEx(int var1) {
		super();
		this.var1 = var1;
	}


	public abstract void unImplemnentedMethod();

	public void concreateMethod() {
		System.out.println("this is concreateMethod "+var1);
	}

	public static void main(String[] args) {
//		AbstractClassEx a = new AbstractClassEx(10);
//		AbstractClassEx a = new AbstractImpl(10,20); // polymorphysm
//		a.unImplemnentedMethod();
//		a.concreateMethod();

	}
}
