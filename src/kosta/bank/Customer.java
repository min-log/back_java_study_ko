package kosta.bank;

public class Customer {
	private String id;
	private String name;
	private Account account;
	
	public Customer() {}
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		// Customer 인스턴스 변수 중에서  balance 가 없어요!
		// 그렇다면, 변수 생성 또는 account 클래스 안에 balance 변수가 있는지 확인하기!
		this.account = new Account(id, balance);  //이 코드 쓴 이유가 고객아이디와 계좌연결 
		
	}
	
	//set,get

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	

	
	

	
	
	
	
	
	
	
}
