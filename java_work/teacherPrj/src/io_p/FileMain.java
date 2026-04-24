package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Date;
import java.util.regex.Pattern;

public class FileMain {

	public static void main(String[] args) throws Exception {
		File ff = new File("fff/qwerqwer");
		System.out.println("ff : "+ff);
		System.out.println("존재유무 : "+ff.exists());
		
		ff = new File("fff/zxcv");
		System.out.println("ff : "+ff);
		System.out.println("존재유무 : "+ff.exists());
		System.out.println("isFile : "+ff.isFile());
		System.out.println("isDirectory : "+ff.isDirectory());
		
		ff = new File("fff/back.png");
		System.out.println("ff : "+ff);
		System.out.println("존재유무 : "+ff.exists());
		System.out.println("isFile : "+ff.isFile());
		System.out.println("isDirectory : "+ff.isDirectory());
		System.out.println("isAbsolute : "+ff.isAbsolute());
		ff = new File("D:\\public\\mbc\\2026_03\\public\\java_work\\teacherPrj\\fff\\back.png");
		System.out.println("ff : "+ff);
		System.out.println("isAbsolute : "+ff.isAbsolute());
		ff = new File("fff/back.png");
		System.out.println("getParent : "+ff.getParent());
		System.out.println("getName : "+ff.getName());
		System.out.println("getAbsolutePath : "+ff.getAbsolutePath());
		System.out.println("isHidden : "+ff.isHidden());
		ff = new File("fff/CXHA8530.JPG");
		System.out.println("isHidden : "+ff.isHidden());
		System.out.println("canRead : "+ff.canRead());
		System.out.println("canWrite : "+ff.canWrite());
		ff = new File("fff/CDCL8013.JPG");
		System.out.println("canWrite : "+ff.canWrite());
		System.out.println("length : "+ff.length());
		System.out.println("lastModified : "+new Date( ff.lastModified()));
		
		//파일생성 - 존재하면 생성하지 않음
		ff = new File("fff/qwer.txt");
		ff.createNewFile();
		
		//폴더생성 - 존재하면 생성하지 않음
		new File("fff/aass").mkdir();
		//폴더-폴더 생성 - 존재하면 생성하지 않음
		//new File("fff/ddff/gghh").mkdir(); 불가
		new File("fff/ddff/gghh").mkdirs(); 
		
		//파일, 폴더 삭제
		ff.delete();
		new File("fff/ddff/gghh").delete();
		new File("fff/ddff").delete(); //폴더삭제시 안에 있는 파일/폴더를 모두 삭제하고 현재폴더삭제해야함
		
		//파일 이동 - 원본파일이 없을 경우 실행하지 않음
		new File("fff/CXHA8530.JPG").renameTo(new File("dst/mmm.jpg"));
		
		//파일복사
		Files.copy(
				new File("fff/PHIS3580.JPG").toPath(), 
				new FileOutputStream("dst/ooo.jpg")
				);
		
		System.out.println("--------------------");
		File [] arr = new File("fff").listFiles();
		
		for (File file : arr) {
			
			String type;
			if(file.isFile()) {
				
				//String ext = file.getName().substring(file.getName().lastIndexOf(".")+1);
				if(Pattern.matches(".*[.](bmp|png|jpeg|jpg|gif)", file.getName().toLowerCase())) {
					type = "[이미지]";	
				}else {
					type = "[일반]";
				}
			}else {
				type = "[폴더]";
			}
			 
			
			
			System.out.println(file.getName()+"\t"+file.length()+"\t"+type);
		}
		
	}
	/*
// ori.zip 을 압축해제 -> ori 폴더
//ori 폴더의 파일을 각각 종류별로 xxx 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요
//이미지 : bmp, jpg, gif, png , jpeg
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음
	 * */

}

