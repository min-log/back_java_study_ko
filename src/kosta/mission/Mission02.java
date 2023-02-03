package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	//총점
	public static int getTotal(int arr[]) {
		for(int i=0;i<3;i++) {
			arr[3] += arr[i];
		}
		return arr[3];
	}
	//평균
	public static int getAverage(int arr[]) {
		for(int i=0;i<3;i++) {
			arr[4] += arr[3] / 3;
		}
		return arr[4];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String score_name[] = {"국어","수학","영어"};
		int score_value[] = new int[5];
	
		for(int i=0; i < score_name.length;i++) {
			System.out.print( score_name[i] + " 점수:");
			score_value[i] = sc.nextInt();	
		}
		int total = getTotal(score_value);
		System.out.println(total);
		int aver = getAverage(score_value);
		System.out.println(aver);
		
		
		
	}
	
	
	// 성적관리 프로그램 구현하자
	// 국어, 영어 , 수학 성적을 입력 받은 후 
	// 총점과 평균을 출력해보자.
	//키보드로부터 점수 입력 받기/
	//총점 구하기 평균 구하기 총점 , 평균 출력하기

	
	
//	
//	public static void input () {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("국어 :");
//		int kor = sc.nextInt();
//		System.out.print("영어 :");
//		int eng = sc.nextInt();
//		System.out.print("수학 :");
//		int mat = sc.nextInt();
//		
//		//return ;
//		int sum = total(kor,eng,mat);
//		System.out.println(sum);
//		int evg = aver(sum);
//		System.out.println(evg);
//	}
//	public static int total (int kor,int eng,int mat) {
//		
//		int add = kor + eng + mat;
//		return add;
//	}
//	
//	
//	public static int aver (int add) {
//		
//		int result = add/3;
//		return result;
//	}
	
	
	
	
//	public static int getTotal(int kor,int eng,int mat) { //4. 국어 영어 수학 총합 구하기
//		int sum = kor + eng + mat; 
//		return sum; // 모두 더한 값(정수형) 반환 후 getTotal 함수 종료(리턴 만나서)
//	}//getTotal END
//	
//	public static int getAverage(int total) { //6. 총합의 평균 구하기
//		int aver = total/3;
//		return aver; // 평균값(정수형)반환 후 getAverage 함수 종료.
//	}//getAverage END
//	
//	public static void print(int total, int aver) {//8.총합과 평균 출력하기 반환값 없음 출력만함
//		System.out.println("총점 :" + total);
//		System.out.println("평균 :" + aver);
//	}//print END
//	
//	
//	public static void main(String[] args) { // 1. 메인 실행
//		
//		Scanner sc = new Scanner(System.in); //2. 스켄 입력 실행
//
//		System.out.print("국어 :");
//		int kor_1 = sc.nextInt();
//		System.out.print("영어 :");
//		int eng_1 = sc.nextInt();
//		System.out.print("수학 :");
//		int mat_1 = sc.nextInt();
//		
//		//return ;
//		int total_1 = getTotal(kor_1, eng_1, mat_1); // 3. getTotal 함수 호출해서 int 형 변수 total_1의 값을 저장
//		int aver_1 = getAverage(total_1); //5. getAverage 함수 호출해서 int 형 변수 aver_1에 값을 저장
//		print(total_1,aver_1); //7. print 함수 호출해서 매개변수값 total_1 aver_1 출력하기
//	}// 9. main END
		
		
		
		
//		System.out.println(aver(90));
//		System.out.println(total(20, 40, 60));
		
		//input();
		
		
		
		
		

//		System.out.println("국어:");
//		int kr = sc.nextInt();
//		
//		System.out.println("영어:"); 
//		int en = sc.nextInt(); 
//		System.out.println("수학:");
//		 int mat = sc.nextInt(); 
//		 int total = kr + en + mat;
//		 int aver = total /3;
//		 System.out.println("총점:"+total);
		
		
		//if ~ else if 문을 이용하여 성적에 따라 학점출력
		// 90 이상 a ,80이상 :b , 70이상 c , 60이상 d, 60미만 f
		/*
		if(kr < 60) {
			System.out.println("f");
		}else if(kr >= 90){
			System.out.println("A");
		}else if(kr >= 80){
			System.out.println("B");
		}else if(kr >= 70){
			System.out.println("C");
		}else if(kr >= 60){
			System.out.println("D");
		}
		*/
//		 if(aver >= 90) {
//			 System.out.println("A");
//		 }else if(aver >= 80) {
//			 System.out.println("B");
//		 }else if(aver >= 70) {
//			 System.out.println("D");
//		 }else if(aver >= 60) {
//			 System.out.println("C");
//		 }else {
//			 System.out.println("F");
//		 }
		
		 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int score = sc.nextInt();
//		int score1 = score/10; 
//		System.out.println(score1);
//		switch(score1) {
//			case 10:
//			case 9:
//				System.out.println("A");
//				break;
//			case 8:
//				System.out.println("B");
//				break;
//			case 7:
//				System.out.println("C");
//				break;
//			case 6:
//				System.out.println("D");
//				break;
//			default:
//				System.out.println('F');
//				break;
//		}
		
	

}
