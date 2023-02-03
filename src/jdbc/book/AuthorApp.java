package jdbc.book;

public class AuthorApp {

	public static void main(String[] args) {
		AuthorVo vo = new AuthorVo();
		AuthorDao dao = new AuthorDaoImpl();
		
		/*
		 * 추가
		 */
//		vo.setAuthor_name("홍길동");
//		vo.setAuthor_desc("홍길동전");
//		int count = dao.insert(vo);
//		if(count == 1) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
		
		
		/*
		 * 삭제
		 **/
		dao.delete(10);
		
		AuthorVo vo_up = new AuthorVo();
		vo_up.setAuthor_name("이지민");
		vo_up.setAuthor_desc("내용 수정2");
		vo_up.setAuthor_id(6);
		dao.update(vo_up);
		/*
		 * 조회
		 */

		dao.getList();
	}

}
