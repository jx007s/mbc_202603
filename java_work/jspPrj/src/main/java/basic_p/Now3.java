package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
	[Servlet lifeCycle]
 
 	instance 생성 (생성자)		-- 1
 		최초 1회
 			|
 			V
 		  init()			-- 2
 		  최초 1회
 			|
 			V
 		doService()			-- 3
 		url로 서비스 호출시마다
 		   doGet()
 		   doPost()
 		    |
 			V
 		destroy()			-- 4
 		톰캣서버 종료시
 	
 */
@WebServlet("/Now3")
public class Now3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int a = 0;
	
	public Now3() {
		System.out.println("Now3 생성자 이지롱");  //최초1회실행 -- 1
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init () 실행");  	//최초1회실행  -- 2
		super.init();
	}

	/* 요청시마다 계속 실행 --- 3
	 * http://localhost:8080/jspPrj/Now3
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int b = 0;
		a++;
		b++;
		//System.out.println("\t doGet 실행 : "+a+","+b);
		//response.getWriter().append("Served at: ").append(new Date()+"");
		
		// client 브라우져에 작성하는 Stream 가져오기
		PrintWriter pw = response.getWriter();
		pw.println("Hi Now3");
		pw.close();
		
		/*
		 testJspPrj > 

			aaa.jsp :::> 안녕하세요 ??? 입니다.

			Bbb :::> 1234567890

			출력 및 배포
		 * */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	public void destroy() {// 서버해제(종료)시 실행 --- 4
		System.out.println("destroy () 실행"+a); 
		super.destroy();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service () 시작 "+a); 
		super.service(req, resp);
		System.out.println("service () 끝 "+a);
	}

}
