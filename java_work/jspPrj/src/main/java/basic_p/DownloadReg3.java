package basic_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadReg1
 */
@WebServlet("/DownloadReg3")
public class DownloadReg3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadReg3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1. 클라이언트 컴퓨터 다운로드 대화상자 설정
		
		//1.1 파일명 한글 encoding
		
		String fname = URLEncoder.encode("엄마상어.txt", "utf-8");
		System.out.println("fname:"+fname);
		response.setHeader("Content-Disposition", "attachment;filename="+fname);
		
		
		
		//2. 클라이언트 파일쓰기 stream
		ServletOutputStream sos = response.getOutputStream();
		
		//3. 서버 파일 Path
		//3.1 파일 경로 가져오기
		//3.1.1 실제 서버에서의 파일위치
		String path = getServletContext().getRealPath("fff/exam.txt");
		//3.1.2 가상 서버에서의 파일위치(배포시 주석처리 필수)
		path = "D:\\public\\mbc\\2026_03\\public\\java_work\\jspPrj\\src\\main\\webapp\\fff\\exam.txt";
		
		//3.2 파일 경로로 Path 얻기
		Path inFile = Paths.get(path);
		
		//4. 파일 내용 전송
		Files.copy(inFile, sos);
		
		//5. stream 닫기
		sos.close();
	}
	


	/**
	 https://www.postgresql.org/
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
/*
 * fileee/ori.jsp 를 생성하고
 *  ori 폴더의 파일들을 다운로드 구현하세요
 * 
 * 
 * */
