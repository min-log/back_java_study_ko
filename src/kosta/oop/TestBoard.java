package kosta.oop;

public class TestBoard {
	//게시판
	String boardNumber; //글 번호
	String boardTitle; //제목
	String boardName; //작성자
	String boardContent; //글내용
	
	int boardListNum = 0;
	
	public TestBoard() {}
	//필드 초기화
	public TestBoard(String boardNumber, String boardTitle, String boardName, String boardContent) {
		super();
		this.boardNumber = boardNumber;
		this.boardTitle = boardTitle;
		this.boardName = boardName;
		this.boardContent = boardContent;
	}
	
	//프린트 출력
	//void 이유
	
	
	public void TestBoardPrint () {
		
		
		//System.out.println(boardTitle);
		System.out.print(this.boardNumber + " / " +this.boardTitle + " / " + this.boardName + " / " + this.boardContent);
		System.out.println();
		
		
		//return boardListCon;
	}
	

}
