package oops_p;

class ClaStatic{
	ClaStatic() {
		System.out.println("생성자");
	}
	String ppp() {
		return a+","+b+","+sa;
	}

	String a = "인스턴스a", b = initB();
	
	String initB() {
		System.out.println("인스턴스initB()");
		return "인스턴스b";
	}
	
	void meth_1() {
		System.out.println("인스턴스 meth_1() 실행");
	}
	
	// static 멤버변수 선언
	static String sa = "스태틱sa";
	//static String sb = initB();  static의 선언우선순위가 instance보다 빠르기때문
	static String sc = initSC();
	
	static String initSC() {
		System.out.println("인스턴스initSC()");
		return "스태틱sc";
	}
	static void meth_s1() {
		System.out.println("스태틱 meth_s1() 실행");
	}
	static void meth_s2() {
		System.out.println("스태틱 meth_s2() 실행");
	}
	
	//static 메소드내부에서는 static 만 접근 가능
	static void meth_s3() {
		System.out.println("스태틱 meth_s3() 시작 ------");
		System.out.println(sa+","+sc);
		//System.out.println(a+","+b+","+sa+","+sc);
		//meth_2();
		meth_s2();
		System.out.println("스태틱 meth_s3() 끝 ------");
	}
	
	
	void meth_2() {
		System.out.println("인스턴스 meth_2() 실행");
	}
	void meth_3() {
		System.out.println("인스턴스 meth_3() 시작 ------");
		System.out.println(a+","+b+","+sa+","+sc);
		meth_2();
		meth_s2();
		System.out.println("인스턴스 meth_3() 끝 ------");
	}
	
}
public class StaticMain {

	public static void main(String[] args) {
		//static : 인스턴스 생성없이 클래스명으로 호출대입가능
		System.out.println("ClaStatic.sa : " +ClaStatic.sa);
		System.out.println("ClaStatic.sc : " +ClaStatic.sc);
		ClaStatic.meth_s1();
		ClaStatic.meth_s3();
		System.out.println("-------------");
		ClaStatic cs1 = new ClaStatic();
		System.out.println("-------------");
		ClaStatic cs2 = new ClaStatic();
		System.out.println("-------------");
		System.out.println("cs1 : " +cs1.ppp());
		System.out.println("cs2 : " +cs2.ppp());
		cs1.meth_1();
		cs2.meth_1();
		
		cs1.a = "에이";
		cs1.sa = "에스에이";	// cs2.sa도 변경
		//static :: 클래스명으로 접근가능
		System.out.println("ClaStatic.sa : " +ClaStatic.sa);
		System.out.println("ClaStatic.sc : " +ClaStatic.sc);
		//System.out.println("ClaStatic.a : " +ClaStatic.a);
		System.out.println("cs1 : " +cs1.ppp());
		System.out.println("cs2 : " +cs2.ppp());
		System.out.println(cs1.sa == cs2.sa);
		ClaStatic.meth_s1();
		cs1.meth_s1();
		cs2.meth_s1();
		cs1.meth_3();

	}

}
