package kosta.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// 리스트를 생성후 멤버 여러개를 추가후 전체를 출력하세요.
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String address;
		
		
		List<Member> memberList = new ArrayList<Member>();
		
		while (true) {
			
			System.out.println("1. 고객 추가  2. 고객 출력");
			String key = sc.nextLine();
			//1. 고객 추가  2. 고객 출력
			switch (key) {
			case "1":
				System.out.println("고객 정보를 입력하세요.");
				System.out.print("이름 : ");
				name = sc.nextLine();
				
				System.out.print("나이 : ");
				age = sc.nextInt();
				
				System.out.print("주소 : ");
				sc.nextLine();
				address = sc.nextLine();
				memberList.add(new Member(name, age, address));
				
				break;
			case "2":
				
				
				System.out.println("일반 for");
				for (int i = 0; i < memberList.size(); i++) {
					Member m = memberList.get(i);
					System.out.println(m.getName() + m.getAge() + m.getAddress());
				}
				
//				
//				System.out.println("향상된 for");
//				for (Member m1 : memberList) {
//					System.out.println(m1.getName() + m1.getAge() + m1.getAddress());
//				}
//				
//				
//				System.out.println("Iterator");
//				
//				Iterator<Member> m2= memberList.iterator();
//				while (m2.hasNext()) {
//					Member m3 = m2.next();
//					System.out.println(m3.getName() + m3.getAge() + m3.getAddress());
//				}
//				
//				System.out.println("stream");
//				memberList.stream().forEach( member2 ->{
//					System.out.println(member2.getName());
//				});
//				
				//stream()
				//forEach()
				break;
			default:
				break;
			}
			
			
			
			
			
		}
		
		
		
		
		

	}

}
