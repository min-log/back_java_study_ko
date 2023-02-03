package kosta.api;

public class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//호출은  p1
		Person p = (Person)obj; //파라미터로 넘어온 값은 > p2
		
		if(name.equals(p.getName()) && age == p.getAge()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	
	
}
