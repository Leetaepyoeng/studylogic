package com.test.tab.study06;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		//평균
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		float[] arrScore = new float [cnt];
//		float avg = 0;
//		int highScore = 0;
//		float total = 0;
//		for (int i = 0; i < cnt; i++) {
//			arrScore[i] = scan.nextFloat();
//			if(highScore < arrScore[i])
//				highScore = (int)arrScore[i];
//		}
//		for (int i = 0; i < cnt; i++) {
//			arrScore[i] = arrScore[i]/highScore*100;
//			total += arrScore[i];
//		}
//		avg = total / cnt;
//		System.out.println(avg);
		
		//바구니 뒤집기
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		int[] arr = new int [N];
//		for(int i = 0; i < N; i++)
//			arr[i] = i+1;
//		for(int i = 0; i < M; i++) {
//			int sttNum = scan.nextInt()-1;
//			int endNum = scan.nextInt()-1;
//			for(int nNum = sttNum, j = 0; nNum < endNum-((endNum - sttNum)/2); nNum++,j++) {
//				int temp = arr[endNum-j];
//				arr[endNum-j] = arr[nNum];
//				arr[nNum] = temp;
//			}
//		}
//		for(int i = 0; i < N; i++)
//			System.out.printf("%d ", arr[i]);
		
		//나머지 HashSet 을 이용한 다른 풀이
//		int cnt = 10;
//		Scanner scan = new Scanner(System.in);
//		HashSet<Integer> h = new HashSet<Integer>();
//		for(int i = 0; i < cnt; i++)
//			h.add(scan.nextInt() % 42);
//		System.out.println(h.size());
		/*
		HashSet
	    중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.
	    HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다. 
	    만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.
		*/
		
		//나머지
//		Scanner scan = new Scanner(System.in);
//		int cnt = 10;
//		int cntUnMatch = 10;
//		int[] remaind = new int[cnt];
//		for(int i = 0; i < cnt; i++)
//			remaind[i] = scan.nextInt()%42;
//		for(int i = 0; i < cnt-1; i++)
//			for(int j = i + 1; j < cnt; j++) {
//				if(remaind[i] == remaind[j]) {
//					cntUnMatch--;
//					break;
//				}
//			}
//		System.out.println(cntUnMatch);
		
		
		//과제 안 내신 분..?
//		Scanner scan = new Scanner(System.in);
//		int stdNum = 30;
//		int nNum = 0;
//		int[] notAttStd = new int[2];
//		boolean[] isAtt = new boolean[stdNum];
//		for(int i = 0; i < stdNum - 2; i++) {
//			nNum = scan.nextInt() - 1;
//			isAtt[nNum] = true;
//		}
//		for(int i = 0, idx = 0; i < stdNum; i++)
//			if(!isAtt[i]) {
//				notAttStd[idx] = i + 1;
//				idx++;
//			}
//		System.out.println(notAttStd[0]);
//		System.out.println(notAttStd[1]);
		
		//공 바꾸기
//		Scanner scan = new Scanner(System.in);
//		int cntBsk = scan.nextInt();
//		int cngNum = scan.nextInt();
//		int[] arrBsk = new int[cntBsk];
//		int cng1 = 0;
//		int cng2 = 0;
//		int temp = 0;
//		for(int i = 0; i < cntBsk; i++)
//			arrBsk[i] = i+1;
//		for(int i = 0; i < cngNum; i++) {
//			cng1 = scan.nextInt() - 1;
//			cng2 = scan.nextInt() - 1;
//			temp = arrBsk[cng1];
//			arrBsk[cng1] = arrBsk[cng2];
//			arrBsk[cng2] = temp;
//		}
//		for(int i = 0; i < cntBsk; i++)
//			System.out.printf("%d ", arrBsk[i]);	
		
		
		//공 넣기
//		Scanner scan = new Scanner(System.in);
//		int cntBsk = scan.nextInt();
//		int cnt = scan.nextInt();
//		int[] arrBsk = new int[cntBsk];
//		int num = 0;
//		int sttNum = 0;
//		int endNum = 0;
//		
//		for(int i = 0; i < cnt; i++) {
//			sttNum = scan.nextInt()-1;
//			endNum = scan.nextInt()-1;
//			num = scan.nextInt();
//			for(int j = sttNum; j <= endNum; j++)
//				arrBsk[j] = num;
//		}
//		for(int i = 0; i < cntBsk; i++)
//			System.out.printf("%d ", arrBsk[i]);
		
		//최대값
//		Scanner scan = new Scanner(System.in);
//		int findIdx = 0;
//		int maxVal = 0;
//		int cnt = 9;
//		int[] arr = new int[cnt];
//		for(int i = 0; i < cnt; i++) 
//			arr[i] = scan.nextInt();
//		for(int i = 0; i < cnt; i++) 
//			if(maxVal < arr[i]) {
//				maxVal = arr[i];
//				findIdx = i + 1;
//			}
//		System.out.println(maxVal);
//		System.out.println(findIdx);
		
		//최소, 최대
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int[] arr = new int[N];
//		int maxNum = -1000000;
//		int minNum = 1000000;
//		for(int i = 0; i < N; i++) {
//			arr[i] = scan.nextInt();
//			if(arr[i] > maxNum)	maxNum = arr[i];
//			if(arr[i] < minNum) minNum = arr[i];
//		}
//		System.out.printf("%d %d", minNum, maxNum);
		
		//X보다 작은 수
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int X = scan.nextInt();
//		int cntNum = 0;
//		int[] arr = new int[N];
//		for(int i = 0; i < N; i++) {
//			arr[i] = scan.nextInt();
//			if(arr[i] < X)
//				System.out.printf("%d ",arr[i]);
//		}
		
		//개수 세기
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int findNum = 0;
//		int cntNum = 0;
//		int[] arr = new int[N];
//		for(int i = 0; i < N; i++) {
//			arr[i] = scan.nextInt();
//		}
//		findNum = scan.nextInt();
//		for(int i = 0; i < N; i++) 
//			if(arr[i] == findNum)
//				cntNum++;
//		System.out.println(cntNum);
	}
}
