package service_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonDAO;

// PList 의 서비스 클래스
// --> DB 에 가서 person 테이블 목록 가져오기
public class PList implements PersonService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		Object res = new PersonDAO().list();
		System.out.println("PList 진입:"+res);
		request.setAttribute("mainData", res);
		request.setAttribute("mainUrl", "PList.jsp");
	}

}
