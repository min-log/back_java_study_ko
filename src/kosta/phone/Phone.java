package kosta.phone;

import java.io.Serializable;

public class Phone implements Serializable {

	private int No; //번호
	private String name; //이름
	private String phoneNo; //핸드폰번호
	private String birth; //생년월일
	
	
	public Phone() {} //디폴트 
	public Phone(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	
	//저장 값 출력
	public void show (int No) {		
		System.out.println("번호 "+ (No + 1) + "\n이름 : " + name + "\n핸드폰번호 : " + phoneNo  +"\n생년월일 : " + birth );
		//System.out.println(phoneNo);
	}
	
	
	// set / get 메소드 가장 하단에 만들기
	// > 정보은닉, 캡슐화
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
	
}
