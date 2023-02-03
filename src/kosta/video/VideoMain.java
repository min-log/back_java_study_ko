package kosta.video;

//1. Video --> 비디오 정보를 담고 있다.(번호, 제목, 배우) 
//2. GeneraMember -> 일반회원에 대한 정보(아이디, 이름, 주소,  빌린비디오)   
//       -> 일반회원내역 출력(아이디, 이름, 주소, 빌린비디오 정보 )


public class VideoMain {
	

	public static void main(String[] args) {
		
		GeneraMember memberList[] = new GeneraMember[2]; 
		//부모 객체 배열 생성 --> 이유  : 메모리 효율 ? > 자식 객체 배열로 하면 for문으로 리스트 실행시 메모리를 계속 배열의 길이 만큼 참조.
		
		//12. 비디오 객체 생성
		Video v1 = new Video(1,"탐건2","톰크루즈"); //  0x100
		Video v2 = new Video(2,"아바타2","아바타"); // 0x200
		
		//13. 회원 객체 생성
		//SpecialMember
		
		memberList[0] = new SpecialMember("id_a", "홍길동", "서울시" , "특별");	
		memberList[1] = new SpecialMember("id_b", "김", "경기도" , "일반");	
		//14. 회원 비디오 선택
		memberList[0].rental(v1); // 0x200
		memberList[1].rental(v2); // 0x200
		
		if(memberList[0] instanceof SpecialMember) {
			
			System.out.println("참조한다.");
			for (int i = 0; i < memberList.length; i++) {
				memberList[i].show();
			}
			
			
		}else {
			System.out.println("참조하지 않는다.");
		}
		
		
		
		


		
		
		
		

	}

}
