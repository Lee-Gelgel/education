package com.multi.day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Prob3 {
	public static void main(String[] args) throws Exception {
		// ����� collection
		Vector prodList = makeCollection("./src/com/multi/day23/input.txt");
		Vector searchList = searchProduct(prodList, 800000);
		System.out.println("<< �˻��� ��ǰ ��� >>");
		for (int i = 0; i < searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
	}

	// String dataFile : �����Ͱ� ����Ǿ��ִ� ���� �̸�
	private static Vector makeCollection(String dataFile) throws Exception {
		Vector<Product> vector = new Vector<>();
		String data;
		BufferedReader br = new BufferedReader(new FileReader(dataFile));
		while ((data = br.readLine()) != null) {
//			String[] dataSplit = data.split(" [*] ");
//			System.out.println("|"+dataSplit[3]+"|");
//			vector.add(new Product(dataSplit[0].trim(), dataSplit[1].trim(), dataSplit[2].trim(),Integer.parseInt(dataSplit[3].trim()), Integer.parseInt(dataSplit[4].trim())));
			StringTokenizer st = new StringTokenizer(data," [*] ");
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
		}
		br.close();
		return vector;
	}

	// Vector prodList : Product ��ü ���� ���� ����� Vector ��ü
	// int price : �˻��� ���� ����

	private static Vector searchProduct(Vector prodList, int price) {
		Vector<Product> result = new Vector<>();
		Product p = null;
		for (int i = 0; i < prodList.size(); i++) {
			p = (Product) prodList.get(i);
			if (p.getPrice() >= price) {
				result.add(p);
			}
		}
		return result;
	}
}
