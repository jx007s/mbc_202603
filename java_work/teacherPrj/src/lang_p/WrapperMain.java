package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		int i = new Integer(123);
		
		System.out.println(i);
		
		Integer i2 = 345;
		System.out.println(i2);
		
		//i = null;	// 기본자료형 null 불가
		i2 = null;	//클래스 이어서 null 가능
		
		i = new Integer("678");
		System.out.println(i);
		
		//i = new Integer("890.123");   에러
		i = Integer.parseInt("246");
		System.out.println(i);
		
		byte bb = Byte.parseByte("123");
		System.out.println(bb);
		short sh = Short.parseShort("123");
		System.out.println(sh);
		long ll = Long.parseLong("12345678904123");
		System.out.println(ll);
		//char ch = Character.parseChar("a");
		boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		float ff = Float.parseFloat("123.456");
		System.out.println(ff);
		double dd = Double.parseDouble("1023.456");
		System.out.println(dd);
		i = Integer.parseInt("11", 2);
		System.out.println(i);
		i = Integer.parseInt("11", 8);
		System.out.println(i);
		i = Integer.parseInt("11", 16);
		System.out.println(i);
		i = Integer.parseInt("11", 5);
		System.out.println(i);
		
		System.out.println(Integer.toString(11)+123);
		System.out.println(Integer.toBinaryString(11)+123);
		System.out.println(Integer.toOctalString(11)+123);
		System.out.println(Integer.toHexString(11)+123);
		System.out.println(Integer.toString(11,5)+123);
		
		
	}

}

/*
SawonJoinMain
//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
//파일명이 부서명, 회원 이름, 입사일이 될 것
//부서명은 영업, 총무, 인사, 기획, 생산 만 가능함
//입사년도는 숫자만 입력토록 함(8자리만 가능)
//호봉수를 계산할 것 (년도단위에서 절삭)
//성명은 2-4자만 기록 가능 
 * */


