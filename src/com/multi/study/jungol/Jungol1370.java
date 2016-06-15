package com.multi.study.jungol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//ȸ�ǽ��� �ϳ� �ִ�. ���� ȸ�ǵ��� ���۽ð��� ����ð��� ����Ǿ� ������, �ð��밡 ��ġ�� ȸ�Ǵ� ���ÿ� ���ְ� �Ұ����ϴ�. 
//���� ���� �ð��뿡 ���ϴ� ȸ�ǵ� �� �ϳ��� �����ϰ� ������ ȸ�ǵ��� �������Ѵ�. 
//
//��, ����ð��� ���۽ð��� ���� ��쿡�� �ð��� ��ģ�ٰ� ������ �ʴ´�. ȸ���� ���� N�� �� ȸ���� ���۽ð�, 
//����ð��� �־����� �� �ǵ��� ���� ȸ�Ǹ� �����ϰ��� �Ѵ�.ȸ�Ǹ� �ִ��� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 
//ù�ٿ��� ȸ���� �� N(5��N��500), ��° �ٺ��� i-1�� ȸ���� ��ȣ�� ���۽ð��� ����ð��� ���ʷ� �־�����. (500 ������ ����)
//
//
//ù�ٿ��� ���� ������ �ִ��� ȸ�Ǽ��� ����ϰ� ���� �ٺ��ʹ� ������ ȸ���� ��ȣ�� �ð�������� ����Ѵ�. ����, 
//���� ���� ����(�ִ�ȸ�Ǽ��� �� �� �ִ� ���� ����� ��������)��� �� �� �ƹ��ų� �ϳ� ����Ѵ�.
//
//[�Է�]
//6
//1 1 10
//2 5 6
//3 13 15
//4 14 17
//5 8 14
//6 3 12
//[���]
//3
//2 5 4

public class Jungol1370 {

	static String meetingCnt; // ���� ������ ȸ�� ��
	static String[] meetingSchedule; // ������ ȸ���� ��ȣ �迭
	static int[][] meetingReservation; // ����� ȸ���� �迭;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/study/jungol/Jungol1370.txt"));
		Scanner sc = new Scanner(System.in);

		// ����� ȸ�� ��
		int meetingReservationCnt = Integer.parseInt(sc.nextLine());
		// ����� ȸ���� �迭�� ����
		meetingReservation = new int[meetingReservationCnt][3];
		while (sc.hasNext()) {

			// ����� ȸ���� �迭 �Է�
			for (int i = 0; i < meetingReservation.length; i++) {
				// ����� ȸ�� �� �׸��� ����(ȸ�ǹ�ȣ, ���۽ð�, ����ð�)
				String[] str = sc.nextLine().split(" ");
				for (int j = 0; j < meetingReservation[i].length; j++) {
					// ����� ȸ���� �迭�� �Է�
					meetingReservation[i][j] = Integer.parseInt(str[j]);
				}
			}

			// ����� ȸ���� �迭 ���
			for (int i = 0; i < meetingReservation.length; i++) {
				for (int j = 0; j < meetingReservation[i].length; j++) {
					System.out.print(meetingReservation[i][j] + " ");
				}
				System.out.println();
			}

		}

	}
}
