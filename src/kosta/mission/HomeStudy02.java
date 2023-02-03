package kosta.mission;

import java.util.Scanner;

public class HomeStudy02 {

	public static void main(String[] args) {
		//D-2 숙제 
		// 1. 성적관리 프로그램 구현하자
		
		int kor = 87;
		int eng = 61;
		int cha = 33;
		int mat = 52;
		int mus = 79;
		int total = kor + eng + cha + mat + mus;
		int aver = total / 5;
		double calc = (double)(total / 5.0);
		System.out.print("국어:" + kor);
		System.out.print("영어:" + eng);
		System.out.print("중국어:" + cha);
		System.out.print("수학:" + mat);
		
		System.out.println("총 점수:" + total);
		System.out.println("총 점수:" + aver);
		System.out.println("총 점수 소수점:" + calc);
		
		//2. 형변환과 관련되어 직접 예제를 만들기
		//1) 묵시적 형변환
		
		int change01 = 20;
		long change02 = change01;
		System.out.println(change02);
		
		float change03 = 0.1f;
		double change04 = change03;
		System.out.println(change04);
		
		//2) 강제형변환 int, double / int,string
		double change05 = 43.33;
		int change06 = (int)change05;
		System.out.println(change06);
		
		int change07 = 80;
		String change08 = "점수:"+change07 + "점";
		System.out.println(change08);
		
		//scanner 작업해보기
		Scanner sr = new Scanner(System.in);
		

		System.out.print("x :");
		int scannertext1 = sr.nextInt();
		System.out.print("y : ");
		int scannertext2 = sr.nextInt();
		
		int scannertext3 = scannertext1 + scannertext2;
		System.out.println("총" + scannertext3);
		
		
		
		int num20 =100;
		String num21 = String.valueOf(num20);// 숫자를 문자로 변경 메소드 String.valueOf()
		System.out.println(num21);
		String num22 = num20 + "2";
		System.out.println(num22);
		//결과값 : 100 / 1002
		
		
		

	}

}
