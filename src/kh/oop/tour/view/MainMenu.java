package kh.oop.tour.view;

import java.util.Scanner;

import kh.oop.tour.controller.TourController;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	
	TourController tc= new TourController();
	
	public MainMenu() {}
	
	public void mainMenu() {
		// 여행객의 현재 보유 금액과 마일리지 및 항공사의 메인 메뉴를 출력
		
		System.out.print("현재 보유 금액 : ");
		System.out.println(tc.bringMyMoney());
		System.out.println();
		System.out.print("현재 보유 마일리지 : ");
		System.out.println(tc.bringMyMile());
		System.out.println();
		while(true){
			System.out.println("==========================");
			
			System.out.println("번호   목적지        가격            마일리지");
			System.out.println("1   미국      300000    3000 ");
			System.out.println("2   중국      100000    1000 ");
			System.out.println("목적지 선택(번호입력) : ");
			int num = sc.nextInt();
	
			switch(num) {
			case 1 : tc.setMyMoney(tc.bringFare());
					 tc.setMymMile(tc.bringMile());
					 break;
			case 2 : tc.setMyMoney(tc.bringFare1());
					 tc.setMymMile(tc.bringMile1());
					 break;
			case 9 : System.out.println("티케팅을 종료합니다.");return;
			default: System.out.println("잘못입력하였습니다.");break;
			}
			
			System.out.print("티케팅 후 잔액 : ");
			System.out.println(tc.bringMyMoney());
			System.out.println();
			System.out.print("티케팅 후  마일리지 : ");
			System.out.println(tc.bringMyMile());
			System.out.println();
		}
		
	}
}
