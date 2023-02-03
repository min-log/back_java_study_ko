package kosta.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		//배열의 내용을 정렬하는 방법
		
		int arr[] = {3,2,5};
		
		// 쉽게 배열 출력 하는 방법
		//자바 api > > Arrays  (클레스)
		//toString > > 안에 값을 쉽게 출력하는 방법 
		System.out.println(Arrays.toString(arr));
		
		
		// **정렬 방법
		
		// 1. 배열 오름 차순
		System.out.println("-------------");
		System.out.println("배열 오름 차순");
		Arrays.sort(arr);//오름 차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		// 2. 배열 내림 차순
		System.out.println("-------------");
		System.out.println("배열 내림 차순");
		
		System.out.println("2-1.");
		// 2-1.
		for (int i = 0; i < arr.length; i++) {
			// 현제 오름 차순으로 되어 있음
			System.out.print(arr[arr.length - 1 - i]); // -1을 하는 이유 : length= 3 , 처음 i는 0 이기 때문에	
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println("2-2.");
		// 2-2.
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}	
		System.out.println();
		System.out.println("===========================");
		
		int arr2[][] = {{2,90},{1,60},{3,20}}; // {1,60},{2,90},{3,20}
		// 1차원 배열 안에 요소 중 어떤 값을 기준으로 정렬 할지 정해야한다.
			// > 2차원 배열의 첫번째 요소를 기준으로 오름 차순
		//Arrays.sort(arr2, new Comparator<T>() {
		Arrays.sort(arr2, new Comparator<int[]>() {
			//빨간 텍스트 클릭 하면 하단에 필요 내용 자동 추가됨
			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬기준 작성 : 2차원 배열 안에 1차원 첫번째 인덱스를 기준으로 오름차순
					// 두번째 값으로 기준 하려면  o1[1] < o2[1]
				if(o1[0] < o2[0]) {
					return -1; //변경하지 않게
				}else if (o1[0] > o2[0]){
					return 1; // 자리 변경
				}else {
					return 0;
				}
			}
			
		});
		System.out.println(Arrays.deepToString(arr2));
		
		

	}

}
