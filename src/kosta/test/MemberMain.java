package kosta.test;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager mbManager = new MemberManager();
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			
			System.out.println("-------------------------------");
			System.out.println("회원관리 프로그램 시작");
			System.out.println("1.회원추가 2.회원리스트 3.회원검색  4.회원수정 5.회원탈퇴  6.프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			int userkey = sc.nextInt();
			
			switch (userkey) {
			case 1:
				//회원추가
				mbManager.MemberAdd();
				break;
			case 2:
				//회원리스트
				mbManager.MemberList();
				break;
			case 3:
				//회원검색
				mbManager.MemberSearch();
				break;
			case 4:
				//회원수정
				mbManager.MemberUpdate();
				break;
			case 5:
				//회원탈퇴
				mbManager.MemberRemove();
				break;
			case 6:
				return;
	
			default:
				break;
			}
		}//while	
		

	}

}
