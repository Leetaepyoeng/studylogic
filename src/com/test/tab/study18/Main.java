package com.test.tab.study18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//다리 놓기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split("-");
		int resultNum = 0;
		for(int i = 0; i < arr1.length; i++) {
			//split의 경우 정규식(regex)을 받기 때문에 "+"을 하면 regex.PatternSyntaxException을 뱉는다.
			//+ 문자가 메타문자(meta character)라 그렇다.(=특별한 의미를 담고 있다는 뜻) 
			String[] arr2 = arr1[i].split("\\+");
			int num = 0;
			for(int j = 0; j < arr2.length; j++) {
				num = Integer.parseInt(arr2[j]);
			}
			if(i == 0)
				resultNum = num;
			else
				resultNum -= num;
		}
		System.out.println(resultNum);
		
		
		//파도반 수열
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		long[] numbers = new long[101];
//		long[] numbers2 = {0, 1L, 1L, 1L, 2L, 2L};
//		for(int i = 0; i < numbers2.length; i++)
//			numbers[i] = numbers2[i];
//		for(int i = 6; i < numbers.length; i++)
//			numbers[i] = numbers[i-1] + numbers[i-5];
//		for(int i = 0; i < cnt; i++) {
//			int num = Integer.parseInt(br.readLine());
//			sb.append(numbers[num]).append("\n");
//		}
//		System.out.println(sb);
		
		
		//2007년
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int month = Integer.parseInt(st.nextToken());
//		int day = Integer.parseInt(st.nextToken());
//		LocalDate date = LocalDate.of(2007, month, day);
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println(dayOfWeek.name().substring(0, 3));
        
        
		//큰 수 A+B
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		BigInteger a = new BigInteger(st.nextToken());
//		BigInteger b = new BigInteger(st.nextToken());
//		System.out.println(a.add(b));
		
		
		
		//평균 점수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int size = 5;
//		int sum = 0;
//		int result = 0;
//		int[] arr = new int[size];
//		for(int i = 0; i < size; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//			if(arr[i] < 40) arr[i] = 40;
//			sum += arr[i];
//		}
//		result = sum / size;
//		System.out.println(result);
		
		
		//직각삼각형
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
//		while(true) {
//			st = new StringTokenizer(br.readLine());
//			int[] arr = new int[3];
//			for(int i = 0; i < 3; i++) {
//				arr[i] = Integer.parseInt(st.nextToken());
//				arr[i] *= arr[i]; 
//			}
//			Arrays.sort(arr);
//			
//			if(arr[0] + arr[1] + arr[2] == 0) break;
//			
//			String str = (arr[0]+arr[1]) == arr[2] ? "right" : "wrong";
//			sb.append(str).append("\n");
//		}
//		System.out.println(sb);
		
		
		//검증수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int size = 5;
//		int sum = 0;
//		int[] arr = new int[size];
//		for(int i = 0; i < size; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			arr[i] *= arr[i];
//			sum+=arr[i];
//		}
//		System.out.println(sum%10);
		
		
		
		
		//부녀회장이 될테야
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int[][] aptArr = new int[15][15];
//		for(int i = 0; i < 15; i++) {
//			aptArr[i][1] = 1;
//			aptArr[0][i] = i;
//		}
//		for(int h = 1; h < 15; h++)
//			for(int w = 2; w < 15; w++)
//				aptArr[h][w] = aptArr[h - 1][w] + aptArr[h][w-1];
//		
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			int h = Integer.parseInt(br.readLine());
//			int w = Integer.parseInt(br.readLine());
//			sb.append(aptArr[h][w]).append("\n");
//		}
//		System.out.println(sb);
		
		
		
		//ACM 호텔
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < cnt; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int h = Integer.parseInt(st.nextToken());
//			st.nextToken();//w는 필요없음
//			int n = Integer.parseInt(st.nextToken());
//			
//			if(n % h == 0) //나머지가 0이면 층수는 입력된 값, 호수는 몫 값
//				sb.append((h*100) + (n / h)).append("\n");
//			else //층수는 나머지값 * 100, 호수는 몫 값+1
//				sb.append((n%h)*100 + (n / h) + 1).append("\n");
//		}
//		System.out.println(sb);
		
		
		
		//최대공약수와 최소공배수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		BigInteger a = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
//        BigInteger b = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
//        // 최대공약수 구하기
//        BigInteger gcd = a.gcd(b);
//        // 최소공배수 구하기
//        BigInteger lcm = a.multiply(b).divide(gcd);
//        sb.append(gcd).append("\n").append(lcm);
//        System.out.println(sb);
		
		
		//소수 구하기, 에라토스테네스의 체로 풀어야함. 잘 이해가 안감. 시간복잡도부터 공부 필요
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int M = Integer.parseInt(st.nextToken());
//		int N = Integer.parseInt(st.nextToken());
//		//소수 판별 배열 N까지 나타내기위해 범위는 N+1로
//		//소수 판별은 꼭 boolean 형을 사용하지 않고 int형이나 String형 같이 다른 자료형을 사용해도 된다.
//		boolean[] arr = new boolean[N + 1];
//		StringBuilder sb = new StringBuilder();
//		
//		//0과 1은 소수가 아니다.
//		arr[0] = true;
//		arr[1] = true;
//		
//		//문제에서 말한 제곱해서 N을 넘지 않을때까지만 소수의 배수를 제외해 주면 된다.
//		for(int i = 2; i * i <= N; i++) {
//			//소수일때
//			if(!arr[i]) {
//				//j에는 소수의 배수들이 들어와야하기때문에 아래 조건이 들어간다.
//				for(int j = i * i; j <= N; j += i) {
//					//소수의 배수들에는 true를 저장
//					arr[j] = true;
//				}
//			}
//		}
//		
//		for(int i = M; i <= N; i++) {
//			if(!arr[i]) sb.append(i).append("\n");
//		}
//		System.out.println(sb);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		int minNum = Integer.parseInt(st.nextToken());
//		int maxNum = Integer.parseInt(st.nextToken());
//		for(int i = minNum; i <= maxNum; i++) {
//			boolean isminorNum = true;
//			int selNum = i;
//			if(selNum % 2 == 0 || selNum % 5 == 0) continue;
//			if(selNum > 9 && selNum % 3 == 0)	continue;
//			for(int j = 2; j <= selNum / 2; j++) {
//				if(selNum % j == 0) {
//					isminorNum = false;
//					break;
//				}
//			}
//			if(isminorNum)
//				sb.append(selNum).append("\n");
//		}
//		System.out.println(sb);
		
		
		//손익분기점
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int annualCost = Integer.parseInt(st.nextToken());
//		int productCost = Integer.parseInt(st.nextToken());
//		int goodsCost = Integer.parseInt(st.nextToken());
//		int margin = goodsCost - productCost;
//		int result = -1;
//		if(margin > 0) {
//			result = annualCost / (margin) + 1;
//		}
//		System.out.println(result);
		
		
		//피보나치 수 5
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = Integer.parseInt(br.readLine());
//		HashMap<Integer, Integer> map = new HashMap<>();
//		map.put(0, 0);
//		map.put(1, 1);
//		for(int i = 2; i < 21; i++)
//			map.put(i, map.get(i-2)+map.get(i-1));
//		System.out.println(map.get(num));
		
		
		//A+B - 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
//		int b = Integer.parseInt(br.readLine());
//		System.out.println(a+b);
		
		
		
		//한수 -> 이건 등차수열 공부
		
		
		
		//셀프 넘버
//		StringBuilder sb = new StringBuilder();
//		HashSet<Integer> list = new HashSet<>();
//        for(int i = 1; i < 10001; i++) 
//        	list.add(i);
//        
//		for(int i = 1; i < 10001; i++) {
//			int num = i;
//			int sum = num;//기존 값에 더해야하니 기본 값부터 시작
//			while(num != 0) {
//				sum = sum + (num % 10); // 가장 오른쪽 자리 수
//				num = num / 10;	// 10을 나누어 첫 째 자리를 없앤다
//			}
//			list.remove(sum);
//		}
//		for (Integer i : list)
//			sb.append(i).append("\n");
//		System.out.println(sb);
		
		
		
		//팩토리얼, ?공부
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = Integer.parseInt(br.readLine());
//		int result = cnt;
//		
//		if(cnt > 1)
//			for(int i = cnt-1; i > 0; i--) {
//				result *= i;
//			}
//		else
//			result = 1;
//		System.out.println(result);
		
		
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
