package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//로그인 예제를 구현해 보자
		//id , pass 키보드로부터 입력
		//id, pass 모두 일치하면 => 로그인 성공
		//id 불일치 => 해당아이디가 존재하지 않습니다.
		//pass가 불일치 => 비밀번호가 일치하지 않습니다.
		String m_id ="kosta";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		String id = sc.nextLine();
		String pass = sc.nextLine();
		
		//함수.trim() //양 사이드의 공백 문자를 제거해준다.
		
//		if(id.trim().equals(m_id)&&pass.trim().equals(m_pass)) {
//			System.out.println("로그인이 성공하였습니다.");
//		}else if(id.trim().equals(m_id) & !pass.trim().equals(m_pass)) {
//			System.out.println("페스워드가 틀렸습니다.");
//		}else if (pass.trim().equals(m_pass)& !id.trim().equals(m_id)) {
//			System.out.println("아이디가 틀렸습니다.");
//		}else {
//			System.out.println("아이디와 페스워드가 틀렸습니다.");
//		}
//		
//		
		//선생님 해석
		if(id.trim().equals(m_id)&&pass.trim().equals(m_pass)) {
			System.out.println("로그인이 성공하였습니다.");
		}else {
			if(!id.trim().equals(m_id) & !pass.trim().equals(m_pass)) {
				System.out.println("아이디.비번 틀렸습니다.");
			}else if(!id.trim().equals(m_id)) {
				System.out.println("아이디가 틀렸습니다.");
			}else if(!pass.trim().equals(m_pass)){
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}
		
		

	}

}
