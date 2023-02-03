package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookInsert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url= "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webDB", "1234");
			System.out.println("접속성공");
			
			String query = "INSERT INTO BOOK \r\n" + 
					" VALUES (seq_book_id.nextval,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "추가책이름");
			pstmt.setString(2, "책정보");
			pstmt.setString(3, "1993-04-30");
			pstmt.setInt(4, 5);
			
			rs = pstmt.executeQuery();
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
