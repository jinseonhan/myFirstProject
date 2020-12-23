package com.kh.silsub1.run;

import com.kh.silsub1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		// 기본생성자를 통해 Member type의 객체를 생성하고 setter를 이용해 값 변경 후 getter를 이용해 출력
		Member m = new Member("abcId", "abcPwd", "abcName", 30, 'M', "01012345678", "abc@naver.com");				
		
		System.out.println(m.getMemberId());
		m.setMemberId("idAbc");
		System.out.println(m.getMemberId());

	}
}
