package kosta.food;

public class FoodList {
	String foodName;
	int price;
	
	
	
	public FoodList(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}
	
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
