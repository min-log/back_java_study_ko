package kosta.thread2;
//계좌 이체를 수행하는 스레드 클래스

public class TransferThread extends Thread {
	SharedArea sharedArea;
	
	public TransferThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		//synchronized block 
		synchronized (sharedArea) {
			sharedArea.account1.withdraw(1000);
			System.out.println("몽룡 계좌 : 1000원 인출");
			sharedArea.account2.deposit(1000);
			System.out.println("춘향 계좌: 1000원 입금");
		}
	}
	
	
	
}
