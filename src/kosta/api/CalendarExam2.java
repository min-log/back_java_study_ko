package kosta.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarExam2 {

	public static void main(String[] args) {
		//입사일 입력 --> 몇년 몇개월 근무 기간 출력
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜를" + pattern + "형태로 입력하세요. (ex : 2023/01/01) :");
		
		Date inDate = null; //데이트 객체
		
		
		while (sc.hasNextLine()) { //hasNextLine 다음에 읽을 값이 있는지확인...
			//예외
			try {
				// 내가 입력한 객체를 데이트 객체로 가져온다
				inDate = df.parse(sc.nextLine()); //같은 형태가 아니면 예외가 되도록
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		
		Calendar cal = Calendar.getInstance(); // 칼랜더 객체 선언
		//데이트 객체를 -> 칼랜더 객체로 변경  
		cal.setTime(inDate);// 입사일
		
		Calendar today = Calendar.getInstance(); //오늘 날짜
		long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(24*60*60*1000); 
		// 총 시간을 빼서 (시간 * 분* 초  * Millis (1000분에 1초를 반환)) 날짜 구해주기...
		
		int m = (int)(day / 30);
		int year = m/12;
		int month = m%12; 
		
		System.out.println("총근무기간 : " + year + "년" + month + "개월 근무");
		
		
		
		
		
	}

}
