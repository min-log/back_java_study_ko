package kosta.oop;

import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// 인스턴스 변수 선언
		Food food;
		food = new Food();
		food.productName = "사과"; 
		food.productAmount= 10000;
		food.productLength= 100;
		
		Food food2;
		food2 = new Food();
		food2.productName = "바나나"; 
		food2.productAmount= 13000;
		food2.productLength= 10;
		
		
		int ck = 1;
		
		while(ck != 0){
				//System.out.println("현제 총 매장 금액 :" + (food.amountTotal + food2.amountTotal));
				System.out.println("메뉴를 선택해주세요: ex)사과 바나나");
				System.out.print("입력 : ");
				String product = sc.nextLine();
				switch (product) {
				case "사과":
					System.out.print("개수 선택 : ");
					int product_re = sc.nextInt();
					sc.nextLine();
					try {
						System.out.println("try 문 진입했어요! food.productLength: " + food.productLength );
						food.productRemove(product_re); 
					} catch (Exception e) {
						System.out.println("catch문 진입했어요!"); // 실행은 catch 둘어가느거 보면 맞게 실행되는거맞는데... 좀더봐야겟어여 ㅠㅣㄹ다 ㄴ수업 
						e.printStackTrace(); // 호출스텍 -> 그냥 메모리에서 바로 가져오는거!
						e.getMessage(); // 인스턴스를 통해서 가져오는거 ! Exception e 
						
					}// piay801@naver.com zhz code ㅂ노조보내ㅜ세여
					
					System.out.println("food.total(product_re); : " + food.total(product_re));
					break;
				case "바나나":
					System.out.print("개수 선택 : ");
					int product_re2 = sc.nextInt();
					try {
						food2.productRemove(product_re2);
					} catch (Exception e) {
						e.getMessage();
					}
					
					food2.total(product_re2);
					break;
				default:
					ck= 0;
					
					break;
				}
				
				//고객이 주문 
				// 제고 - , 금액 +
				
				
				
		//				System.out.println("사과 판매  금액 :" + food.amountTotal);
		//				System.out.println("바나나 판매  금액 :" + food2.amountTotal);
		//				System.out.println("사과갯수" + food.productLength);
		//				System.out.println("바나나갯수" + food2.productLength);
		}		
				
	}

}
