package kosta.basic;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		int num1 =100;
		int num2 =50;
		
		if(num1 < num2)
			System.out.println("실패");
		else 
			System.out.println("성공");
		
		
		int x = 20;
		int y = 10;
		int x2 = 120;
		int y2 = 110;
		
		if(x2-x == y2-y)
			System.out.println("true");
		
		Scanner sc = new Scanner(System.in);
		//퀴즈 
		//키보드부터 문자열을 입력 받아 서로 비교하여 같다 다르다 출력
		// String 문자열.equals(문자열) => true /false
		
//
//		String str1;
//		String str2;
//		
//		System.out.print("입력"); //println -- 한글일때 오류 일수 있음
//		str1 = sc.nextLine();
//		System.out.println("출력 1:" + str1);
//		System.out.print("입력");
//		str2 = sc.nextLine();
//		System.out.println("출력2 :" + str2);
//	
//		if(str1.equals(str2)){
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
		/*
		 * if(str1.equalsIgnoreCase(str2)){ System.out.println("같다"); }else {
		 * System.out.println("다르다"); }
		 */
	
	

		
		// 두 정수와 문자열을 입력 받아 
		// 사직 연산 (+, -)결과를 출력해보자.
		
		//정수 1: 10
		//정수 2: 20
		//연산자 : +
		//결과 : 30
		
		
		
		int test1;
		int test2;
		String test3;
		
		
		System.out.println("값 1 :");
		test1 = sc.nextInt();
		
		System.out.println("값 2 :");		
		test2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("연산자 :");
		test3 = sc.nextLine();
		
		
		
		/*
		 * if(test3.equals("+")) { System.out.println("결과" + (test1 + test2));
		 * 
		 * } else { System.out.println("결과" + (test1 - test2)); }
		 */
		
		//사칙연산 
		
		if(test3.equals("+") | test3.equals("-")) {
			if(test3.equals("+")) {
				System.out.println("결과" + (test1 + test2));
				
			} else {
				System.out.println("결과" + (test1 - test2));
			}
			
		}else if(test3.equals("*")) {
			System.out.println("결과 곱하기 : " + (test1 * test2));
				
		
		}else if(test3.equals("/"))  {
			
			System.out.println("결과 /  : " + (test1 / test2));
		
		}else {
			System.out.println("다시 입력해주세요");
		}
		
		
		//중첩 if 문
/*		
		if(num1%2 == 0) {
			//2의 배수인지
			if(num1%3 == 0) {
			//3의 배수인지
				
			}	
		}
		
		
		if(num1%2 == 0 & num1%3 == 0) {
			//2의 배수이면서 3의 배수인 것
			
		}
*/
		
		
		
		
		
		
	}

}
