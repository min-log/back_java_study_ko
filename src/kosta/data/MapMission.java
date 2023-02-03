package kosta.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapMission {

	public static void main(String[] args) {
		// 이름,점수를 한쌍으로 Map 자료구조로 구현하자 => 김자바 : 80 , 박자바 : 70
		//1. 시험 응시자만 전체 출력
		//2. 총점, 평균, 최고점수,최저 점수  : collections => max(),min()활용해보기..?
		int sum = 0;
	
		Map<String, Integer> list = new HashMap<String, Integer>();
		
		list.put("김지연", 80);
		list.put("이지민", 90);
		list.put("홍길동", 50);
		

		
			
		Set<String> keyinput = list.keySet();
		System.out.println(keyinput);
		
		
		
		Collection<Integer> listScore = list.values();
		System.out.println(listScore);
		
		// 순서가 없는 데이터의 집합 전체 출력해줄때 
		// 개별적인 값을 각각 전체 출력..
		Iterator<Integer> listIter = listScore.iterator(); 
		while (listIter.hasNext()) {
			sum += listIter.next();
		}
		
		

		int max= Collections.max(listScore);
		int min= Collections.min(listScore);
		
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + (sum / list.size()));
		System.out.println("최고 : "+max);
		System.out.println("최저 : "+min);
		
		
		
		
		
		
	}

}
