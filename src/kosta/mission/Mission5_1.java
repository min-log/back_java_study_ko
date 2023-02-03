package kosta.mission;

import java.util.Scanner;

public class Mission5_1 {
	// 메뉴를 선택해서 해당 메뉴의 명령문을 실행해보자.
	// 1.추가 2.출력  3.검색   4.수정  5.삭제 6.종료
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
	
	// 입력 : 4
	// 대상 입력 : 홍길동
	// 수정: 김길동
	
	//순서
	// 1. 스케너로 입력 받는거 구현
	// 2. 메뉴 1 > 2 > 3 > 4 만들어보기
	
	static int count = 0; // 인덱스 증가 시킬때 사용 
	
	/*
	 * public static int m_new (String m_add) { int m_ch;
	 * 
	 * 
	 * return m_ch; }
	 */
	
	public static void m_new (String m_add[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
//		String usertxt = sc.nextLine().trim();
//		m_add[count++] = usertxt;
		m_add[count++] = sc.nextLine().trim(); //=> 변수 없이 바로 넣는 코드로 변경
		System.out.println("추가완료!");
		
	}// end m_new
	//출력
	public static void m_show (String m_add[]) { //m_add[] 똑같은 이름 선언 해도 되는 이유 지역변수로 해당 메소드 안에서만 사용 하기 때문.
		//향상된 for문은 null값까지 다 출력될 수 밖에 없음
		// 입력 값이 있는 내용만 출력하고 싶을때는 일반 for문
//		for(int i=0;i<m_add.length;i++) {
//			if(m_add[i]!=null) {
//				System.out.println((i+1) + "번 내용:" + m_add[i]);
//			}
//			
//		}
		
		for(int i=0;i<count;i++) { //count 입력 시 + 한번씩 추가 되었기 때문에 입력한 갯수와 동일
			System.out.println((i+1) + "번 내용:" + m_add[i]);
		}
		
	}// end m_show
	
	//검색
	public static void m_search (String m_add[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색 : ");
		String search = sc.nextLine().trim();
		int idx = -1; //- 일치하는 인덱스 번호를 저장하기 위해서 추가 
		
		
		for(int i=0;i<count;i++) {
			
			if(search.equals(m_add[i])) {
				idx = i; // - 해당하는 인덱스 추가해주기
				break;
			} 
			

		}
		
		//- 일치하는 인덱스가 있는지 검사 하여 맞는 값 출력
		if(idx != -1) {
			System.out.println((idx+1) + "번째 있습니다.");
		}else {
			System.out.println("없다");
		}
	
	}// end m_search
	
	public static void m_re (String m_add[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대상 입력:");
//		String m_re_name = sc.nextLine();
//		System.out.println("수정 값 입력:");
//		String m_re_value = sc.nextLine();
//		
//		for(int i=0;i<count;i++) {
//			if(m_re_name.equals(m_add[i])) {
//				m_add[i] = m_re_value;
//			}
//		}
		
		String str = sc.nextLine();
		int idx= -1;
		
		for(int i=0;i<count;i++) {
			if(str.equals(m_add[i])) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			System.out.println("대상을 찾을 수 없습니다.");
		}else {
			System.out.print("수정이름 입력 : ");
			m_add[idx]= sc.nextLine();
		}
		
		//System.out.println(m_add[]);
		
		
	}
	
	public static int delete(String arr[],int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 내용 입력");
		String user_del = sc.nextLine();
		int idx = -1;
		for(int i=0;i<count;i++) {
			if(user_del.equals(arr[i])) {
				idx = i;
			}
			
			
		}
		if(idx == -1) {
			System.out.println("해당 문자 없음");
		}else {
			for (int i = idx; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
				
			}
			count--;
		}
		return n;
	}
	
	
	
	public static void main(String[] args) {
		
		
		// 배열 생성
		int number = 5;
		String m[] = new String[number];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.추가 2.출력  3.검색  4.수정 5.삭제  6.종료"); 
		

		
		while(true) {
			System.out.print("메뉴를 선택하세요 : ");
			int user_ck = Integer.parseInt(sc.nextLine().trim()); // 문자열 공백 제거 후 숫자로 형 변환

			switch (user_ck) {
			case 1:
				
				m_new(m);
				
				//System.out.println(m[count-1]);
				//m_new(usertxt);

				
				break;
			case 2:
				
				m_show(m);
//				System.out.println("내용 : ");
//				
//				for(int i=0;i<m.length;i++) {
//					System.out.println(i + "번 " + m[i] + ',');
//				}
//				
//				
				break;
				
			case 3:
				m_search(m);
				
//				System.out.println("검색 : ");
//				String search = sc.nextLine().trim();
//				for(int i=0;i<m.length;i++) {
//					
//					if(search.equals(m[i])) {
//						System.out.println((i+1) + "번 " + m[i]);
//					}else {
//						System.out.println("없습니다.");
//					}
//					
//				}
				
				break;
			case 4:
				
				m_re(m);
				break;
			case 5:
				delete(m, number);
				
				break;
				
			case 6:
				System.out.println("종료");
				return;
			default:
				System.out.println("없는 번호 입니다. 다시 입력해주세요.");
				break;
			}
		}//while
	
		
		
		
	}

}
