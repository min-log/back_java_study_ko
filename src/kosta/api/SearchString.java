package kosta.api;

import java.util.Scanner;

public class SearchString {
	public int solution(String userKey, String key) {
		int count = 0;
		for (int i = 0; i < userKey.length(); i++) {
			if(userKey.charAt(i) == key.charAt(0)) count++;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		SearchString s = new SearchString();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("내용 입력 : ");
		String userKey = sc.next().toLowerCase(); // Computercooler
		System.out.print("찾는 문자 : ");
		String key = sc.next().toLowerCase(); //c
		int count = 0;
		
		s.solution(userKey, key);
		
		System.out.println(userKey + "에서,");
		System.out.println("'"+ key + "'은 해당 문자열에 " + count + "번 존재 합니다.");

	}

}
