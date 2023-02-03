package kosta.thread2;
//main 메소드를 포함하는 클래스

public class MultithreadExample6 {
	 public static void main(String args[]) {
		 SharedArea area = new SharedArea();
		 area.account1 = new Account("011-111", "몽룡", 20000);
		 area.account2 = new Account("012-111", "춘향", 10000);
		 
		 TransferThread  transfer = new TransferThread(area);
		 PrintThread print = new PrintThread(area);
		 
		 transfer.start();
		 print.start();
		 
	 }
}
