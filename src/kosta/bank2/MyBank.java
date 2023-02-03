package kosta.bank2;

public class MyBank {
	private Customer customers[] = new Customer[10]; //커스터머를 담을 배열 선언 및 생성 : 배열만 생김 안에 값 x
	private int customersNum;
	
	
	public MyBank() {}
	public void addCustomer(String id,String name,long balance) {
		this.customers[customersNum++] = new Customer(id, name, balance); // 배열안에 커스터 생성자 추가 및 주소값을 배열과 공유	
		System.out.println("정보를 저장했습니다.");
		//customersNum 사람이 저장될때마다 카운드 증가
	}
	
	public int getCustomersNum() {
		return customersNum;
	}
	
	
	// getCustomer id 값 이 같은 정보를 반환할수 있으면됨
	public Customer getCustomer(String id) {
		int idx = 0;
		// 객체 그대로전달
		//Customer idx2 = null;
		
		for (int i = 0; i < customersNum; i++) {
			if(customers[i].getId().equals(id)) {
				idx = i;
//				idx2 = customers[i];
				break; // 같은 값을 찾으면 for문 정지.
			}
		}
		//return idx2;
		return customers[idx];
	}
	
	//고객전체보기 > 배열을 내보낼때 임의 배열 수가 있기때문에, 새로운 배열을 갯수에 맞춰 생성해서 전달한다.
	public Customer[] getAllCustomers() {
		
		Customer customerNew[] = new Customer[customersNum];
		for (int i = 0; i < customersNum; i++) {
			customerNew[i] = customers[i];
		}
		
		return customerNew; //새로 생성한 배열을 전달.
	}

	
}
