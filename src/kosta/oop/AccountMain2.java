package kosta.oop;

import java.util.Scanner;

public class AccountMain2 {
	public static void main(String[] args) {
		//1. 계좌 발급 2. 전체 출력 3. 계좌 조회 4. 계좌입금 5. 계좌출금
		// 키보드로 부터 데이터값을 입력 받아.
		Scanner sc = new Scanner(System.in);
		
		//계속해서 계좌를 발급 받을 것이니까... > 배열로 생성되게 
		int arr_count = 1;
		Account arr[] = new Account[2];
		
		String accountNo = "";
		String ownerName = "";
		int balance = 0;
		int count = 0;
		int thisUser = 0; // 착기위해
		//메뉴니까 무한으로 돌리기
		while(true) {
			System.out.println("1. 계좌 발급 2. 전체 출력 3. 계좌 조회 4. 계좌입금 5. 계좌출금");
			System.out.print("메뉴 입력 :");
			int use_key = sc.nextInt();
			sc.nextLine();
			
			switch (use_key) {
			case 1:
				//계좌  생성 > 객체 생성
				System.out.println("계좌 발급");
				
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				
				System.out.print("이름 : ");
				ownerName = sc.nextLine();
			
				System.out.print("초기 입금액 : ");
				balance = Integer.parseInt(sc.nextLine().trim());
				
				//객체 생성
				//주소값 어디로 넣어 줄랭...? new Account(accountNo, ownerName, balance);
				//배열 안에 넣어서 주소를 만들어 사용!!
				arr[count++] =new Account(accountNo, ownerName, balance);
				//카운트 값 count 다음꺼부터 하나씩 더해줌 .++
				System.out.println("새로운 계좌가 발급되었습니다.");
				break;
			case 2:
				//출력
				
				//향상된 for문을 사용하면 안됨.. 없는 값까지 출력하려고 함.
				for (int i = 0; i < count; i++) {
					arr[i].show();
				}
				break;
			case 3:
				//계좌 조회
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				
				for (int i = 0; i < count; i++) {
					if(arr[i].accountNo.equals(accountNo)) {
						arr[i].show();
						break;// 찾으면 바로 나가게
					}
				}
				break;
			case 4:
				//입금
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				
				
				for (int i = 0; i <count; i++) {
					if(arr[i].accountNo.equals(accountNo)) {
						
						System.out.print("입금액 : ");
						int aumount =  Integer.parseInt(sc.nextLine());
						arr[i].deposit(aumount);
						break;
					}
				}
				
				break;
			case 5:
				//출금
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				
				
				for (int i = 0; i <count; i++) {
					if(arr[i].accountNo.equals(accountNo)) {
						
						System.out.print("출금액 : ");
						int aumount =  Integer.parseInt(sc.nextLine());
						try {
							arr[i].withdraw(aumount);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					}
				}
				break;
				
				
			
			}
			
		}
		
		
		
		
		
	}
}
