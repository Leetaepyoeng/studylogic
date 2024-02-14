package com.test.tab.study17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		//2차원 배열의 합 누적합 사용, 공식을 외우자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nHeight = Integer.parseInt(st.nextToken());
		int nWidth = Integer.parseInt(st.nextToken());
		int[][] buf = new int[nHeight][nWidth];
		int[][] pSum = new int[nHeight+1][nWidth+1];
		
		for(int h = 0; h < nHeight; h++) {
			st = new StringTokenizer(br.readLine());
			for(int w = 0; w < nWidth; w++)
				buf[h][w] = Integer.parseInt(st.nextToken());
		}
		
		for(int h = 1; h < nHeight+1; h++) 
			for(int w = 1; w < nWidth+1; w++)
				pSum[h][w] = pSum[h-1][w]+pSum[h][w-1]-pSum[h-1][w-1]+buf[h-1][w-1];
		
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int sttH = Integer.parseInt(st.nextToken());
			int sttW = Integer.parseInt(st.nextToken());
			int endH = Integer.parseInt(st.nextToken());
			int endW = Integer.parseInt(st.nextToken());

			System.out.println(pSum[endH][endW] - pSum[sttH-1][endW] - pSum[endH][sttW-1] + pSum[sttH-1][sttW-1]);
		}
		
		
		//2차원 배열의 합
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		int nHeight = Integer.parseInt(st.nextToken());
//		int nWidth = Integer.parseInt(st.nextToken());
//		int[][] buf = new int[nHeight][nWidth];
//		for(int h = 0; h < nHeight; h++) {
//			st = new StringTokenizer(br.readLine());
//			for(int w = 0; w < nWidth; w++)
//				buf[h][w] = Integer.parseInt(st.nextToken());
//		}
//		
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			int sum = 0;
//			st = new StringTokenizer(br.readLine());
//			int sttH = Integer.parseInt(st.nextToken())-1;
//			int sttW = Integer.parseInt(st.nextToken())-1;
//			int endH = Integer.parseInt(st.nextToken());
//			int endW = Integer.parseInt(st.nextToken());
//			for(int h = sttH; h < endH; h++) {
//				for(int w = sttW; w < endW; w++){
//					sum += buf[h][w];
//				}
//			}
//			sb.append(sum+"\n");
//		}
//		System.out.println(sb);
		
		
		
		//기상청 인턴 신현수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int cnt = Integer.parseInt(st.nextToken());
//		int sumCnt = Integer.parseInt(st.nextToken());
//		int[] arrNum = new int[cnt];
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < cnt; i++)
//			arrNum[i] = Integer.parseInt(st.nextToken());
//		
//		int maxNum = -2147483648;
//		for(int i = 0; i <= cnt-sumCnt; i++) {
//			int num = 0;
//			for(int j = i; j < i+sumCnt; j++) {
//				num += arrNum[j];
//			}
//			if(num > maxNum)
//				maxNum = num;
//		}
//		System.out.println(maxNum);
	}
}
