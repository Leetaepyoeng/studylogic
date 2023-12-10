package com.test.tab.study07;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//그대로 출력하기
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		
		//다이얼
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		int time = 0;
//		for(int i = 0; i < str.length(); i++)
//		{
//			switch(str.charAt(i)) {
//			case 'A': 
//			case 'B': 
//			case 'C':
//				time += 3;
//				break;
//			case 'D':
//			case 'E':
//			case 'F':
//				time += 4;
//				break;
//			case 'G':
//			case 'H':
//			case 'I':
//				time += 5;
//				break;
//			case 'J':
//			case 'K':
//			case 'L':
//				time += 6;
//				break;
//			case 'M':
//			case 'N':
//			case 'O':
//				time += 7;
//				break;
//			case 'P':
//			case 'Q':
//			case 'R':
//			case 'S':
//				time += 8;
//				break;
//			case 'T':
//			case 'U':
//			case 'V':
//				time += 9;
//				break;
//			case 'W':
//			case 'X':
//			case 'Y':
//			case 'Z':
//				time += 10;
//				break;
//			case '1':
//				time += 2;
//				break;
//			default:
//				time += 11;
//			}
//		}
//		System.out.println(time);
		
		
		//상수
//		Scanner scan = new Scanner(System.in);
//		String str1 = scan.next();
//		String str2 = scan.next();
//		int nNum1 = Integer.parseInt(new StringBuilder(str1).reverse().toString());
//		int nNum2 = Integer.parseInt(new StringBuilder(str2).reverse().toString());
//		System.out.println(nNum1 > nNum2 ? nNum1: nNum2);
		
		//단어의 개수
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		StringTokenizer st = new StringTokenizer(str, " ");
//		System.out.println(st.countTokens());
		
		//문자열 반복
//		Scanner scan = new Scanner(System.in);
//		int inputNum = scan.nextInt();
//		int[] repetNum = new int[inputNum];
//		String[] str = new String[inputNum];
//		
//		for(int i = 0; i < inputNum; i++) {
//			repetNum[i] = scan.nextInt();
//			str[i] = scan.next();
//		}
//		for (int i = 0; i < inputNum; i++) {
//			for (int k = 0; k < str[i].length(); k++) {
//				for (int j = 0; j < repetNum[i]; j++)
//					System.out.printf("%s", str[i].charAt(k));
//			}
//			System.out.println();
//		}
		
		
		//알파벳 찾기
//		int numOfAlpbt = 26;
//		int[] alpbt = new int [numOfAlpbt];
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		for(int i = 0; i < numOfAlpbt; i++) 
//			alpbt[i] = str.indexOf('a'+i);
//		for(int i = 0; i < numOfAlpbt; i++) 
//			System.out.printf("%d ", alpbt[i]);
		
		//숫자의 합
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int[] arr = new int[cnt];
//		int total = 0;
//		String str = scan.next();
//		for(int i =0; i < cnt; i++) {
//			arr[i] = Integer.parseInt(str.substring(i,i+1));
//			total += arr[i];
//		}
//		System.out.println(total);
		
		
		//아스키 코드
//		Scanner scan = new Scanner(System.in);
//		int num = scan.next().charAt(0);
//		System.out.println(num);
		
		
		//문자열
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		String str = null;
//		int len = 0;
//		char[] stt = new char[cnt];
//		char[] end = new char[cnt];
//		for (int i = 0; i < cnt; i++) {
//			str = scan.next();
//			len = str.length();
//			stt[i] = str.charAt(0);
//			end[i] = str.charAt(len - 1);
//		}
//		for(int i = 0; i < cnt; i++)
//			System.out.printf("%c%c\n", stt[i], end[i]);
		
		
		//문자와 문자열
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		int idx = scan.nextInt() - 1;
//		System.out.println(str.charAt(idx));
	}
}
