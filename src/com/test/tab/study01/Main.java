package com.test.tab.study01;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strNum = str.split(" ");
		int[] nNum = new int[strNum.length];
		
		for(int i = 0; i < strNum.length; i++) {
			nNum[i] = Integer.parseInt(strNum[i]);
		}
		
		int A = nNum[0];
		int B = nNum[1];
		int C = nNum[2];
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}
