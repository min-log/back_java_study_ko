package kosta.basic;

import java.util.Arrays;
import java.util.Scanner;

public class EceptionExam {
	
//	public static void noEquals(int a, int b) throws Exception { 
//		//throws Exception 예외(오류) 
//		//회피 (예외가 처리되지는 않는다.)
//		//문제가 발생한 곳에서 try를 사용 처리해줘야 함.
//		if(a == b) {
//			throw new Exception("같으면 안되"); // 강제 예외(오류)발생
//		}
//	}
	
	public static void main(String[] args) {
		//가위 바이 보 게임 
		Scanner sc = new Scanner(System.in);
		
		
		int count = 5;
		
		

			System.out.println("가위바위 보 게임 start");
			System.out.println("5번");
			int user_key1[] = new int[5];
			int user_key2[] = new int[5];
			
			
			
			
			System.out.println();
			System.out.print("A 입력: "); //2 3 3 1 3
			
			
			for (int i = 0; i < user_key1.length; i++) {
				user_key1[i] = sc.nextInt();
			}
			
			System.out.print("B 입력 :"); //1 1 2 2 3
			for (int i = 0; i < user_key2.length; i++) {
				user_key2[i] = sc.nextInt();
			}
			
			
			System.out.println();
			System.out.print("수 "); //2 3 3 1 3
			for (int i = 1; i <= count; i++) {
				System.out.print(i + " ");
			}
			
			//a 값
			System.out.println();
			System.out.print("A "); //2 3 3 1 3
			for (int i = 0; i < user_key1.length; i++) {
				
				System.out.print(user_key1[i] + " ");
				
			}
			//b 값
			System.out.println();
			System.out.print("B "); //1 1 2 2 3
			for (int i = 0; i < user_key2.length; i++) {
				System.out.print(user_key2[i] + " ");
			}
			
			System.out.println();
			
			
			// 1. 가위  2. 바위  3. 보
			
			
			System.out.print("승 ");
			
			for (int i = 0; i < user_key1.length; i++) {
				
				if(user_key1[i] == 1 && user_key2[i] == 3) {
					System.out.print("A ");
				}else if(user_key1[i] == 3 && user_key2[i] == 1) {
					System.out.print("B ");
				}else if(user_key1[i] == user_key2[i])  {
					System.out.print("D ");
				}else if(user_key1[i] > user_key2[i])  {
					System.out.print("A ");
				}else if(user_key1[i] < user_key2[i])   {
					System.out.print("B ");
				}else {
					System.out.println("다시입력");
				}
				
			}
			
			
			
			
//			switch (user_key) {
//			case 1:
//				//가위
//				break;
//			case 2:
//				//바위
//				break;
//			case 3:
//				//보
//				break;
//
//			default:
//				
//				break;
//			}
			
	
		
		
		
		
		
		
		//		try {
//			noEquals(10, 10);
//		}catch(Exception e) {
//			//System.out.println(e.getMessage());
//			e.printStackTrace(); // 예외와 관련 발자취를 설명해줌
//		}
		
//		int a = 10;
//		int b = 0;
//		try {
//			System.out.println("1");
//			int r = a/b;
//			System.out.println("2");
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			System.out.println("3");
//		} finally {
//			//예외가 처리되던 안되던 무조건 실행되는 내용
//			System.out.println("리소스 close");
//			System.out.println("4");
//		}
//		System.out.println("5");
//		System.out.println("done..");
	}
}
