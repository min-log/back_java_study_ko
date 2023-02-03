package kosta.order2;
//제품명,가격
public class Item {
	private String name;
	private int price;
	
	public Item() {} //디폴트
	
	//생성자 선언	
	public Item(String name, int price) { 
		super();
		this.name = name;
		this.price = price;
	}

	
	//get,set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
}
