package kosta.oop3;

public class BoardService {
	//OracleDao -> insert{}호출
	//MySQLDao -> insert{}호출
	
	private Board board;
	
	public BoardService(Board board) {
		super();
		this.board = board;
	}


	public void insertBoard() {
		board.insert();
	}
}
