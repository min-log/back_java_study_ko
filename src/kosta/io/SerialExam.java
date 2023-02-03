package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExam {
	private Member m;
	//객체 직렬화
	public void write() {
		//m = new Member("홍길동", 20);// 1. 객체 정렬화 선언 메모리에 생성.
		Video v = new Video(1, "비디오 a", "b");
		m = new Member("박길동", 20, v);
		
		
		
		ObjectOutputStream oos = null;
		//모든 입출력 try ~~
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser")); // 2. ObjectOutputStream을 통해  파일 생성 
			oos.writeObject(m); //3. ObjectOutputStream 으로 해당 파일에 객체정렬화 된 내용을 작성 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close(); //4. 작성 닫기
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	//객체 역직렬화
	public void read() {
		ObjectInputStream ois = null; // 
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser")); // 8. ObjectInputStream  해당파일 부름.
			m = (Member)ois.readObject(); // 9. m 메모리에 해당 파일의 내용을 추가. (Member)로 형변환 >> why? 오브젝트 객채로 들어와서 (Member)형 m 에  대입해줘야해서.
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close(); // 10. ObjectInputStream 닫기
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public static void main(String[] args) {

		
		SerialExam se = new SerialExam(); // 5. 객체 생성
		se.write(); // 6. 객체 직렬화
		se.m = null; // 7. 객체 직렬화 된 m 메모리 내용 지움.
		
		se.read(); // 11. 객체 역직렬화
		System.out.println(se.m); // 12 .m에 내용프린트
			
	}

}
