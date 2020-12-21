package com.kh.practice5;

public class Array {
	// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하시오
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.println(arr[i]);
		}	
	}
	
	public void practice2() {
		// 길이가 5인 String 배열을 선언하고, "사과","귤","포도","복숭아","참외"로 초기화 한 후 배열 인덱스를 활용하여 귤을 출력하세요.
		String[] str = {"사과", "귤", "포도" , "복숭아", "참외"};
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("귤")) {
				System.out.println("귤은 str의 "+i+ "인덱스에 있습니다.");
			}
		}
	}
	
	public void practic3(String str, char c) {
		// 문자열을 하나 입력 받아 배열에 넣고 문자 하나를 입력 받아 입력한 문자가 문자열에 몇 개가 들어가는지 개수를 출력하세요.
		int count=0;
	
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("c 의 갯수는 "+count+"개 입니다.");
	}
	
	public void practice4(String str) {
		// 주민등록번호 성별 자리 이후부터 *로 가리고 출력하시오
		// 단, 원본 배열 값을 변경 없이 배열 복사본으로 변경하세요.
		char regi[] = new char[str.length()];
		char regiclone[];

		for(int i=0;i<str.length();i++) {
			regi[i]=str.charAt(i);
		}
			regiclone=regi.clone();
		for(int i=0;i<regiclone.length;i++) {
			if(i==7) {
				System.out.print('*');
			}else {
				System.out.print(regiclone[i]);				
			}
		}	
	}
	
	public void practice5(int n) {
		// 홀수인 자연수를 입력받아 배열의 중간 까지는 1부터 1씩증가하여 오름차순으로 값을 넣고
		// 중간 이후부터는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		if(n%2==0) {
			System.out.println("홀수가 아닙니다.");
			return;
		}
		
		int arr[] = new int[n];
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(n/2>i) {
				arr[i]=count++;
			}else {
				arr[i]=count--;
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	// 로또 생성기
	public void practice6() {
		int lotto[] = new int [6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			System.out.print(lotto[i]+" ");
		}
		
	}
	
	
}	
