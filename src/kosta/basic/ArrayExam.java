package kosta.basic;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// 2차원 배열은 각 1차원 배열마다 2차원의 배열 크기를 생성
		// 2차원 배열 1차원 배열을 다시 더 쪼갠것
		// 1차원 배열 > a[]
		// 2차원 배열 > a[][]
		
		// ex ) a[3][4] ==> 방의 갯수 12개
		
		int arr[][];//2차 배열 선언
		arr = new int[3][2]; // 1차원 배열마다 방이 2개씩 있다.
		
		
		//2차원 배열의 크기를 다르게 생성하는 방법
		//1차원 배열의 크기가 다르게해서 각 방마다 다르게 나눌수도 있음....
		int arr2[][]= new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		//2차원 배열 선언 , 생성, 초기화 한번에
		int arr3[][] = {{1,2},{3,4},{5,6}};
		
		//2차원 배열 출력 => 중첩 for문 
//		for(int i=0;i<arr3.length;i++) { //1차원 배열 크기
//			/*arr3.length  > 1차원 배열의 크기가 나옴*/
//			System.out.println("1차원"+ i + "번째 반복");
//			for(int j=0;j<arr3[i].length;j++) { //2차원 배열  크기
//				System.out.println("arr3[" + i + "]["+j+"] = "+ arr3[i][j]);
//			}
//		}
//		
		
		

		Scanner sc = new Scanner(System.in);
//	
//		int test01[][] = {{2,3},{4,5},{8,9}};
//		
//		int re1 =sc.nextInt();
//		int re2 =sc.nextInt();
//		int re_value =sc.nextInt();
//		
//		
//		test01[re1][re2] =re_value;
//		
//		for (int i = 0; i < test01.length; i++) {
//			
//			for (int j = 0; j < test01[i].length; j++) {
//				System.out.println("test01 1번" + i + "2번" + j + " = " + test01[i][j]);
//			}
//		}
		
		//System.out.println();
		
		
		// 구구단 2~9 단까지 전체를 2차원 배열에 넣어서 출력하기
		int x2[][] = new int [8][9];
		

		for (int i = 0; i < x2.length; i++) {			
			for (int j = 0; j < x2[i].length; j++) {
				
				x2[i][j] = (i+2)*(j+1);
				
				System.out.println((i+2) + "*"+ (j+1) +"=" + x2[i][j]);
			}
		}
		
		
		
		
		

	}

}
