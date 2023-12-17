package com.test.tab.study11;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//소인수분해
		//1 이상의 정수를 입력받아서 소인수분해를 한다. 작은 수부터 오름차순 한줄씩
		//현재 넘버까지 나눠보고 중간에 나머지가 0이 되면 출력, 몫 값을 다시 저장하고 반복
		Scanner scan = new Scanner(System.in);
		int nNum = scan.nextInt();
		
		for (int i = 2; i <= Math.sqrt(nNum); i++)
			while (nNum % i == 0) {
				System.out.println(i);
				nNum /= i;
			}
		
		if(nNum != 1)
			System.out.println(nNum);


		
		//소수
//		Scanner scan = new Scanner(System.in);
//		int sttNum = scan.nextInt();
//		int endNum = scan.nextInt();
//		int firstMinNum = 0;
//		int totalNum = 0;
//		boolean hasFirstMinNum = false;
//		for(int i = sttNum; i <= endNum; i++) {
//			int matchCnt = 0;
//			if(i <= 1) continue;
//			for(int j = 1; j <= i; j++) {
//				if(i % j == 0) {
//					matchCnt++;
//				}
//			}
//			if(matchCnt < 3) {
//				totalNum += i;
//				if(hasFirstMinNum == false) {
//					firstMinNum = i;
//					hasFirstMinNum = true;
//				}
//			}
//		}
//		if (hasFirstMinNum == false)
//			System.out.println("-1");
//		else {
//			System.out.println(totalNum);
//			System.out.println(firstMinNum);
//		}
		
		
		//소수 찾기
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int nNum[] = new int[cnt];
//		int mnCnt = 0;
//		int mnTotalCnt = 0;
//		for(int i = 0; i < cnt; i++) { 
//			nNum[i] = scan.nextInt();
//			if(nNum[i] == 1) continue;
//			for(int j = 2; j <= nNum[i]; j++)
//				if(nNum[i] % j == 0) 
//					mnCnt++;
//			if(mnCnt < 2) mnTotalCnt++;
//			mnCnt = 0;
//		}
//		System.out.println(mnTotalCnt);
		
		
		//약수들의 합
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			int nNum = scan.nextInt();
//			if(nNum == -1) break;
//			int divisorTotal = 1;
//			String str = String.format("%d = 1", nNum);
//			for (int i = 2; i < nNum; i++)
//				if (nNum % i == 0) {
//					str += String.format(" + %d", i);
//					divisorTotal += i;
//				}
//			if (divisorTotal == nNum)
//				System.out.println(str);
//			else
//				System.out.printf("%d is NOT perfect.\n", nNum);
//		}
		
		
		//약수 구하기
//		Scanner scan = new Scanner(System.in);
//		int nNum1 = scan.nextInt();
//		int nNum2 = scan.nextInt();
//		int cnt = 0;
//		int val = 0;
//		for(int i = 1; i <= nNum1; i++)
//			if(nNum1 % i == 0) {
//				cnt++;
//				if(cnt == nNum2) {
//					val = i;
//					break;
//				}
//			}
//		System.out.println(val);
		
		
		//배수와 약수
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			if (A == 0 && B == 0)
//				break;
//			if (B % A == 0)
//				System.out.println("factor");
//			else if (A % B == 0)
//				System.out.println("multiple");
//			else
//				System.out.println("neither");
//		}
	}
}
