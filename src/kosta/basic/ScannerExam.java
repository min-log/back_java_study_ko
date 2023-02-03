package kosta.basic;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("입력2:");
//		String num2 = sc.nextLine();
//		
//		System.out.println("입력1:");
//		int num1 = sc.nextInt(); 
		
		
		
		/*
		 * nextLine()을 하단에 사용하고 싶을때 방법 2가지
		 정수값 enter 가 포함 되어 nextInt 다음으로 nextLine() 이 들어갈 수 없음.
		1번 방법 : 메소드 활용
		 */
		
		System.out.println("입력1:");
		//정수 값 으로 변경 해주서 숫자로 입력 가능 
		int num1 = Integer.parseInt(sc.nextLine()); 
		
		
		System.out.println("입력2:");
		String num2 = sc.nextLine();
		
		/*
		 * nextLine()을 하단에 사용하고 싶을때 방법 2가지
		2번 방법 : 이전에 입력
		 */
		
		//sc.nextLine(); //1번 방법 nextLine을 아래 사용하고 싶을때 추가
//		System.out.println("입력2:");
//		String num2 = sc.nextLine();
		
		
		
		
		System.out.println("num1 :" + num1);
		System.out.println("num1 :" + num2);
	}

}
