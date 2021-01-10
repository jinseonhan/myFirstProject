package com.hw10.controller;

import com.hw10.model.vo.Guests;

public class RideController {
	Guests[] gs= {new Guests("홍길동",17,'M',120.2),new Guests("유관순",20,'F',120.3),new Guests("김유신",23,'M',110.4),new Guests("김흥부",21,'M',112.5)};
	Guests[] onboard;	// 놀이기구 허용 인원수 크기의 객체 배열 생성
	
	public RideController() {}
	public void cutGuests() {
		// 예외처리를 통해 인원을 제한하고 탑승자와 관련된 정보 출력
		
		// 4명의 탑승 대기자를 생성자를 통한 GUest객체 배열 초기화(Guests[] gs)
		// RollerCoaster클래스의 허용인원 상수값 크기의 또 다른 객체 배열 생성
		// (guests[] onBooard)		

		try {
			// for문과 if문을 통해 RollerCoaster클래스의 허용키 상수값 크기
			// 이상인 사람을 Guests객체 배열 onBoard에 담는다
			
		} catch (Exception e) {// 배열의 크기를 넘어가면 발생되는 예외클래스 참조형 변수 e를 받는 매개변수 자리
			// 문제가 발생한 해당 배열의 인덱스 번호가 몇번에서 발생하는지
			// Throwable클래스의 getMessage()메소드를 통해 출력

		}finally {
			
		}
	}
	
}
