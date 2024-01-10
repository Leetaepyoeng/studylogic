package com.test.tab.study14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//수 정렬하기 2
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//StringBuilder:가변(mutable)한 문자열을 처리하기 위한 클래스, 새로운 문자열을 추가하거나 변경하게 되면 “기존의 객체”로 추가 및 변경.
		int cnt = scan.nextInt();
		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();//리스트에 대해서 좀 더 알아보기
		for(int i =0; i < cnt; i++) 
			list.add(scan.nextInt());
		Collections.sort(list);//객체의 모음, 그룹
		for(int value : list) 
			sb.append(value).append('\n');
		System.out.println(sb);
		
		
		//커트라인
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int priceCnt = scan.nextInt();
//		int[] num = new int[cnt];
//		for(int i =0; i < cnt; i++) 
//			num[i] = scan.nextInt();
//		Arrays.sort(num);
//		System.out.println(num[cnt-priceCnt]);
		
		
		//대표값2
//		Scanner scan = new Scanner(System.in);
//		int cnt = 5;
//		int sum = 0;
//		int avg = 0;
//		int[] num = new int[cnt];
//		for(int i = 0; i < cnt; i++) { 
//			num[i] = scan.nextInt();
//			sum += num[i];
//		}
//		avg = sum / cnt;
//		Arrays.sort(num);
//		System.out.println(avg);
//		System.out.println(num[2]);
		
		
		//수 정렬하기
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int[] num = new int[cnt];
//		for(int i =0; i < cnt; i++)
//			num[i] = scan.nextInt();
//		Arrays.sort(num);
//		for(int i = 0; i< cnt; i++)
//			System.out.println(num[i]);
	}
}
