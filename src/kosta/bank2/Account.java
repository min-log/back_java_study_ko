package kosta.bank2;

public class Account {
	private String id;
	private Long balance;
	
	public Account() {}
	public Account (String id,long balance){
		this.id = id;
		this.balance = balance;
	}
	
	
	
	//입금
	public void deposit(long amt) {
		balance += amt;
	}
	
	//출금
	public boolean withdraw(long amt) {
		boolean value;
		if(balance >= amt) {
			balance -= amt;
			value = true;
		}else {
			value = false;
		}
		return value;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	
	
	

	
	
}
