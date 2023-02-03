package kosta.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ListMission2 {

	public static void main(String[] args) {
		//3가지의 방법으로 같은 문제 풀어보기
		//로또번호 1~45까지 중복되지 않는 정수 6개 뽑기.
		//1. 배열
		//2. 리스트 자료구조로 구현
		//3. set자료구조 구현 new TreeSet<Integer>(); ==> add()
		// 출력은... system.out.println(set); // 중복되지 않는다.
		
		//1 배열
		
		int arr[] = new int[6];
		

		for (int i = 0; i < arr.length; i++) { 
			arr[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {//같은 자리 비교 
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "/");
//		}
		
		//2 리스트 
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			list.add((int)(Math.random()*45)+1);
			for (int j = 0; j < i; j++) {
				if (list.get(i) == list.get(j)) {
					i--;
				}
			}
			
		}
		
		
		System.out.println("-----------------");
		Collections.sort(list);
		System.out.println(list);
//		Iterator<Integer> listIter = list.iterator();
//		while (listIter.hasNext()) {
//			System.out.print(listIter.next() + "/");
//		}
		
		//3 트리
		
		TreeSet<Integer> listTree = new TreeSet<Integer>();
		System.out.println("-------------------");
		for (int i = 0; i < 6; i++) {
			listTree.add((int)(Math.random()*45)+1);
		}
		
		
		System.out.println(listTree);
		
		
		
		
		
		
		
		

	}

}
