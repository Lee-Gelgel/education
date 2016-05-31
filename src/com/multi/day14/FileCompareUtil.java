package com.multi.day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {
	ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception{
		//FileReader fstFR = new FileReader(fstFileName);
		//BufferedReader fstBR = new BufferedReader(fstFR);
		// FileReader scdFR = new FileReader(scdFileName);
		// BufferedReader scdBR = new BufferedReader(scdFR);
		BufferedReader fstBR = new BufferedReader(new FileReader(fstFileName));
		BufferedReader scdBR = new BufferedReader(new FileReader(scdFileName));
		ArrayList<String> result = new ArrayList<>();
		String fst;
		String scd;
		int index=0;
		while((fst=fstBR.readLine())!=null && (scd=scdBR.readLine())!=null){
			index++;
			if(!fst.equals(scd)){
				result.add("LINE "+index+":"+scd);
			}
		}
		
		if(scdBR!=null) scdBR.close();
		if(fstBR!=null) fstBR.close();
		//if(scdFR!=null) scdFR.close();
		//if(fstFR!=null) fstFR.close();
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		FileCompareUtil fileCompareUtil = new FileCompareUtil();
		ArrayList<String> result = fileCompareUtil.compareFile("src/com/multi/day14/fstFineName.txt", "src/com/multi/day14/scdFineName.txt");
		for(String str : result){
			System.out.println(str);
		}
	}
}
