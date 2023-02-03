package kosta.oop2;

public class Person {
	private String name;
	private Role role;
	

	public Person() {}
	
	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	
	
	//수행메서드
	public void doIt() {
		role.doing();
	}
	
	
	
	//SET/GET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
