package kosta.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		//1. 바이트 스트림을 이용하여 이미지 파일을 복사해보자
//		String source = "C:\\Users\\KOSTA\\256\\goole.PNG";
//		//1. 복사 경로
//		String dest = "C:\\Users\\KOSTA\\256\\workspace\\goole.PNG";
		
		
		//CopyUtill.copyFile(new File(source), new File(dest));
		
		//2. 디렉토리까지 전체 복제
		String source = "C:\\Users\\KOSTA\\256\\교재PPT";
		String dest = "C:\\Users\\KOSTA\\256\\교재PPTCopy";
		CopyUtill.copyDirectory(new File(source), new File(dest));
		
		
		

	}

}
