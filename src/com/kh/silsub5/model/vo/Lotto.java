package com.kh.silsub5.model.vo;

public class Lotto {
	private int lotto[]=new int[6];
	
	public Lotto() {
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)((Math.random()*45)+1);
		}
	}
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto(int[] lotto) {
		this.lotto=lotto;
	}
	
	public void information() {
		for(int i=0;i<lotto.length;i++) {
			System.out.print((i+1)+" : "+lotto[i]+" ");
		}
		System.out.println();
	}
}
