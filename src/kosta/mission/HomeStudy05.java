package kosta.mission;

import java.util.Scanner;

public class HomeStudy05 {
	//문자열 / 분리해서 읽기
	//바나나 딸기로 메소드 사용해서 변경
	public static String text_change(String txt_v[]) {
		
		txt_v[1] = "딸기";
	
		return txt_v[1];
		
	}
	
	public static void main(String[] args) {
		String txt = "사과 / 바나나 / 참외";
		String txt_v[] = new String[3];
		txt_v = txt.split("/"); //
		
		text_change(txt_v);
		System.out.println("변경 후 : ");
		for(int i = 0;i<txt_v.length;i++) {
			System.out.println(i+"번:"+txt_v[i].trim());
		}
		//System.out.println(txt_v[0] + " / " + txt_v[1] + " / " + txt_v[2]);	
		
		
		
	}
	
	
/*	
	// 국어 , 영어 , 수학의 점수를 키보드로 입력 받고
	// 배열에 평균, 총합 의 값을 추가로 넣어 보자.
	
	// 배열에 총합
	public static int getTotal(int score_v[]){
		for(int i=0;i <3;i++) {
			score_v[3] += score_v[i];
		}
		return score_v[3];
	}  
	// 배열에 평균
	public static int getAver(int score_v[]) {
		
		for(int i=0;i <3;i++) {
			score_v[4] = score_v[3]/3;
		}
		
		return score_v[4];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		String score_name[];//선언
		score_name = new String[3];//생성
		score_name[0] ="국어";
		score_name[1] ="수학";
		score_name[2] ="영어";
		int score_value[] = new int [5];
		for(int i=0; i<score_name.length;i++) {
			System.out.print(score_name[i] + ":");
			score_value[i] = sc.nextInt();
		}
		int total = getTotal(score_value);
		int aver = getAver(score_value);
		System.out.println("총합 = " + total);
		System.out.println("평균 = " + aver);
		
	}
*/

}
