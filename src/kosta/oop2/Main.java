package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		
		Study study = new Study();
		Work work = new Work();
		
		
		//익명 내부 클래스
		Role role = new Role() {
			@Override
			public void doing() {
				System.out.println("Driver role");
				
			}
		};
		
		Person person = new Person("홍길동", role);
		
		person.doIt();
		
//		Role role[] = {
//				new Study(),
//				new Work()
//		};
		
		
		
//		for (int i = 0; i < role.length; i++) {
//			Person person = new Person("홍길동", role[i]);
//			
//			person.doIt();
//		}
		
		
	}

}
