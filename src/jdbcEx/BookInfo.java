package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookInfo {

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
			String query ="SELECT b.BOOK_ID, b.TITLE,b.PUBS,b.PUB_DATE,a.AUTHOR_NAME,a.AUTHOR_DESC \r\n" + 
					"FROM BOOK b,AUTHOR a \r\n" + 
					"WHERE b.AUTHOR_ID = a.AUTHOR_ID"
					+ " ORDER BY BOOK_ID" ;
			pstmt = conn.prepareStatement(query);
			//4. 실행
			rs = pstmt.executeQuery(); // 5번의 next()를 해서 값을 찾을때 데이터가 들어감. 이전에는 없음.
			
			
			//5. 결과처리
				//값이 없을때까지 실행됨
			while (rs.next()) {
				int bookId = rs.getInt("BOOK_ID"); //number형은 getInt로 받아오기
				String bookName = rs.getString("TITLE");
				String bookPubs = rs.getString("PUBS");
				String bookDate = rs.getString("PUB_DATE");
				String authorName = rs.getString("AUTHOR_NAME");
				String authorDesc = rs.getString("AUTHOR_DESC");
				
				System.out.println(bookId + "\t" + bookName + "\t\t" + bookPubs 
						+ "\t\t" + bookDate 
						+ "\t\t" + authorName
						+ "\t\t" + authorDesc);	
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
