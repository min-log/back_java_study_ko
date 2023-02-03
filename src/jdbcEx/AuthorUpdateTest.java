package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorUpdateTest {

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
			String query ="UPDATE AUTHOR SET AUTHOR_NAME = '김지연' WHERE AUTHOR_ID = 2";
			pstmt = conn.prepareStatement(query);
			//4. 실행
			int count= pstmt.executeUpdate(); //
			
			
			//5. 결과처리
				//값이 없을때까지 실행됨
			System.out.println(count + "건이 수정되었습니다.");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
