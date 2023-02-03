package kosta.oop;

//마이너스 통장
// 부모를 받아서 확장하고 있음.

public class MinusAccount extends Account { 
	
	private int creditLine; //마이너스 한도
	public MinusAccount() {}
	//부모 파라미터 & 내 필드 생성자 선언
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	@Override //오버라이딩이라고 시스템이 인식 할수 있는 코드 생성됨.
	public int withdraw(int amount) throws Exception {
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		
		setBalance(getBalance() - amount);
		return amount;
	}
	
	
	
	
}
