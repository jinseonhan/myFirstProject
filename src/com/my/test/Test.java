package com.my.test;

public class Test {
	public static void main(String[] args) {
		// 출력값 00001010
		int[] a = new int[8];
		int i=0;
		int n=10;
		while(n>0) {
			a[i++]= n%2;
			n/=2;
		}
		
		for(i=7;i>=0;i--) {
			System.out.print(a[i]);
		}
		

	}
	
	
}
