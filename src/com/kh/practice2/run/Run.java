package com.kh.practice2.run;

import com.kh.practice2.OperatorPractice;

public class Run {
	public static void main(String[] args) {
//		new OperatorPractice().practice1();
//		new OperatorPractice().practice2();
		
		if(new OperatorPractice().practice3(333)==9) {
			System.out.println("OK");
		}else {
			System.out.println("fail");
		}
		
	}
}
