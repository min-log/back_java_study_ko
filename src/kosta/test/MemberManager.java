package kosta.test;

import java.util.Scanner;

public class MemberManager {
	// 행동 회원검색 , 회원추가(아이디 중복 확인), 회원탈퇴, 회원리스트 확인 ,정보 수정(아이디 패스워드가 두개다 일치시 변경가능)
	Scanner sc = new Scanner(System.in);
	Member member[] = new Member[10]; // 클레스가 배열로 선언만 된 상태
	int count = 0;
	
	
	String id;
	String pw;
	String name;
	String age;
	String phone;
	String address;
	
	int idx = -1;
	String searchKey;
	
	public void MemberAdd() {
		System.out.println("회원추가");
		System.out.print("아이디 :");
		id = sc.nextLine();
		 
		
		if (count == 0) {
			//System.out.println("처음이야.");
			idx = 1;
		}else if (count > 0) {
			//System.out.println(count + "명");
			for (int i = 0; i < count; i++) {
				if(member[i].id.equals(id)) {
					idx= -1;
					break;
				}
			}
		}
		
		
		if(idx == -1) {
			System.out.println("아이디가 존재합니다.");
		}else {
			System.out.print("비밀번호 :");
			pw = sc.nextLine();
			System.out.print("이름 :");
			name = sc.nextLine();
			System.out.print("나이 :");
			age = sc.nextLine();
			System.out.print("핸드폰번호 :");
			phone = sc.nextLine();
			System.out.print("주소 :");
			address = sc.nextLine();
	
			member[count++] = new Member(id, pw, name, age, phone, address);//클레스 초기화
		}
	}//MemberAdd

	
	
	//전체 멤버 리스트 출력
	public void MemberList() {
		for (int i = 0; i < count; i++) {
			member[i].ListMember();
		}
	};//MemberList
	
	//회원 삭제
	public void MemberRemove() {
		System.out.print("탈퇴 회원 아이디 입력 : ");
		searchKey = sc.nextLine();
		
		for (int i = 0; i < count; i++) {
			if (member[i].id.equals(searchKey)) {
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 회원이 없습니다.");
		} else {
			System.out.println(member[idx].id + "님의 비밀번호를 확인해주세요.");
			System.out.print("비밀번호 확인 : ");
			
			if(member[idx].pw.equals(sc.nextLine())) {
				System.out.println("회원탈퇴 되었습니다.");
				
				//삭제
				for (int i = idx; i < count; i++) {
					member[i] = member[i + 1];
				}
				member[count-1] = null; // 빈자리 값 - null
				count--;
				
				
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			

		}
	}//MemberRemove
	
	
	//수정



	public void MemberUpdate() {
		System.out.print("수정 회원 아이디 입력 : ");
		searchKey = sc.nextLine();
		for (int i = 0; i < count; i++) {
			if(member[i].id.equals(searchKey)) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("해당 회원이 없습니다.");
		}else {
			System.out.println(member[idx].id + "님의 비밀번호를 확인해주세요.");
			System.out.print("비밀번호 확인 : ");
			if(member[idx].pw.equals(sc.nextLine())) {
				System.out.println("수정정보를 입력해주세요.");
				System.out.print("비밀번호 :");
				member[idx].pw = sc.nextLine();
				System.out.print("이름 :");
				member[idx].name = sc.nextLine();
				System.out.print("나이 :");
				member[idx].age = sc.nextLine();
				System.out.print("핸드폰번호 :");
				member[idx].phone = sc.nextLine();
				System.out.print("주소 :");
				member[idx].address = sc.nextLine();
				
				System.out.println("수정완료");
			}
		}
		
	} //MemberUpdate end


	//검색
	public void MemberSearch() {
		System.out.println("찾고싶은 회원을 입력하세요.");
		System.out.print("아이디 :");
		
		for (int i = 0; i < count; i++) {
			if(member[i].id.equals(searchKey)) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("해당 회원이 없습니다.");
		}else {
			System.out.println(member[idx].id + "님의 비밀번호를 확인해주세요.");
			System.out.print("비밀번호 확인 : ");
			if(member[idx].pw.equals(sc.nextLine())) {
				System.out.println(member[idx].name);
				System.out.println(member[idx].age);
				System.out.println(member[idx].phone);
				System.out.println(member[idx].address);
			}
		}
		
	}//MemberSearch end
	
	
	
}
