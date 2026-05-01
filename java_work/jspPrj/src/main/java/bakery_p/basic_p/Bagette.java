package bakery_p.basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import basic_p.MenuDTO;

/**
 * Servlet implementation class Bagette
 */
@WebServlet("/forward/basic/Bagette")
public class Bagette extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bagette() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<MenuDTO> menuData = List.of(
				new MenuDTO("/jspPrj/forward/basic/Bagette","바게뜨"),
				new MenuDTO("/jspPrj/forward/basic/RedBean","앙꼬"),
				new MenuDTO("/jspPrj/forward/basic/Soboro","소보로")
				
				);

		request.setAttribute("cate","일반빵");
		request.setAttribute("menuData",menuData);
		
		request.setAttribute("mainUrl","basicView.jsp");
		request.setAttribute("service","바게뜨이지롱");
		request.setAttribute("mainData","데이터베이스에서 가져오는 바게뜨 정보");
		
		//forwarding
		request.getRequestDispatcher("../../forView/template2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
