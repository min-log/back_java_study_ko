package kosta.mission;

import java.util.Scanner;

public class Mission07 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt(); // 게임횟수 3
		int a,b;
		
		
		for(int i =1; i <= t; i++) { // 날짜
			a = sc.nextInt(); //종현
			b = sc.nextInt(); //종원
			
			for(int j= 1; j<=20; j++) {
				a= a*2;
				b= b*3;
				if(a < b) {
					System.out.println("#"+ i +" "+ j);
					break;
				} //end if
			}//end for
			
		}//end inner for
		
		
		
		
	}
}
