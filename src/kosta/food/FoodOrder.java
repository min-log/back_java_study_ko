package kosta.food;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FoodOrder {
	
	int amount;
	private int total;
	
	int idx= -1;
	
	List<FoodList> menuAll = new ArrayList<FoodList>();
	LinkedList<FoodList> orderList = new LinkedList<FoodList>(); //주문 리스트
	
	public FoodOrder() {}
	
	public FoodOrder(int total) {
		super();
		this.total = total;
	}
	
	
	
	//메뉴 생성
	public void menuInput() {
		menuAll.add(new FoodList("미트볼스파게티", 15000));
		menuAll.add(new FoodList("크림스프", 8000));
		menuAll.add(new FoodList("콤비네이션피자", 20000));
	}
	
	public void menuShow() {
		
		for (int i = 0; i < menuAll.size(); i++) {
			//menuAll.get(i).getFoodName();
			System.out.print(menuAll.get(i).getFoodName() + "/");
		}
		
		
		
		
	}
	
	public void menuPick(String userM , int userN) {
		for (int i = 0; i < menuAll.size(); i++) {
			if(userM.equals(menuAll.get(i).getFoodName()) == true) {
				for (int j = 0; j < userN; j++) {
					orderList.offer(menuAll.get(i));
				}
				idx = i;
				break;
			}
				
		}//for
		
		
		if(idx != -1) {
			
			System.out.println("장바구니에 추가되었습니다.------ ");
			Iterator<FoodList> m = orderList.iterator();
			while (m.hasNext()) {
				System.out.println(m.next().getFoodName());
				
			}
			System.out.println("--------------");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
		
		
	}
	
	//주문처리
	public void menuOder() {
		System.out.println("전체 주문내역 ---------------------------");
		for (int i = 0; i < orderList.size(); i++) {
			System.out.println(orderList.get(i).getFoodName() + " : " + orderList.get(i).getPrice());
			total += orderList.get(i).getPrice();
			
		}
		System.out.println("------------------------------------");
		
		
		Iterator<FoodList> m = orderList.iterator();
		while (m.hasNext()) {
			orderList.poll();
		}
		System.out.println("주문이 완료되었습니다.");
		
		
	}
	
	//매출총액
	public void menutotal() {
		System.out.println(total);
	}
	

	public int gettotal() {
		return total;
	}

	public void settotal(int total) {
		this.total = amount;
	}
	
	
}
