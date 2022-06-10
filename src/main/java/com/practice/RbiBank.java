package com.practice;

class SBI extends RbiBank {
	
	float getRateOfInterest() {
		return 8.4f;
	}

	static void guideLines() {
		System.out.println("1)SBI guildelines must folllow");
	}

	public void personalInterest() {
		// TODO Auto-generated method stub

	}
}

public class RbiBank {
	float getRateOfInterest() {
		return 4.1f;
	}

	static void guideLines() {
		System.out.println("1)RBI guildelines must folllow");
	}

	public static void main(String args[]) {
		RbiBank b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b.guideLines();

		RbiBank b1 = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b1.getRateOfInterest());
		RbiBank b2 = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b2.getRateOfInterest());
		
		if( b instanceof SBI) {
			System.out.println("RBI");
		}
	}
}

class ICICI extends RbiBank {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends RbiBank {
	float getRateOfInterest() {
		return 9.7f;
	}
}
