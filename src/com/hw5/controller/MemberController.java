package com.hw5.controller;

import java.util.Scanner;

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
			if(mem[i].getUserId().equals(userId)) {					
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
		Member searchMember =null;
		if(menu==1) {
			for(int i=0;i<memberCount;i++) {
				if(mem[i].getUserId().equals(search)){
					searchMember = mem[i]; 
				}
			}
		}else if(menu==2) {
			for(int i=0;i<memberCount;i++) {
				if(mem[i].getName().equals(search)){
					searchMember = mem[i]; 
				}
			}
		}else if(menu==3) {
			for(int i=0;i<memberCount;i++) {
				if(mem[i].getEmail().equals(search)){
					searchMember = mem[i]; 
				}
			}
		}
		
		return searchMember;
	}
	
	public void updateMember(Member m, int menu, String update) {
		for(int i=0;i<memberCount;i++) {
			if(mem[i]==m) {
				switch(menu) {
				case 1 : mem[i].setUserPwd(update);break;
				case 2 : mem[i].setName(update);break;
				case 3 : mem[i].setEmail(update);break;
				}
				System.out.println("회원정보가 변경되었습니다.");
			}
		}
	}
	
	public void deleteMember(String userId) {
		for(int i =0;i<memberCount;i++) {
			if(mem[i].getUserId().equals(userId)) {
				mem[i]=null;
				// 그리고 앞으로 당겨라
				for(int j=i;j<memberCount;j++) {
					mem[j]=mem[j+1];
				}
				mem[memberCount]=null;
				memberCount--;
				break;
			}
		}
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
