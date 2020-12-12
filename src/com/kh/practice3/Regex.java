package com.kh.practice3;

import java.util.regex.Pattern;

public class Regex {
	public void practice1() {
		String name= "홍길동";
		String tel = "010-1234-5678";
		String email = "abc@naver.com";
		
		// 유효성 검사
		boolean name_check = Pattern.matches("^[가-힣]*$", name);
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9], input)-(?:\\d{3}|\\d{4})-\\d{4}$",tel);
		boolean email_checl= Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);
		
		System.out.println("이름 : "+name_check);
		System.out.println("전화번호 : "+name_check);
		System.out.println("이메일 : " +name_check);
	}
}
