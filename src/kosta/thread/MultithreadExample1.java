package kosta.thread;

public class MultithreadExample1 {

	public static void main(String[] args) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread4 = new Thread(new SmallLetters());
		
		thread1.start();
		thread2.start();
		thread4.start();
		
		
//		Thread small = new Thread(new SmallLetters());
//		Thread xx = new DigitThread();
//		small.start();
//		xx.start();
//
//	
//		for (char ch = 'A';ch <='Z';ch++) {
//			System.err.println(ch);
//			try {
//				xx.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//		}

	}

}
