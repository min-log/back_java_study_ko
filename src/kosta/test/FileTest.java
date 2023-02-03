package kosta.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileTest {
	
	public static void main(String[] args) {
		//List<FileT> fileInfo = new ArrayList<FileT>();
		
		// 쓰고 데이터에 저장
		// + 파일에 저장
		// 읽어주기 데이터 말고 파일을
		BufferedReader reader = null;
		BufferedWriter writer = null; 
		boolean roop = true;
		
		String str = " ";
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new FileWriter("fileTest.txt"));
			
		
			System.out.println("입력하기 : ");
			System.out.println(str);
			while (!(str.equals("q"))) {
				writer.write(str);
				
				
				
				
			}
			
			System.out.println("종료됩니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				reader.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		
			
		}
		
		
			
		
		
		

	}

}
