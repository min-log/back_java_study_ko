package jdbc.book;

import java.util.List;

public interface BookDao {
  public List<BookVo> getList(); // 책정보 모두 가져오기
  public List<BookVo> getSearchList(String keyWord); // 책정보 검색하여 가져오기
}
