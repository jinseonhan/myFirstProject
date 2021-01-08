package com.hw9.run;

import com.hw9.controller.SetDate;

public class Run {
	public static void main(String[] args) {
		SetDate tw1 = new SetDate();
		
		// todayPrint()를 출력한다.
		System.out.println(tw1.todayPrint());
		
		// setDay()를 출력한다.
		System.out.println(tw1.setDay());
	}
}
