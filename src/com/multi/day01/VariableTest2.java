package com.multi.day01;

public class VariableTest2 {
	// 1. ��� ����
	// 2. �����ڸ޼���
	// 3. �Ϲݸ޼���
	// 4. innerclass
	// 5. static block

	public static void main(String[] args) {
		// �������� => �ݵ�� �ʱ�ȭ�ϰ� ����Ѵ�.
		int a = 100;
		{
			int b = 200;
			System.out.println(a + b);
		}
		// System.out.println(a+b); //b���Ұ�
		// 1.boolean
		// 2.����,�Ǽ� : byte(1)->short(2)->int(4)->long(8)->float(4)->double(8)

		// ����ȯ
		// 1.�ڵ�����ȯ
		// ū��= ������
		int su = 100;
		long value;
		value = su;
		System.out.println(value);

		char ch = 'A'; // 65 (0100 0001)
		char ch2 = 0x41; // 0x(16����) 0(8����)
		int value2;
		value2 = ch;
		System.out.println(value2);

		// 2.��������ȯ ...... ���սǰ��ɼ�
		// ������ = (������Ÿ��) ū��
		byte aa;
		int bb = 128;
		aa = (byte) bb;
		System.out.println(aa);

		char cc;
		int dd = 97;
		cc = (char) dd;
		System.out.println(cc);

		int score1 = 100;
		double score2 = 200;
		score2 = score1 + score2;
		System.out.println(score2);
		System.out.println((int) score2);

		short score3 = 100;
		short score4 = 200;
		score4 = (short) (score3 + score4 + 300);
		System.out.println(score4);

		
		
		char ch3 = 'A';
		// ch3 = ch3+3; // ������ ����, ���ͷ� �⺻�� int, ����ȯ(ĳ����) �ʿ���
		ch3 = (char) (ch3 + 3);
		//ch3 += 3; // �� ��쿡�� ��������ȯ ���ص� �����Ͽ��� �ȳ� why?
		System.out.println(ch3);

		
		
		String str = "�ڹ�!";
		// ch3 = (char) str; // String�� �⺻���� �ƴϿ��� ĳ������ �ȵȴ�
		ch3 = str.charAt(0);
		System.out.println(ch3);

		char ch4 = ' ';
		System.out.println(ch4);
		System.out.println((int) ch4);

		byte by10 = 10;
		byte by11 = 11;
		byte by12 = (byte) (by10 + by11);

		int a1 = 10;
		int a2 = 10;
		int a3 = 10;
		int a4 = 10, a5 = 10, a6 = 10;
		int a7, a8, a9;
		a7 = a8 = a9 = 10;
	}
}
