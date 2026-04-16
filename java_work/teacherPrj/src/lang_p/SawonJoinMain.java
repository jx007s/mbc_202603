package lang_p;

import java.util.Date;

//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
//파일명이 부서명, 회원 이름, 입사일이 될 것
//부서명은 영업, 총무, 인사, 기획, 생산 만 가능함
//입사년도는 숫자만 입력토록 함(8자리만 가능)
//호봉수를 계산할 것 (년도단위에서 절삭)
//성명은 2-4자만 기록 가능
class SawonJoin{
	String buseo, name;
	Date regDate;
	int yyCnt;
	
	
	
	public void setBuseo(String buseo) throws Exception {
		if(!"영업,총무,인사,기획,생산".contains(buseo)) {
			throw new Exception("부서에러");
		}
		
		this.buseo = buseo;
	}



	public void setName(String name) throws Exception {
		
		if(name.length()>4 || name.length()<2) {
			throw new Exception("이름에러");
		}
		this.name = name;
	}



	public void setRegDate(String regDate)  throws Exception{
		if(regDate.length()!=8) {
			throw new Exception("입사일에러");
		}
		int regi = Integer.parseInt(regDate);
		
		this.regDate = new Date(
				Integer.parseInt(regDate.substring(0, 4))-1900,
				Integer.parseInt(regDate.substring(4, 6))-1,
				Integer.parseInt(regDate.substring(6, 8))
				);
		setYyCnt();
	}



	void setYyCnt(){
		Date now = new Date();
		yyCnt = now.getYear()-regDate.getYear();
		Date currReg = new Date(now.getYear(), regDate.getMonth(), regDate.getDate());
		if(now.before(currReg)) {
			yyCnt--;
		}
	}



	void ppp() {
		System.out.println("부서명 : "+buseo);
		System.out.println("회원명 : "+name);
		System.out.println("입사일 : "+regDate);
		System.out.println("호봉수 : "+yyCnt);
	}
}
public class SawonJoinMain {

	public static void main(String[] args) {
		String ttt = "생산_홍길12_20240417.bmp";

		try {
			String [] exArr = ttt.split("[.]");
			if(exArr.length!=2) {
				throw new Exception("갯수에러");
			}
			if(!"jpg,bmp,gif".contains(exArr[1].toLowerCase())) {
				throw new Exception("확장자에러");
			}
			
			String [] arr = exArr[0].split("_");
			if(arr.length!=3) {
				throw new Exception("갯수에러");
			}
			SawonJoin res = new SawonJoin();
			res.setBuseo(arr[0]);
			res.setName(arr[1]);
			res.setRegDate(arr[2]);
			res.ppp();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
