package com.multi.day01;

public class OperatorTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		System.out.println(a + b);
		System.out.println("�հ�=" + a + b);// ���� ����
		System.out.println("�հ�=" + (a + b));// ���� �켱����
		System.out.println(a - b);
		// System.out.println("����="+a-b);//���ڿ��� '-'���� �ȵ�
		System.out.println("����=" + (a - b));
		System.out.println("���ϱ�=" + a * b);
		System.out.println("������=" + a / b); // �� ... ����/���� -> ����
		System.out.println((double) a / b); // ĳ���� �Ǽ�ǥ��
		System.out.println(1.0 * a / b); // 1.0(�Ǽ�) ���ؼ� �Ǽ�ǥ��
		System.out.println(a % b); // ������

		System.out.println("==================");
		System.out.println(a = b);// b�� a�� �ְ� a�� ���
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println("======��������======");
		int su1 = 10;
		int su2 = 20;

		// &&,& (and) ��� true�̸� true�̴�.
		System.out.println(su1 < 10 && ++su2 >= 20); //&& ���౸��, �տ� ������ false�̸� �ڿ� ���� ������Ѵ�
		System.out.println(su2);
		System.out.println(su1 < 10 & ++su2 >= 20); //& �տ� ������ false�̶� �ڿ� ���� �����Ѵ�
		System.out.println(su2);
		
		// System.out.println(su1>=10 & su2>=20);
		// System.out.println(su1>=10 && su2<20);
		// System.out.println(su1>=10 & su2<20);

		// ||,| (or) �ϳ��� true�̸� true�̴�.
		System.out.println(su1==10 || ++su2 >=20);// || ���౸��, �տ� ������ true�̸� �ڿ� ���� ������Ѵ�.
		System.out.println(su2);
		System.out.println(su1==10 | ++su2 >=20);// | �տ� ������ true�̶�, �ڿ� ���� �����Ѵ�.
		System.out.println(su2);
		
		String str = null; //null�� �������� �ʾҴ�.
		System.out.println(str);
		System.out.println(str!=null && str.length()>0);
		//System.out.println(str!=null & str.length()>0); // error
		System.out.println(str==null||str.length()>0);

		//��Ʈ������
		System.out.println(3 & 4);
		
		//���Կ�����
		short score = 100;
		score++;
		++score;
		score += 1; //���մ��Կ����ڴ� �ڵ� cast
		score = (short)(score+1); // ��������ȯ �ʿ�
		System.out.println(score);
		
		//���ǹ�
		if(score>100){
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		//���׿�����
		System.out.println(score>100?"pass":"fail");
		
		String grade;
		grade = score>100?"A":"B";
		System.out.println(grade+"�����Դϴ�");
	}
	
}
