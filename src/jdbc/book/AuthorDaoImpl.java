package jdbc.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
  
  private Connection getConnection() throws SQLException {
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
  public int insert(AuthorVo vo) {
    int count = 0;
    try {
      Connection conn = getConnection();
      String query = "INSERT INTO AUTHOR VALUES (seq_author_id.nextval, ?, ? )";
      PreparedStatement ps = conn.prepareStatement(query);
      
      ps.setString(1, vo.getAuthor_name());
      ps.setString(2, vo.getAuthor_desc());
      
      count = ps.executeUpdate();
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("추가 성공");
    return count;
  }

  @Override
  public List<AuthorVo> getList() {
	ArrayList<AuthorVo> arraylist= new ArrayList<AuthorVo>(); // 불러온 객체 넣어줄 배열
	
	try {
		Connection conn = getConnection();
		String query = "SELECT * FROM AUTHOR";
	    PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			AuthorVo vo = new AuthorVo(
	            rs.getInt("AUTHOR_ID"),
	            rs.getString("AUTHOR_NAME"),
	            rs.getString("AUTHOR_DESC")
            );
			arraylist.add(vo);
		
		}
		
		for (AuthorVo item : arraylist) {
			System.out.println(item.getAuthor_id()+ item.getAuthor_name() + item.getAuthor_desc());
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("조회성공");
	
    return arraylist;
  }

  @Override
  public int delete(int authorId) {
    // TODO Auto-generated method stub
	  int count = 0;
	  try {
			Connection conn = getConnection();
			PreparedStatement prstmt = null;
		  
		  String query = "DELETE author\r\n" + 
				  		"WHERE author_id = ?";
		  prstmt = conn.prepareStatement(query);
		  prstmt.setLong(1, authorId);
		  count = prstmt.executeUpdate();
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  System.out.println("데이터 삭제 성공");
	 
    return count;
  }

  @Override
  public int update(AuthorVo vo) {
	  int count = 0;
	    try {
	      Connection conn = getConnection();
	      String query = " UPDATE AUTHOR a        \n"
	                   + " SET a.AUTHOR_NAME = ?, \n"
	                   + "     a.AUTHOR_DESC = ?  \n"
	                   + " WHERE a.AUTHOR_ID = ?    ";
	      PreparedStatement ps = conn.prepareStatement(query);
	      
	      ps.setString(1, vo.getAuthor_name());
	      ps.setString(2, vo.getAuthor_desc());
	      ps.setInt(3, vo.getAuthor_id());
	      
	      count = ps.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    System.out.println("데이터 수정완료");
	    return count;
  }

}

