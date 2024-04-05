package com.test.tab.study19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시뮬레이션
public class Main {
	public static void main(String[] args) throws IOException {
		//전자레인지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int srcTemp = Integer.parseInt(br.readLine());
		int dstTemp = Integer.parseInt(br.readLine());
		int timeIce = Integer.parseInt(br.readLine());
		int timeDefrost = Integer.parseInt(br.readLine());
		int timeHot = Integer.parseInt(br.readLine());
		int sum = 0;
		if(srcTemp > 0)
			sum = timeHot * (dstTemp-srcTemp);
		else if(srcTemp == 0) 
			sum = timeDefrost + (timeHot * (dstTemp-srcTemp));
		else 
			sum = (Math.abs(srcTemp) * timeIce) + timeDefrost + (timeHot * dstTemp);
		System.out.println(sum);
		
		
		//나무 조각
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int[] arr = new int[5];
//		for(int i = 0; i < 5; i++)
//			arr[i] = Integer.parseInt(st.nextToken());
//		
//		while(true) {
//			for(int i = 0; i < 4; i++) {
//				StringBuilder sb = new StringBuilder();
//				if(arr[i] > arr[i+1]) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//					for (int j = 0; j < 5; j++)
//						sb.append(arr[j]).append(" ");
//					
//					System.out.println(sb);
//				}
//			}
//			
//			if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4)
//				break;;
//		}
		
		
		
		//공
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = Integer.parseInt(br.readLine());
//		boolean[] b = new boolean[3];
//		b[0] = true;
//		
//		for(int i = 0; i < cnt; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int fb = Integer.parseInt(st.nextToken());
//			int sb = Integer.parseInt(st.nextToken());
//			
//			if(b[fb-1] == true) {
//				b[fb-1] = false;
//				b[sb-1] = true;
//			} else if (b[sb-1] == true){
//				b[sb-1] = false;
//				b[fb-1] = true;
//			}
//		}
//		if(b[0] == true)
//			System.out.println(1);
//		else if(b[1] == true)
//			System.out.println(2);
//		else if(b[2] == true)
//			System.out.println(3);
//		else
//			System.out.println(-1);
		
		
		//트럭 주차, [contains():리스트에 특정 값이 있는지 확인]
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		int stt = 100;
//		int end = 0;
//		int price = 0;
//		List<Integer>[] list = new ArrayList[3];
//		for(int i = 0; i < 3; i++) {
//			list[i] = new ArrayList<>();
//			st = new StringTokenizer(br.readLine());
//			int sttNew = Integer.parseInt(st.nextToken());
//			int endNew = Integer.parseInt(st.nextToken());
//			if(stt > sttNew)
//				stt = sttNew;
//			if(end < endNew)
//				end = endNew;
//			for(int j = sttNew; j < endNew; j++)
//				list[i].add(j);
//		}
//		
//		for(int i = stt; i < end; i++) {
//			if(list[0].contains(i) && list[1].contains(i) && list[2].contains(i)) {
//				price += (c * 3);
//			}
//			else if((list[0].contains(i) && list[1].contains(i)) 
//					|| (list[0].contains(i) && list[2].contains(i)) 
//					|| (list[1].contains(i) && list[2].contains(i))) {
//				price += (b * 2);
//			}
//			else if(list[0].contains(i) || list[1].contains(i) || list[2].contains(i)){
//				price += a;
//			}
//			else {
//				;
//			}
//		}
//		System.out.println(price);
		
		
		
		
		//만취한 상범
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int test = Integer.parseInt(br.readLine());
//		for(int tcnt = 0; tcnt < test; tcnt++)
//		{
//			int cnt = Integer.parseInt(br.readLine());
//			int jailbreak = 0;
//			boolean[] prison = new boolean[cnt+1];
//			for(int i = 1; i <= cnt; i++) {
//				if(i % 2 == 1)
//					prison[i] = true;
//			}
//			for(int i = 3; i <= cnt; i++) {
//				for(int j = i; j <= cnt; j++)
//					if(j % i == 0)
//						if(prison[j] == true)
//							prison[j] = false;
//						else
//							prison[j] = true;
//			}
//			
//			for(int i = 1; i <= cnt; i++) {
//				if(prison[i] == true)
//					jailbreak++;
//			}
//			sb.append(jailbreak).append("\n");
//		}
//		System.out.println(sb);
		
		
		
		
		//카드 역배치, [리스트, 컬렉션 리버스]
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		List<Integer> list = new LinkedList<>();
//		for(int i = 1; i <= 20; i++) 
//			list.add(i);
//		
//		for(int i = 0; i < 10; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int stt = Integer.parseInt(st.nextToken());
//			int end = Integer.parseInt(st.nextToken());
//			// 마지막 번호는 포함되지 않으므로 포함하기 위해 +1
//			List<Integer> sublist = list.subList(stt-1, end);
//			//같은 객체를 할당하기때문에 같이 바뀐다.
//	        Collections.reverse(sublist);
//		}
//		//표기법 변경
//		String result = list.stream()
//                .map(Object::toString)
//                .collect(Collectors.joining(" "));
//		System.out.println(result);
		
		
		//주사위 게임
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		int cd = 100;
//		int sd = 100;
//		
//		for(int i = 0; i < cnt; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int n1 = Integer.parseInt(st.nextToken());
//			int n2 = Integer.parseInt(st.nextToken());
//			if(n1 > n2) {
//				sd -= n1;
//			}else if(n2 > n1) {
//				cd -= n2;
//			}
//		}
//		sb.append(cd).append("\n");
//		sb.append(sd);
//		System.out.println(sb);
		
		
		//알고리즘 수업 - 알고리즘의 수행 시간 1, 알고리즘의 복잡도
//		System.out.println(1);
//        System.out.println(0);
		
		//프린터 큐 문제 이해를 못함.
	}
}
