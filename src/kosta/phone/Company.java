package kosta.phone;

import java.io.Serializable;

public class Company extends Phone implements Serializable {
	//Company (dept,position) 부서, 직급
	private String dept;
	private String position;
	
	public Company() {}
	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}
	
	
	
	
	
	//set,get
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
