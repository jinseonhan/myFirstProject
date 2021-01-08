package com.hw9.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class SetDate {
	public SetDate() {}
	public String todayPrint() {
		Calendar date = Calendar.getInstance();
		// 오늘의 년, 월, 일, 시, 분, 초를 각 변수에 담은 후 오늘은 String으로 리턴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String dateOutput= sdf.format(date.getTime());
		
		return dateOutput;
	}
	
	public String setDay() {
		Calendar date = Calendar.getInstance();
		// "2011년 3월 21일 월요일"을 세팅하여 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		// 1.요일을 추가애햐함.
		// 2.그리고 연도, 월, 일을 임의로 변경해야함
		int dateNum = date.get(Calendar.DAY_OF_WEEK);
		String day = "";
		switch(dateNum) {
		case 1: day="일요일";break;
		case 2: day="월요일";break;
		case 3: day="화요일";break;
		case 4: day="수요일";break;
		case 5: day="목요일";break;
		case 6: day="금요일";break;
		case 7: day="토요일";break;
		}
		
		
		date.add(Calendar.YEAR, -10);
		date.add(Calendar.MONTH, 2); // 기준이 1월임 +1 안해도됨
		date.add(Calendar.DATE, 13);
		String dateOutput= sdf.format(date.getTime())+day;
		
		return dateOutput;
	}
	
	
}
