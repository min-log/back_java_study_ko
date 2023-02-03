package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		//파일에 있는 문자 데이터를 읽기
		
		//객채를 바로 생성하면 예외의 finally에서 파일 닫기(close)를 사용해줄 수 없기때문에 생성하지 않고 선언만 한다.
		FileReader reader = null; 
		
		char arr[] = new char[10];
		
		
		try {
			reader = new FileReader("poem.txt"); //파일 생성 읽어줌 
			
			while (true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr); //배열안에 데이터 값 넣어줌
				if(data == -1) break;
				System.out.print(arr);
			}
			
//			reader.read(arr);
//			while (true) {
//				int data = reader.read();  //read() 숫자로 변형되어 읽어짐(아스키코드) 데이터 값이 없으면 -1 을 리턴함.
//				if(data == -1) break;
//				System.out.print((char)data); //문자로 변환
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close(); //try로 묶어주는 이유 >> finally 에서는  
			} catch (Exception e2) {
				
			}
		}
		
		
		

	}

}
