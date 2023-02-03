package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
//		Map :(key,value),(key,value) =>HashMap
		// map / set 순서가 없다...
		
		//프로야구 순위, 이름
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "SSG");
		map.put("2", "키움");
		map.put("3", "LG");
		System.out.println("요소의 사이즈" + map.size());
		//원하는 값 삭제
		if (map.containsValue("SSG")) {
			map.remove("1");
		}
		
		System.out.println("삭제 후 요소의 사이즈" + map.size());
		//데이터값 출력
		
//		System.out.println(map.get("2"));
		
		//전체 데이터값 출력 (key,value)
		//map -> set -> iterator
		//key값만 가져오고 싶을때  => keySet()
		//value값만 가져오고 싶을때  => values() -> Collection :value값만 추출
		//key /value 둘다 추출  => entrySet() 
		
		//Set set = map.keySet();
		Set set = map.entrySet();
		System.out.println(set);
		
		Iterator iter = set.iterator(); //key,value
		while (iter.hasNext()) {
			//map의 안에 value 와 키의 묶음 하나  -> 데이터타입은 Map.Entry   (.)점 -> 내부 클래스 , 내부 인터페이스  
			//Map의 내부 클래스 Entry
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();
			System.out.println("key: " + e.getKey() +" , value: " + e.getValue());
		}
		
		
		
		
	}

}
