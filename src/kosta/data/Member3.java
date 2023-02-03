package kosta.data;

public class Member3 implements Comparable<Member3> {
	String name;
	int age;
	String address;
	
	
	public Member3(String name, int age, String address) {
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


	@Override
	public int compareTo(Member3 o) {
		if (age < o.age) {
			return -1; // 안움직임
		}else if(age > o.age){
			return 1; // 변화
		}
		return 0;
	}
	
	
}
