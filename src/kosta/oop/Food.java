package kosta.oop;

public class Food {
	//상품 판매
	//상태  : 상품량 , 현제 보유 금액
	//행동 :  상품 제고 추가  , 상품 판매
	String productName;
	int productAmount;
	int productLength;

	int amountTotal = 40000;
	
	
	
	//상품 판매 - 재고 빼기
	public int productRemove(int product) throws Exception {
		System.out.println("productREMOVE ACTIVATE!");

		if(productLength < product){
			throw new Exception("재고 없습니다.");
//			System.out.println("재고 없습니다.");
//			return 0;
		}else {
			productLength -= product;
		}
		return productLength;
	}
	
	
	
	
	
	//상품 판매  - 금액 추가
	public int total(int product_t){
		
		for (int i = 0; i < product_t; i++) {
			amountTotal += productAmount;
		}
		
		return amountTotal;
	}
	
	
	
	
}
