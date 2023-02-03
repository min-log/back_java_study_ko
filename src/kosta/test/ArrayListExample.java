package kosta.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//리스트 객체 추가 검색 삭제
		//List<Board> boardlist = new ArrayList<Board>(); // 보드 객체를 넣을 것이면 보드 타입으로 선언
		List<Board> boardlist = new LinkedList<Board>(); // 보드 객체를 넣을 것이면 보드 타입으로 선언
		
		boardlist.add(new Board("제목 1", "내용 1", "글쓴이 1"));
		boardlist.add(new Board("제목 2", "내용 2", "글쓴이 2"));
		boardlist.add(new Board("제목 3", "내용 3", "글쓴이 3"));
		boardlist.add(new Board("제목 4", "내용 4", "글쓴이 4"));
		
		//저장된 리스트 수 뿌리기
		
		System.out.println(boardlist.size());
		//특정인덱스의 객체 가져오기 3번째 아이 출력
		System.out.println("제목 : "+boardlist.get(2).getSubject()+"내용 : "+boardlist.get(2).getContent() +"글쓴이 : "+boardlist.get(2).getWriter());
		
		//모든 객체를 하나씩 가져오기
		
			//각각 내용 출력 불가
//		Iterator<Board> listShow = boardlist.iterator();
//	
//		while (listShow.hasNext()) {
//			System.out.println("제목 : "+listShow.next().getSubject());
//		}
		System.out.println("------------");
		for (int i = 0; i < boardlist.size(); i++) {
			
			System.out.println(boardlist.get(i).getSubject() + boardlist.get(i).getContent() +  boardlist.get(i).getWriter());
		}
		//객체 삭제하기 2번째
		boardlist.remove(1);
		System.out.println("------------");
		boardlist.add(0, new Board("새로 추가한 1번", "확인하자", "지민"));
		//향상된 for문으로 모든 객체 다시 가져오기
		for(Board n : boardlist) {
			System.out.println(n.getSubject() + n.getContent() +  n.getWriter());
			
		}
		
	}

}
