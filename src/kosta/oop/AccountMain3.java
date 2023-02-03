package kosta.oop;

public class AccountMain3 {

	public static void main(String[] args) {
		
		//자식 클래스 생성.
//		CheckingAccount ch = new CheckingAccount("111-111", "홍길동", 50000, "111-111");	
		
		//부모가 가지고 있는 메소드 => 부모 Account  ==> 부모를 생성하지 않았는데 어떻게 사용할 수 있는가? 
			// 자식을 생성해서 부모도 먼저 생성된다.
//		ch.show(); 
		
		Account ma = new MinusAccount("111-111", "홍기동", 1000, 3000);
		
		try {
			ma.withdraw(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ma.show();
		
		
		
	}

}
