package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;



public class CopyUtill {
	//재귀함수
	
	public static void copyDirectory(File source, File dest) {
		if(source.isDirectory()) dest.mkdir(); //소스에 디렉터리가 있을때 추가
		//현제 소스 파일을 리스트 만들어준다
		File[] lists = source.listFiles();


		for (int item =0; item < lists.length; item++) {
			 
			File de = lists[item]; // 현제 파일
			File itemde = new File(dest, de.getName());  //copy
			
			if (de.isDirectory()) {
				copyDirectory(de, itemde); // 다시 메서드를 호출해서 해당 메서드 먼저 실행 후 다시 돌아옴.	
			}	
				
			copyFile(de, itemde);
					
			
		}
		
		
	}
	
	public static void copyFile(File source, File dest) {
		FileOutputStream os = null;
		FileInputStream is = null;
		System.out.println("000");
		byte buf[] = new byte[1024];
		int data = 0;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			while ((data = is.read(buf)) != -1) {
				os.write(buf);
				Arrays.fill(buf, (byte)0);
				
			}
			System.out.println("복사성공");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (os != null) {
					os.close();	
				}
				if (is != null) {
					is.close();	
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
//				
//		try {
//			is = new FileInputStream(source);
//			os = new FileOutputStream(dest);
//	
//			while (true) {
//				int a = is.read();
//				if (a < 0) {break;}
//				os.write((byte)a);
//				
//			}
//
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				is.close();
//				os.close();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
	}
}
