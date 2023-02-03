package kosta.test;


public class Member {
	// 회원관리 프로그램
	// 상태 회원  아이디, 패스워드, 이름, 나이 , 폰번호 , 주소
	// 행동 회원검색 , 회원추가, 회원탈퇴, 회원리스트 확인 ,정보 수정
	
	
	String id;
	String pw;
	String name;
	String age;
	String phone;
	String address;
	
	public Member() {}

	public Member(String id, String pw, String name, String age, String phone, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}





	//리스트 확인
	public void ListMember () {
		System.out.println("아이디 :" + id);
		System.out.println("비밀번호 :" + pw);
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("핸드폰번호 :" + phone);
		System.out.println("주소 :" + address);
		System.out.println("----------------------");
	};
	
	
	
	
	
	
}
