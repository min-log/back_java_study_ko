package kosta.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		// 1.String 클레스 생성 방법
		
			//1)번
		String str = "ABC"; 
		String str2 = "ABC"; 
			//2)번
		String str3 = new String("ABC");
		
			// 차이점
			//1)번 객체 생성시 : 같은 내용이 있는지 확인하고 생성하게됨 , 동일한 내용이 있다면 해당 메모리의 주소값을 받음.
			//2)번 객체 생성시 : new 선언을 통해 새롭게 생성이된다.
		
		if(str == str3) {   // == 주소값 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//2. String 객체 특징(불변성) --> 자기자신은 바뀌지 않는다.... => StringBuffer , StringBuilder 메서드(가변성) 문자열을 다루기 위해 사용됨. 
		// String은 리턴 받기 위한 것.
		str.concat("DEF"); //concat 문자열 뒤에 내용 추가  but 자기자신은 변경되지 않음  -->ABC
		String str4 = str.concat("DEF"); //새로운 변수 선언 + 문자열 추가는 --> ABCDER
		System.out.println(str4);
		
		// 동적쿼리문 (행동에 따라서 변경이 계속되는...) 
		// 플러스(+) 연산자를 사용하면 변경가능
		String sql = "select * from board";
		int num = 10;
		if(num == 10) {
			sql+="where num = 10";
		}
		System.out.println(sql);
		
		
//		StringBuffer sb = new StringBuffer("select * from board");
//		int num= 10;
//		if(num == 10) {
//			sb.append("where num = 10");
//		}
//		
//		System.out.println(sb.toString());
		
		//찾고자하는 문자열의 위치를 파악 indexOf("문자열") =>해당문자열의 인덱스 반환 , 없으면 -1
		System.out.println(sql.indexOf("*"));
		
		//문자열의 길이
		System.out.println(sql.length());
		
		//charAt (인덱스) :char => 인덱스에 해당하는 문자 1개 리턴
		for (int i = 0; i < sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		//문자열 부분 추출 
		// subString(5)   --> 5번째 문자열 부터 전체
		// subString(5,10); --> 5번째 부터9번째 까지  마지막은 포함 x
		
		System.out.println(sql.substring(7,13));
		
		//퀴즈 sql 변수에서 board 문자 추출하기
		
		String a = "board";
		int sqlB = sql.indexOf(a); // 시작이 몇번째에 있는지
		int sqlBlength = a.length(); // 현제 문자열 수 
		System.out.println(sql.substring(sqlB, (sqlB + sqlBlength)));
		
		String fileName ="kosta.jpg";
		String head="";
		String pattern="";
		
		int stringCut = fileName.indexOf(".");
		head = fileName.substring(0,stringCut);
		pattern = fileName.substring(stringCut+1);
		System.out.println(head + ":" + pattern);
		
		// 어떤문자로 끝나는지 확인가능
		if(fileName.endsWith("jpg")) { //startsWith("문자열") 해당문자열로 시작하는지 확인 가능
			System.out.println("이미지 파일 입니다.");
		}
		
		String id="Kosta ";
		String m_id = "kosta";
		
		if (id.trim().equalsIgnoreCase(m_id.trim())) { //equalsIgnoreCase 소대문자 구분 없이 같은 의미면 true
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		//문자열을  => String 배열로 변환
		String fruits = "사과/포도/수박/배";
		String arr[] = fruits.split("/");
		System.out.println(Arrays.toString(arr));
		
		int n = 10;
		String s = n + "";
		String s2 = String.valueOf(n);
		
		
		
	
		
	}

}
