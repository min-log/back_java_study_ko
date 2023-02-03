package kosta.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴의 명령문을 실행해보자
		// 1. 추가 2. 출력 3.검색 4. 종료
		// 계속 메뉴 선택이 가능하고 4번을 선택했을때만 종료 return;
	
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			int i = sc.nextInt();
//			
//			if(i == 1) {
//				System.out.println("추가");
//			} else if(i == 2) {
//				System.out.println("출력");
//			} else if(i == 3) {
//				System.out.println("검색");
//			} else if(i == 4) {
//				System.out.println("종료");
//				return;
//			}else {
//				System.out.println("잘못된접근입니다.");
//			}
//		}
		
		
		
		System.out.println("프로그램을 선택해주세요.");
		System.out.println("1. 추가 2. 출력 3.검색 4. 종료");
		while(true) {
			int i =sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("추가");
				break;
			case 2:
				System.out.println("출력");
				break;
			case 3:
				System.out.println("검색");
				break;
			case 4:
				System.out.println("종료");
				return;
			
			}
			
		}
	
		
		
		
		

	}

}
