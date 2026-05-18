package person_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PersonDAO;



public class PModifyForm implements PersonService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String pid = request.getParameter("pid");
		Object res = new PersonDAO().detail(pid);
		System.out.println("PModifyForm 진입:"+res);
		request.setAttribute("mainData", res);
		request.setAttribute("mainUrl", "PModifyForm.jsp");
	}

}
