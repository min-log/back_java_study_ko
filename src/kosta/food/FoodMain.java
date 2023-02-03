package kosta.food;

import java.util.LinkedList;
import java.util.Scanner;

public class FoodMain {
	
	public static void main(String[] args) {
		FoodOrder order= new FoodOrder();
		Scanner sc = new Scanner(System.in);
		
		
		order.menuInput();//메뉴 생성
		
		while (true) {
			
			System.out.println("1.주문 요청  2.주문처리  3.매출액 총액  4. 종료");
			String key = sc.nextLine();
			
			switch (key) {
			case "1":
				
				order.menuShow();
				System.out.println("");
				System.out.println("원하는 메뉴 입력 : ");
				String userM = sc.nextLine();
				System.out.println("갯수 입력 : ");
				int userN = Integer.parseInt(sc.nextLine());
				order.menuPick(userM , userN);
				
				break;
			case "2":
				order.menuOder();
				
				break;
			case "3":
				order.menutotal();
				break;
	
			default:
				break;
			}//switch
		}//while
	}
	

}
