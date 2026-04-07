package oops_p;

class ClaOverload{
	void meth(String a, int b) {
		System.out.println("meth : "+a+","+b);
	}
	/* 중첩불가
	void meth(String a, int b) {
		System.out.println("meth : "+a+","+b);
	}*/
	// overloading : 한 클래스에서 메소드가 중첩되었으나 매개변수가 달라서 다른메소드로 인식
	// 매개변수가 다르다
	void meth(String a, int b, int c) {
		System.out.println("1. 매개변수 갯수가 다른 경우 : "+a+","+b+","+c);
	}
	
	void meth(int a, int b) {
		System.out.println("2. 매개변수 자료형이 다른 경우 : "+a+","+b);
	}
	
	void meth(int b, String a ) {
		System.out.println("2. 매개변수 자료형이 다른 경우2 : "+a+","+b);
	}
	
	/* 매개변수이름이 다른 것은 매개변수가 다른 것이 아니다 - 오버로딩 불가
	void meth(String a, int c) {
		System.out.println("meth : "+a+","+c);
	}
	
	리턴과 오버로딩은 관계없음
	String meth(String a, int b) {
		System.out.println("meth : "+a+","+b);
		return "리턴값이지롱";
	}
	*/
}

public class OverloadMain {

	public static void main(String[] args) {
		ClaOverload col = new ClaOverload();
		col.meth("아기상어", 10);
		col.meth("엄마상어", 20,30);
		col.meth(40,50);
		col.meth(60,"아빠상어");
	}

}
