package com.test.tab.study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//좌표 압축 https://infodon.tistory.com/53
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] an = new int[num];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++)
			an[i] = Integer.parseInt(arr[i]);

		int[] temp = an.clone();
		Arrays.sort(an);
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < an.length; i++) 
			if (!hmap.containsKey(an[i]))
				hmap.put(an[i], cnt++);

		for (int i = 0; i < num; i++) 
			sb.append(hmap.get(temp[i])).append(" ");
		
		
		//나이순 정렬 >> 클래스를 만들어서 하는게 메모리랑 시간을 줄일 수 있음
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = Integer.parseInt(br.readLine());
//		List<String> userInfo = new ArrayList<>();
//		for(int i = 0; i < cnt; i++) 
//			userInfo.add(br.readLine());
//		
//		// 숫자로 오름차순 정렬
//        Collections.sort(userInfo, new Comparator<String>() {//Collections.sort는 리스트의 요소들을 정렬하는 메소드
//        	//new Comparator<String>() {...} 부분은 익명 클래스를 생성하여 Comparator 인터페이스의 compare 메소드를 오버라이드 함.
//			@Override
//			public int compare(String s1, String s2) {
//				int num1 = Integer.parseInt(s1.split(" ")[0]);
//				int num2 = Integer.parseInt(s2.split(" ")[0]);
//				return Integer.compare(num1, num2);
//			}
//			/*
//			compare 메소드 내부에서는 두 문자열 s1과 s2를 숫자 부분과 그 뒤의 문자열 부분으로 나누어서 비교.
//			Integer.parseInt(s1.split(" ")[0])와 Integer.parseInt(s2.split(" ")[0])를 통해 두 문자열의 숫자 부분을 정수로 변환하여 가져옵니다.
//			Integer.compare(num1, num2)를 통해 두 숫자를 비교하고, 이 값을 반환
//			쉽게 말해서 리스트 안의 0번째는 숫자, 1번째는 이름인데 add된 데이터를 2개씩 계속해서 비교해서 정렬함.
//			병합 정렬(Merge Sort)과 삽입 정렬(Insertion Sort)을 결합한 하이브리드 정렬 알고리즘 
//			*/
//		});
//		// 정렬된 결과 출력
//		for (String element : userInfo) {
//			System.out.println(element);
//		}
		
		
		
		//단어 정렬
//		// 길이가 짧은 순서로 정렬하는 Comparator
//        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
//
//        // 길이가 같을 경우 알파벳순으로 정렬하는 Comparator
//        Comparator<String> alphaComparator = Comparator.naturalOrder();
//        
//        // 길이가 짧은 순서로 정렬하되, 길이가 같을 경우 알파벳순으로 정렬하는 Comparator
//        Comparator<String> customComparator = lengthComparator.thenComparing(alphaComparator);
//        
//        // TreeSet 생성 시에 customComparator 지정
//        Set<String> set = new TreeSet<>(customComparator);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        for(int i = 0; i < cnt; i++) 
//        	set.add(br.readLine());
//        for(String str : set) 
//        	System.out.println(str);
        
		
		
		//좌표 정렬하기2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		int[][] num = new int[cnt][2];
//		for(int i = 0; i < cnt; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			num[i][0] = Integer.parseInt(st.nextToken());
//			num[i][1] = Integer.parseInt(st.nextToken());
//		}
//        Arrays.sort(num, Comparator //Comparator: 비교자 객체를 생성. 비교자는 정렬의 규칙을 제공하는 역할.
//            .comparingInt((int[] row) -> row[1]) 
//            //comparingInt: 비교자를 생성하는 메소드 중 하나로, 정수 기반의 비교를 수행. 이 경우 row[0]을 기준으로 정렬
//            .thenComparingInt(row -> row[0])
//            //thenComparingInt: 두 번째 정렬 기준을 추가하는 메소드. 이 경우 row[1]을 기준으로 정렬
//        );
//		for(int i = 0; i < cnt; i++)
//			sb.append(num[i][0] + " " + num[i][1]).append('\n');
//		System.out.println(sb);
		
		
		//좌표 정렬하기
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		int[][] num = new int[cnt][2];
//		for(int i = 0; i < cnt; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			num[i][0] = Integer.parseInt(st.nextToken());
//			num[i][1] = Integer.parseInt(st.nextToken());
//		}
//		
//		// 첫 번째 열로 오름차순 정렬 후, 첫 번째 열 값이 같은 경우 두 번째 열로 오름차순 정렬
//        Arrays.sort(num, Comparator //Comparator: 비교자 객체를 생성. 비교자는 정렬의 규칙을 제공하는 역할.
//            .comparingInt((int[] row) -> row[0]) 
//            //comparingInt: 비교자를 생성하는 메소드 중 하나로, 정수 기반의 비교를 수행. 이 경우 row[0]을 기준으로 정렬
//            .thenComparingInt(row -> row[1])
//            //thenComparingInt: 두 번째 정렬 기준을 추가하는 메소드. 이 경우 row[1]을 기준으로 정렬
//        );
//		
//		for(int i = 0; i < cnt; i++)
//			sb.append(num[i][0] + " " + num[i][1]).append('\n');
//			//System.out.printf("%d %d", num[i][0], num[i][1]);
//			//System.out.println(Arrays.toString(num[i]));
//		System.out.println(sb);
		
		
		//소트인사이드
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		char[] nums = str.toCharArray();
//		for(int i = 0; i < str.length(); i++)
//			nums[i] = str.charAt(i);
//		Arrays.sort(nums);
//		for(int i = str.length() - 1; i >= 0; i--)
//			System.out.print(nums[i]);
		
		
		//수 정렬하기 3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int cnt = Integer.parseInt(br.readLine());
//		int[] num = new int[cnt];
//		for(int i = 0; i < cnt; i++) 
//			num[i] = Integer.parseInt(br.readLine());
//		Arrays.sort(num);
//		for(int i = 0; i < cnt; i++) 
//			sb.append(num[i]).append('\n');
//		System.out.println(sb);
		
		
		//수 정렬하기 2
//		Scanner scan = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		//StringBuilder:가변(mutable)한 문자열을 처리하기 위한 클래스, 새로운 문자열을 추가하거나 변경하게 되면 “기존의 객체”로 추가 및 변경.
//		int cnt = scan.nextInt();
//		// list 계열 중 하나를 쓰면 된다.
//		ArrayList<Integer> list = new ArrayList<>();//리스트에 대해서 좀 더 알아보기
//		for(int i =0; i < cnt; i++) 
//			list.add(scan.nextInt());
//		Collections.sort(list);//객체의 모음, 그룹
//		for(int value : list) 
//			sb.append(value).append('\n');
//		System.out.println(sb);
		
		
		
		//커트라인
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int priceCnt = scan.nextInt();
//		int[] num = new int[cnt];
//		for(int i =0; i < cnt; i++) 
//			num[i] = scan.nextInt();
//		Arrays.sort(num);
//		System.out.println(num[cnt-priceCnt]);
		
		
		//대표값2
//		Scanner scan = new Scanner(System.in);
//		int cnt = 5;
//		int sum = 0;
//		int avg = 0;
//		int[] num = new int[cnt];
//		for(int i = 0; i < cnt; i++) { 
//			num[i] = scan.nextInt();
//			sum += num[i];
//		}
//		avg = sum / cnt;
//		Arrays.sort(num);
//		System.out.println(avg);
//		System.out.println(num[2]);
		
		
		//수 정렬하기
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int[] num = new int[cnt];
//		for(int i =0; i < cnt; i++)
//			num[i] = scan.nextInt();
//		Arrays.sort(num);
//		for(int i = 0; i< cnt; i++)
//			System.out.println(num[i]);
	}
}
