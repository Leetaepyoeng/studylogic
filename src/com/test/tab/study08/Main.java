package com.test.tab.study08;

import java.util.*;
public class Main {
	public static void main(String[] args) {
        //그룹 단어 체커
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
        sc.nextLine(); // 개행 문자 제거
		for(int i = 0; i < num; i++) {
			boolean[] isGroup = new boolean[26];
			boolean totalIsGroup = true;
			String str = sc.nextLine();
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (isGroup[ch - 'a']) {
					totalIsGroup = false;
                    break;
                }
				isGroup[ch - 'a'] = true;
				while (j + 1 < str.length() && ch == str.charAt(j + 1))
                    j++;
			}
			if (totalIsGroup)
                cnt++;
		}
		System.out.println(cnt);
		
		
		
		//너의 평점은
//		Scanner scan = new Scanner(System.in);
//		String line = null;
//		String[] rate = {"D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};
//		float num = 0;
//		float numTotal = 0;
//		float total = 0;
//		for(int i = 0; i < 20; i++) {
//			float credit = 0;
//			line = scan.nextLine();
//			String[] token = line.split(" ");
//			num = Float.parseFloat(token[1]);//학점
//			
//			if(token[2].equals("P"))	continue;
//			else if(token[2] != "F") {
//				for(int j = 0; j < rate.length; j++)
//					if(rate[j].equals(token[2])) //등급
//						credit = (float)(j * 0.5 + 1);
//			}
//			total += num * credit;
//			numTotal += num;
//		}
//		System.out.println(total /= numTotal);
		
		
		//크로아티아 알파벳
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		String[] findStr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
//		int cnt = 0;
//		
//		for (int i = 0; i < findStr.length; i++) {
//			Pattern pattern = Pattern.compile(Pattern.quote(findStr[i]));
//			Matcher matcher = pattern.matcher(str);
//			while (matcher.find())
//				cnt++;
//		}
//		System.out.println(str.length() - cnt);
		
		
		//단어 공부
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		str = str.toUpperCase();
//		int maxIdx = 0;
//		int maxVal = 0;
//		boolean isDouble1 = false;
//		int[] alph = new int[26];
////		for(int i = 0; i < str.length(); i++) {
////			for(int j = 0; j < 26; j++)
////				if(str.charAt(i) == 65+j) 
////					alph[j]++;
////		}
//		for(int i = 0; i < str.length(); i++) {
//			int num = str.charAt(i) - 'A';
//			alph[num]++;
//		}
//		for(int i = 0; i < 26; i++) {
//			if(maxVal <= alph[i]) {
//				if(maxVal == alph[i])
//					isDouble1 = true;
//				else
//					isDouble1 = false;
//				maxVal = alph[i];
//				maxIdx = i;
//			}
//		}
//		if(isDouble1)
//			System.out.print("?");
//		else
//			System.out.printf("%c", 65+maxIdx);
		
		
		//팰린드롬인지 확인하기
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		boolean isPal = true;
//		for(int i = 0; i < str.length()/2; i++)
//			if(str.charAt(i) != str.charAt(str.length() - i - 1))
//				isPal = false;
//		System.out.println(isPal == true ? 1:0);
		
		
		//별 찍기 - 7
//		Scanner scan = new Scanner(System.in);
//		int nNum = scan.nextInt();
//		for(int i = 0, n = 3; i < nNum * 2 - 1; i++) {
//			if (i < nNum) {
//				for (int j = 0; j < nNum - i - 1; j++)
//					System.out.print(" ");
//				for (int k = 0; k < 1 + (i * 2); k++)
//					System.out.print("*");
//			}
//			else { 
//				for(int j = 0; j < i - (nNum-1); j++) 
//					System.out.print(" ");
//				for(int k = 0; k < nNum*2-n; k++)
//					System.out.print("*");
//				n+=2;
//			}
//			System.out.println();
//		}
		
		
		//킹, 퀸, 룩, 비숍, 나이트, 폰
//		Scanner scan = new Scanner(System.in);
//		int[] rightNum = {1, 1, 2, 2, 2, 8};
//		int[] num = new int[6];
//		for(int i = 0; i < 6; i++) {
//			num[i] = scan.nextInt();
//			num[i] = rightNum[i] - num[i];
//		}
//		for(int i = 0; i < 6; i++)
//			System.out.printf("%d ", num[i]);
		
		
		//새싹
//		System.out.println("         ,r'\"7");
//		System.out.println("r`-_   ,'  ,/");
//		System.out.println(" \\. \". L_r'");
//		System.out.println("   `~\\/");
//		System.out.println("      |");
//		System.out.println("      |");
	}
}
