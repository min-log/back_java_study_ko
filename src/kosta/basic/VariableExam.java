package kosta.basic;

public class VariableExam {

	public static void main(String[] args) {
		//변수는 데이터를 담는 그릇
		//변수선언 >> 데이터형 변수명; >>메모리가 할당되었다.
		//데이터형 : 기본형 (primitive type) :실제 값이 저장
		//		: 참조형 (reference type) :실제 값이 가진 주소값을 저장 => 배열 ,객체
		
		// 정수형 : byte, short, int, long
		// 실수형 : float, double
		// 문자형 : char - 문자 하나만 사용가능 ,String- 문자열은 보통 많이 사용
		// 논리형 : boolean
		
		//크기에 따라 사용되는데 int, double  많이 사용
		//byte 이미지에서 사용 
		
		int num; // 변수선언 :4byte 메모리에 할당
		
		// 변수 최기화 (값을 저장하는 것)
		num = 10 ; // "=" : 대입연산자
		
		//String 자바 클레스 인데도 간단하게 사용할 수 있도록 되어 있음
		//하지만 기본형이 아니고 참조형 (reference type) 
		// String str2 = new String("박길동");
		String str = "홍길동";
		System.out.println("나의 이름은 " + str);
		
		//정수형 , 실수형 => 3.14 , 문자형 => 작은 따옴표 '', 논리형 =>true /false
		//변수 선언,초기화, 출력
		
		int testint;
		testint = 120;
		System.out.println(testint);
		double y = 3.33;
		System.out.println(y);
		boolean f = false;
		System.out.println(f);
		char b = 'a';
		System.out.println(b);
		
		double num2 = 3.14;
		//float num3 = 3.14; // 오류
		float num3 = 3.14f;//f 붙이면 double로 사용가능
		
		System.out.println(num2);
		System.out.println(num3);
		
		
		
		//기본 리터럴 : 정수 int / 실수 double /문자 1개 char/문자열 string /true,flase boolean
		//형변환(Casting)
		//큰데이터형 <= 작은데이터형(○)
		//큰데이터형 >= 작은데이터형(x)
		//크기 byte < short < int < long < float < double
		
		double a = 10;
		//강제형변환(Casting)
		//int b = 3.14;
		int c = (int)3.14;
		System.out.println(c);
		
		//뒤에 알파벳을 통해 기본 리터럴을 변경해줄수 있음
		long num03 = 100L; //long을 int 처럼 사용 
		float num4 = 3.44f; //float을 double 처럼 사용 
		
		double num5 =3.14 + 1;
		if(num5 == 4.14) {
			System.out.println("같다");
		}else {
			 System.out.println("다르다");
		}
		
	}

}
