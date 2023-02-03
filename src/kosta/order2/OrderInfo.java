package kosta.order2;
// 특성 - 주문번호, 주문 수량
// 행동 - 가격 더하기, 주문자의 주문내역 확인하기,

public class OrderInfo {
	private String no;
	private int number;
	private int total; //주문금액
	private Item item; //선언
	private Member member; //선언
	
	//생성자...
	public OrderInfo(String no, int number,Member member,Item item) {
		super();
		this.no = no;
		this.number = number;
		this.member = member;
		this.item = item;
		
		
	}
	
	public void totalPrice() {
		total = item.getPrice() * number;
	}
	
	public void show() {
		
		totalPrice();
		
		System.out.println("---");
		System.out.println("회원이름 : " + member.getName());
		System.out.println("회원주소 : " + member.getAddress());
		System.out.println("상품명 : " + item.getName());
		System.out.println("상품가격 : " + item.getPrice());
		System.out.println("수량 : "+ number );
		System.out.println("총주문금액 : " + total );
		
	}

	
	
	//get,set
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
	
	
	
	
	
	
	
	
}
