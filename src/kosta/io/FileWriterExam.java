package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		// 키보드로 부터 문자열을 입력 받아 파일 쓰기를 구현하자.
		//"q" 입력하면 종료 => q를 입력하기 전까지 문자열을 파일 쓰기를 하자.
		// 입력 > 안녕
		// 입력 > 반갑다.
		// 입력 > q
		// 종료
		// FileWriter : write(문자열); -> 문자열 쓰기
		// 파일명 : poem2.txt : 실존 안해도 생성됨. 반드시 close 해야지만 파일이 생성되어 있음.
		// 파일 생성 확인 ->파일을 리플레쉬 해주어야 확인가능
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter wt = null;
		String txt = " ";
		
		try {
			wt = new FileWriter("poem2.txt");
			System.out.println("입력");
			while (!((txt=sc.nextLine()).equals("q"))) {
				wt.write(txt + "\n");
			};
			wt.close();
			
		} catch (Exception e) {
			System.out.println("작성실패 했습니다.");
			e.printStackTrace(); // 
		}finally {
			try {
				wt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
	

		
		

	}

}
