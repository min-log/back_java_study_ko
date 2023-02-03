package kosta.data;

public class MapMissionClass {
	//이름,점수
	String name;
	int score;
	public MapMissionClass() {}
	public MapMissionClass(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	//get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
}
