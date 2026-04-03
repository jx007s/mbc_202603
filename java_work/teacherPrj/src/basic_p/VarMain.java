package basic_p;

public class VarMain {

	public static void main(String[] args) {
		//a = 5 + 3;  명령문 종결시 ; 필수
		
		//
		int a = 5 + 3;

		System.out.println(a);

		//변수 선언 : 자료형 변수명;
		int b;
		
		//System.out.println(b); 초기화 하지 않은 변수 호출 불가
		
		b = 10;
		System.out.println(b);
		
		//b = "아기상어"; 자료형 불일치
		//b = true;
		//b = 123.456;
		
		//const int c = 456;
		final int d = 789;	//상수 선언
		System.out.println(d);
		
		//d = 1234;  상수 대입불가
		
		///1. 정수			
		/// byte : 1byte   -128~127
		byte bb = 123;
		System.out.println("bb : "+bb);
		bb = 127;
		System.out.println("bb : "+bb);
		//bb = 128;
		bb = -128;
		System.out.println("bb : "+bb);
		//bb = -129;
		System.out.println("bb : "+bb);
		/// short : 2byte  -32,768 ~ 32,767
		short sh = 128;
		System.out.println("sh : "+sh);
		sh = 32767;
		System.out.println("sh : "+sh);
		//sh = 32768;
		sh = -32768;
		System.out.println("sh : "+sh);
		//sh = -32769;
		System.out.println("sh : "+sh);
		/// int : 4byte  -2,147,483,648 ~ 2,147,483,647
		int i = 32768;
		System.out.println("i : "+i);
		i = 2147483647;
		System.out.println("i : "+i);
		
		System.out.println("2147483647 : "+2147483647);
		// 정수 숫자는 자료형이 int
		// int 범주를 넘어갈 경우 L 을 붙여서 long 임을 명시
		System.out.println("2147483648L : "+2147483648L);	
		//i = 2147483648L;
		///long : 8byte   -9,223,372,036,854,775,808∼9,223,372,036,854,775,807
		long ll = 2147483648L;
		System.out.println("ll : "+ll);
		ll = 9223372036854775807L;
		System.out.println("ll : "+ll);
		//ll = 9223372036854775808L;
		
		// 2. 실수
		// 실수는 기본자료형이 double
		// double 8byte
		double dd = 123.456;
		System.out.println("dd : "+dd);
		//float 로 처리할 경우 F 붙여서 float 임을 명시
		// float 4byte
		float ff = 123.456F;
		System.out.println("ff : "+ff);
		
		//3. boolean   1byte  true, false
		boolean bo = true;
		System.out.println("bo : "+bo);
		bo = false;
		System.out.println("bo : "+bo);
		//bo = 0;
		
		//4. char : 2byte '' 안에 1글자만 표현가능 - 0글자 2글자이상 모두 불가
		char ch = '가';
		System.out.println("ch : "+ch);
		//ch = 'abc';
		//ch = '';
		
		// String : 문자열클래스 , 기본자료형이 아님 - "" 안에 0~무한대 글자표현
		String str = "아기상어";
		System.out.println("str : "+str);
	}

}



//커피숍을 구현해 주세요

//CoffeeMain.java

//커피이름: ex)아프리카노

//포장유무: ex)  true

//크기:  ex) L (S, M , L 중 택 1) 

//단가 : ex) 2100

// 수량 : ex) 3

// 금액 : ex) 6300


