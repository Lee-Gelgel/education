package com.multi.day11.thread;

//°øÀ¯ÀÚ¿ø
class BathRoom{
	boolean first = true;
	public void use(String name){
		synchronized(this){
		if(first && name.equals("gelgel")){
			first = false;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
			System.out.println(name+"´Ô ÀÔÀå");
			System.out.println(name+"´Ô »ç¿ë");
			System.out.println(name+"´Ô ÅðÀå");
			System.out.println("==============");
			notify();
		}
			
	}
}

class BathThread extends Thread{
	BathRoom room;
	String name;
	
	public BathThread(BathRoom room, String name) {
		this.room = room;
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++){
			room.use(name);
		}
	}
	
	
}


public class SynchronizedExample {
	public static void main(String[] args) {
		BathRoom room = new BathRoom();
		BathThread person1 = new BathThread(room, "gelgel");
		BathThread person2 = new BathThread(room, "lulu");
		BathThread person3 = new BathThread(room, "simon");
		BathThread person4 = new BathThread(room, "jhon");
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		
	}
}
