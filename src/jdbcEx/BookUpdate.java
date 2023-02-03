package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			//1. JDBC 드라이버 (Oracle)로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. connection 얻어오기
				//어떻게 연결할건지 @ 오라클 서비스 주소
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webDB", "1234");
			System.out.println("접속성공");
			
			//3. sql문 준비 (바인딩 / 실행)
			String query ="UPDATE BOOK \r\n" + 
					"SET TITLE = '다시',\r\n" + 
					"	PUBS ='확인'\r\n" + 
					"WHERE BOOK_ID = ?" ;
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 12);
			//5. 결과처리
			int count= pstmt.executeUpdate();
			System.out.println("실행됨.");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
