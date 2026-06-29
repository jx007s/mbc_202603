package aaa.controll_p;


import aaa.model_p.Product;
import jakarta.annotation.Resource;
import org.jspecify.annotations.Nullable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    RestClient restClient;

    @GetMapping("ocr")
    Object ocr() throws IOException {

        System.out.println("ocr 진입");
        // 파일 읽기
        ClassPathResource rr = new ClassPathResource("static/fff/carnum.jpg");

        //multipart/form-data 생성
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        //ff - 파일
        body.add("ff", new ByteArrayResource(rr.getInputStream().readAllBytes()){
            @Override
            public @Nullable String getFilename() {
                return "qwer.jpg";  //ByteArrayResource는 파일이름이 없어서
                                    //FastAPI에서 filename 요청시 에러발생
            }
        });

        body.add("pname","나는무너");
        body.add("age",32);

        /*   String으로 리턴
        String res = restClient.post()          //post 방식
                .uri("http://127.0.0.1:8000/ocr")   //요청받을 URL
                .contentType(MediaType.MULTIPART_FORM_DATA)//multipart/form-data
                .body(body)                 //body 지정  post는 body에 parameter 설정
                .retrieve()                 //HTTP 요청 전송
                .body(String.class);        //응답(JSON) -> String 으로 변환


        List로 받을 경우
        List<Object> res = restClient.post()          //post 방식
                .uri("http://127.0.0.1:8000/ocr")   //요청받을 URL
                .contentType(MediaType.MULTIPART_FORM_DATA)//multipart/form-data
                .body(body)                 //body 지정  post는 body에 parameter 설정
                .retrieve()                 //HTTP 요청 전송
                .body(List.class);

        객체인 경우
        Product res = restClient.post()          //post 방식
                .uri("http://127.0.0.1:8000/ocr")   //요청받을 URL
                .contentType(MediaType.MULTIPART_FORM_DATA)//multipart/form-data
                .body(body)                 //body 지정  post는 body에 parameter 설정
                .retrieve()                 //HTTP 요청 전송
                .body(Product.class);
        */

        HashMap<String,Object> res = restClient.post()          //post 방식
                .uri("http://127.0.0.1:8000/ocr")   //요청받을 URL
                .contentType(MediaType.MULTIPART_FORM_DATA)//multipart/form-data
                .body(body)                 //body 지정  post는 body에 parameter 설정
                .retrieve()                 //HTTP 요청 전송
                .body(HashMap.class);        //응답(JSON) -> HashMap 으로 변환

        System.out.println(res.get("pname"));
        System.out.println(res.get("age"));
        System.out.println(res.get("msg"));
        System.out.println(res.get("res"));
        return res;
    }
}
