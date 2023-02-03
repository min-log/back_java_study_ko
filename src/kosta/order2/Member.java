package kosta.order2;
//이름,주소
public class Member {
	private String name;
	private String address;
	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
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
