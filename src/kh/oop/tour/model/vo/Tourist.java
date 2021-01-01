package kh.oop.tour.model.vo;

public class Tourist {
	int myMoney;
	int myMile;
	
	public Tourist() {}
	
	public Tourist(int myMoney, int myMile) {
		this.myMoney=myMoney;
		this.myMile=myMile;
	}
	
	public int getMyMoney() {
		return myMoney;
	}
	public int getMyMile() {
		return myMile;
	}
	
	public void setMyMoney(int myMoney) {
		this.myMoney=myMoney;
	}
	public void setMymile(int myMile) {
		this.myMile=myMile;
	}
	
	
	
}
