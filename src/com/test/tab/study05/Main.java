package com.test.tab.study05;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//A+B - 5
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextInt()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A+B);
		}
		scan.close();
		//별 찍기 - 2
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		for(int j = 0; j < num; j++) {
//			for(int i = num; i > j+1; i--)
//				System.out.print(" ");
//			for(int k = 0; k < j+1; k++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		
		//A+B - 8
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int A, B;
//		
//		for(int i = 0; i < num; i++) {
//			A = scan.nextInt();
//			B = scan.nextInt();
//			System.out.printf("Case #%d: %d + %d = %d\n", i+1, A, B, A+B);
//		}
		
		//A+B - 7
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int A, B;
//		
//		for(int i = 0; i < num; i++) {
//			A = scan.nextInt();
//			B = scan.nextInt();
//			System.out.printf("Case #%d: %d\n", i+1, A+B);
//		}
		
		//빠른 A+B
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//BufferedReader를 사용하여 표준 입력 (System.in)에서 데이터를 읽어옵니다.
//		//InputStreamReader를 사용하여 바이트 스트림을 문자 스트림으로 변환합니다.
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		//BufferedWriter를 사용하여 표준 출력 (System.out)으로 데이터를 쓰기 위한 버퍼를 생성합니다.
//		//OutputStreamWriter를 사용하여 문자 스트림을 바이트 스트림으로 변환합니다.
//		int N = Integer.parseInt(br.readLine());
//	    //첫 번째 줄에서 입력받은 문자열을 정수로 변환하여 변수 N에 저장합니다.
//	    //br.readLine()은 한 줄을 읽어옵니다.
//		StringTokenizer st;
//		//문자열을 공백 또는 다른 구분자로 나누기 위한 StringTokenizer 객체를 선언합니다.
//		for (int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine()," ");
//			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
//		}
//	    //N번 반복하는 루프를 시작합니다.
//	    //각 반복에서 한 줄을 읽어 StringTokenizer를 사용하여 공백으로 나눕니다.
//	    //나뉜 문자열을 정수로 변환하여 두 숫자를 더한 결과를 BufferedWriter에 씁니다. 마지막에 줄 바꿈 문자("\n")를 추가합니다.
//		br.close();
//		bw.flush();
//		bw.close();
		
		//체육과목
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int num = N / 4;
//		for(int i=0; i < num; i++) 
//			System.out.print("long ");
//		System.out.println("int");
		
		//영수증
//		Scanner scan = new Scanner(System.in);
//		int X = 0;
//		int N = 0;
//		int a = 0;
//		int b = 0;
//		int price = 0;
//		X = scan.nextInt();
//		N = scan.nextInt();
//		for(int i=0; i<N; i++) {
//			a = scan.nextInt();
//			b = scan.nextInt();
//			price += a * b;
//		}
//		if(price == X)
//			System.out.println("Yes");
//		else
//			System.out.println("No");
		
		//합
//		Scanner scan = new Scanner(System.in);
//		int nNum = scan.nextInt();
//		int total = 0;
//		
//		for(int i=0;i<nNum;i++) {
//			total += i+1;
//		}
//		System.out.println(total);
	}
}
