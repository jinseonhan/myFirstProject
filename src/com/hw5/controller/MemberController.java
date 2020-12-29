package com.hw5.controller;

import com.hw5.model.vo.Member;

public class MemberController {
	public static int SIZE =10;
	private int memberCount=0;
	private Member[] mem = new Member[SIZE];
	
	public int getMemberCount() {
		return memberCount;
	}
	public Member[] getMem() {
		for(int i=0;i<memberCount;i++) {
			if(mem[i]!=null) {
				
			}
		}
	}
	
	public Member checkId(String userId) {
		Member m;
		for(int i=0;i<memberCount;i++) {
			if(mem[i].getUserId()==userId) {					
				return m=mem[i];
			}
		}
		return null;
	}

	public void insertMember(Member m) {
		// 매개변수로 전달받은 회원정보를 mem객체에 추가
		// memberCount 1 증가
		mem[memberCount] = new Member(m.getUserId(), m.getUserPwd(), m.getName(), m.getAge(), m.getGender(), m.getEmail());
		memberCount++;
	}
	
	public Member searchMember(int menu, String search) {
		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
	}
	
	public void deleteMember(String userId) {
		
	}
	
	public Member[] sortIdAsc() {
		
	}
	
	public Member[] sortIdDesc() {
		
	}
	public Member[] sortAgeAsc() {
		
	}
	public Member[] sortAgeAsc() {
		
	}
	public Member[] sortAgeDesc() {
		
	}
	public Member[] sortGenderDesc() {
		
	}
}
