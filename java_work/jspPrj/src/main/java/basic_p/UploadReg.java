package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;


@WebServlet("/UploadReg")
  
//파일업로드시 -  enctype="multipart/form-data"
// 으로 처리되는 객체형 파일정보 가져오기
@MultipartConfig(maxFileSize = 1024*1024*20) //최대 20MB 까지 업로드
public class UploadReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 실행");
		
		System.out.println(request.getParameter("pid")); //일반데이터 정상
		System.out.println(request.getParameter("age"));
		System.out.println(request.getParameter("up1"));//file : null 리턴
		System.out.println(request.getParameter("up2"));
		
		System.out.println("getPart----------");
		Part up1 = request.getPart("up1");  // 파일정보 받기
		System.out.println("파라미터명: "+up1.getName());
		System.out.println("파일타입: "+up1.getContentType());
		System.out.println("파일크기: "+up1.getSize());
		System.out.println("업로드파일명: "+up1.getSubmittedFileName());
		/*
		 파일이없을 경우
파라미터명: up1
파일타입: application/octet-stream
파일크기: 0
업로드파일명: ""
		 * */
		
		//파일저장
		String dstPath = request.getServletContext().getRealPath("fff")+"\\";
		dstPath ="D:\\public\\mbc\\2026_03\\public\\java_work\\jspPrj\\src\\main\\webapp\\fff\\";
		System.out.println(dstPath+up1.getSubmittedFileName());
		
		//파일쓰기
		up1.write(dstPath+up1.getSubmittedFileName());
		
		//임시폴더에 업로드된 파일 삭제
		up1.delete();
		
		// multipart 처리
		System.out.println("getParts----------");
		Collection<Part> up2 = request.getParts();  //모든 업로드 정보 받기
													//pid, age, up1, up2 모두 처리
		
		for (Part part : up2) {
			String tt = part.getName()+"\t"+
					part.getContentType()+"\t"+
					part.getSize()+"\t"+
					part.getSubmittedFileName();
			System.out.println(tt);
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 실행");
		doGet(request, response);
	}

}
