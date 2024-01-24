package com.test.tab.study15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//서로 다른 부분 문자열의 개수, substring을 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Set<String> set = new HashSet<>();
		for(int start = 0; start <= str.length(); start++)
			for(int end = start+1; end <= str.length(); end++)
				set.add(str.substring(start, end));
		System.out.println(set.size());
		
		
		//대칭 차집합
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int cntA = Integer.parseInt(st.nextToken());
//		int cntB = Integer.parseInt(st.nextToken());
//		int cntSize = cntA + cntB;//총 원소 개수
//		st = new StringTokenizer(br.readLine());
//		HashMap<String, Integer> hlist = new HashMap<>();
//		for(int i = 0; i < cntA; i++)
//			hlist.put(st.nextToken(), 0);
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < cntB; i++) 
//			if(hlist.get(st.nextToken()) != null) 
//				cntSize -= 2;
//		System.out.println(cntSize);
		
		
		
		//듣보잡
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		HashMap<String, Integer> list = new HashMap<>();
//		ArrayList<String> dstlist = new ArrayList<>();
//		for(int i = 0; i < N; i++)
//			list.put(br.readLine(), 0);
//		
//		for(int i = 0; i < M; i++) {
//			String str = br.readLine();
//			if(list.get(str) != null)
//				dstlist.add(str);
//		}
//		Collections.sort(dstlist);//ArrayList 사전순으로 정렬
//		System.out.println(dstlist.size());
//        for (String s : dstlist)
//            System.out.println(s);
		
		
		//숫자 카드 2																																																								
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int skCnt, ranCnt;//상근의 숫자개수, 랜덤 숫자개수
//		StringTokenizer st; //문자열을 토큰으로 분리하려고
//		HashMap<String, Integer> owned = new HashMap<>();//해쉬맵 변수 owned 선언
//		skCnt = Integer.parseInt(br.readLine());
//		String[] skArr = new String[skCnt];
//		skArr = br.readLine().split(" ");//상근의 번호
//		
//		ranCnt = Integer.parseInt(br.readLine());//랜덤번호 개수
//		st = new StringTokenizer(br.readLine());//랜덤번호를 끊어서 저장
//		String[] dstNum = new String[ranCnt];
//		for (int i = 0; i < ranCnt; i++) {
//			String str = st.nextToken();
//			owned.put(str, 0);// owned HashMap에 key 값만 넣는 과정
//			dstNum[i] = str;// HashMap은 순서대로 저장하지 않아서 순서를 위해 배열로 저장
//		}
//		for(int i = 0; i < skCnt; i++) {
//			String strNum = skArr[i];
//			if (owned.get(strNum) != null) 
//				owned.put(strNum, owned.get(strNum)+1);
//		}
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < ranCnt; i++) 
//			sb.append(owned.get(dstNum[i]) + " ");
//		System.out.println(sb);
		
		
		
		//나는야 포켓몬 마스터 이다솜 시간초과 뜸 indexof 함수연산이 오래 걸린다 함. 자체 측정으로는 평균 40ms정도의 차이가 남(내 코드 240ms 밑의 코드 200ms)
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine()); //문자열을 토큰으로 분리
//		StringBuilder sb = new StringBuilder();
//		int poketmonCnt = Integer.parseInt(st.nextToken());
//		int questCnt = Integer.parseInt(st.nextToken());
//		
//		ArrayList<String> list = new ArrayList<>();
//		for(int i = 0; i < poketmonCnt; i++)
//			list.add(br.readLine());
//		
//		for(int i = 0; i < questCnt; i++) {
//			String strBuffer = br.readLine();
//			char fstChar = strBuffer.charAt(0);
//			if(48 <= fstChar && fstChar <= 57) //숫자라면
//				sb.append(list.get(Integer.parseInt(strBuffer) - 1)+"\n");//인덱스는 0번부터 시작이라 -1을 함.
//			else //문자열이라면 인덱스를 반환, 여기는 인덱스 값을 반환해주므로 +1을 해줘야 함
//				sb.append((list.indexOf(strBuffer)+1) + "\n");
//		}
//		System.out.println(sb);
		
		//시간초과 안뜨는 코드
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		StringBuilder sb = new StringBuilder();
//		//조건에 따라 다르게 쓰일 두개의 HashMap
//		HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
//		HashMap<String, Integer> hash2 = new HashMap<String, Integer>();
//		for(int i = 1; i <= N; i++) {
//			String S = br.readLine();
//			hash1.put(i, S);
//			hash2.put(S, i);
//		}
//		for(int i = 0; i < M; i++) {
//			String S = br.readLine();
//			//입력값이 번호인지 포켓몬이름인지 판별
//			if(49 <= S.charAt(0) && S.charAt(0) <= 57) 
//				sb.append(hash1.get(Integer.parseInt(S))).append("\n");
//			else 
//				sb.append(hash2.get(S)).append("\n");
//		}
//		System.out.println(sb);
        
		
        
		//회사에 있는 사람
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = Integer.parseInt(br.readLine());
//		HashMap<String, String> userInfo = new HashMap<>();
//		StringTokenizer st;
//		for(int i = 0; i < cnt; i++) {
//			st = new StringTokenizer(br.readLine());
//			userInfo.put(st.nextToken(), st.nextToken());
//		}
//		ArrayList<String> list = new ArrayList<String>();//해쉬맵은 정렬이 안되어있기때문에 arrlist를 사용해서 정령
//		//entrySet() 메서드를 사용헤서 키어ㅣ 밸류값을 활용
//		for(Map.Entry<String, String> entry : userInfo.entrySet())
//			if(entry.getValue().equals("enter"))
//				list.add(entry.getKey());
//		Collections.sort(list, Collections.reverseOrder());//리스트를 역순으로 정렬하는 코드
//		for(var li : list) {
//			System.out.print(li + " ");
//		}
		
		
		//문자열 집합
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = 0;
//		StringTokenizer st = new StringTokenizer(br.readLine()); //문자열을 토큰으로 분리
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		HashMap<String, Integer> srcStr = new HashMap<>();//해쉬맵 변수 srcStr 선언
//		for(int i = 0; i < n; i++)
//			srcStr.put(br.readLine(), null);//해쉬맵은 순서대로 저장하지 않음
//	
//		for(int i = 0; i < m; i++) {
//			if(srcStr.containsKey(br.readLine()))
//				cnt++;
//		}
//		System.out.println(cnt);
		
		
		//숫자 카드 >> 시간초과
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int skCnt = Integer.parseInt(br.readLine());
//		int[] sgNum = new int[skCnt];
//		String[] strSkNum = br.readLine().split(" ");
//		
//		for(int i = 0; i < strSkNum.length; i++)
//			sgNum[i] = Integer.parseInt(strSkNum[i]);
//		
//		int ranCnt = Integer.parseInt(br.readLine());
//		int[] ranNum = new int[ranCnt];
//		boolean[] isMatch = new boolean[ranCnt];
//		String[] strRanNum = br.readLine().split(" ");
//		
//		for(int i = 0; i < strRanNum.length; i++)
//			ranNum[i] = Integer.parseInt(strRanNum[i]);
//		
//		for(int i = 0; i < ranNum.length; i++) {
//			for(int j = 0; j < sgNum.length; j++) {
//				if(ranNum[i] == sgNum[j])
//					isMatch[i] = true;
//			}
//			System.out.print(isMatch[i]? 1 : 0);
//			if(i == ranNum.length-1)
//				break;
//			System.out.print(" ");
//		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st; //문자열을 토큰으로 분리
//        StringBuilder sb = new StringBuilder();
//
//        int skCnt, ranCnt;//상근의 숫자개수, 랜덤 숫자개수
//        HashMap<String, Integer> owned = new HashMap<>();//해쉬맵 변수 owned 선언
//        skCnt = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for (int i=0; i<skCnt; i++) {
//            owned.put(st.nextToken(), 0);//owned HashMap에 key 값만 넣는 과정, 벨류는 0으로 채우고 사용하지 않음
//        }
//
//        ranCnt = Integer.parseInt(br.readLine());//임의의 숫자 cnt
//        st = new StringTokenizer(br.readLine());
//        for (int i=0; i<ranCnt; i++) {
//        	String strNum = st.nextToken();//토큰으로 나눠서 하나씩 값을 전달받음
//            if (owned.get(strNum) != null) {
//                sb.append("1 ");
//            } else {
//                sb.append("0 ");
//            }
//        }
//        System.out.println(sb.toString());
		
	}
}
