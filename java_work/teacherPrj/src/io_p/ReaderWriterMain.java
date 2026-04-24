package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class ReaderWriterMain {

	public static void main(String[] args) throws Exception {
		String srcPath = "fff/CZRF0751.JPG";
		int data;
		
		//1byte 기반 stream : 한글깨짐 발생
		// 일반 파일 전송 가능(이미지, 음성파일 가능)
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream("dst/ddd1.jpg");
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
			fos.write(data);
		}
		fos.close();
		fis.close();
		System.out.println("\n------------------");
		//2byte 기반 stream : 한글정상 출력
		// 문자기반 파일만 전송가능(txt, csv 만 가능 , 이미지, 음성파일 불가)
		FileReader fr = new FileReader(srcPath);
		FileWriter fw = new FileWriter("dst/ddd2.jpg");
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
			fw.write(data);
		}
		fw.close();
		fr.close();
	}

}
