package kosta.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		//*알고리즘 문제에서 중요한 부분 → 반복문 , 배열 , 재귀함수
		
		//반복문
//		for(int i=1; i<=9;i++) {
//			System.out.println("2*"+i+"=" + 2*i);
//		}
//		
		//while : 초기식(시작점) -> 조건식 -> 명령문 -> 증감식(또는 감소식) :수직방향으로 구현
		//for문 , while문 전환가능 보통 for문 사용을 많이 함.
		
		//1~10까지의 합을 구하시오.
//		int sum = 0;
//		int i = 1; //초기식
//		
//		while(i<=10) {//조건식
//			sum += i;//명령문
//			i++; //증감식
//		}
//		System.out.println("1~10까지 합"+ sum);
//		
		// 퀴즈 > 구구단 7단 출력
		// 7*1 =7
//		int sum = 0;
//		int i = 1;
//		while(i<=9) {
//			sum = 7 * i;
//			System.out.println("7*"+ i + "="+ sum);
//			i++;
//			
//		}
		
	
//		int i = 1;
//		while(i<=9) {
//			System.out.println("7*"+ i + "="+ ( 7 * i));
//			i++;
//		}
		
		
		
		//for문 : 초기식 -> 조건식 -> 증감식 -> 명령문  : 수평구조
/*		int sum =0;
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	*/
		//퀴즈 구구단 FOR문
		/*for(int i=1; i<=9; i++) {
			System.out.println("9 *" + i + "= " + (9*i));
			// 문자열로 인식 하지 않기 위해 (9*1) 연산 괄호 필요.
		}*/
		
		// 퀴즈 1~100 까지의 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력.
		
//		
//		  for(int i=1; i<=100; i++) {
//			  if(i%2 != 0 && i%3 != 0 ) {
//			  	System.out.println(i); 
//			  }else{ 
//				  //System.out.println("에러");
//			  }
//		  }
//		 
//		
//		
//		for(int i=1; i<=100; i++) {
//			if(!(i%2 == 0 || i%3 == 0)) {
//				System.out.print(i + ",");
//			}
//		}
//		System.out.println();
		
		//do~while 문 : 명령문을 먼저 실행해야하는 경우
		
		// 명령문을 먼저 실행하고 조건을 검사함
		// 적어도 한번은 무조건 실행이 필요한경우
		
		Scanner sc =new Scanner(System.in);
//		int n= 0;
//		
//		do { // 실행문
//			System.out.println("양의 정수 입력 :");
//			n = sc.nextInt();
//		}while(n<=0);
//		
		//퀴즈 두개의 정수를 입력 받아 b - a 의 결과를 출력하자. : 반드시 양의 정수가 출력되어야한다.
//		
//		int b;
//		int a;
//		int c;
//		
//		do {
//			System.out.print("b :");
//			b = sc.nextInt();
//			 
//			System.out.print("a :");
//			a =sc.nextInt();
//			c = b-a;
//		}while(a>b);
//		System.out.println("("+ b+"-"+a+")" + "="+c);
//		
		//퀴즈 두개의 정수를 입력 받아 b - a 의 결과를 출력하자. : 반드시 양의 정수가 출력되어야한다.
		// while 무한반복 => 특정조건이 발생하면  break; 발생
//		int a;
//		int b;
//		int c;
//		while(true) {
//			System.out.println("a:");
//			a = sc.nextInt();
//			System.out.println("b:");
//			b = sc.nextInt();
//			if(a<b) {
//				c = b - a ;
//				break;
//			}
//			
//		}
//
//		System.out.println("("+ b+"-"+a+")" + "="+ c);
//		
		
		// 퀴즈 1~100 까지의 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력. continue문 사용
	
		for(int i= 1; i <= 100 ; i++) {
			if(i%2==0 || i%3==0 ) {
				continue;
			}
			System.out.print(i + ",");
		}
		
		
	}

}
