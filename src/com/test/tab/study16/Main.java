package com.test.tab.study16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		//균형잡힌 세상
		//소괄 스택1, 대괄 스택1, .이면 종료, 다음 행에 아무것도 없을때까지 읽어야함.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<>();//
		String line;
		
		while(true) {
			line = br.readLine();
			if(line.substring(0).equals(".")) break;
			for(int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if(ch == '(' || ch == '[')
					s.push(ch);
				else if(ch == ')' || ch == ']') {
					if(ch == ')') {
						if(s.isEmpty()) {
							s.push('e');
							break;
						}
						else if(s.peek().equals('[')) 
							break;
						else if(s.peek().equals('(')) 
							s.pop();
					}else if(ch == ']') {
						if(s.isEmpty()) {
							s.push('e');
							break;
						}
						else if(s.peek().equals('(')) 
							break;
						else if(s.peek().equals('[')) 
							s.pop();
					}
				}
			}
			if(s.isEmpty())
				sb.append("yes\n");
			else
				sb.append("no\n");
			s.clear();
		}
		System.out.println(sb);
		
		
		//괄호
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < cnt; i++) {
//			Stack<String> stack = new Stack<String>();
//			String str = br.readLine();
//			for(int j = 0; j < str.length(); j++)
//				if(str.charAt(j) == '(') 
//					stack.push("(");
//				else
//					if(stack.isEmpty()) {
//						stack.push("error");
//						break;
//					}
//					else
//						stack.pop();
//			
//			if(stack.isEmpty())
//				sb.append("YES\n");
//			else
//				sb.append("NO\n");
//		}
//		System.out.println(sb);
		
		
		
		//제로 stack은 후입선출구조로 제일 마지막에 넣은 데이터만 출력, 삭제가 가능함
//		Stack<Integer> stack = new Stack<Integer>();//스택은 후입선출
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			int nNum = Integer.parseInt(br.readLine());
//			if(nNum == 0)
//				stack.pop();//스택의 맨 위(가장 최근에 추가된) 요소를 제거하고 반환
//			else 
//				stack.push(nNum);
//		}
//		int sum = 0;
//		for(int i = 0; i < stack.size(); i++)
//			sum += stack.get(i);
//		System.out.println(sum);
		
		
		//스택
//		Stack<Integer> list = new Stack<Integer>();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
//		int cnt = Integer.parseInt(br.readLine());
//		for(int i = 0; i < cnt; i++) {
//			st = new StringTokenizer(br.readLine());
//			String strNum = st.nextToken();
//			if(strNum.equals("1"))
//				list.push(Integer.parseInt(st.nextToken()));
//			else if(strNum.equals("2"))
//				if(!list.isEmpty()) {
//					sb.append(list.lastElement()).append("\n");
//					list.pop();
//				}
//				else
//					sb.append(-1).append("\n");
//			else if(strNum.equals("3"))
//				sb.append(list.size()+"\n");
//			else if(strNum.equals("4"))
//				if(list.isEmpty())
//					sb.append(1 + "\n");
//				else
//					sb.append(0 + "\n");
//			else if(strNum.equals("5"))
//				if(list.isEmpty()) 
//					sb.append(-1 + "\n");
//				else
//					sb.append(list.lastElement() + "\n");	
//		}
//		System.out.println(sb);
	}
}
