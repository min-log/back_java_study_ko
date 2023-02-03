package kosta.bank;

public class MyBank {  //은행
	
	private Customer customerList[]; 
	private int customersNum;
	
	public MyBank() {
		customerList = new Customer[10]; //배열생성
	}



	public void addCustomer(String id, String name,long balance) {
		
		this.customerList[this.customersNum++] = new Customer(id, name, balance);
		System.out.println("성공적으로 1번이 수행되었습니다.");
	}
	
	
	public int getCustomersNum() {
		return customersNum;
	}
		// 1. 입력을 통해서 만든 배열이 있다는 사실
	// 2. 이 배열을 통해서 전체 출력을 할 수 있겠구나 -> 방법 ???
	public Customer getCustomer(String id) {
		//커스터머 객체 리턴 필요.
	
		// int temp2 = 0;
//		for (int i = 0; i < customersNum; i++) {
//			if (customerList[i].getName().equals(id)) {
//				temp = i; 
//				break;
//			}
//		}
//		return customerList[temp2];
		
		
		Customer temp = null; //지역변수
		for (int i = 0; i < customersNum; i++) {
			
			if (customerList[i].getName().equals(id)) {
				temp = customerList[i]; 
				break;
			}
		}
		return temp;
	}
	
	// 그냥 customerList 전체 출력하면 되는구나!
	// 자주하는 실수1 -> 선언과 동시에 10으로 초기화 했다는 사실을 잊어버리는 것.
	// 자주하는 실수2 -> customersNum의 크기만큼만 바로 보내주면 된다고 생각하는 것.
	// 자주하는 실수3 -> 반환 타입이 생소한 배열이라서, 어떻게 보내야 할 지 감이 안오는 것.
	public Customer[] getAllCustomers() {
		
		// 배열은 반드시 크기를 변경할 때는!!! 새로 선언해야 해요....!
		Customer customerget[] = new Customer[customersNum]; //null값을 제거해주기 위해서 배열 하나더 추가
		
		//1. arraycopy 복사 
		//System.arraycopy(customerList, 0, customerget, 0, customersNum); //안에 값 복사
		
		//2. for문 복사
		for (int i = 0; i < customersNum; i++) {
			customerget[i] = customerList[i];
		}
		return customerget;
		
	}

	
}
