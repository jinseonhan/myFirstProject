package com.my.test;

public class Test {
	public static void main(String[] args) {
		String str=  "abcd";
		String str1= "efgh";
		StringBuilder sb = new StringBuilder(str);
		sb.append(str1);
		sb.setCharAt(0, 'z');
		sb.setCharAt(5, 'p');
		for(int i=0;i<sb.length();i++) {
			System.out.print(sb.toString().charAt(i)+"+");
		}
	}
}
