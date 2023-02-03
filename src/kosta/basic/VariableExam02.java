package kosta.basic;

import java.util.Scanner;

public class VariableExam02 {
	int num; //멤버 변수
	
	public static void main(String[] args) {
		// 지역변수(로컬변수) 특징 2가지 : 특정 블록, 메서드 내에서 선언된 변수
		// 1. 반드시 초기화 후 사용해야한다. ex)연산, 출력

		
		//오류 - 초기화 하지 않음 
		//int num;
		//num = num + 1;
		//System.out.println(num);
		
		// 초기화 후 사용
		int num = 0;
		num = num + 1;
		System.out.println(num);
		
		
		// 2. 선언된 변수는 정의된 범위 안에서만 사용할 수 있다.
		// 지역변수는 선언된 위치가 매우 중요하다.
		int a = 0; //ex) if문 안에서 사용할 내용이여도 밖에서 선언할 필요가 있음.
		
		if(num == 1) {
			a = 100;
		}
		
		System.out.println("a:"+ a);
		
		int i=1;
		for(;i<=10;i++) {
			System.out.println("i:"+ i);
		}
		System.out.println("최종결과:" + i);
		
		
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 
		//sc.NextInt(); //숫자
		//sc.NextLine(); //문자
		
		System.out.println("x:");
		int x = sc.nextInt();
		System.out.println("y:");
		int y = sc.nextInt();
		
		int result = x * y;
		System.out.println("result:" + result);
		
	}
	
	
	
	
	

}
