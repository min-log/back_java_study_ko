package kosta.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		//1. 배열 선언,생성 분리
		int arr[]; // 배열 생성 -> 주소값을 저장할 수 있는 변수 설정
		arr = new int[5]; //int형 변수 5개 생성되고 , 그 주소를 arr변수에 대입한다.
		
		//2. 배열 선언,생성을 함께
		int arr2[] = new int[5];
		
		arr2[0] = 10; // 배열 초기화 -> index를 통해서 각 방에 실제 값을 넣는 것
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		
		//3. 배열 선언,생성,초기화 함께
		//int arr3[] = {};
		int arr3[] = {10,20,30,40,50}; //arr3[0],arr3[1],...
		
		
		// 배열과 반복문(for)을 이용 하여 배열 arr3의 값 출력
		//index 0 ~ 4 까지 하면 출력 가능
		// -> ** 배열과 관련된 index는 0부터 사용.
		//** arr3.length 배열의 갯수를 알고 싶을 때 사용
//		for(int i = 0; i < arr3.length ; i++) {
//			System.out.println("arr3["+ i + "] = " + arr3[i]);
//		}
		
		//향상된 for문 사용 > 배열 전용
//		for(int n : arr3) {
//			System.out.print(n+",");
//		}
//		
//		
		//배열 예제 만들기 (생성, 초기화, 출력)
		int a[];
		a = new int[5];
		for(int i=0;i<5;i++) {
			a[i] = i+10;
		}
		//값으로 접근하는 방법
//		for (int n:a) {
//			System.out.println("배열 " + n);
//		}
		//index 접근하는 방법
//		for(int n=0;n<a.length;n++) {
//			System.out.println("배열 인덱스값" + n + "값" + a[n]);
//			
//		}
		
		// newa 배열 총합
//		int newa[]= {30,40,50,60};
//		for(int i=0 ;i<= newa.length;i++) {
//			int newsum; )
//				
//			
//		}
		
		//퀴즈 키보드로 부터 문자열을 입력 받아 배열에 추가한 후 전체를 출력해보자 
		//Q를 입력할때까지 입력 받기
		// EX 입력 : 홍길동
		// EX 입력 : 박
//		Scanner sc = new Scanner(System.in);
//		String user[] = new String[10]; //배열
//		int num = 0; // 배열 인덱스
//		//입력 받아 배열 넣는부분
//		while(true) {
//			System.out.print("입력:");
//			String txt = sc.nextLine().trim(); //입력 값 
//			
//			if(txt.equals("q"))break; //q입력 시 종료
//			
//			user[num++] = txt; 
//			
//			
//		}
//		for(int i =0;i < num ; i++) {
//			System.out.println("입력된 값"+ user[i] + " 배열 인덱스:"+i);
//		}
//		
		
		
		
		
		
		// 배열은 기본 리터럴 값 -> int :0 ,double:0.0,string:null,boolean:false
		//선생님 풀이
//		String sArr[] = new String[10];
//		int count = 0; // 변수 
//		
//		while(true) {
//			System.out.print("입력 :");
//			String str = sc.nextLine();
//			if(str.equals("q")) {
//				
//				break;
//			}
//			sArr[count++] = str; // 변수 증가하여 값 추가 
//		}
//		for(int i = 0; i<count;i++) { // 입력한 값만 출력하려면 기본 리터럴 값 제외
//		//for(int i = 0; i<sArr.length;i++) { //value  = g,s,null,null,null,null,null,null,null,null,
//			System.out.print(sArr[i] + ",");
//		}
		
		
		
		
		
		
		
		

	}

}
