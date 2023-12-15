package com.test.tab.study10;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		//달팽이는 올라가고 싶다 - 풀지 못함
		//낮에 올라가는 시간 A 자면서 내려가는 시간 B 높이 V
//		Scanner in = new Scanner(System.in);
//		int up = in.nextInt();		// A
//		int down = in.nextInt();	// B
//		int length = in.nextInt(); 	// C
//		int day = (length - down) / (up - down);
//		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
//		if ((length - down) % (up - down) != 0)
//			day++;
//		System.out.println(day);
		
		
		//분수찾기
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int cnt = 1; //대각선 몇 번째 줄인지 계산, 각 줄의 칸마다 데이터의 합은 cnt + 1
//		int leftVal = 0;
//		int rightVal = 0;
//		boolean isStartTop = false; //왼쪽에서 위로 먼저 시작
//		boolean isRun = true;
//		while(isRun) {
//			if(num <= cnt) {
//				if(isStartTop) {
//					rightVal = (cnt+1) - num;
//					leftVal = (cnt+1) - rightVal;
//					System.out.printf("%d/%d", leftVal, rightVal);
//					isRun = false;
//				}else {
//					leftVal = (cnt+1) - num;
//					rightVal = (cnt+1) - leftVal;
//					System.out.printf("%d/%d", leftVal, rightVal);
//					isRun = false;
//				}
//			}
//			else {
//				num -= cnt;
//			}
//			cnt++;
//			isStartTop = isStartTop ? false : true;
//		}
		
		
		//벌집
		//1-6-12-18-24-30-36 -> (6 * i)
		// 5 6  6  6  6  6
//		Scanner scan = new Scanner(System.in);
//		int selNum = scan.nextInt();
//		int areaNum = 1;
//		int cnt = 0;
//		while(true) {
//			cnt++;
//			if(selNum <= areaNum) {
//				break;
//			}
//			areaNum = areaNum + (6*cnt);
//		}
//		System.out.println(cnt);
//		
		
		//중앙 이동 알고리즘
		//  초기값
		//  2^2  3^2  5^2  9^2  17^2
		//     +1   +2   +4   +8    +16
		// num은 2^n승+1
//		Scanner scan = new Scanner(System.in);
//		int cnt = scan.nextInt();
//		int num = 0;
//		int nVal = 0;
//		num = (int) Math.pow(2, cnt) + 1;
//		nVal += Math.pow(num, 2);
//		System.out.println(nVal);
		
		
		//세탁소 사장 동혁
//		Scanner scan = new Scanner(System.in);
//		final int Quarter = 25;
//		final int Dime = 10;
//		final int Nickel = 5;
//		final int Penny = 1;
//		int cnt = scan.nextInt();
//		int[] nQuarter = new int[cnt];
//		int[] nDime = new int[cnt];
//		int[] nNickel = new int[cnt];
//		int[] nPenny = new int[cnt];
//		int[] chg = new int[cnt];
//		for(int i = 0; i < cnt; i++) {
//			chg[i] = scan.nextInt();
//			nQuarter[i] = chg[i]/Quarter;
//			chg[i] %= Quarter;
//			nDime[i] = chg[i]/Dime;
//			chg[i] %= Dime;
//			nNickel[i] = chg[i]/Nickel;
//			chg[i] %= Nickel;
//			nPenny[i] = chg[i]/Penny;
//		}
//		
//		for(int i = 0; i < cnt; i++)
//			System.out.printf("%d %d %d %d\n", nQuarter[i], nDime[i], nNickel[i], nPenny[i]);
		
		
		//진법 변환 2 == 일단 포기 -> 재도전
		//몫과 나머지를 구해서 몫은 다시 나누고 나머지는 앞으로 보내고
		//나머지가 10 이상이면 대문자 알파벳으로 변환-계속 런타임 에러가 뜸
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt(); //10진법
//		int system = scan.nextInt(); //변환할 진법
//		int rest = 0; //나머지
//		String result = "";
//		
//		while (true) {
//			rest = num % system;
//			if (num < system) {
//				if (0 <= num && num < 10)
//					result = String.format("%d", num) + result;
//				else
//					result = String.format("%c", (char) (num + 'A' - 10)) + result;
//				break;
//			}
//			else if (0 <= rest && rest < 10)
//				result = String.format("%d", rest) + result;
//			else if (10 <= rest)
//				result = String.format("%c", (char) (rest + 'A' - 10) + result);
//			num /= system;
//			// 10이 A가 되려면 10 + 55
//		}
		//인터넷에서 해당 함수를 찾음
		//integer.toString(바꿀수, 바꿀진법)을 대문자로
//		System.out.println(result);
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		System.out.println(Integer.toString(a, b).toUpperCase());
		
		
		//진법 변환 실패
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		int system = scan.nextInt();
//		int total = 0;
//		for(int i = 0; i < str.length(); i++) {
//			if('0' <= str.charAt(str.length() - 1 - i) && str.charAt(str.length() - 1 - i) <= '9') {//0~9 사이면
//				int num = str.charAt(str.length() - 1 - i) - '0';
//				int plus = (int)Math.pow(system, i);
//				num *= plus;
//				total += num;
//			}
//			else {
//				int num = str.charAt(i) - 55;
//				int plus = (int)Math.pow(system, i);
//				num *= plus;
//				total += num;
//			}
//		}
//		System.out.println(total);
//		
//		Scanner sc = new Scanner(System.in);
//        String n = sc.next();//진법변환할 문자열 넘버
//        int b = sc.nextInt();//진수
//
//        long result = 0;
//        int idx = 0;// 승 0, 1, 2, 3 ....
//        int num = 0;//계산하기 위해 각 자리 숫자를 10진수로 바꿔준다
//        for (int i = n.length()-1; i >= 0; i--) {
//            char c = n.charAt(i);
//            if (c>='0' && c<='9')
//                num = c - '0';//0~9 사이는 그대로 출력
//            else
//                num = c - 55;//A~Z는 숫자로 변경
//            result += num * Math.pow(b, idx++);
//        }
//        System.out.println(result);
	}
}
