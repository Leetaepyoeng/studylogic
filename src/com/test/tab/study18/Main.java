package com.test.tab.study18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//더하기 사이클
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		int dstNum = Integer.parseInt(strNum);
		int selNum = dstNum;
		int cnt = 0;
		while(true) {
			int num1 = selNum / 10;
			int num2 = selNum % 10;
			selNum = (num2*10)+((num1+num2)%10);
			cnt++;
			if(selNum == dstNum) break;
		}
		System.out.println(cnt);
	}
}
