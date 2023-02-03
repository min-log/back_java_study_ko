package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {
	
	public static void main(String[] args) {
		//scanner => 키보드 입력
		// System.in -> InputStream(한자씩 읽음) -> InputStreamReader 필터 스트림 -> BufferdReader (한줄씩 읽을 수 있음)
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in)); // 키보드로 부터 입력받은 내용을 파일에 추가
			bw = new BufferedWriter(new FileWriter("output.txt"));
		
			System.out.println("입력");
			String str =" ";
			
			while ((str=br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
			
			System.out.println("쓰기 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {}
		}
		
	
	
	}
	
}
