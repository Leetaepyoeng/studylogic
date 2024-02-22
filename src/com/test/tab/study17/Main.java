package com.test.tab.study17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		//나머지 합 이건 나중에, 다시 기초부터 하면서 수학공부랑 병행하자
		
		
		
		//수들의 합 2, 투 포인터 문제
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int cnt = Integer.parseInt(st.nextToken());
//		int dstNum = Integer.parseInt(st.nextToken());
//		int[] list = new int[cnt];
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			list[i] = Integer.parseInt(st.nextToken());;
//		}
//		int stt = 0;
//		int end = 0;
//		int sunCnt = 0;
//		int sum = 0;
//		while(true) {
//			if(sum >= dstNum) {//더한 값이 목표값보다 같거나 크면 왼쪽값을 빼주고 자리이동
//				sum -= list[stt++];
//			}else if(end==cnt) break; //오른값의 위치가 제일 오른쪾이면
//			else {//더한값이 목표값보다 적으면 오른값을 저장하고 자리 이동
//				sum += list[end++];
//			}
//			if(sum==dstNum) {
//				sunCnt++;
//			}
//		}
//		System.out.println(sunCnt);
		
		
		
		//부분합, 투포인터 문제 실패 모범답안은 아래
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int cnt = Integer.parseInt(st.nextToken());
//		int dstNum = Integer.parseInt(st.nextToken());
//		List<Integer> list = new ArrayList<>();
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			list.add(Integer.parseInt(st.nextToken()));
//		}
//		int i = 0;
//		int srcNum = 0;
//		int selNum = 99990;
//		int cntNum = 1;
//		while(i < list.size()) {
//			srcNum += list.get(i);
//			if(srcNum >= dstNum) {
//				srcNum = 0;
//				if(cntNum < selNum) {
//					selNum = cntNum;
//					cntNum = 0;
//				}
//				else {
//					cntNum--;
//				}
//				i--;
//				
//			}
//			cntNum++;
//			i++;
//		}
//		if(selNum != 99990)
//			System.out.println(selNum);
//		else
//			System.out.println(0);
		//부분합 모범답안
//		Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();//숫자의 개수
//        int s = scan.nextInt();//목표값
//        int[] nums = new int[n + 1];
//        for(int i = 0; i < n; i++) {
//            nums[i] = scan.nextInt();//순서대로 배열 채우고
//        }
//        int min = Integer.MAX_VALUE;//걍 인트형 제일 높은 값 먹임
//        int start = 0;
//        int end = 0;
//        int total = 0;
//        while(start <= n && end <= n) {
//            if(total >= s && min > end - start) min = end - start;
//            if(total < s) total += nums[end++];
//            else total -= nums[start++];
//        }
//        if(min == Integer.MAX_VALUE) System.out.println("0");
//        else System.out.println(min);
		
		
		//구간 합 구하기 5
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		int wh = Integer.parseInt(st.nextToken());
//		int cnt = Integer.parseInt(st.nextToken());
//		int[][] arr = new int[wh][wh];
//		int[][] pSum = new int[wh+1][wh+1];
//		
//		for(int i = 0; i < wh; i++) {
//			st = new StringTokenizer(br.readLine());
//			for(int j = 0; j < wh; j++)
//				arr[i][j] = Integer.parseInt(st.nextToken());
//		}
//		for(int h = 1; h <= wh; h++)
//			for(int w = 1; w <= wh; w++)
//				pSum[h][w] = pSum[h-1][w]+pSum[h][w-1]-pSum[h-1][w-1]+arr[h-1][w-1];
//		
//		for(int i = 0; i < cnt; i++) {
//			st = new StringTokenizer(br.readLine());
//			int sttH = Integer.parseInt(st.nextToken());
//			int sttW = Integer.parseInt(st.nextToken());
//			int endH = Integer.parseInt(st.nextToken());
//			int endW = Integer.parseInt(st.nextToken());
//
//			sb.append(pSum[endH][endW] - pSum[sttH-1][endW] - pSum[endH][sttW-1] + pSum[sttH-1][sttW-1])
//			.append("\n");
//		}
//		System.out.println(sb);
		
		
		//구간 합 구하기 4
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		int nNum = Integer.parseInt(st.nextToken());
//		int nCnt = Integer.parseInt(st.nextToken());
//		int[] pSum = new int[nNum+1];
//		st = new StringTokenizer(br.readLine());
//		for(int i = 1; i <= nNum; i++) {
//			pSum[0] = 0;
//			pSum[i] = pSum[i-1]+Integer.parseInt(st.nextToken());
//			//5 4 3 2 1 이면 처음에는 0+5 그다음은 [0+5]+4 그다음은 [0+5+4]+3순으로 감
//		}
//		for(int i = 0; i < nCnt; i++) {
//			st = new StringTokenizer(br.readLine());
//			int stt = Integer.parseInt(st.nextToken());
//			int end = Integer.parseInt(st.nextToken());
//			sb.append(pSum[end]-pSum[stt-1]).append("\n");
//		}
//		System.out.println(sb);
		
		
		//2차원 배열의 합 누적합 사용, 공식을 외우자
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int nHeight = Integer.parseInt(st.nextToken());
//		int nWidth = Integer.parseInt(st.nextToken());
//		int[][] buf = new int[nHeight][nWidth];
//		int[][] pSum = new int[nHeight+1][nWidth+1];
//		
//		for(int h = 0; h < nHeight; h++) {
//			st = new StringTokenizer(br.readLine());
//			for(int w = 0; w < nWidth; w++)
//				buf[h][w] = Integer.parseInt(st.nextToken());
//		}
//		
//		for(int h = 1; h < nHeight+1; h++) 
//			for(int w = 1; w < nWidth+1; w++)
//				pSum[h][w] = pSum[h-1][w]+pSum[h][w-1]-pSum[h-1][w-1]+buf[h-1][w-1];
//		
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			st = new StringTokenizer(br.readLine());
//			int sttH = Integer.parseInt(st.nextToken());
//			int sttW = Integer.parseInt(st.nextToken());
//			int endH = Integer.parseInt(st.nextToken());
//			int endW = Integer.parseInt(st.nextToken());
//
//			System.out.println(pSum[endH][endW] - pSum[sttH-1][endW] - pSum[endH][sttW-1] + pSum[sttH-1][sttW-1]);
//		}
		
		
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
