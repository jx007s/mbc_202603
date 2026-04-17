package util_p;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/*

1. 아이디 : 영문 숫자 조합(4자이상)
2. 이메일  -  아이디:영문,숫자(3글자이상)   @  도메인 : 영문 점
3. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
4. 이름 (한글만 가능) 2~5자
5. 우편번호 검색 - 구단위 (초성검색)
예외처리로 처리할 것
 * */
class MemberJoin{
	private String id, email, tel, pname, zipcode;
	
	void ppp() {
		System.out.println("아이디 : "+id);
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+tel);
		System.out.println("이름 : "+pname);
		System.out.println("주소 : "+zipcode);
	}

	public void setId(String id) throws Exception{
		if(!Pattern.matches("\\w{4,}", id)) {
			throw new Exception("id 에러");
		}
		this.id = id;
	}

	public void setEmail(String email)  throws Exception{
		if(!Pattern.matches("[a-zA-Z0-9]{3,}@[a-zA-Z.]{3,}", email)) {
			throw new Exception("email 에러");
		}
		this.email = email;
	}

	public void setTel(String tel)  throws Exception{
		if(!Pattern.matches("(\\d{3}-\\d{4}|\\d{2,3}-\\d{3})-\\d{4}", tel)) {
			throw new Exception("tel 에러");
		}
		this.tel = tel;
	}

	public void setPname(String pname)  throws Exception{
		if(!Pattern.matches("[가-힣]{2,5}", pname)) {
			throw new Exception("pname 에러");
		}
		this.pname = pname;
	}

	public void setZipcode(String zipcode) {
		
		String [] dongs = {"강동동",
				"구랑동",
				"녹산동",
				"눌차동",
				"대저1동",
				"대저2동",
				"대항동",
				"동선동",
				
				"명지동",
				"미음동",
				"범방동",
				"봉림동",
				"생곡동",
				"성북동",
				"송정동",
				"식만동",
				"신호동",
				"죽동동",
				"죽림동",
				"지사동",
				"천성동",
				"화전동",
				
				
				
				"구서동",
				"금사동",
				"금성동",
				"남산동",
				"노포동",
				"두구동",
				"부곡동",
				"서동",
				"선동",
				"오륜동",
				"장전동",
				"청룡동",
				"회동동",
				
				"기장읍",
				"일광면",
				
				"장안읍",
				"정관읍",
				"철마면",
				
				"감만동",
				"대연동",
				"문현동",
				"용당동",
				"용호동",
				"우암동",
				
				"범일동",
				"수정동",
				"좌천동",
				"초량동",
				
				"낙민동",
				"명륜동",
				"명장동",
				"복천동",
				"사직동",
				"수안동",
				"안락동",
				"온천동",
				"칠산동",
				
				"가야동",
				"개금동",
				"당감동",
				"범전동",
				"범천동",
				"부암동",
				"부전동",
				"양정동",
				"연지동",
				"전포동",
				"초읍동",
				
				"구포동",
				
				"금곡동",
				"덕천동",
				"만덕동",
				"화명동",
				
				"감전동",
				"괘법동",
				"덕포동",
				"모라동",
				"삼락동",
				"엄궁동",
				"주례동",
				"학장동",
				
				"감천동",
				"괴정동",
				"구평동",
				"다대동",
				"당리동",
				"신평동",
				"장림동",
				"하단동",
				
				"남부민동",
				"동대신동1가",
				"동대신동2가",
				"동대신동3가",
				"부민동1가",
				"부민동2가",
				"부민동3가",
				"부용동1가",
				"부용동2가",
				"서대신동1가",
				"서대신동2가",
				"서대신동3가",
				"아미동1가",
				"아미동2가",
				
				"암남동",
				"초장동",
				"충무동1가",
				"충무동2가",
				"충무동3가",
				"토성동1가",
				"토성동2가",
				"토성동3가",
				"토성동4가",
				"토성동5가",
				
				"광안동",
				"남천동",
				"망미동",
				"민락동",
				"수영동",
				"연제구",
				"영도구",
				"중구",
				"해운대구",
				"거제동",
				"연산동",
				"남항동1가",
				"남항동2가",
				"남항동3가",
				"대교동1가",
				"대교동2가",
				"대평동1가",
				"대평동2가",
				"동삼동",
				"봉래동1가",
				"봉래동2가",
				
				"봉래동3가",
				
				"봉래동4가",
				
				"봉래동5가",
				
				"신선동1가",
				
				"신선동2가",
				
				"신선동3가",
				
				"영선동1가",
				
				"영선동2가",
				
				"영선동3가",
				
				"영선동4가",
				
				"청학동",
				
				"광복동1가",
				
				"광복동2가",
				
				"광복동3가",
				
				"남포동1가",
				
				"남포동2가",
				
				"남포동3가",
				
				"남포동4가",
				
				"남포동5가",
				
				"남포동6가",
				
				"대창동1가",
				
				"대창동2가",
				
				"대청동1가",
				
				"대청동2가",
				
				"대청동3가",
				
				"대청동4가",
				
				"동광동1가",
				
				"동광동2가",
				
				"동광동3가",
				
				"동광동4가",
				
				"동광동5가",
				
				"보수동1가",
				
				"보수동2가",
				
				"보수동3가",
				
				"부평동1가",
				
				"부평동2가",
				
				"부평동3가",
				
				"부평동4가",
				
				"신창동1가",
				
				"신창동2가",
				
				"신창동3가",
				
				"신창동4가",
				
				"영주동",
				
				"중앙동1가",
				
				"중앙동2가",
				
				"중앙동3가",
				
				"중앙동4가",
				
				"중앙동5가",
				
				"중앙동6가",
				
				"중앙동7가",
				
				"창선동1가",
				
				"창선동2가",
				
				
				
				"반송동",
				
				"반여동",
				
				"석대동",
				
				"송정동",
				
				"우동",
				
				"재송동",
				
				"좌동",
				
				"중동"};
		
		
		System.out.println(Arrays.toString(dongs));
		
		this.zipcode = zipcode;
	}
	
	
	
}

public class MemberJoinMain {

	public static void main(String[] args) {
		
		MemberJoin mj = null;
		Scanner sc = new Scanner(System.in);
		while(true){
			try {
				mj = new MemberJoin();
				
//				System.out.print("아이디 : ");
//				mj.setId(sc.nextLine());
//				System.out.print("이메일 : ");
//				mj.setEmail(sc.nextLine());
//				System.out.print("전화 : ");
//				mj.setTel(sc.nextLine());
//				System.out.print("이름 : ");
//				mj.setPname(sc.nextLine());
				System.out.print("주소 : ");
				mj.setZipcode(sc.nextLine());
				
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		mj.ppp();

	}

}
