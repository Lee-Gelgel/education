package com.multi.day02;
//����3. ������ ���ڸ� �Է¹޾� �Ʒ��� ���� ���� ����� ��Ÿ���� ���α׷��� �ۼ��Ͻʽÿ�. 
//���� n�� ���丮��(factorial)�� 1���� n������ ��� ������ ���� ������ n!�� ǥ���մϴ�.
//�� 2���� �۰ų� 9���� ū ������ �Էµ� ��쿡�� ���߸��� ���ڰ� �ԷµǾ����ϴ�.����� ��� �޽����� ����ϰ� 
//���α׷��� �����մϴ�.

public class FactorialTest {
	public static void main(String[] args) {
		int num= 5;
		int result = 1;
		for(int i=num;i>=1;i--){
			result *=i;
		}
		System.out.println(result);
	}
}
