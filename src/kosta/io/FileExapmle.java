package kosta.io;

import java.io.File;

public class FileExapmle {
	
	public static void show(File file) { //파일을 받아서 디렉토리면 디렉토리, 파일이면 파일
		if (file.isDirectory()) {
			//디렉토리라면
			System.out.println("Dir : " + file.getName());
			File files[] = file.listFiles(); // 디렉토리이기 때문에 안에 파일 목록이 있음.
			for (int i = 0; i < files.length; i++) { //파일의 갯수만큼
				System.out.println(" file : " + files[i].getName()); // 파일의 이름
			}
		}else {
			//파일이라면
			System.out.println(" file : " + file.getName());
		}
		
	}
	public static void main(String[] args) {
		//파일 객체 생성 방법
			// 파일에 대한 정보가 필요하기 때문에 파일을 객체로 만들어서 사용.
		//현제 전체 디렉토리 경로 알아내기
		System.out.print(System.getProperty("user.dir"));
		//상대경로
		//show(new File("./src/kosta/io"));
		//절대경로
		//show(new File("C:\\Users\\KOSTA\\256\\workspace\\java_work\\java_Basic\\src\\kosta\\io\\video.java"));
		//(절대경로 , 파일명 ) 분리하여 사용할 수도 있다.
//		show(new File("C:\\Users\\KOSTA\\256\\workspace\\java_work\\java_Basic\\src\\kosta\\io","video.java"));
		//show(new File("."));// 현제 파일이 위치한 디렉토리
		show(new File("YoureType"));// 현제 파일이 위치한 디렉토리
	}

}
