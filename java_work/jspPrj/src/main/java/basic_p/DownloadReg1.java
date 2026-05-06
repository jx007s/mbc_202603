package basic_p;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadReg1
 */
@WebServlet("/DownloadReg1")
public class DownloadReg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadReg1() {
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
		
		String fname = URLEncoder.encode("아기상어.txt", "utf-8");
		System.out.println("fname:"+fname);
		response.setHeader("Content-Disposition", "attachment;filename="+fname);
		
		
		
		//2. 클라이언트 파일쓰기 stream
		ServletOutputStream sos = response.getOutputStream();
		
		//3. 서버 파일 읽기 stream
		//3.1 파일 경로 가져오기
		//3.1.1 실제 서버에서의 파일위치
		String path = request.getServletContext().getRealPath("fff/zaq.txt");
		//3.1.2 가상 서버에서의 파일위치(배포시 주석처리 필수)
		path = "D:\\public\\mbc\\2026_03\\public\\java_work\\jspPrj\\src\\main\\webapp\\fff\\qqq.txt";
		FileInputStream fis = new FileInputStream(path);
		
		//4. 파일 내용 전송
		//4.1 buffer 생성
		byte [] buf = new byte[1024];
		
		//4.2 buf 이용해서 파일내용 보내기
		while(fis.available()>0) {
			int len = fis.read(buf);
			sos.write(buf,0,len);
			//System.out.println(Arrays.toString(buf));
		}
		
		//5. stream 닫기
		fis.close();
		sos.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
