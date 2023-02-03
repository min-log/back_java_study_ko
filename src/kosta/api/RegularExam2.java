package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {
	public static void main(String[] args) {
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
//		
//		//뽑고 싶은 데이터 값을 체크 > ca-
//		//compile 패턴 객체 정규표현식을 객체화 시킨 것.
//		
//		Pattern p = Pattern.compile("^d[a-z]*");
//		for (int i = 0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]); //결과값을 true / false 로 반환
//			if(m.matches()) {
//				System.out.println(data[i]);
//			}
//			
//		}
		
		
//		Pattern p = Pattern.compile("^c[a-z]*");
//		for (int i = 0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]); //결과값을 true / false 로 반환
//			if(m.matches()) {
//				System.out.println(data[i]);
//			}
//			
//		}
		
//		String source = "ab?cd?de?gh";
//		String reg = "(\\w*)";
//		Pattern p = Pattern.compile(reg); //정규표현식
//		Matcher m = p.matcher(source);
//		
//		while (m.find()) {
//			System.out.println(m.group());
//		}

		
		
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String pat = "0[0-9]*{2,3}-[0-9]*{3,4}-[0-9]*{4}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
		//
		
		
		
		
		
		
	}
}
