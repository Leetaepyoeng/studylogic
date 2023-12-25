package com.test.tab.study12;


import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		//세 막대
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++)
			num[i] = scan.nextInt();
		int maxNum = num[0];
        int maxIndex = 0;
        int sum = 0;
        //최대값과 인덱스 구하기
        for (int i = 1; i < num.length; i++)
            if (num[i] > maxNum) {
                maxNum = num[i];
                maxIndex = i;
            }
        //최대값 줄여가면서 삼각형 조건 검색
        sum = Arrays.stream(num).sum() - maxNum;
        if(maxNum >= sum) 
        	while(true) {
        		num[maxIndex]--;
        		if(num[maxIndex] < sum)
        			break;
        	}
        System.out.println(Arrays.stream(num).sum());
			
		
		
		//삼각형과 세 변
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			int[] num = new int[3];
//			for (int i = 0; i < 3; i++)
//				num[i] = scan.nextInt();
//			if (Arrays.stream(num).sum() == 0)
//				break;
//
//	        //제일 큰 수와 나머지 두 수를 비교
//			int maxVal = Arrays.stream(num).max().getAsInt();
//	        if(maxVal >= Arrays.stream(num).sum() - maxVal)	        	
//	        	System.out.println("Invalid");
//	        else if(num[0] == num[1] && num[1] == num[2])
//	        	System.out.println("Equilateral");
//	        else if(num[0] == num[1] || num[1] == num[2] || num[0] == num[2])
//	        	System.out.println("Isosceles");
//	        else
//	        	System.out.println("Scalene");
//		}
		
		
		//삼각형 외우기
//		Scanner scan = new Scanner(System.in);
//		int[] num = new int[3];
//		for(int i = 0; i < 3; i++)
//			num[i] = scan.nextInt();
//		
//		if (Arrays.stream(num).sum() == 180) {
//			if (num[0] == 60 && num[1] == 60)
//				System.out.println("Equilateral");
//			else if (num[0] == num[1] || num[0] == num[2] || num[1] == num[2])
//				System.out.println("Isosceles");
//			else
//				System.out.println("Scalene");
//		}
//		else
//			System.out.println("Error");
		
		
		//대지
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int[] x = new int[cnt];
//		int[] y = new int[cnt];
//		int gabX, gabY;
//		for(int i = 0; i < cnt; i++) {
//			x[i] = scan.nextInt();
//			y[i] = scan.nextInt();
//		}
//		gabX = Arrays.stream(x).max().getAsInt() - Arrays.stream(x).min().getAsInt();
//		gabY = Arrays.stream(y).max().getAsInt() - Arrays.stream(y).min().getAsInt();
//		System.out.printf("%d", gabX * gabY);
		
		
		//수학은 체육과목 입니다
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long n = Long.parseLong(br.readLine());
//		System.out.println(n * 4);
		
		
		//네 번째 점
//		Scanner scan = new Scanner(System.in);
//		int[] x = new int[3];
//		int[] y = new int[3];
//		int valX = 0;
//		int valY = 0;
//		for(int i = 0; i < 3; i++) {
//			x[i] = scan.nextInt();
//			y[i] = scan.nextInt();
//		}
//		if(x[0] == x[1])
//			valX = x[2];
//		else if(x[0] == x[2])
//			valX = x[1];
//		else
//			valX = x[0];
//		
//		if(y[0] == y[1])
//			valY = y[2];
//		else if(y[0] == y[2])
//			valY = y[1];
//		else
//			valY = y[0];	
//		System.out.printf("%d %d", valX, valY);
		
		
		//직사각형에서 탈출
//		Scanner scan = new Scanner(System.in);
//		int minValX, minValY, finVal;
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		int width = scan.nextInt();
//		int height = scan.nextInt();
//		minValX = (x > width - x) ? width - x : x;
//		minValY = (y > height - y) ? height - y : y;
//		finVal = minValX > minValY ? minValY : minValX;
//		System.out.println(finVal);
		
		
		//직사각형
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println(a * b);
	}
}
