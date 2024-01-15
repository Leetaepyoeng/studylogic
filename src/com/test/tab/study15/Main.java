package com.test.tab.study15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int skCnt = Integer.parseInt(br.readLine());
		int[] sgNum = new int[skCnt];
		String[] strSkNum = br.readLine().split(" ");
		
		for(int i = 0; i < strSkNum.length; i++)
			sgNum[i] = Integer.parseInt(strSkNum[i]);
		
		int ranCnt = Integer.parseInt(br.readLine());
		int[] ranNum = new int[ranCnt];
		boolean[] isMatch = new boolean[ranCnt];
		String[] strRanNum = br.readLine().split(" ");
		
		for(int i = 0; i < strRanNum.length; i++)
			ranNum[i] = Integer.parseInt(strRanNum[i]);
		
		for(int i = 0; i < ranNum.length; i++) {
			for(int j = 0; j < sgNum.length; i++) {
				if(ranNum[i] == sgNum[j])
					isMatch[i] = true;
			}
			System.out.printf("%b ", isMatch[i]);
		}
	}
}
