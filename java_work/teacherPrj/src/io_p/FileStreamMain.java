package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;


public class FileStreamMain {

	public static void main(String[] args) throws Exception {
		
		String srcPath = "fff/exam.txt";
		String dstPath = "dst/aaa.txt";
		srcPath = "fff/back.png";
		dstPath = "dst/bbb.png";
									//파일경로
									//상대주소, 절대주소
									// 상대주소 : 프로젝트 위치를 기반으로 함
		//파일에서 읽어오기
		FileInputStream fis = new FileInputStream(srcPath);
		
		//파일 작성하기 - 파일이 없으면 생성, 단 파일 생성위치인 폴더는 존재해야 함
		
		FileOutputStream fos = new FileOutputStream(dstPath);
				

		byte[] buf = new byte[10];
		
		while(fis.available()>0) {
			int len = fis.read(buf);	//내용읽어서 buf에 저장
			//String ttt = new String(buf);//한글은 3byte(UTF-8)이므로 글자깨짐발생가능
			String ttt = new String(buf,0,len);//한글은 3byte(UTF-8)이므로 글자깨짐발생가능
			System.out.println(len+Arrays.toString(buf)+ttt);
			
			fos.write(buf, 0, len);	// buf 내용 stream 으로 쓰기 -> file에 내용작성
		}
		
		fos.close();
		fis.close();
	}

}
