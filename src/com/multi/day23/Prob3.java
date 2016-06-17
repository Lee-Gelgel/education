package com.multi.day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Prob3 {
	public static void main(String[] args) throws Exception {
		// 입출력 collection
		Vector prodList = makeCollection("./src/com/multi/day23/input.txt");
		Vector searchList = searchProduct(prodList, 800000);
		System.out.println("<< 검색된 상품 목록 >>");
		for (int i = 0; i < searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
	}

	// String dataFile : 데이터가 저장되어있는 파일 이름
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

	// Vector prodList : Product 객체 여러 개가 저장된 Vector 객체
	// int price : 검색할 가격 정보

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
