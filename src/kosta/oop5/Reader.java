package kosta.oop5;

public class Reader extends Man implements Speakable {
	//private String name;
	
	public Reader() {}
	public Reader(String name) {
		super(name);
	}


	@Override
	public String speak() {
		super.setName(name);
		return super.getName() + "자바화이팅";
	}
	

}
