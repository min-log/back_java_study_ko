package kosta.oop5;

public class Man {
	String name;
	Speakable speak;
	
	
	public Man() {}
	public Man(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		speak.speak();
		
	}
	
	
	//get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
