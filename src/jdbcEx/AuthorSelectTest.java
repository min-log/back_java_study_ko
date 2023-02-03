package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorSelectTest {

	public static void main(String[] args) {
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1. jdbc 드라이버 오라클 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webDB", "1234");
			System.out.println("접속성공");
			
			//sql문 
			String query = "SELECT author_name from AUTHOR";
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery(); // 5번의 next()를 해서 값을 찾을때 데이터가 들어감. 이전에는 없음.
			
			while (rs.next()) {
				
				String name = rs.getString("author_name");
				System.out.println(name);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}

}
