package kosta.order;

public class Member {
	//이름,주소
	private String name;
	private String address;
	
	public Member() {}
	
	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	//show
	public void MemberShow() {
		System.out.println("회원 이름" + getName());
		System.out.println("회원 주소" + getAddress());
	}
	
	

	
	//get,set 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
