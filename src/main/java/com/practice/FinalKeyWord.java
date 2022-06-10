package com.practice;

class Testing {
	private int var = 10;

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
}

public class FinalKeyWord extends Testing {

	private  static final int var;
	
	static {
		var=10;
	}

	public int getVar() {
		return var;
	}

//	public void setVar(int var) {
//		this.var = var;
//	}

	public static void main(String[] args) {

		FinalKeyWord f = new FinalKeyWord(0);
		System.out.println(f.var);
		// f.setVar(20);
		System.out.println(f.var);

	}

	public FinalKeyWord(final int var) {
		super();
		//this.var = var;
	}

}
