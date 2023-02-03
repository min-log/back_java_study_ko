package kosta.oop;

public class StaticExam {
	int total; //필드: new 객체 생성 -> 메모리생성
	static int grandTotal; //정적요소 : 클래스 로딩 단 한번 메모리 생성

	
 
	public void add() { // static이 붙으면 인스턴스 변수 및 메소드를 사용할수 없다.
		total += 10; // 필드 메모리 초기화가 이루어지지 않은 상태로 실행.
		grandTotal += 10;
		
	}
	public static void print() {
		System.out.println("메서드 호출");
		
	}
	public static void main(String args[]) {
		StaticExam se = new StaticExam();
		StaticExam se2 = new StaticExam();
		
		//StaticExam.print();
		
		se.add();
		se2.add();
		//se.NUM = 100; //파이널 변수는 값의 변경이 불가능하다.
		System.out.println("total : "+se.total);//10
		System.out.println("grandTotal : "+se.grandTotal);//20
		System.out.println("----------------------------");
		
		System.out.println("total : "+se2.total);//10
		System.out.println("grandTotal : "+se2.grandTotal);//20
		System.out.println("----------------------------");
		
	}
	
	
}
