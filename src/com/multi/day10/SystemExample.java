package com.multi.day10;

public class SystemExample {
	public static void main(String[] args) {
//		if (args.length == 0) {
//			System.out.println("����� �Ű����� 2�� �Է�...");
//			// return; // �Լ� ������
//			System.exit(0); // ���α׷� ������
//		}
		
		System.setSecurityManager(new SecurityManager(){

			@Override
			public void checkExit(int status) {
				if(status!=5) throw new SecurityException();
				super.checkExit(status);
			}
			
		});
		
		for(int i=0;i<10;i++){
			System.out.println(i);
			try{
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println("exception ó����");
			}
		}
		
		
		
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		System.out.println(su1 + su2);
	}
}
