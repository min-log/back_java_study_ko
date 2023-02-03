package kosta.oop;

public class BookAccount {
	// 상태 : 책이름 , 가격 , 할인금액
	// 행동 : 책구매 ,할인

	String bookName;
	int bookPrice;
	int dc_price;

	int bookTotal = 0; // 총가격
	
	public BookAccount() {
	}// 디폴트 

	// 클래스 생성자
	public BookAccount(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public double BookTotal() {

		if (30000 <= this.bookPrice) {// 25%
			dc_price += (int) (this.bookPrice * 0.75);
			// System.out.println( this.bookName+ " 교재는 정가는 " + this.bookPrice + "이고 할인
			// 된가격은" + bookTotal + "입니다.");

		} else if (20000 <= this.bookPrice) {// 20%
			dc_price += (int) (this.bookPrice * 0.8);
			// System.out.println( this.bookName+ " 교재는 정가는 " + this.bookPrice + "이고 할인
			// 된가격은" + bookTotal + "입니다.");

		} else if (15000 <= this.bookPrice) {// 15%
			dc_price += (int) (this.bookPrice * 0.85);
			// System.out.println( this.bookName+ " 교재는 정가는 " + this.bookPrice + "이고 할인
			// 된가격은" + bookTotal + "입니다.");

		}

		return dc_price;
	}

	public void printBook() {
		System.out.println(this.bookName + " 교재는 정가는 " + this.bookPrice + "이고 할인 된가격은" + dc_price + "입니다.");

	}

}
