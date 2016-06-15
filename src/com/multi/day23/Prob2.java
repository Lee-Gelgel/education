package com.multi.day23;

public class Prob2 {
	public static void main(String[] args) {
		int[] rottoNums = rottoGenerator();
		System.out.println("<< ������ ROTTO ��ȣ >>");
		for (int i = 0; i < rottoNums.length; i++) {
			System.out.println(rottoNums[i]);
		}
	}
	
	

	private static int[] rottoGenerator() {
		
		// �����ϼ���.	
		// 1~45���� 6�� �ߺ�������
				int[] num = new int[6];
				int cnt = num.length;
				aa: for (int i = 0; i < cnt; i++) {
					if (i == 0) {
						num[i] = (int) (Math.random() * 45 + 1);
					} else {
						int number = (int) (Math.random() * 45 + 1);
						// �ߺ���
						for (int j = 0; j < i; j++) {
							// �ߺ��϶�
							if (number == num[j]) {
								--i;
								continue aa;
							} else {
								// �ߺ��ƴҶ�
								num[i] = number;
							}
						}
					}
				}
				// ��������(��������)
				int temp;
				for (int j = 0; j < cnt - 1; j++) {
					for (int i = 0; i < cnt - 1; i++) {
						if (num[i] > num[i + 1]) {
							temp = num[i + 1];
							num[i + 1] = num[i];
							num[i] = temp;
							temp = 0;
						}
					}
				}
		
		return num;
	}
}


//<< �������� >>
//���ķ����� ������ �� java.util.Arrays Ŭ������ sort() �޽�带 ������� ���� �����ϰ� ���� �˰����� �����ؾ� �Ѵ�. 
//
//
//<< ���ǻ��� >>
//1. �����Ǵ� prob2 ��Ű���� Prob2.java main() �޽��� �������� �ʰ� �����Ѵ�.
//2. �������� �����Ǵ� rottoGenerator() �޽�� �ñ״��Ĵ� ���� �����ؼ��� �ȵȴ�. 
//3. ������ ���� ������ Prob2.java �����̴�.
