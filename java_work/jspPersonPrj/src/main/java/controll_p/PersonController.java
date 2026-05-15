package controll_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**

 View     ------      Controller  ---------------------------------------------- model



       url : http://localhost:8080:jspPersonProj/person/PList   1

               (... /PDetail?id=12  ... /PWriteForm   ... /PWriteReg 

                ... /PModifyForm?id=12  ....... )

                             |

                             V

           server : http://localhost

                             |

                             V

           tomcat  : http://localhost:8080

                             |

                             V  

          project  : http://localhost:8080/jspPersonProj/프로젝트 로 진입해라!!!      2

                              |

                              V

                          web.xml    3   (규칙 ::>  /person/???? 인 경우 PersonController로 진입)

                          @WebServlet("/person/*")

                              |

                              V
template 10 <------  PersonController  4, 9  (Servlet)

                              ↑              

   |                          |

   |                          |   

   |                          |               PersonService.execute()  추상메소드    5

   |                          |                (인터페이스) 

   V                          V

                            (Service)

board_list.jsp 11        PList .execute()   (Interface 구현 클래스)  6, 8 <------------------>  db.java  (DAO) 7

top.jsp                                                                                                (db에서 받아오는 클래스)

menu.jsp                                                                                                   Object  write()

bottom.jsp

                               (Service) PDetail, PWrite, PModify,PDelete.....


 */
@WebServlet("/person/*")  
//    /person/ 으로 작성되는 url 요청은 현태 서블릿(controller)로 진입하라
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
