package com.hw8.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	Scanner sc= new Scanner(System.in);
	public void spacetoUpper() {
		// 영문을 입력받는다.
		System.out.println("영문을 입력하세요.");
		String str = sc.nextLine();
		
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를 구성
		StringTokenizer st = new StringTokenizer(str, " ");
		// 띄어쓰기 이후 첫 글자는 대문자로 되게하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			char[] ch=st.nextToken().toCharArray();
			
			ch[0]=Character.toUpperCase(ch[0]);
			String str1= new String(ch);
			sb.append(str1+" ");
		}
		System.out.println(sb);
	}
}
