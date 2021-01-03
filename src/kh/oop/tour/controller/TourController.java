package kh.oop.tour.controller;

import kh.oop.tour.model.vo.Airline;
import kh.oop.tour.model.vo.Tourist;

public class TourController {
	Airline al;
	Airline al1;
	Tourist tt;

	{
		// 초기화 블록으로 객체 값을 초기화
		al = new Airline("미국", 3000, 300000);
		al1 = new Airline("중국", 1000, 100000);
		tt = new Tourist(1000000, 4000);
	}
	
	public TourController() {}
	
	public int bringFare() {
		// 목적지 별 요금을 리턴
		return al.getAirfare();
	}
	
	public int bringFare1() {
		// 목적지 별 요금을 리턴
		return al1.getAirfare();
	}
	
	public int bringMile() {
		// 목적지 별 마일리지를 리턴
		return al.getMileage();
	}
	
	public int bringMile1() {
		// 목적지 별 마일리지를 리턴
		return al1.getMileage();
	}
	
	public int bringMyMoney() {
		// 여행객의 보유금액을 리턴
		return tt.getMyMoney();
	}
	
	public int bringMyMile() {
		// 여행객의 마일리지를 리턴
		return tt.getMyMile();
	}
	
	public void setMyMoney(int myMoney) {
		// 여행객의 보유금액을 변경
		tt.setMyMoney(tt.getMyMoney()-myMoney);
	}
	
	public void setMymMile(int myMile) {
		// 여행객의 마일리지 변경
		tt.setMymile(tt.getMyMile()+myMile);
	}
}
