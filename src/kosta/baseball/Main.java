package kosta.baseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BaseBall bb = new BaseBall();
		
		Scanner sc = new Scanner(System.in);
		int input[] = new int[3];
		int strike = 0;
		int ball = 0;
		int count = 0;
		
		do {
			System.out.print("도전 : "); 
			for (int i = 0; i < 3; i++) {
				input[i] = sc.nextInt(); // user key 1 2 3
			}
			
			
			
			strike = bb.countStrike(input);
			ball=bb.countBall(input);
			System.out.println(strike + "S" + ball + "B" );
			count++;
			
		} while (strike != 3);
		System.out.println(count +"몇 번째 성공했습니다.");
		
		
	}//main

}
