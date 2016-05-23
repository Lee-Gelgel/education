package com.multi.day07;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public TireLocation location;
	public Tire(TireLocation location, int maxRotation) {
		super();
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll(){
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + 
				"tire수명:" + (maxRotation-accumulatedRotation)+"회");
			return true;
		}else{
			System.out.println("***" +location+
					"타이어 펑크****" );
			return false;
		}
	}
	
	
	
	
	
}
