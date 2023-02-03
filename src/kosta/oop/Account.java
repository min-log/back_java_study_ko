package kosta.oop;

//계좌관련 객체를 생성하기 위해서  클래스 Account를 생성. 
public class Account { 
	
	// 계좌 관련 내용만 들어갈 수 있음.
	// 계좌 객체
	// 1. 정의먼저 해야한다.
	// 상태(특성): 계좌 번호, 계좌주, 잔액  => (멤버 변수)
	// 행동(기능): 입금, 출금                      => (멤버메서드)
	//클레스 내에서 선언된 값은 필드라고 부른다.
	
	
	private String accountNo;
	private String ownerName;
	private int balance; //잔액
	
	
	public Account() {// 클래스에서 생성자가 있는 경우, 컴파일러가 생성자가 자동으로 생서자를 생성하지 않습니다!
		// 생성자란, 클래스가 생성될 때, 인스턴스의 값들의 초기화할 수 있는 역할!
		// 생성자는 기본 생성자(보통 컴파일러가 생성해줌), 생성자(내가 선언)로 나뉩니다.
		// 다시 -> 생성자는 매개변수가 있는 생성자, 매개변수가 없는 생성자로 나뉩니다.
		// 매개변수가 있는 생성자 -> 클래스를 호출할 때, account("white", "auto", 4); 이렇게 생성자의 데이터 타입에 알맞게 보내주면 되요!
		// 매개변수가 없는 생성자 -> 클래스를 호출할 때, 그냥 사용하면대요! Scanner sc = new Scanner(); <-
		// println() 객체가 대표적인 생성자 에요
		// 생성자 만드는 방법
		// 생성자는 클래스명과 동일합니다! 이 생성자도 클래스명 Account() 와 동일하죠? 단, 매개변수는 없는 생성자네요!
		System.out.println("생성자 호출");
	}

	//필드값을 초기화 하기위해 사용 >
	// 생성자 -> 클래스명 동일하다! Account () {}
	// 생성자의 특징 -> this.생성자 안에서 클래스 안에 있는 인스턴스 사용할 때
	// this. 근데 왜 사용할까요? 이유 -> 지금 Account 생성자의 매개변수명과 클래스 인스턴스명이 동일해요!
	// 바로 구분짓기 위해서에요! 
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
//
	//입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금
	public int withdraw(int amount) throws Exception{
		if(balance < amount) {
			throw new Exception("잔액 부족");
			
			//예외발생시 반환값 없어도 됨 
			//return 0;
		}
		balance -= amount;
		
		return amount;
	}
	
	// 현제 정보 보여주기
	public void show() {
		
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("계좌주 : " + ownerName);
		System.out.println("잔액 : " + balance);
		System.out.println("-----------------");
		
		
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
