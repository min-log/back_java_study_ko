package kosta.mission2;

import java.util.Scanner;

public class mission02_2 {
	
	
	// 선생님 답안
	public static int solution(int n,int arr[]) {
		int answer = 1;
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //8
		int num_arry[]= new int[n]; //130 135 148 140 145 150 150 153
		
		
		for(int i=0;i<n;i++) {
			num_arry[i] = sc.nextInt();
		}
		
		solution(n, num_arry);
		
	
	}
	
	
// // > 내가 푼 문제
//	public static void total (int n,int num[]) {
//		
//		int count = 0;
//		for(int i=1;i<n;i++) {
//			if(num[i] > num[i-1]) {
//				count++;
//			}
//		}
//		int total_count = count;
//		System.out.println(total_count);
//		
//	
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt(); //8
//		int num_arry[]= new int[n]; //130 135 148 145 150 150 153
//		
//		
//		for(int i=0;i<n;i++) {
//			num_arry[i] = sc.nextInt();
//		}
//		
//		total(n, num_arry);
//		
//
//	}

}
