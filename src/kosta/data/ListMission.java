package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		//List 자료구조를 활용하여 키보드로 부터 입력 받은 문자열을 처리하자.
		//1. 데이터 추가 2. 데이터 삭제 3. 전체 출력
		Scanner sc = new Scanner(System.in);
		
		List<String> arr = new ArrayList<String>();
		
		while (true) {
			System.out.println("1. 데이터 추가  2. 데이터 삭제  3. 전체 출력");
			System.out.print("메뉴선택 : ");
			String key = sc.nextLine();
			int idx = -1;
			switch (key) {
			case "1":
				System.out.println("데이터 추가 --------------");
				System.out.print("추가 내용입력 : ");
				arr.add(sc.nextLine());
				
				break;
			case "2":
				System.out.println("데이터 삭제 --------------");
				System.out.print("삭제 내용입력 : ");
				
				
				
				idx = arr.indexOf(sc.nextLine());
				if(idx != -1) {
					arr.remove(idx);
				}else {
					System.out.println("없음.");
				}
				
				
							
				
				break;
			case "3":
				System.out.println("데이터 출력 --------------");
				Iterator<String> arrList = arr.iterator();
				while (arrList.hasNext()) {
					System.out.println(arrList.next());
				}
				
				break;
			default:
				break;
			}//swich
		}//while
	}

}
