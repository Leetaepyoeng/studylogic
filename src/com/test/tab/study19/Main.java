package com.test.tab.study19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//시뮬레이션
public class Main {
	public static void main(String[] args) throws IOException {
		//주사위 게임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		int cd = 100;
		int sd = 100;
		
		for(int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if(n1 > n2) {
				sd -= n1;
			}else if(n2 > n1) {
				cd -= n2;
			}
		}
		sb.append(cd).append("\n");
		sb.append(sd);
		System.out.println(sb);
		
		
		//알고리즘 수업 - 알고리즘의 수행 시간 1, 알고리즘의 복잡도
//		System.out.println(1);
//        System.out.println(0);
		
		//프린터 큐 문제 이해를 못함.
	}
}
