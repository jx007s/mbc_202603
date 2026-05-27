package aaa.controll_p;

import aaa.model_p.Person;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class FileController {

    @GetMapping("/file/form")
    String form(){
        return "file/form";
    }

    @PostMapping("/file/form")
    String comp(Person pp, HttpServletRequest request){
        System.out.println("comp:"+pp);
        System.out.println("up1:"+
                pp.getUp1().getOriginalFilename()+","+
                pp.getUp1().getSize()+","+
                pp.getUp1().getContentType()+","+
                pp.getUp1().isEmpty()
                );
        System.out.println("up2-----------");
        for (MultipartFile mf : pp.getUp2()){
            System.out.println(
                    mf.getOriginalFilename()+","+
                    mf.getSize()+","+
                    mf.getContentType()+","+
                    mf.isEmpty()
            );
        }

        //up1만 파일 저장
        // 파일 저장위치 (나중 이미지 파일등을 불러오기 위한 위치) - 정적 폴더 위치
        // rewources/static  이하 에 저장  rewources/static/fff/BDJY9060.JPG
        // 접근경로 : 호스트IP:포트/이하주소임
        // localhost/fff/BDJY9060.JPG

        String dirPath = request.getServletContext().getRealPath("fff");
        dirPath= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\fff";
        if(!pp.getUp1().isEmpty()){ //파일이 존재한다면
            try {
                Files.copy(
                        pp.getUp1().getInputStream(),
                        Paths.get(dirPath+"\\"+pp.getUp1().getOriginalFilename()),
                        StandardCopyOption.REPLACE_EXISTING
                        );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return "file/comp";
    }

    @GetMapping("/file/down1")
    void fileDown1(HttpServletRequest request, HttpServletResponse response){

        try {
            String fname = URLEncoder.encode("java 설치.txt", "utf-8");
            System.out.println("fname:"+fname);
            response.setHeader("Content-Disposition", "attachment;filename="+fname);



            //2. 클라이언트 파일쓰기 stream
            ServletOutputStream sos = response.getOutputStream();

            //3. 서버 파일 Path
            //3.1 파일 경로 가져오기
            //3.1.1 실제 서버에서의 파일위치
            String path = request.getServletContext().getRealPath("fff/java 설치.txt");
            //3.1.2 가상 서버에서의 파일위치(배포시 주석처리 필수)
            path= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\fff\\java 설치.txt";

            //3.2 파일 경로로 Path 얻기
            Path inFile = Paths.get(path);

            //4. 파일 내용 전송
            Files.copy(inFile, sos);

            //5. stream 닫기
            sos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    @GetMapping("/file/down2")
    void fileDown2(HttpServletRequest request, HttpServletResponse response){

        try {
            String fname = URLEncoder.encode("java 설치.txt", "utf-8");
            System.out.println("fname:"+fname);
            response.setHeader("Content-Disposition", "attachment;filename="+fname);

            //2. 클라이언트 파일쓰기 stream
            ServletOutputStream sos = response.getOutputStream();

            //3. 서버 파일 Path
            //3.1 파일 경로 가져오기
            //3.1.1 실제 서버에서의 파일위치
            String path = request.getServletContext().getRealPath("fff/java 설치.txt");
            //3.1.2 가상 서버에서의 파일위치(배포시 주석처리 필수)
            path= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\fff\\java 설치.txt";

            //3.2 파일 경로로 Path 얻기
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    ///파일 다운로드 권장
    @GetMapping("/file/down3")
    ResponseEntity<InputStreamResource> fileDown3(HttpServletRequest request) throws Exception {

        String path = request.getServletContext().getRealPath("fff/java 설치.txt");
        path= "D:\\public\\mbc\\2026_03\\public\\java_work\\springMvcPrj\\src\\main\\resources\\static\\fff\\java 설치.txt";

        File ff = new File(path);
        InputStreamResource res = new InputStreamResource(new FileInputStream(ff));

        String fname = URLEncoder.encode("java 설치.txt", "utf-8");

        return ResponseEntity.ok()                                      //응답코드 : 200
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename="+fname)       //응답 헤더
                .contentLength(ff.length())                             //응답길이 : 파일길이
                .contentType(MediaType.APPLICATION_OCTET_STREAM)        //응답타입 : 일반파일
                .body(res);                                             //응답내용 : 파일스트림
    }

}

   /*
    회원 정보 :
pid, pname,  age, height;
가입일 - 현재시각 자동처리

사진(이미지파일만), 이력서

 ori.zip 압축해제하고  ori 내 파일들을 다운로드 구현하세요
 * */
