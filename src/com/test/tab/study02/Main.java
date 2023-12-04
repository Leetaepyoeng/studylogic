package com.test.tab.study02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] srcNum = new int[3];
		Scanner scan = new Scanner(System.in);
		int nNum = scan.nextInt();
		String strNum = scan.next();
		
		for(int i = 2; i >= 0; i--) {
			srcNum[i] = strNum.charAt(i) - 48;
			System.out.println(nNum * srcNum[i]);
		}
		System.out.println(nNum * (Integer.parseInt(strNum)));
	}
}
