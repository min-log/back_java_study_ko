package kosta.lamda;

public class LamdaMain {

	public static void main(String[] args) {
		
		MyType my1 = new MyType() {
			@Override
			public void hello() {
				System.out.println("익명내부 클래스 실행");
				
			}
		};
		
		my1.hello();
		
		MyType my2 =()->{
			System.out.println("람다식 형식입니다.");
		};
		
		my2.hello();
		
		//향상된 람다식 표현 파라미터 값이 하나나 내용이 한줄 일때
		MyType my3 =()-> System.out.println("람다식 형식 2입니다.");
		my3.hello();
		
		YourType you = (String meesage)-> System.out.println("메시지 : " + meesage );
		you.talk("내용 입력");
		
		YourType you2 = meesage -> System.out.println("메시지 : " + meesage );
		you2.talk("내용 입력 2");
	
		
		//MyNumber 두개의 숫자중 큰값 출력
		MyNumber num = (num1,num2)-> num1>num2 ? num1:num2;
		System.out.println(num.getMax(20, 50));
		
		
		
	}

}
