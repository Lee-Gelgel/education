package com.multi.day10;

public class StringTest2 {
	public static void main(String[] args) {
		
		int i = 100;
		String s = ""+i+100;
		System.out.println(s);
		
		
//		String str1 = "�ڹ� ���α׷���";
//		System.out.println(str1.indexOf('��'));
//		System.out.println(str1.replace("�ڹ�", "java"));
//		System.out.println(str1);
//		String str2 = str1.replace("�ڹ�", "java");
//		System.out.println(str2);
		
		/*
		String s = "901128-1234567";
		for (int i = 0; i < s.length(); i++) {
			System.out.print((char)(s.charAt(i)));
			if(i==7){
				System.out.print(s.charAt(i)=='1'?"����":"����");
			}
		}
		System.out.println();
		System.out.println("-------------------");
		System.out.println(s.substring(2, 4)+"��");
		for(int i=0;i<s.length();i++){
			System.out.print(s.substring(i,i+1));
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		String s2 = "java";
		byte[] b;
		try {
			b = s2.getBytes("UTF-8");
			System.out.println(Arrays.toString(b));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println();
		System.out.println("-------------------");
		char[] ch = s.toCharArray();
		for(char c : ch){
			System.out.print(c);
		}
		*/
	}
}
