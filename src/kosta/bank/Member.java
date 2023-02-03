package kosta.bank;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	private String address;
	
	public Member() {};
	public Member(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	//최초의 정렬기준.
	@Override
	public int compareTo(Member o) {
		// 나이를 기준으로 오름 차순 
			// o 뒤에꺼	
		if (age < o.age) {
			return -1;
		}else if(age > o.age) {
			return 1;
		}
		return 0;
	}
	
	
	
}
