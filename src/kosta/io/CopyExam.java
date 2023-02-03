package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExam {

	public static void main(String[] args) {
		// poem2.txt  > poem3.txt 로 복사 해보자
		FileReader c = null;
		FileWriter v = null;
		
		try {
			c = new FileReader("poem2.txt");
			v = new FileWriter("poem3.txt");
			
			while (true) {
				int reader = c.read();
				if(!(reader == -1)) {
					//System.out.print((char)reader);
					v.write((char)reader);
				}else {
					break;
				}
			}
			
			v.close();
			c.close();
			System.out.println("복사 완료 !");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				v.close();
				c.close();
			} catch (Exception e2) {}
		}
		
	}

}
