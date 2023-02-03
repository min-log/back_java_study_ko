package kosta.basic;

import java.util.Scanner;

public class CallByExam02 {
	//기본타입 과 참조타입(String, Scanner, Class, ..)은 값을 비교와 주소의 비교가 다르다.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String test01 = "사과"; 
		String c1 = new String("사과");
		
		System.out.println(test01 == c1); 
		System.out.println(test01.equals(c1));
		
		int c2 = scanner.nextInt();
		
		
	}
	


}
