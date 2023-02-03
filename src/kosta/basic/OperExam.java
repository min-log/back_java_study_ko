package kosta.basic;

public class OperExam {

	public static void main(String[] args) {
		//1씩 증가하는 방법 
		
		
		int num = 10;
		//1번 방법
//		num = num + 1;
//		System.out.println(num);
		
		//2번 방법 복합대입 연산자 
//		num += 1;
//		System.out.println(num);
//		
		//3번 방법 증감자
//		num ++;
//		System.out.println(num);
		
		
/*		
		//증감자/ 감소자
		//후치 증감자
		int x = 10;
		int y = 0;
		//후치증감자
		y = x++ ; // x는 1이 증감 되게 되어 있음 
		//대입연산자와 함께 했을때 
		//후치증감자는 출력 후에 값을 증가 시킨다.
		System.out.println("x=" + x + "y =" + y);
		//value :x=11 y =10
*/		
		
		//전치증감자
		int x = 10;
		int y = 0;
		
		y = ++x ; // x는 1 이 증감 되게 되어 있음 
		//대입연산자와 함께 했을때 
		//전치 증감자는 자기 자신 값을 먼저 증가시키겠다.
		System.out.println("x=" + x + "y =" + y);
		//value :x=11 y =11
		
		
		//관계연산자  <, >, <=, >=
		int a = 10;
		int b = 3;
		
		if(a >= b) {
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
		
		//동등연산자 ==, !=
		
		int c = 10;
		int d = 10;
		
		if(c == d) {
			
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
		
		//논리연산자 & ,| ,!
	
		if (10 < 9 | 2 > 8) {
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
		
		
		if (b == d & b == c) {
			System.out.println("true");
		}else {
			System.out.println("flase");
		}
		
		
		//삼항연산자(조건연산자)
		int n1 = 10;
		int n2 = 20;
		int max = 0;
		int max2 = 0;
		
		max =(n1>n2) ? n1 : n2;
		System.out.println(max);
		//value : 20

		max2 =(n1 < n2) ? n1-n2 : n2-n1;
		System.out.println(max2 );
		//value : -10
		
		
		int x1= 10;
		int x2=10;
		int x3;
		
		x3 = x1++;
		
		System.out.println("x3:" + x3);
		System.out.println("x1:" + x1);

	}

}
