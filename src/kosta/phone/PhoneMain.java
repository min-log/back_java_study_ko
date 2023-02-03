package kosta.phone;

//import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		
		
		// 기본 값  + 출력 문
//		Phone phone[]; //클레스 파일 호출 배열로 생성
//		phone = new Phone[10] ; // 실재 배열 생성

		//기능
		Manager manager;
		manager = new Manager();
		
		
		// 전화번호 생성
		
		String user_search;
		
		
		
		//저장 객체 직렬화
		//불러오기 역 직렬화
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("전화번호 프로그램 실행");
			System.out.println("전화번호 1.추가  2.출력  3.검색  4.수정  5.제거  6.정렬  7.저장  8.불러오기 9.종료");
			System.out.print("메뉴 선택 : ");
			String user_key =DataInput.sc.nextLine();
			
			switch (user_key) {
			case "1":
			case "추가":
				manager.addPhoneInfo();

				break;
			case "2":
			case "출력":
				//선언 배열 이기 때문에 배열 안에 번호로 들어가서 호출해야한다.
				manager.listPhoneInfo();
				
				break;
			case "3":
			case "검색":
				
				manager.searchPhoneInfo();
				break;	
			case "4":
			case "수정":
				
				manager.updatePhoneInfo();
				break;
				
			case "5":
			case "제거":
				
				manager.removePhoneInfo();
				break;
			case "6":
			case "정렬":
				//이름순 정렬
				manager.arrPhoneInfo();
				
				break;
			case "7":
			case "저장":
				manager.fileSave();
				
				break;
			case "8":
			case "불러오기":
				manager.fileInput();
				break;
			case "9":
				System.out.println("프로그램이 종료됩니다.");
				return;	
			default:
				break;
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
