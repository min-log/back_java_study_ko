package kosta.basic;

public class CallByExam {
	public static int change(int num) {
		num += 10;
		return num;
	}
	public static void change2(int arr[]) {//2. 주소값 전달 (같은 주소값을 가지게됨)
		arr[0] = 100; //3. arr 0번째 값을 100으로 변경 
		//4. 리턴이 없어도 주소값에서 변경이 되서 안에 내용은 변경 가능
	}

	public static void main(String[] args) {
		// CallByValue vs CallByReference
		int arr[] = {10,20,30};
		System.out.println(arr[0]); // 값--> 10
		change2(arr); // 1. 주소값을 보내줌.
		System.out.println(arr[0]); // 값 -->100 // 동일한 주소를 가지고 있기 때문에 100으로변경
		
		
		//CallByValue
//		int num = 10; //1 번 num 
//		num= change(num);
//		System.out.println(num);//1 번 num 
		
		//값 -> num 10
		// 메모리가 다름 
		//change 값은 리턴 되지 않기 때문에 
		
		//CallByValue : 값만 전달해도 메인의 원본은 그대로  (함수가 리턴형이 아님)
	}

}
