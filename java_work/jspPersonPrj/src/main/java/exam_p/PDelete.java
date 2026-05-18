package exam_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonDAO;
import model.PersonDTO;


public class PDelete implements ExamService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		PersonDTO dto = new PersonDTO();
		dto.setPid(request.getParameter("pid"));
		
		
		
		
		int cnt = new PersonDAO().delete(dto);
		
		System.out.println("PDelete 진입:"+cnt);
		request.setAttribute("msg", "삭제되었습니다");
		request.setAttribute("goUrl", "PList");
		request.setAttribute("mainUrl", "alert.jsp");
	}

}
