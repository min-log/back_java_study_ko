package kosta.oop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board dao1 = new OracleDao(); // Board 상위 삼촌.. 이기때문 사용 가
		MySQLDao dao2 = new MySQLDao();
		
		
	
		MySQLDao Msql = new MySQLDao() {
			@Override
			public void insert() {
				System.out.println("이너 클래스 보여줘");

			}
		};
		
		BoardService board = new BoardService(Msql);
		board.insertBoard();
		
		
		
	}

}
