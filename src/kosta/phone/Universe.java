package kosta.phone;

import java.io.Serializable;

public class Universe extends Phone implements Serializable {
	//전공, 학번
	private String major; 
	private int year;
	public Universe() {}
	public Universe(String name, String phoneNo, String birth) {
		super(name, phoneNo, birth);
	}
	
	public Universe(String name, String phoneNo, String birth, String major, int year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}
	


	@Override
	public void show(int No) {
		super.show(No);
		System.out.println("전공 : " + getMajor() + "\n 학번 : " + getYear());
	}



	//get,set
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
