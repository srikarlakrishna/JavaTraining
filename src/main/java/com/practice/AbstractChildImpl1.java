package com.practice;

public class AbstractChildImpl1 extends AbstractClassEx {

	 
	public int heartRate = 30;
	
	
	public AbstractChildImpl1(int var1, int heartRate) {
		super(var1);
		this.heartRate = heartRate;
	}

	public void pillerDesign() {
		System.out.println("pillerDesign method");
	}

	@Override
	public void unImplemnentedMethod() {
		System.out.println("unimplemented mthod body");
	}

	@Override
	public void concreateMethod() {
		System.out.println("child impl"+heartRate);
	}
	
	public static void main(String[] args) {
		AbstractClassEx a = new AbstractChildImpl1(50,72); // polymorphysm
		a.unImplemnentedMethod();
		a.concreateMethod();
		
		//a.setVar(30);
		//System.out.println(a.heartReate);
		
		
		 

	}

}
