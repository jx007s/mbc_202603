package controll_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import person_p.PersonService;

import java.io.IOException;

import exam_p.ExamService;

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
                               3   (규칙 ::>  /person/???? 인 경우 PersonController로 진입)
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
list.jsp 11              PList .execute()   (Interface 구현 클래스)  6, 8 <------------------>  db.java  (DAO) 7
top.jsp                                                                                                (db에서 받아오는 클래스)
menu.jsp                                                                                                   Object  write()
bottom.jsp
                               (Service) PDetail, PWrite, PModify,PDelete.....


 */
@WebServlet("/exam/*")  
//    /person/ 으로 작성되는 url 요청은 현재 서블릿(controller)로 진입하라
public class ExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println(request.getRequestURI());  // /jspPersonPrj/person/PList
		
		
		// service 문자열로 가져오기
		// /jspPersonPrj/exam/PList ==> // /jspPersonPrj/exam/  +   PList
		//                                           19글자
		String service = request.getRequestURI().substring(19);
		System.out.println(service);
		
		try {
			// service 에 해당하는 객체 생성 및 서비스인터페이스로 형변환(다형성)
			ExamService pservice = (ExamService)Class.forName("exam_p."+service).newInstance();
			
			// 연산 메소드 실행
			pservice.execute(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//view 진입
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/exam/template.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
