package aaa.filter;

import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

//JWT 생성(로그인 성공시)
//JWT 검증
//JWT 정보꺼내기
@Component
public class JwtUtil {

    private final SecretKey key;

    //@Value("${jwt.secret}") : Spring의 설정값을 주입
    /*
    * application.yaml
jwt:
  secret: qwertyuiopasdfghjkzxcvbnmlkj1234567890
  expiration-seconds: 3600

  가져다 씀
    * */
    public JwtUtil(@Value("${jwt.secret}") String secret){

        //암호화
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
    }

    // 토큰생성
    public String createToken(String username){

        // 인증이 성공한 이름으로 토큰 생성
        // 토큰 생성 시간, 유효시간, 암호화 하여 리턴
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(
                        new Date(System.currentTimeMillis()+3600000)
                )
                .signWith(key)          //토큰 생성
                .compact();
    }


    // 토큰에서 읽어오기
    /*
    토큰 :
    wefewfwefwefoi234r532
    .
    fwefwe393920gffr
    .
    wcverwefcewfcwecwc

    ==> Payload
    {
        sub:"아기상어",
        role:"USER"
    }
    ==> 획득정보
        "아기상어"
    * */
    public String getUsername(String token){
         JwtParser parser = Jwts.parser()                        //복호화 JWT 읽기위한 parser 생성
                . verifyWith(key)               //검증에 사용할 비밀키 등록 --> 토큰 생성한 비밀키와 일치해야함
                 .build();                        // parser 실제 생성 및 설정

        return parser.parseSignedClaims(token)      //실제 JWT 해석 token을 해석한다
                                                // header 읽기 , 만료시간 확인 까지 해서 정상일 경우
                .getPayload()                   // payload 추출
                                                //        {
                                                //            sub:"아기상어",
                                                //            role:"USER"
                                                //        }
                .getSubject();                  // subject ==>    sub:"아기상어" ==> "아기상어"
    }

}
