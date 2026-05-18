package exam_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonDAO;
import model.PersonDTO;


public class PModifyReg implements ExamService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		PersonDTO dto = new PersonDTO();
		dto.setPid(request.getParameter("pid"));
		dto.setPame(request.getParameter("pame"));
		dto.setHeight(Double.parseDouble(request.getParameter("height")) );
		dto.setFriend(request.getParameter("friend"));
		dto.setPfid(request.getParameter("pfid"));
		
		
		
		int cnt = new PersonDAO().modify(dto);
		
		System.out.println("PModifyReg 진입:"+cnt);
		request.setAttribute("msg", "수정되었습니다");
		request.setAttribute("goUrl", "PDetail?pid="+dto.getPid());
		request.setAttribute("mainUrl", "alert.jsp");
	}

}
