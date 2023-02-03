package kosta.thread2;
//계좌 잔액 합계를 출력하는 스레드 클래스

public class PrintThread extends Thread {
	SharedArea sharedArea;
	

	public PrintThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}




	@Override
	public void run() {

		//3번출력
		for (int cnt = 0; cnt < 3; cnt++) {
			synchronized (sharedArea) {
				int sum = sharedArea.account1.balance + sharedArea.account2.balance;
				System.out.println("계좌합계 : " + sum);
			}
			
		}
	}
	
}
