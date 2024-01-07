package com.test.tab.study13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 설탕 배달
		// 일단 10(5 두봉지)으로 나누면
		// 경우의 수는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		// 0이면 문제없음,
		// 1이면 몫이 1 이상일때 1개를 가져와서 3 2봉지로
		// 2이면 몫이 2 이상일때 2개를 가져와서 3 4봉지로
		// 3이면 문제없음, 3*1
		// 4이면 몫이 1 이상일때 1개를 가져와서 3 3봉지로
		// 5이면 문제없음, 5*1
		// 6이면 문제없음, 3*2
		// 7이면 몫이 1 이상일때 1개를 가져와서 3 4봉지로
		// 8이면 문제없음, 5*1 / 3*1
		// 9이면 문제없음, 3*3
		Scanner scan = new Scanner(System.in);
		int nNum = scan.nextInt();
		int fVal = 0;
		int thVal = 0;
		
		fVal = nNum / 5;
		int remainNum = nNum % 5;
		if(remainNum==1 ||  remainNum==4 || remainNum==7) {
			if(fVal >= 1) {
				fVal--;
				remainNum+=5;
				thVal = remainNum / 3;
			} else {
				System.out.println("-1");
				System.exit(0);
			}
		} else if(remainNum==3 || remainNum==6 ||remainNum==9) {
			thVal = remainNum / 3;
		} else if(remainNum==0 || remainNum==5) {
			int exNum = remainNum / 5;
			fVal += exNum;
		} else if(remainNum==2) {
			if(fVal >= 2) {
				fVal -= 2;
				remainNum += 10;
				thVal = remainNum / 3;
			}else {
				System.out.println("-1");
				System.exit(0);
			}
		} else {
			fVal++;
			thVal++;
		}
		System.out.println(fVal+thVal);
		
		
		//영화감독 숌
//		Scanner scan = new Scanner(System.in);
//		int dstNum = scan.nextInt();
//		int verNum = 0;
//		int num = 0;
//		int fstNum = 666;
//		while(true) {
//			String str = Integer.toString(fstNum);
//			for(int i = 0; i < str.length() - 2; i++) {
//				if(str.charAt(i) == '6' && str.charAt(i+1) == '6' && str.charAt(i+2) == '6') {
//					num++;
//					break;
//				}
//			}
//			if(num == dstNum) {
//				verNum = fstNum;
//				break;
//			}
//			fstNum++;
//		}
//		System.out.println(fstNum);
		
		
		//체스판 다시 칠하기
//		Scanner scan = new Scanner(System.in);
//		int fixCnt = 100;
//		int height = scan.nextInt();
//		int width = scan.nextInt();
//		String[] board = new String[height];
//		// 일단 바둑판 가져오기
//		scan.nextLine();//이유는 모르겠으나 하나 버려야함
//		for (int i = 0; i < height; i++)
//			board[i] = scan.nextLine();
//		
//		for(int y  = 0; y < height - 7; y++) {
//			for(int x = 0; x < width - 7; x++) {
//				int fstCnt = 0;
//				int secCnt = 0;
//				char sttW = 'W';
//				char sttB = 'B';
//				for(int j = 0; j < 8; j++) {
//					for(int i = 0; i < 8; i++) {
//						if(board[y+j].charAt(x+i) != sttW) 
//							fstCnt++;
//						sttW = (sttW == 'W') ? 'B' : 'W';
//						if(board[y+j].charAt(x+i) != sttB)
//							secCnt++;
//						sttB = (sttB == 'B') ? 'W' : 'B';
//					}
//					sttW = (sttW == 'W') ? 'B' : 'W';
//					sttB = (sttB == 'B') ? 'W' : 'B';
//				}
//				
//				if(fstCnt <= secCnt) {
//					if(fstCnt <= fixCnt )
//						fixCnt = fstCnt;
//				} else {
//					if(secCnt <= fixCnt )
//						fixCnt = secCnt;
//				}
//			}
//		}
//		System.out.println(fixCnt);

		
		
		//수학은 비대면강의입니다
//		Scanner scan = new Scanner(System.in);
//		int a, b, c, d, e, f, x, y;
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		d = scan.nextInt();
//		e = scan.nextInt();
//		f = scan.nextInt();
//		
//		for(int i = -999; i <= 999; i++) {
//			for(int j = -999; j <= 999; j++) {
//				x = i;
//				y = j;
//				if((a*x)+(b*y) == c && (d*x) + (e*y) == f) {
//					System.out.printf("%d %d", x, y);
//					System.exit(0);
//				}
//			}
//		}
		
		
		//분해합
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int val = 0;
//		for(int i = 0; i < num; i++) {
//			int number = i;
//			int sum = 0;
//			while(number != 0)//각 자리수 더하기
//			{
//				sum += number%10;
//				number /= 10;
//			}
//			
//			if(i + sum == num) {
//				val = i;
//				break;
//			}
//		}
//		System.out.println(val);
		
		
		
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
