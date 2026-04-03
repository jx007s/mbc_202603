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
	}

}
