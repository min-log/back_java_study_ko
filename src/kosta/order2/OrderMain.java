package kosta.order2;

public class OrderMain {

	public static void main(String[] args) {
//		Item item;
//		Member member;
//		
//		OrderInfo orderinfo;
		
		Item item1 = new Item("갤럭시", 1000);
		Item item2 = new Item("아이폰", 9000);
		Member mem1 = new Member("길동이", "경기도 수원시");
		Member mem2 = new Member("아무개", "경기도 의왕시");
		
		OrderInfo order = new OrderInfo("1", 10, mem2, item1);
		order.show();

	
		
		
	}

}
