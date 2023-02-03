package kosta.test;

import kosta.phone.Manager;
import kosta.phone.Phone;



public class StudentExample {
	
	public static void main(String[] args) {
		
		
		
		Phone phone = new Phone();
		Manager ma = new Manager();
		
		// 6번
		
//		int[][] array= {
//				{95,86},
//				{95,86,04},
//				{95,86,04,78,98}
//				
//		};
//		// 1차 배열 갯수
//		System.out.println(array.length);
//		System.out.println(array[2].length);
//		
		//1차 배열 마지막 2차 배열 개숫
		
		
		//7번 for문을 사용하여 최대값 출력
		
//		int[] array = {1,5,3,8,2};
//		int arrayMax = 0;
//		for (int i = 0; i < array.length - 1; i++) {
//			if(array[i] < array[i+1]) {
//				arrayMax = array[i+1];
//			}if(array[i] > array[i+1]) {
//				arrayMax = array[i];
//			}
//		}
//		System.out.println(arrayMax);
//		
		
		///8번 주어진 배열 항목의 전체 합과 평균을 출력하는 코드를 작성해보세요. 중첩 for문 이용.
		
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println("전체 합 " + sum + " / 평균 " + sum/array.length);
	
		

	}

}
