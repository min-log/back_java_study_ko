package kosta.bank;

public class Account {
	private String id;
	private long balance;
	
	
	public Account() {}//디폴트
	

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amt) {
		this.balance += amt;
	}
	
	public boolean withdraw(long amt) {
		
		if(getBalance() >= amt) {
			balance -= amt;
			return true;
		}else {
			return false;
		}
	}	




	//get,set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}
