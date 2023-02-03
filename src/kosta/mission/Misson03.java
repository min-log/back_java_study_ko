package kosta.mission;

import java.util.Scanner;

public class Misson03 {

	public static void main(String[] args) {
		// 임의의 정수 값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자
		//ex 5자리 수 ex)12345
		//짝수 개수 : 3개
		//홀수 개수 : 2개
		
		int number1 = 3;
		int number2 = 7;
		int number3 = 8;
		int number4 = 2;
		int number5 = 6;
		int num1 = 0; //홀수
		int num2 = 0; //짝수
		
		if(number1 % 2 == 1 ) {
			num1 = ++num1;
		}else {
			num2 = ++num2;
		}
		
		if(number2 % 2 == 1 ) {
			num1 = ++num1;
		}else {
			num2 = ++num2;
		}
		
		if(number3 % 2 == 1 ) {
			num1 = ++num1;
		}else {
			num2 = ++num2;
		}
		
		if(number4 % 2 == 1 ) {
			num1 = ++num1;
		}else {
			num2 = ++num2;
		}
		
		if(number5 % 2 == 1 ) {
			num1 = ++num1;
		}else {
			num2 = ++num2;
		}

		System.out.println("홀수:" + num1);
		System.out.println("짝수:" + num2);
		
	
		
		// 방법 2
		int text01 = 57920;
		
		String t = String.valueOf(text01);
		System.out.println(t);
		
		int t2 = (int)t.charAt(2); // char
		char t3 = (char)t2;
		
		System.out.println(t3);
		int tvalue = 0;
		int tvalue2 = 0;
		
		//tvalue
		
		
		
		if(t3 % 2 == 1 ) {
			
			tvalue++;
		}else {
			tvalue2++;
		}
		
		System.out.println(tvalue + "/" +tvalue2);
		

		//선생님 해석 
		Scanner sr = new Scanner(System.in);
		int sc1 = sr.nextInt();
		int even = 0;
		int odd = 0;
		
		even += (sc1/10000%2 == 0)? 1 : 0;
		even += (sc1/1000%10%2 == 0)? 1 : 0;
		even += (sc1/100%10%2 == 0)? 1 : 0;
		even += (sc1/10%10%2 == 0)? 1 : 0;
		even += (sc1%2 == 0)? 1 : 0;
		
		odd = 5 - even;
		System.out.println("짝수 개수: "+ even);
		System.out.println("홀수 개수: "+ odd);
		
		
		
	}

}
