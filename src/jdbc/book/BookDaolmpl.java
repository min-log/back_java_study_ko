package jdbc.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaolmpl implements BookDao {
	public Connection getbookconnect() throws SQLException{
		Connection conn = null;
	    try {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	      conn = DriverManager.getConnection(dburl, "webdb", "1234");
	    } catch (ClassNotFoundException e) {
	      System.err.println("JDBC 드라이버 로드 실패!");
	    }
	    return conn;
		
	}
	
	

	@Override
	public List<BookVo> getList() {
		// TODO Auto-generated method stub
		Connection conn =null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		List<BookVo> bookList = new ArrayList<BookVo>();
		try {
			conn = getbookconnect();
			String query = "SELECT b.BOOK_ID, b.TITLE,b.PUBS,PUB_DATE ,a.AUTHOR_NAME \n" + 
					"FROM BOOK b,AUTHOR a \n" + 
					"WHERE b.AUTHOR_ID = a.AUTHOR_ID";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				BookVo vo_list = new BookVo(
					rs.getInt("BOOK_ID"),
					rs.getString("TITLE"),
					rs.getString("PUBS"),
					rs.getString("PUB_DATE"),
					rs.getString("AUTHOR_NAME")
				);
				bookList.add(vo_list);
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("book조회성공");
		return bookList;
	}


	@Override
	public List<BookVo> getSearchList(String keyWord) {
		Connection conn =null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		List<BookVo> bookList = new ArrayList<BookVo>();
		try {
			conn = getbookconnect();
			String query = " SELECT b.BOOK_ID, b.TITLE,b.PUBS,b.PUB_DATE,a.AUTHOR_NAME\r\n" + 
					" FROM AUTHOR a , BOOK b \r\n" + 
					" WHERE A.AUTHOR_ID = B.AUTHOR_ID\r\n" + 
					" AND (A.AUTHOR_NAME || B.TITLE || B.PUBS)  LIKE ?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, "%" + keyWord + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				BookVo vo_list = new BookVo(
					rs.getInt("BOOK_ID"),
					rs.getString("TITLE"),
					rs.getString("PUBS"),
					rs.getString("PUB_DATE"),
					rs.getString("AUTHOR_NAME")
				);
				bookList.add(vo_list);
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("book조회성공");
		return bookList;
	}




}
