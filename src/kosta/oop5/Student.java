package kosta.oop5;

public class Student extends Man {
	
	//public Student() {}
	public Student(String name) {
		super(name);
	}
	public void speak() {
		super.setName(name);
		System.out.println(super.getName() + "공부나 열심히해");
	}
}
