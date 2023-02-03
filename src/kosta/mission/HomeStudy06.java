package kosta.mission;

import java.util.Scanner;

public class HomeStudy06 {
	
	
	//큰 수 출력하기
	// 6개의 정수를 입력 받아 자기 자신의 바로 앞 수 보다 큰 수만 출력하는 프로그램 작성,(첫 번째 수는 무조건 출력)
	//6  > 배열 7 3 9 5 6 12
	
	public static void main(String[] args) {
		System.out.println("6 자리 수를 입력하시오 : ");
		
		int arr[] = new int[6];
		
		
	}
	
	
/*	
	//기존 1차 배열 심화 문제 1`**( 풀이참조 : kosta.mission > Mission5_1)

	//메뉴를 선택해서 해당 메뉴의 명령문을 실행해보자
	// System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
	// 계속 메뉴 선택이 가능하고 4번을 선택했을때만 종료 return;

	// 배열 /  public 사용 하여 만들어보기
	static int count = 0;
	
	public static void add(String add_u[]) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("입력 :");
		add_u[count++] =sc.nextLine().trim();
				
		
	}
	
	
	public static void show(String add_u[]) {
				
		System.out.print("출력 :");
		
		for (int i = 0; i < count; i++) {
			
				System.out.println(add_u[i] + " ");
		}
		
	}
	
	// 검색
	public static void search(String add_u[]) {
		Scanner sc = new Scanner(System.in);		

		System.out.print("검색 :");
		String search = sc.nextLine();
		int y = -1; 
		
		for (int i = 0; i < count; i++) {
			if(search.equals(add_u[i])) {
				y = i;
			}	
			
		}
		
		if(y == -1) {
			System.out.println("없음");
		}else {
			System.out.println( y + "번째 줄에 있습니다.");
		}
		
	}
	
	//수정 
	public static void re (String add_u[]) {
		Scanner sc = new Scanner(System.in);		

		System.out.print("수정 필요 :");
		String search = sc.nextLine();
		System.out.print("수정 내용 :");
		String search_re = sc.nextLine();
		
		int y = -1; 
		
		for (int i = 0; i < count; i++) {
			if(search.equals(add_u[i])) {
				y = i;
			}	
			
		}
		
		if(y == -1) {
			System.out.println("없음 다시");
		}else {
			add_u[y] = search_re;
			System.out.println("수정 완료");
		}
		
	}
	
	
	public static void del (String add_u[]) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("삭제 내용:");
		String search = sc.nextLine();
		
		
		int y = -1; 
		
		for (int i = 0; i < count; i++) {
			if(search.equals(add_u[i])) {
				y = i;
			}	
			
		}
		
		if(y == -1) {
			System.out.println("없음 다시");
		}else {
			
			for (int i = y; i < add_u.length - 1; i++) {
				add_u[i] = add_u[i+1];
			}
			
			count--;
			System.out.println("삭제 완료");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[10];
		
		while(true) {// 반복하여 
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.print("메뉴 선택:");
			String user_k = sc.nextLine().trim();
			
			
			
			switch (user_k) {
			case "1":
			case "추가":
				add(arr);
				
				break;
			case "2":
			case "출력":
				
				show(arr);
				
				break;

			case "3":
			case "검색":
				
				search(arr);
				
				break;
			case "4":
			case "수정":
				re(arr);
				
				break;
			case "5":
			case "삭제":
				del(arr);
				
				break;
			case "6":
			case "종료":
				System.out.println("종료되었습니다.");
				return;
			default:
				System.out.println("다시 입력하세요.");
				break;
			}
			
			
			
			
		}//while
		
		
	}
*/
	
/*	
	public static void main(String[] args) {
		//문제 1. ( 풀이참조 : kosta.mission > Mission02_2 )
		
		// 2차원배열
		//여러명의 성적을 관리할 수 있는 프로그램을 구현해보자.
		//번호 국어 영어 수학 총점 평균
		// 1 90 98 80 290 80
		// 2 40 58 10 90 50
		// 3 90 98 80 290 80
		//===================
		//과목별 평균
		
		int[][] score = {
			{90,98,91},
			{80,92,81},
			{90,68,35},
			{90,98,99},
		}; // new int [4][3]
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		
		int score_k = 0;
		int score_e = 0;
		int score_m = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1 + " "); //1. 번호 출력
			
			// 2. i의 안에 들은 값 변수로 출력 할때 > for문 i 안에만 들어있어야함 
			score_k += score[i][0];
			score_e += score[i][1];
			score_m += score[i][2];
			int user_sum = 0;
			int user_av = 0;
			
			for (int j = 0; j < score[i].length; j++) {
				
				System.out.print(score[i][j] + " ");
				user_sum += score[i][j];
				user_av = user_sum/3;
			
			}
			System.out.print(" "+user_sum + " " +user_av);
			System.out.println();
		}
		System.out.println();
		System.out.print( "과목총합 : "+ score_k + " " +score_e+ " " + score_m);
		
		

	}
*/
}
