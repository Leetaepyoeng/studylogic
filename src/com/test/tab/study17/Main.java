package com.test.tab.study17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		//기상청 인턴 신현수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		int sumCnt = Integer.parseInt(st.nextToken());
		int[] arrNum = new int[cnt];
		int maxNum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < cnt; i++)
			arrNum[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < cnt-sumCnt; i++) {
			int num = 0;
			for(int j = i; j < i+sumCnt; j++) {
				num += arrNum[j];
			}
			if(num > maxNum)
				maxNum = num;
		}
		
		if(cnt == sumCnt) {
			for(int i = 0; i < cnt; i++)
				maxNum+=arrNum[i];
		}
		
		System.out.println(maxNum);
	}
}
