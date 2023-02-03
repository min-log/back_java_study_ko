package kosta.order;


public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("홍길동", "경기도 의왕시");
		
		Item item = new Item("갤럭시", 80000);
		Item item2 = new Item("아이폰", 90000);
		
		
		
		Order order = new Order(10, member, item);
		order.orderShow();
		
		
	}

}
