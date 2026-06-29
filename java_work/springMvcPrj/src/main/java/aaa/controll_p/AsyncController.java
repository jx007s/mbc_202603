package aaa.controll_p;


import aaa.model_p.Person;
import jakarta.annotation.Resource;
import org.jspecify.annotations.Nullable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.io.IOException;
import java.util.HashMap;

@CrossOrigin(origins = "http://200.200.200.2:5173/")
@RestController
@RequestMapping("/asy")
public class AsyncController {

    @RequestMapping("hello")
    Object hello(){
        System.out.println("asy/hello 진입");
        return "헬로상어";
    }


    @Resource
    RestClient restClient;

    @PostMapping("ocr")
    Object ocr(Person per) throws IOException {

        System.out.println("/asy/ocr 진입");

        //multipart/form-data 생성
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        //ff - 파일
        body.add("ff", new ByteArrayResource(per.getFf().getBytes()){
            @Override
            public @Nullable String getFilename() {
                return per.getFf().getOriginalFilename();  //ByteArrayResource는 파일이름이 없어서
                //FastAPI에서 filename 요청시 에러발생
            }
        });

        body.add("pname",per.getPname());
        body.add("age",per.getAge());

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
