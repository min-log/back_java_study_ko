package kosta.phone;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//1. addPhoneInfo {} //더하기
	//2. listPhoneInfo//출력

//import java.util.Scanner;

public class Manager {
	//기존 배열 
	//Phone phone[] = new Phone[10];
	//리스트 자료구조로 대채
	List<Phone> phone = new ArrayList<Phone>();

	
//	Scanner sc = new Scanner(System.in);
	
	
	int count = 0; // 카운트 
	
	String name ="이름";
	String phoneNo;
	String birth;
	//학교
	String major;
	int year;
	//회사
	String dept;
	String position;
	
	String user_search;// 검색용
	int userSearchNo = -1; // yes or no 
	
	
	
	// 추가
	public void addPhoneInfo(){
		System.out.println("원하는 폴더 선택 :");
		System.out.println("1. 일반  2. 동창  3. 직장");
		user_search = DataInput.sc.nextLine();
		
		System.out.print("이름 : ");
		name = DataInput.sc.nextLine();
		
		System.out.print("핸드폰번호 : ");
		phoneNo = DataInput.sc.nextLine();
		
		System.out.print("생년월일 : ");
		birth = DataInput.sc.nextLine();
		
		switch (user_search) {
		case "1":
		case "일반":
			//phone[count++] = new Phone(name, phoneNo, birth); // 후치증감자 계산후 ++
			phone.add(new Phone(name, phoneNo, birth));
			//count++;
			break;
		case "2":
		case "동창":
			System.out.print("전공 : ");
			major = DataInput.sc.nextLine();
			System.out.print("학번 : ");
			year = DataInput.sc.nextInt();
			
			//phone[count++] = new Universe(name, phoneNo, birth, major, year); // 후치증감자 계산후 ++
			phone.add(new Universe(name, phoneNo, birth, major, year));
			System.out.println("동창으로 등록되었습니다.");
			//count++;
			break;
		case "3":
		case "직장":
			System.out.print("부서 : ");
			dept = DataInput.sc.nextLine();
			System.out.print("직급 : ");
			position = DataInput.sc.nextLine();
			//phone[count++] = new Company(name, phoneNo, birth, dept, position); // 후치증감자 계산후 ++
			phone.add(new Company(name, phoneNo, birth, dept, position)); // 후치증감자 계산후 ++
			System.out.println("직장으로 등록되었습니다.");
			//count++;
			break;
		default:
			System.out.println("메뉴에 없습니다. 다시 처음부터 선택 해주세요.");
			break;
			
		}
		
	
		
	}
	
	// 삭제
	public void removePhoneInfo(){		
		
		System.out.print("삭제할 사람 이름 :");
		user_search = DataInput.sc.nextLine();
		
		for (int i = 0; i < phone.size(); i++) {
			//if(phone[i].getName().equals(user_search)) {
			if(phone.get(i).getName().equals(user_search)) {
				userSearchNo = i;
				break;
			}
		}
		
		if(userSearchNo == -1) {
			//제거 대상 없음 
			System.out.println("삭제 대상이 없습니다.");
		}else {
			// 제거 필요한 번호 부터 
			phone.remove(userSearchNo);
			//count--;
//			for (int i = userSearchNo; i < count; i++) {
//				if (i == phone.size() - 1) {
//					//맨마지막 인수일 경우 지울 수 없으니까 null로 값 변경 
//					phone[i] = null;
//				}else {
//					phone[i] = phone[i+1];
//				}
//			}
//			count--;
		}
	}
	
	// 출력
	public void listPhoneInfo(){
		System.out.println("원하는 폴더 선택 :");
		System.out.println("1. 일반  2. 동창  3. 직장 ");
		user_search = DataInput.sc.nextLine();
		
		
		for (int i = 0; i < phone.size(); i++) {
			
			if (user_search.equals("2") && phone.get(i) instanceof Universe) {
				System.out.println("2");
				phone.get(i).show(i);
				
			}else if (user_search.equals("3") && phone.get(i) instanceof Company) {
				System.out.println("1");
				phone.get(i).show(i);
			}else if (user_search.equals("1") && phone.get(i) instanceof Phone) {
				System.out.println("1");
				phone.get(i).show(i);
			}
			
		}
		

		

		
				
	}
	
	//검색
	public void searchPhoneInfo(){
		
		System.out.print("검색 : ");
		user_search = DataInput.sc.nextLine();
		for (int i = 0; i < phone.size(); i++) {
			if(phone.get(i).getName().equals(user_search)) {	
				userSearchNo = i;
				break;
			}
		}
		if(userSearchNo == -1) {
			System.out.println("해당 사용자가 없습니다.");
		}
		else {
			phone.get(userSearchNo).show(userSearchNo);
		}
		
	}
	//수정
	public void updatePhoneInfo() {
		System.out.print("수정 이름:");
		user_search = DataInput.sc.nextLine();
		
		
		for (int i = 0; i < phone.size(); i++) {
			if(phone.get(i).getName().equals(user_search)) {
				userSearchNo = i;
			};
		};
		
		
		
		if(userSearchNo == -1) {
	
			System.out.println("없는 사람입니다 ㅜㅜ");

			
		}else {
			
			
			System.out.println(phone.get(userSearchNo).getName() + "님의 정보를 수정 하시겠습니까 ?");
			System.out.print("맞으면 yse / 틀리면 no 를 입력해주세요.");
			String userYesNo = DataInput.sc.nextLine();
			
			switch (userYesNo) {
			case "yes":
			case "YES":
				String userM = "일반";
				
				System.out.print("이름 : ");
				phone.get(userSearchNo).setName(DataInput.sc.nextLine());
				System.out.print("핸드폰번호 : ");
				phone.get(userSearchNo).setPhoneNo(DataInput.sc.nextLine());
				System.out.print("생년월일");
				phone.get(userSearchNo).setBirth(DataInput.sc.nextLine());
				int num =phone.get(userSearchNo).getNo();
				System.out.println(num);
				

		
				if (phone.get(userSearchNo) instanceof Universe) {
					System.out.println("1");
					Universe userU = (Universe)phone.get(userSearchNo);
					
					System.out.print("전공 : ");
					userU.setMajor(DataInput.sc.nextLine());
					System.out.print("학번 : ");
					userU.setYear(Integer.parseInt(DataInput.sc.nextLine()));
					userM = "동창";
					break;
				}else if (phone.get(userSearchNo) instanceof Company) {
					Company userC = (Company)phone.get(userSearchNo);
					System.out.print("부서 : ");
					userC.setDept(DataInput.sc.nextLine());
					System.out.print("직급 : ");
					userC.setPosition(DataInput.sc.nextLine());
					userM = "회사";
					break;
				}else if (phone.get(userSearchNo) instanceof Phone) {
					userM = "일반";
					break;
				}
				

				

				break;
			case "no":
			case "NO":
				System.out.println("다시 메뉴를 선택해주세요.");
				break;
	
			default:
				break;
			}
		}//if end
		
		
	}//updatePhoneInfo end


	//정렬
	public void arrPhoneInfo() {
		Collections.sort(phone, new Comparator<Phone>() {
			//이름순으로 변경..
			@Override
			public int compare(Phone o1, Phone o2) {
				if(o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}else if (o1.getName().compareTo(o2.getName()) < 0) {
					return 1;
				}
				return 0;
			}
			
		});
		System.out.println("정렬이 수정되었습니다.");
		
	}
	
	
	
	//저장 api -> ObjectOutputStream 
	public void fileSave() {
		System.out.println("파일이 곧 저장됩니다 ... \n 파일 개수 : " + phone.size());
		ObjectOutputStream save = null;
		try {
			save = new ObjectOutputStream(new FileOutputStream("phone.txt"));
			save.writeObject(phone);
			
//			for (int i = 0; i < phone.size(); i++) {
//				//save.write(phone.get(i).getNo() + Integer.parseInt(phone.get(i).getName()) + Integer.parseInt(phone.get(i).getPhoneNo())+ Integer.parseInt(phone.get(i).getBirth()));
//				save.writeObject(phone.get(i));
//
//			}
			
			
			System.out.println("파일을 저장했습니다.");
			
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				save.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
	
	//불러오기
	public void fileInput() {
		
		ObjectInputStream inputP = null;
		try {
			System.out.println("저장되어 있는 파일을 불러옵니다... \n 파일 개수 : " + phone.size());
			inputP = new ObjectInputStream(new FileInputStream("phone.txt"));
			
			phone = (List<Phone>)inputP.readObject();
			
			System.out.println("다시 저장 파일 불러오기 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				inputP.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	
}
