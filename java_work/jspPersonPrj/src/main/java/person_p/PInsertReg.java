package person_p;

import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonDAO;
import model.PersonDTO;

// PList 의 서비스 클래스
// --> DB 에 가서 person 테이블 목록 가져오기
public class PInsertReg implements PersonService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		PersonDTO dto = new PersonDTO();
		dto.setPid(request.getParameter("pid"));
		dto.setPame(request.getParameter("pame"));
		dto.setAge(Integer.parseInt(request.getParameter("age")));
		dto.setHeight(Double.parseDouble(request.getParameter("height")) );
		dto.setFriend(request.getParameter("friend"));
		dto.setPfid(request.getParameter("pfid"));
		
		String [] arr = request.getParameter("birth").split("-");
		Date birth = new Date(
				Integer.parseInt(arr[0])-1900,
				Integer.parseInt(arr[1])-1,
				Integer.parseInt(arr[2])
				);
		
		dto.setBirth( birth);
		
		int cnt = new PersonDAO().insert(dto);
		
		System.out.println("PInsertReg 진입:"+cnt);
		request.setAttribute("msg", "가입되었습니다");
		request.setAttribute("goUrl", "PList");
		request.setAttribute("mainUrl", "alert.jsp");
	}

}
