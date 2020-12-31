package com.hw5.view;

import java.util.Scanner;

import com.hw5.controller.MemberController;
import com.hw5.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 메뉴 출력 >> 반복 처리
		while(true){
			int num =0;
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1.신규 회원 등록");
			System.out.println("2.회원 정보 검색");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 정보 삭제");
			System.out.println("5.회원 정보 출력");
			System.out.println("6.회원 정보 정렬");
			System.out.println("9.프로그램 종료");
			num=sc.nextInt();
			switch(num) {
				case 1 : inserMember();
				break;
				case 2 : searchMember();
				break;
				case 3 : updateMember();
				break;
				case 4 : deleteMember();
				break;
				case 5 : printAllMember();
				break;
				case 6 : sortMember();
				break;
				case 9 : System.out.println("프로그램을 종료합니다.");
				return;
				default : continue;
			}
		}
	}
	
	public void inserMember() {
		// memberCount가 최대 회원수를 넘어설 경우 return처리
		if(MemberController.SIZE<=mc.getMemberCount()) {
			System.out.println("최대 회원을 넘어섰습니다.");
			return;
		}else {
			sc.nextLine();
			System.out.println("추가할 아이디를 입력하세요.");
			String userId = sc.nextLine();
			
			if(mc.checkId(userId)!=null) {
				System.out.println("중복된 아이디가 존재합니다.");
				return;
			}else {
				System.out.println("비밀번호를 입력하세요.");
				String userPwd = sc.nextLine();
				System.out.println("이름을 입력하세요.");
				String name= sc.nextLine();
				System.out.println("나이를 입력하세요.");
				int age =sc.nextInt();
				sc.nextLine();
				System.out.println("성별을 입력하세요.");
				char gender=sc.nextLine().charAt(0);
				System.out.println("이메일을 입력하세요.");
				String email=sc.nextLine();
				
				Member m = new Member(userId, userPwd, name, age, gender, email);
				
				mc.insertMember(m); // controller에 정보 전달
			}
		}
	}
	
	public void searchMember() {
		while(true) {
			System.out.println("==== 회원 정보 검색 ====");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			if(menu==9) {
				break;
			}
			sc.nextLine();
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();
			
			if(menu!=9){
				Member m = mc.searchMember(menu, search);
				if(m==null) {
					System.out.println("검색된 결과가 없습니다.");
				}else {
					System.out.println(m.information());
				}		
			}else {
				System.out.println("이전으로 돌아갑니다.");
				return;
			}	
		}
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("====  회원 정보 수정 ====");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			if(menu==9) {
				break;
			}
			System.out.println("변경할 회원 아이디");
			String userId= sc.nextLine();
			
			Member m =mc.checkId(userId);
			
			if(m==null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			}else {
				System.out.println(m.information()); // 변경할 내용 출력
				
				System.out.println("어떻게 변경하시겠습니까?");
				String update = sc.nextLine();
				
				mc.updateMember(m, menu, update);
			}
			
		}
	}
	public void deleteMember() {
		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m==null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			System.out.println("정말 삭제하시겠습니까?(Y/N)");
			String yn = sc.nextLine().toUpperCase();
			if(yn.equals("Y")) {
				mc.deleteMember(userId);
			}else if(yn.equals("N")) {
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void printAllMember() {
		Member[] mem = mc.getMem();
		for(int i=0;i<mem.length;i++) {
			if(mem[i]!=null) {
				System.out.println(mem[i].information());
			}
		}
		
	}
	public void sortMember() {
		Member[] sortMem=null; // 정렬 결과를 받아 줄 객체 배열 초기화
		
		while(true) {
			System.out.println("==== 회원 정보 정렬 ====");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남/여 순)");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1 : sortMem=mc.sortIdAsc(); break;
				case 2 : sortMem=mc.sortIdDesc(); break;
				case 3 : sortMem=mc.sortAgeAsc(); break;
				case 4 : sortMem=mc.sortAgeDesc(); break;
				case 5 : sortMem=mc.sortGenderDesc(); break;
				case 9 : System.out.println("회원 정보 정렬을 나갑니다.");break;
				default : continue;
			}
			
			for(int i=0;i<sortMem.length;i++) {
				if(sortMem[i]!=null) {
					System.out.println(sortMem[i].information());
				}
			}
		}
	}
}
