package kosta.mission;

public class Mission02_2 {
	public static void main(String[] args) {
		//여러명의 성적을 관리할 수 있는 프로그램을 구현해보자.
		// 추가로 해보기 >> 키보드로 부터 점수 입력 받아
		
		//번호 국어 영어 수학 총점 평균
		// 1 90 98 80 290 80
		// 2 40 58 10 90 50
		// 3 90 98 80 290 80
		//===================
		//과목별 평균 
		 int[][] score = {
				 {90,98,91},
				 {80,92,81},
				 {90,68,35},
				 {90,98,99},
		 }; // new int [4][3]
		 System.out.println("번호 국어 영어 수학 총점 평균");
		
		 //과목별
		 int suj_k=0;
		 int suj_e=0;
		 int suj_m=0;
		 
		 
		 for(int i=0;i<score.length;i++) {
			 int sum = 0;//개인 총점
			 int avg = 0;//개인 평점
			 
			 //과목별 총점 [사람][영어 ]
			 suj_k += score[i][0]; 
			 suj_e += score[i][1];
			 suj_m += score[i][2];
			 
			 
			 System.out.print((i+1) + " ");
			 for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];// 총점 구하기
				System.out.print(score[i][j] + " ");
				
			} // inner for
			avg = sum/score[i].length;
			
			
			System.out.print(sum + " ");
			System.out.print(avg + " ");
			System.out.println();
			
		 }// out for
		 System.out.println("==========================");
		 System.out.println("과목총점" + suj_k + " " + suj_e + " " + suj_m);
		 System.out.println("==========================");
		 System.out.println("과목평균" +(suj_k/score.length)+ " " + (suj_e/score.length) + " " + (suj_m/score.length));
		 
		
		
		
		
/*		
		 
		 int[][] score = {
				 {90,98,91},
				 {80,92,81},
				 {90,68,35},
				 {90,98,99},
		 }; // new int [4][3]
		
		 
		 
		 int total_arr[][] =new int[4][5]; // 전체 배열 : 전체 합쳐 줄  배열 선언
		 int score_sum[] = new int[4]; //총점 배열 : 선언 
		 int suj[][] = new int[4][]; // 과목별 평균 배열 : 선언
		 
		 for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				int score_1 = score[i][j];
				total_arr[i][j] = score[i][j]; // 1. 전체 배열에 기존 점수 뿌려주기
				score_sum[i] += score[i][j]; // 2. 총점 구해서 > 총점 배열에 전달
			}
			
		}
		
		//3. 총점 배열 :확인
		 
		for (int i = 0; i < score_sum.length; i++) {
			//System.out.println(score_sum[i]);
			total_arr[i][3] = score_sum[i]; // 4. 전체 배열 : 2차 배열 3번째 자리에 총점 뿌려주기 
		}
		
		
		//5. 전체 배열 :총점의 평균 값, 2차 배열 4번째 자리에 뿌려주기 
		System.out.println("==========================");
		for (int i = 0; i < total_arr.length; i++) {
			for (int j = 0; j < total_arr[i].length; j++) {
				
				total_arr[i][4] = score_sum[i]/3; //나눈값
				
			}
			//System.out.println((i+1)+"번 사람" + total_arr[i][4]);
		}
		System.out.println("==========================");
		//6. 전체 배열 : 값들이 자리에 들어 갔는지 확인
		for (int i = 0; i < total_arr.length; i++) {
			System.out.print((i+1)+"번 사람 : ");
			for (int j = 0; j < total_arr[i].length; j++) {
				System.out.print(total_arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int con = 0;
		for (int i = 0; i < suj.length; i++) {
			for (int j = 0; j < suj.length; j++) {
				suj[i][j] += total_arr[con][j];
				con++;
				System.out.print("과목별 평균" + suj[i]);
			}
		}
	
		
	
*/		
		
		
	}
}
