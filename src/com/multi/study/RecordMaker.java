package com.multi.study;

import java.util.HashMap;

//- �ҽ� �ڵ带 �ٿ��ּ���. ����, github/���̹� ������ ���Ϳ� �����Ͽ��ٸ�, URL�� ������ �ּ���.
//- �ڽ� �ִ� Language�� �ۼ��Ͻø� �˴ϴ�.
//
//���� : �����ȣ�� ������ ����ϴ� ���α׷��� ����ÿ�.
//���� : ~> java RecordMaker [count]
//���� �� : ~> java RecordMaker 3
//NT00002 80
//NT11206 85
//NT01321 15
//
//���� : "�����ȣ��������"���·� count ���� ���� ��µǾ�� �մϴ�.
//
//����)
//- �����ȣ���� NT�� �ٲ� �� ����, ���� �ټ� �ڸ��� random ����. random ���� 99999 ���ϸ� 0���� ä��.(30�̶�� NT00030)
//- �����ȣ �ߺ� �ȵ�.
//- score�� 0�� �̻� 100�� �̸�. random.
//
//** ���ص��� �ʴ� �κ��� �ִٸ�, ������ �ٴ�� �����ϰ�, �����Ͻÿ�.
public class RecordMaker {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		memberInfo(num);
		
	}
	
	// return �����ȣ
	public static String memberNo(){
		String[] arrNo = new String[7];
		arrNo[0]="N";
		arrNo[1]="T";
		for (int i = 2; i < arrNo.length; i++) {
			arrNo[i] = ""+(int)(Math.random()*10);
		}
		String memberNo = "";
		for (int i = 0; i < arrNo.length; i++) {
			memberNo += arrNo[i];
		}
		return memberNo;
	}
	
	// return �������
	public static Integer memberScore(){
		int memberScore = (int)(Math.random()*100);
		return memberScore;
	}
	
	// ������� ���
	public static void memberInfo(int num){
		HashMap<String,Integer> hm = new HashMap<>();
		boolean run = true;
		while(run){
			String memberNo = memberNo();
			Integer memberScore = memberScore();
			hm.put(memberNo,memberScore);
			if(hm.size()==num){
				run=false;
			}
		}
		 for(String memberNo : hm.keySet()){
		 System.out.println(memberNo+" "+hm.get(memberNo));
		 }
	}
}
