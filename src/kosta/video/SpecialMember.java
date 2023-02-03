package kosta.video;
//특별회원에 대한 정보(보너스포인트)
//-> 보너스정보 출력
public class SpecialMember extends GeneraMember {
	private String memberSelect; // 멤버 구분 : 일반, 특별
	
	private int point = 10;
	
	
	public SpecialMember() {}


	public SpecialMember(String id, String name, String address, String memberSelect) {
		super(id, name, address); //부모생성자 호출
		this.memberSelect = memberSelect;
	}
	
	
	
	// 포인트 금액 
	public void printPoint() {
		// 비디오 대여 갯수에 따라 포인트 추가
		point = point * super.getCount();
		System.out.println(memberSelect +"회원 보너스 포인터 적립 : " + point);
	}
	
	
	
	
	@Override
	public void show() {
		super.show(); // super 부모의 메서드를 호출하기 위해 사용
		
		
		if(memberSelect.equals("특별")) {
			printPoint();
			
		}
		System.out.println("-----------------------");
	}


	
	
	
	//get ,set
	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
	
	
}
