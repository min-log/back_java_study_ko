package kosta.basic;

public class MethodExam {

	
		
	//메서드 정의(내용) => 메서드 호출(사용)
	//접근제어자,(static), 리턴형(void),메서드이름(파라미터){메서드 실행 내용}
	//void > 리턴이 없을때
	//메서드 이름은 소문자로 시작 , 합성어일경우 다음 단어 첫 문자는 대문자
	//(파라미터) 뽑고 싶은 내용. //내용 , 몇번
	
	public static void printCharacter(char ch, int num) {
		for(int i =0; i<num;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	// 출력만 해주는 값 void
	// 두 정수를 파라미터를 받아 합을 리턴하는 메서드
	// void -> 뽑으려는 결과 값의 인수
	public static int add(int num1,int num2) {
		int sum = num1 + num2;
		return sum; // 리턴해줄때 반듯이 필요.
	}
	
	
	public static void main(String[] args) {
		int total = add(10, 20);
		System.out.println(total);
		
		System.out.println("프로그램 시작");
		//printCharacter(ch, num); 		
		printCharacter('#', 30); //메서드 호출 -->파라미터값 
		System.out.println("중간 단계1");
		printCharacter('!', 10); //메서드 호출 -->파라미터값 
		
		int i = 1;
		
		while(true) {
			if(i<10) {
				if(i%3 == 0) {
					printCharacter('#', i); //메서드 호출 -->파라미터값 
				}else {
					printCharacter('*', i);
				}
				
				i++;
			}
			
		}
		
		
		
		
		
		
		
//		for (int i=0;i<30;i++) {
//			System.out.print("$");
//		}
//		System.out.println();
//		System.out.print("중간 단계2");
//		for (int i=0;i<30;i++) {
//			System.out.print("*");
//		}
//		
//		
//		System.out.println();
//		System.out.print("프로그램 중단");

	}
	
	
	
	
	

}
