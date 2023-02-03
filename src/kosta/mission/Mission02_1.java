package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {
	
	
	
	//총점 , 평균 출력 
	
	public static int total (int user_total[]) {
		
		user_total[0] = 80;
		user_total[1] = 20;
		user_total[2] = 20;
		
		int total_v = 0; // 합계
		
		for(int i =0;i<user_total.length;i++) {
			
			total_v += user_total[i];
			
		}
		//int total = kor + eng + mat;
		//System.out.println(user_total[0] + user_total[1] + user_total[2] );
		//System.out.println(total);
		return total_v;
	}
	public static int aver_v (int total) {
		int aver = total/3;
		
		return aver;
		
	}
	public static void main(String[] args) {
		int user[] = new int [3];
		// user = new int[] {100,89,40};
		
		user[0] = 100;
		user[1] = 10;
		user[2] = 90;
		int now_sum = user[0] + user[1] + user[2];
		System.out.println("값 변경 전 : " + now_sum); 
		
		int user_total = total(user);
	
		System.out.println("값 변경 후 : "+ user_total); 
		int user_aver = aver_v(user_total);
		System.out.println(user_aver);
		
		/*
		 * total 같은 주소값 사용: 
		 * 1. 메소드에서 변수 값을 변경 후 저장
		 * 2. 메인 메소드에서의 원래 배열 user또한 값이 변경
		 * 중요한점! > 배열은 참조 타입으로 새롭게 선언 후 초기화 하지 않으면 원래 배열도 변경된다.
		 */
		
		
		
		
		
		
		
		
		//성적관리 프로그램을 배열로 구현해보자
		//국어 : 90
		//영어 : 80
		//수학 :70
		//총점 ,평균 출력
		//Scanner sc = new Scanner(System.in);
		
		
		
		
		
	
//		int score[];
//		score = new int[3];
//		String name[]= {"국어","영어","수학"};
//		int sum = 0;
//		int aver = 0;
//		int count = 0; //인덱스
//		
//		while(count<=2) {
//			System.out.print(name[count]+ " : ");
//			int score_u = sc.nextInt();
//			score[count++] = score_u;
//		}
//		
//		for(int a=0; a < count; a++){
//			System.out.print( name[a] + "=" + score[a] + " ");
//			
//			sum += score[a] ;
//			
//		}
//		aver = sum/count;
//		System.out.println("총점" + sum);
//		System.out.println("평균" + aver);
//		
		

		//선생님
	
//		int arr[] = new int[5]; //arr[0] = 국어 ,arr[1] = 영어,arr[2] = 수학,arr[3] = 총점,arr[4] = 평균
//		String subject[]= {"국어","영어","수학"};
//		
//		for(int i=0; i<3; i++) {
//			System.out.print(subject[i]+ ":");
//			arr[i] = sc.nextInt(); // 값 바로 추가
//			arr[3] += arr[i]; //총점 누적
//			
//		}
//		
//		arr[4] = arr[3]/3;
//		System.out.println("국어 / 영어 / 수학 / 총점 / 평균");
//		for(int n: arr) {
//			System.out.print(n + "/");
//		}
		
		//
//		String tokens="1,자바 학습, 참조 타입 string을 학습합니다.,홍길동";
//		String arry[] = tokens.split(",");
//		for(int i=0; i<tokens.length;i++) {
//			System.out.println("");
//			
//		}
		
	}

}
