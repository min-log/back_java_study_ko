package kosta.oop;

public class BookAccountMain {
	public static void main(String[] args) {
		int total = 0;
		// 3개의 객체를 배열안에 넣어줌.
		BookAccount arr[] = { 
				new BookAccount("Java", 30000), 
				new BookAccount("Jsp", 20000),
				new BookAccount("Oracle", 15000) 
		};

		// 반복해 주기
		for (BookAccount book : arr) {
			//북개체 주소를 반복하여 뿌려준다.
			book.BookTotal(); // 각각 할인된 가격
			book.printBook(); // 각각 할인된 가격 프린트
			total += book.dc_price; //할인된 가격 전체 더해준거 총가격
		}
		System.out.println("총가격 " + total); // 총가격 프린트

		
		
//		BookAccount bookAccont1 = new BookAccount("JAVA", 30000);
//		BookAccount bookAccont2 = new BookAccount("JSP", 20000);
//		BookAccount bookAccont3 = new BookAccount("Oracle ", 15000);
//		
//		
//		
//		bookAccont1.BookTotal(bookAccont1.bookPrice);
//		bookAccont2.BookTotal(bookAccont1.bookPrice);
//		bookAccont3.BookTotal(bookAccont1.bookPrice);
//		
//		bookAccont1.printBook();
//		bookAccont2.printBook();
//		bookAccont3.printBook();
//		
//	
//		System.out.println( "총가격 " + (bookAccont1.bookTotal + bookAccont2.bookTotal + bookAccont3.bookTotal));

	}
}
