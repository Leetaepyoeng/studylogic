package com.test.tab.study13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//분해합
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int val = 0;
		for(int i = 0; i < num; i++) {
			int number = i;
			int sum = 0;
			while(number != 0)//각 자리수 더하기
			{
				sum += number%10;
				number /= 10;
			}
			
			if(i + sum == num) {
				val = i;
				break;
			}
		}
		System.out.println(val);
		
		
		
		//블랙잭
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int dstNum = scan.nextInt();
//		int sumNum = 0;
//		int[] arrNum = new int[cnt];
//		//값을 먼저 받고
//		for(int i = 0; i < cnt; i++) {
//			arrNum[i] = scan.nextInt();
//		}
//		//Arrays.sort(arrNum);//오름차순 정렬
//		for(int i = 0; i < cnt - 2; i++)
//			for(int j = i+1; j < cnt - 1; j++)
//				for(int k = j + 1; k < cnt; k++) {
//					int sum = arrNum[i] + arrNum[j] + arrNum[k];
//					if(Math.abs(dstNum - sum) <= Math.abs(dstNum - sumNum) && sum <= dstNum) {
//						sumNum = arrNum[i] + arrNum[j] + arrNum[k];
//					}
//				}
//		System.out.println(sumNum);
	}
}
