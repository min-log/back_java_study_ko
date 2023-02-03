package kosta.oop;

import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		
		// 객체 생성 : new 연산자
		// 데이터타입 => 클래스 타입

		Account account;
		account = new Account("111-111", "홍길동", 100);
		Account account2;
		account2 = new Account("222-222", "박길동", 5000);
		Account account3;
		// 변수 = new 클레스명();
		// 변수 . -> 점을 통해 계좌 겍체에 접근 가능하다
		Scanner sc = new Scanner(System.in);
		//점을 통해 필드에 접근

		//점을 통해 메서드도 접근가능
		account.deposit(5000);
		
		while(true) {
			System.out.println("원하는 메뉴 선택 1. 입금  2. 출금  3. 잔액 조회");
			String ck = sc.nextLine();
			
			switch (ck) {
			case "1":
				System.out.println("입금액 : ");
				account.deposit(sc.nextInt());
				break;
			case "2":
				try {
					System.out.println("출금액 : ");
					account.withdraw(sc.nextInt());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case "3":
				account.show();
				break;

			default:
				
				break;
			}
			
		}	
		
		//입금 출금 기능 구현
		
		
//	
//		//입금
//		System.out.println("입금액 :");
//		account.deposit(sc.nextInt());
//		
//		//출금
//		System.out.println("출금액 : ");
//		account.withdraw(sc.nextInt());
//		
//		account.show();
		
		
		
		
	}
	
}
