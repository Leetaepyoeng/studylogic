package com.test.tab.study18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//팩토리얼, ?공부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int result = cnt;
		
		if(cnt > 1)
			for(int i = cnt-1; i > 0; i--) {
				result *= i;
			}
		else
			result = 1;
		System.out.println(result);
		
		//평균은 넘겠지
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int scoreCnt = Integer.parseInt(st.nextToken());
//			int sum = 0;
//			int[] stCnt = new int[scoreCnt];
//			for(int j = 0; j < scoreCnt; j++) {
//				stCnt[j] = Integer.parseInt(st.nextToken());
//				sum += stCnt[j];
//			}
//			float avg = (float)sum/scoreCnt;
//			int overAvgCnt = 0;
//			for(int j = 0; j < scoreCnt; j++)
//				if(stCnt[j] > avg)
//					overAvgCnt++;
//			String result = String.format("%.3f%%\n",(float)overAvgCnt/scoreCnt*100);
//			sb.append(result);
//		}
//		System.out.println(sb);
		
		
		//숫자의 개수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int num1 = Integer.parseInt(br.readLine());
//		int num2 = Integer.parseInt(br.readLine());
//		int num3 = Integer.parseInt(br.readLine());
//		int sum = num1 * num2 * num3;
//		int share = 0;
//		int rest = 0;
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i = 0; i < 10; i++)
//			map.put(i, 0);
//		
//		while(true) {
//			share = sum / 10;
//			rest = sum % 10;
//			
//			if(share == 0) {
//				map.put(rest, map.get(rest)+1);
//				break;
//			}
//			else {
//				map.put(rest, map.get(rest)+1);
//				sum /= 10;
//			}
//		}
//		for(int i = 0; i < 10; i++)
//			sb.append(map.get(i)).append("\n");
//		System.out.println(sb);
		
		
		//더하기 사이클
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String strNum = br.readLine();
//		int dstNum = Integer.parseInt(strNum);
//		int selNum = dstNum;
//		int cnt = 0;
//		while(true) {
//			int num1 = selNum / 10;
//			int num2 = selNum % 10;
//			selNum = (num2*10)+((num1+num2)%10);
//			cnt++;
//			if(selNum == dstNum) break;
//		}
//		System.out.println(cnt);
	}
}
