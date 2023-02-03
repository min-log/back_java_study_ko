package kosta.oop5;

public class Work extends Man implements Speakable {
	//private String name;
	
	public Work() {}
	public Work(String name) {
		super(name);
	}
	@Override
	public String speak() {
		super.setName(name);
		return super.getName() + "열심히 일해야 한다.";
	}
		

}
