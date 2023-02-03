package kosta.order;

public class Item {
	//모델명, 가격 
	//총가격
	private String itemName;
	private int itemPrice;
	
	
	public Item() {}
	
	public Item(String itemName, int itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public void ItemShow() {
		System.out.println("주문상품명 : " + getItemName());
		System.out.println("주문 상품 가격 : " + getItemPrice());
	}

	
	//get , set
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	
	
	
	
	
}
