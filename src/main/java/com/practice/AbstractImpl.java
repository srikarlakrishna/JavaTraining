package com.practice;

public abstract class AbstractImpl extends AbstractClassEx {

	public AbstractImpl(int var1) {
		super(var1);
	}
	
	public abstract void unImplemnentedMethod2();

	public void concreateMethod2() {
		System.out.println("this is concreateMethod "+var1);
	}	
}
