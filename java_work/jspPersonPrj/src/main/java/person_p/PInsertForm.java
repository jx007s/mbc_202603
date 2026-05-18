package person_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonDAO;

// PList 의 서비스 클래스
// --> DB 에 가서 person 테이블 목록 가져오기
public class PInsertForm implements PersonService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("PInsertForm 진입:");
		
		request.setAttribute("mainUrl", "PInsertForm.jsp");
	}

}
