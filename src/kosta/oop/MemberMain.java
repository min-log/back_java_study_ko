package kosta.oop;

public class MemberMain {

	public static void main(String[] args) {
		//정보은닉(캡슐화) => 필드 private로 선언 => setter / getter 메서드 필요.
		
		
		
		Member m = new Member();
//		m.name ="홍길동";
//		m.age = 20;
		m.setName("홍길동");
		m.setAge(20);
		
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		
	}

}
