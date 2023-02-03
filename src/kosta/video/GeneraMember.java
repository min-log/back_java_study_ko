package kosta.video;
// GeneraMember -> 일반회원에 대한 정보(아이디, 이름, 주소,  빌린비디오) 
//2. GeneraMember -> 일반회원에 대한 정보(아이디, 이름, 주소,  빌린비디오)   
//-> 일반회원내역 출력(아이디, 이름, 주소, 빌린비디오 정보 )

public class GeneraMember {
	// 6. 필드 선언
	private String id;
	private String name;
	private String address;
	private Video rentalVideo[];//Video 객체 0x200 // 비디오 두개 빌리기 > 배열로 변경 

	private int count = 0;
	
	
	// 7. 디폴트 생산자
	public GeneraMember() {}
	
	// 8. 필드 초기화하기 위한  생성자 추가 
	public GeneraMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		rentalVideo = new Video[5]; // 비디오 생성
	}
	
	
	// 9.비즈니스 메소드  >  나중에 빌린 비디오를 넣어준다.... 그러기 위해서 
	public void rental (Video video) { // 0x200
		rentalVideo[count++] = video;
	}
	
	//10. 회원정보 출력 
	public void show() {

		System.out.println("회원아이디 : "+ id);
		System.out.println("회원이름 : "+ name);
		System.out.println("회원주소 : "+ address);
		for (int i = 0; i < count; i++) {
			rentalVideo[i].VideoShow(); // 11. 비디오 정보 출력 0x200 
		}
			
	
		
	}
	//11. SET GET메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video[] getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video[] rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	


		

	
	

	
	
	
	
	
	
	
	
}
