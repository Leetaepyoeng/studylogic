package com.test.tab.study16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		//스택
		Stack<Integer> list = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int cnt = Integer.parseInt(br.readLine());
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			String strNum = st.nextToken();
			
			if(strNum.equals("1"))
				list.push(Integer.parseInt(st.nextToken()));
			else if(strNum.equals("2"))
				if(!list.isEmpty()) {
					sb.append(list.lastElement()).append("\n");
					list.pop();
				}
				else
					sb.append(-1).append("\n");
			else if(strNum.equals("3"))
				sb.append(list.size()+"\n");
			else if(strNum.equals("4"))
				if(list.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
			else if(strNum.equals("5"))
				if(list.isEmpty()) 
					sb.append(-1 + "\n");
				else
					sb.append(list.lastElement() + "\n");	
		}
		System.out.println(sb);
	}
}
