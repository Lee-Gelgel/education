package com.multi.test.prob5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SQLSearcher {
	public static void main(String[] args) throws IOException {
		String fileName = "src/com/multi/test/prob5/sqlMaps.txt";
		Map<String, String> sqlMap = makeSqlMap(fileName);
		String sql = getSQL(sqlMap, "getBoardList");
		System.out.println("검색된 SQL 문자열 : " + sql);
	}

	private static Map<String, String> makeSqlMap(String fileName) throws IOException {
		// 구현하시오.
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String data;
		Map<String, String> map = new HashMap<String, String>();
		while ((data = br.readLine()) != null) {
			String[] dataSplit = data.split("=", 2);
			map.put(dataSplit[0], dataSplit[1]);
//			String[] dataSplit = data.split("=");
//			String key = dataSplit[0];
//			String value = "";
//			for (int i = 1; i < dataSplit.length; i++) {
//
//				if (i > 1) {
//					value += "=" + dataSplit[i];
//				} else {
//					value += dataSplit[i];
//				}
//			}
//			map.put(key, value);
		}
		br.close();
		return map;
	}

	private static String getSQL(Map<String, String> sqlMap, String key) {
		// 구현하시오.
		String result = sqlMap.get(key);
		return result;
	}
}
