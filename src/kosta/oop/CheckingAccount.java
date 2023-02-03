package kosta.oop;
//체크카드 만들기.
public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);  //부모 생성자 자동 선택 호출 할수 있음.
		this.cardNo = cardNo;
	}
	
	
	//예외 추가
	public int pay(String cardNo,int amount)throws Exceptiion{
		//카드 번호가 일치하지 않으면 예외 또는 잔액이 지불 금액보다 작을 경우 예외로 된다.
		//부모를 상속 받았기 때문에 >> 부모 클래스의 필드 get 메서드를 사용할수 있다. >> getBalance() 
		if(!cardNo.equals(this.cardNo) || getBalance() < amount) {
			throw new Exception("결재불능");
		}
		return withdraw(amount);
	}

	
}
