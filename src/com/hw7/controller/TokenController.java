package com.hw7.controller;

import java.util.StringTokenizer;

public class TokenController {
	public String afterToken(String str) {
		// 공백을 토큰으로 처리한 글자 반환
		StringTokenizer st = new StringTokenizer(str, " ");
		String str1 = "";
		
		while(st.hasMoreTokens()) {
			str1+=st.nextToken();
		}
		return str1;
	}
	
	public String firstCap(String input) {
		// 매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환
		char[] first = input.toCharArray();
		first[0]=Character.toUpperCase(first[0]);
		
		
		return new String(first);
	}
	
	public int findChar(String input, char one) {
		// 매개변수로 받은 문자열 중에서 매개변수로  들어온 문자가 몇 개 존재하는지  개수를 반환
		int count=0;
		
		char[] num= input.toCharArray();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==one) {
				count++;
			}
		}
		
		return count;
	}
}
