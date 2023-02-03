package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("수박");
		
		//출력방법 1
		list.clear();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		//출력 방법2 .Iterator   (List,Map,Set)--> 통용해서 출력 
		Iterator<String> iter = list.iterator(); //Iterator로 데이터형 변환
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		
		
		
	}

}
