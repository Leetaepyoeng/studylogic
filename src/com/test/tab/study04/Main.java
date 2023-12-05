package com.test.tab.study04;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//주사위 세개
		int[] nNum = new int[3];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
			nNum[i] = scan.nextInt();
		int nLotNum = nNum[0];
		
		if(nNum[0] == nNum[1] && nNum[0] == nNum[2]) {
			System.out.println(10000 + (nNum[1] * 1000));
		}
		else if (nNum[0] == nNum[1] || nNum[0] == nNum[2] || nNum[1] == nNum[2]) {
			if(nNum[0] == nNum[1])	nLotNum = nNum[0];
			else if(nNum[0] == nNum[2]) nLotNum = nNum[0];
			else nLotNum = nNum[1];
			System.out.println(1000 + (nLotNum * 100));
		}
		else {
			if(nLotNum < nNum[1]) nLotNum =  nNum[1];
			if(nLotNum < nNum[2]) nLotNum =  nNum[2];
			System.out.println(nLotNum * 100);
		}
		
		//오븐 시계
//		Scanner scan = new Scanner(System.in);
//		int plusHour = 0;
//		int nH = scan.nextInt();
//		int nM = scan.nextInt();
//		int time = scan.nextInt();
//
//		if (nM + time < 60) {
//			nM += time;
//			System.out.println(nH + " " + nM);
//		} else {
//			plusHour = (nM + time) / 60;
//			nM = (nM + time) % 60;
//			nH += plusHour;
//			nH = nH % 24;
//			System.out.println(nH + " " + nM);
//		}
		
		// 알람 시계
//		Scanner scan = new Scanner(System.in);
//		int nHour = scan.nextInt();
//		int nMin = scan.nextInt();
//		scan.close();
//		
//		if (nMin > 45)
//			System.out.println(nHour + " " + (nMin - 45));
//		else {
//			nHour--;
//			nMin = 60 - Math.abs(45 - nMin);
//			if (nHour < 0)
//				nHour = 23;
//				
//			System.out.println(nHour + " " + nMin);
//		}

		//1번 크기연산
//		Scanner scan = new Scanner(System.in);
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		if(A > B) System.out.println(">");
//		else if(A < B) System.out.println("<");
//		else if(A == B) System.out.println("==");
		
		//2번 성적
//		Scanner scan = new Scanner(System.in);
//		int nNum = scan.nextInt();
//		
//		if(90 <= nNum && nNum <= 100)
//			System.out.println("A");
//		else if(80 <= nNum && nNum <= 89)
//			System.out.println("B");
//		else if(70 <= nNum && nNum <= 79)
//			System.out.println("C");
//		else if(60 <= nNum && nNum <= 69)
//			System.out.println("D");
//		else
//			System.out.println("F");
		
		//3번 윤년
//		Scanner scan = new Scanner(System.in);
//		int nNum = scan.nextInt();
//		String result = (nNum % 4 != 0 || (nNum % 400 != 0 && nNum % 100 == 0)) ? "0" : "1";
//		System.out.println(result);
		
		//4번 사분면 고르기
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		if(x > 0) {
//			if(y > 0) System.out.println(1);
//			else System.out.print(4);
//		}else {
//			if(y > 0) System.out.println(2);
//			else System.out.println(3);
//		}
		
		
	}
}
