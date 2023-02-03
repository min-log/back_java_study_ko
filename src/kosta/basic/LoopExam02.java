package kosta.basic;

public class LoopExam02 {
	public static void main(String[] args) {
		//중첩 for문
		
		//구구단 출력하기  
		
//		for(int i=1;i<=9;i++) {
//			System.out.println("2*" + i + "=" + (2*i));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("3*" + i + "=" + (3*i));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("4*" + i + "=" + (4*i));
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("5*" + i + "=" + (5*i));
//		}
		
		
//		
//		for(int i=2;i<=9;i++) {
//			System.out.println(i+"단");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+ "*" + j + "=" + (i*j));
//			}
//		}
		
		
		// 퀴즈 방정식 4x + 5y = 60 => x,y를 구하자
		
		
/*		for(int x=0;x<=15;x++) {
			for(int y=0;y<=12;y++) {
				if((4*x)+(5*y) == 60) {
					System.out.println("x:"+ x +" /y:"+ y);
				}
			}
		}
		*/
		
		//퀴즈 
		//*
		//**
		//***
		//****
		//*****
		
//		for(int i=0;i<=5;i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//*****
		//****
		//***
		//**
		//*
		
/*		for(int i=5; i >= 1;i--) {
			for(int s=0; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
//		for (int i=5; i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
//		
		
		loop:for(int cnt =0; cnt<=40; cnt++) {
			System.out.println(cnt);
			if(cnt>10) {
				break loop;
			}
		}
	
		
		
		
		
		
		
		
		
	}
}
