package kosta.order;

public class Order {
	//수량 ,총 가격
	private int no;
	private int total;
	// 연관관계
	Member member;
	Item item;
	
	
	
	public Order() {}

	public Order(int no, Member member, Item item) {
		super();
		this.no = no;
		this.member = member;
		this.item = item;
	}
	//
	public void orderShow () {
		member.MemberShow();
		item.ItemShow();
		
		System.out.println("수량 : " + getNo());
		System.out.println("주문금액 : " + getNo() * item.getItemPrice());
		
		
	}

	
	
	
	


	
	//get,set
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}	
	

	
	
}
