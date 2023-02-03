package kosta.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {
	
	public static void main(String[] args) {
		//2023년 1월 달력 만들기
		//<2023년 2월>
		// 일 월 화 수 목 금 토
		//		1 2 3 4
		//5 6 7 8 9 10 11
		
		Calendar gc = Calendar.getInstance();
		
		Scanner sc =new Scanner(System.in);
		
		gc.set(2023, 1,1); //1. 원하는 날짜 셋팅
		

		int nowYear= gc.get(Calendar.YEAR);
		int nowMont= gc.get(Calendar.MONTH);
		System.out.println("\t\t< " + nowYear + "년 " + (nowMont+1) + " 월 >");
	
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//2. 2월 1일  일주일 중 첫 날짜가 몇요일인지 확인
		int frist = gc.get(Calendar.DAY_OF_WEEK) - 1; // 1 2 3 4 5 6 7 -> 일~토
		
		
		//3. 첫 날짜 요일 이전 갯수 공백처리		
		for (int i = 0; i < frist; i++) {
			System.out.print("\t");
		}
		//4. 2월의 마지막 날짜 구하기
		int dateLast = gc.getActualMaximum(Calendar.DATE); 
		//5. 처음 날짜부터 마지막 날짜까지 뿌려주기 
		for (int i = 1; i < dateLast + 1; i++) {
			if(frist % 7 == 0) { //처음 공백처리한 날짜 3 부터 돌아가며 7이 되었을때 println 갱신 해준다.
				System.out.println();
				frist = 0; //마지막에 다시 0 부터 
			}
			frist++; //1씩 다시 증가 하여 7 까지 돌면 다시 갱신 해줄수 있게 추가.
			System.out.print( i + "\t"); // 날짜 증가되게 추가
		}
		
		

		
		
		
	}
}
