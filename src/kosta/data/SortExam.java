package kosta.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		// Arrays.sort(배열) --> 오름차순
		// List -> 입력순서 -> 정렬순서..
		// Collections.sort(list);
		// 기본 정렬 조건 : Comparable(인터페이스) -> CompareTo() 오버라이딩
		// 정렬기준을 변경 : Comparator -> compare() 오버라이딩.
		
		
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
			//익명... 내부 클래스
			@Override
			public int compare(Integer o1, Integer o2) {
				//내림차순 정렬기준으로 변경
				if(o1 < o2) {
					return 1;
				}else if(o1 > o2){
					return -1; 
				}
				return 0;
			}
			
		});
		
		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		
	}

}
