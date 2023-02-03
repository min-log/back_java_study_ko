package kosta.mission;

import java.util.Scanner;

//메뉴를 선택해서 해당 메뉴의 명령문을 실행해보자.
// 1.추가 2.출력  3.검색  4.종료
// 키보드로 부터 입력 받은 문자열을  배열에 추가, 출력 , 검색
//각각의 기능을 구현하는 메서드를 만들어서
// 입력: 1
// 문자열 입력: 홍길동
// 입력 : 2 
// 출력 : 내용: 홍길동 , 박길동
// 입력 : 3
// 검색 : 김길동 
// 출력 : 해당 문자열은 존재 하지 않습니다.
// 입력 : 3
// 검색 : 홍길동
// 출력 : 1번에 있습니다.

//순서
// 1. 스케너로 입력 받는거 구현
// 2. 메뉴 1 > 2 > 3 > 4 만들어보기


public class Mission5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) { // 반복하여 실행
			//
			System.out.println("1.추가 2.출력  3.검색  4.종료");
			System.out.println("메뉴를 입력하세요");
			String user_k = sc.nextLine().trim();
			
			
		}
		
		
	}
}
