package com.multi.day07;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++){
			System.out.println("======================");
			TireLocation problemLocation = car.run();
			System.out.println(problemLocation+" �κ��� ����");
		
		    switch(problemLocation){
		    case FRONT_LEFT:
		    	System.out.println(problemLocation.getName()+" ��ü�Ѵ�.");
		    	car.tires[0]  = new Tire(problemLocation,15);
		    	break;
		    case FRONT_RIGHT:
		    	System.out.println(problemLocation.getName()+" ��ü�Ѵ�.");
		    	car.tires[1]  = new Tire(problemLocation,13);
		    	break;
		    case BACK_LEFT:
		    	System.out.println(problemLocation.getName()+" ��ü�Ѵ�.");
		    	car.tires[2]  = new Tire(problemLocation,14);
		    	break;
		    case BACK_RIGHT:
		    	System.out.println(problemLocation.getName()+" ��ü�Ѵ�.");
		    	car.tires[3]  = new Tire(problemLocation,17);
		    	break;
		    	
		    }
		
		
		
		
		}
	}
}
