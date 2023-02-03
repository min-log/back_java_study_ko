package kosta.thread;

public class DigitThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
