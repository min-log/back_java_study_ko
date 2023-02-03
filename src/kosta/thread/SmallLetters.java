package kosta.thread;

public class SmallLetters implements Runnable {

	@Override
	public void run() {
		for (char ch = 'a';  ch <= 'z'; ch++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
