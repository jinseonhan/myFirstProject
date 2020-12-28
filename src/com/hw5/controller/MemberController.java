package com.hw5.controller;

import com.hw5.model.vo.Member;

public class MemberController {
	public static int SIZE =10;
	private int memberCount=0;
	private Member[] mem;
	
	public int getMemberCount() {
		return memberCount;
	}
	public Member[] getMem() {
		
		
	}
	
	public Member checkId(String userId) {
		for(int i=0;i<mem.length;i++) {
			if(mem!=null) {
				if(mem[i].getUserId()==userId) {
					System.out.println("중복된 아이디가 존재합니다. 회원등록 실패");
					return;
				}
				
			}
		}
	}

	public void insertMember(Member m) {
		
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
