package com.test.tab.study09;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//색종이
		Scanner scan = new Scanner(System.in);
		int numOfPaper = 0;
		int x = 0;
		int y = 0;
		int cnt = 0;
		int nWidth = 101;
		int nHeight = 101;
		boolean[][] arr = new boolean[nHeight][nWidth];
		numOfPaper = scan.nextInt();
		for(int num = 0; num < numOfPaper; num++) {
			x = scan.nextInt();
			y = scan.nextInt();
			int xx = x + 10;
			int yy = y + 10;
			for(int j = y; j < yy; j++)
				for(int i = x; i < xx; i++)
					arr[j][i] = true;
		}
		for(int j = 0; j < nHeight; j++)
			for(int i = 0; i < nWidth; i++)
				if(arr[j][i] == true) cnt++;
		System.out.printf("%d", cnt);
		
		//세로읽기
//		Scanner scan = new Scanner(System.in);
//		
//		int cntLine = 0;
//		int nWidth = 15;
//		int nHeight = 5;
//		String[] str = new String[nHeight];
//		for(int i = 0; i < nHeight; i++) {
//			str[cntLine] = scan.nextLine();
//			cntLine++;
//		}
//		for(int i = 0; i < nWidth; i++)
//			for(int j = 0; j < cntLine; j++)
//			{
//				if( i >= str[j].length())
//					continue;
//				System.out.printf("%c", str[j].charAt(i));
//			}
		
		
		//최대값
//		Scanner scan = new Scanner(System.in);
//		int nWidth = 9;
//		int nHeight = 9;
//		int maxNum = 0;
//		int maxNumX = 0;
//		int maxNumY = 0;
//		int arr[][] = new int[nHeight][nWidth];
//		for(int j = 0; j < nHeight; j++) {
//			for(int i = 0; i < nWidth; i++) {
//				arr[j][i] = scan.nextInt();
//				if(maxNum <= arr[j][i]) {
//					maxNum = arr[j][i];
//					maxNumX = i + 1;
//					maxNumY = j + 1;
//				}
//			}
//		}
//		System.out.printf("%d\n%d %d", maxNum, maxNumY, maxNumX);
		
		
		//행렬 덧셈
//		Scanner scan = new Scanner(System.in);
//		int nWidth = scan.nextInt();
//		int nHeight = scan.nextInt();
//		int[][] arr1 = new int[nHeight][nWidth];
//		int[][] arr2 = new int[nHeight][nWidth];
//		
//		for(int j = 0; j < nHeight; j++) 
//			for(int i = 0; i < nWidth; i++) 
//				arr1[j][i] = scan.nextInt();
//		
//		for(int j = 0; j < nHeight; j++) 
//			for(int i = 0; i < nWidth; i++) {
//				arr2[j][i] = scan.nextInt();
//				arr2[j][i] += arr1[j][i];
//			}
//		
//		for(int j = 0; j < nHeight; j++) {
//			for(int i = 0; i < nWidth; i++) {
//				System.out.printf("%d", arr2[j][i]);
//				if(i != nWidth - 1)
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
	}
}
