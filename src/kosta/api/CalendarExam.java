package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		System.out.println(gc);
		
		String now = gc.get(Calendar.YEAR) + "년 "
					+ (gc.get(Calendar.MONTH) + 1 ) + "월 " //0월부터 시작
					+ gc.get(Calendar.DATE) + "일 "
					+ gc.get(Calendar.HOUR) + "시 "
					+ gc.get(Calendar.MINUTE) + "분 ";
		System.out.println(now);
		
		//기념일
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR) + "년 "
				+ (gc.get(Calendar.MONTH) + 1 ) + "월 " //0월부터 시작
				+ gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 "
				+ gc.get(Calendar.MINUTE) + "분 ";
		System.out.println("100일 후" + future);
		
		
		gc.set(2022, 11, 11); // 2022 /12/11  -->월은 0 부터
		gc.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("YYYY/MM/dd hh:mm");
		
		String Str = dateFormat.format(gc.getTime()); // getTime 데이터 형 변경 calendal => date 
		System.out.println("100일 후 " + Str);
		
		
		
		
		//2023 ~ 2033 새해 요일
		char week[] = {'일','월','화','수','목','금','토'};
		for (int i = 2023; i < 2033; i++) {
			gc.set(i, 0, 1); // 1월 1일
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1]; //배열 인덱스는 0부터
			System.out.println(i+"년도 새해 요일은" + c + "요일입니다.");
		}
		
		
		
		
		
		
	}

}
