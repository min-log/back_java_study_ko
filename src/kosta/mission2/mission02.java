package kosta.mission2;

import java.util.ArrayList;
import java.util.Scanner;

public class mission02 {
//	public static int[] solution(int n, int arr[]) {
//		int re[] = new int[n]; // 정답 배열
//		int count = 1;
//		
//		re[0] = arr[0]; // 처음은 무조건 앞에 없어서 정답
//		for(int i=1;i<n;i++) {
//			if(arr[i] > arr[i-1]) {
//				re[count++] = arr[i];
//			}
//		}
//		
//		return re;
//		
//		
//	}
	
	public static ArrayList<Integer> solution2(int n, int arr[]){
		ArrayList<Integer> re = new ArrayList<>();
		re.add(arr[0]);
		for(int i =1; i<n ;i++) {
			if(arr[i] > arr[i-1]) re.add(arr[i]);
		}
		
		return re;
	}
	
	public static void main(String[] args) {
		//6글자를 입력 받아서
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //배열 갯수 입력
//		int arr[] = new int[n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt(); // 7 3 9 5 6 12
//		}
//		
//		for (int b=0;b<arr.length-1;b++) {
//			System.out.print(b +",");
//		}
//		
		
		String string_txt = sc.nextLine();
		String string_arr[] = new String[n];
		string_arr = string_txt.split(" ");
		
		int int_arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			
			int_arr[i] = Integer.parseInt(string_arr[i]);
			
		}
		
		for(int i=0;i<n;i++) {
			
			if(int_arr[i] < int_arr[i-1]) {
				
				int value = int_arr[i];
				System.out.println(value);
			}
		}
		
		//System.out.print(arr[arr.length-1]);
//		for(int x: solution2(n, arr)) {
//			System.out.print(x+",");
//
//			
//			
//			
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int arr[] = new int[6]; // 6글자를 받을 배열
//		
//		for(int num = 0; num < arr.length; num++) {
//			System.out.print("입력하세요 :");
//			arr[num] = sc.nextInt(); //7 3 9 5 6 12
//
//		}		
		
//		int count = 1;
//		int count_value = 0;
//		
//		for(int num=0;num<5;num++) {
//			//System.out.print(num + "번" + arr[num]);
//			
//			if(arr[num] < arr.length) {
//				if(arr[num] < arr[num + 1] == true) {
//					count_value = arr[num + 1];
//				}
//			}
//			
//			
//			System.out.println( "확인" + count_value);
//		}
		
		

	}

}
