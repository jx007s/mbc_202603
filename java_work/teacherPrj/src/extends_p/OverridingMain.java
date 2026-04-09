package extends_p;
class OvGrand{
	String g = "할아버지";
	void meth_g() {
		System.out.println("할아버지meth_g()");
	}
}
class OvPar extends OvGrand{
	String a = "부모a";
	String b = "부모b";  //자식과 중첩되어 hiding - 소멸되지 않음
	final String c = "final부모c"; // final 멤버변수 hiding 가능
	int g = 1234;	//할아버지 hiding
	
	void meth_1() {
		System.out.println("부모meth_1() : "+a+","+b+","+c);
		// b : 부모b
	}
	void meth_2() {
		System.out.println("부모meth_2()");
	}
	final void meth_3() { //final 메소드 overriding 불가
		System.out.println("final부모meth_3()");
	}
	void meth_g() {	//할아버지 overriding --> 자식클래스에게 할아버지 메소드를 넘기지 않겠다
		System.out.println("부모재정의meth_g()");
	}
}
class OvChild extends OvPar{
	String d = "자식d";
	String b = "자식b"; // hiding - 부모멤버변수와 중첩
	String c = "자식c";	
	
	//@Override
	void meth_4() {
		System.out.println("자식meth_4() : "+a+","+b+","+c+","+d+"---------");
		// 자식b  - 부모b는 hiding 됨
		meth_2();
		super.meth_2(); //super : 부모접근자 - overriding, hiding 된 부모멤버접근가능
						// 클래스정의부에서만 사용가능
		System.out.println("super : "+super.a+","+super.b+","+super.c);
		System.out.println("자식meth_4() 끝 ------------------");
	}
	
	@Override		//어노테이션
	void meth_2() {	//overriding - 부모메소드 재정의
		System.out.println("자식meth_2() : "+a+","+b+","+c+","+d);
	}
	/*
	void meth_3() {
		System.out.println("자식meth_3()");
	}*/
	void meth_goGrand() {
		System.out.println("자식goGrand() : ");
		//System.out.println("자식goGrand() : "+super.super.g);
		//super.super.meth_g();
	}
}
public class OverridingMain {

	public static void main(String[] args) {

		OvChild cc = new OvChild();
		System.out.println("cc : "+cc.a+","+cc.b+","+cc.c+","+cc.d);
		
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		cc.meth_4();
		//cc.super.meth_2();
		//cc.super.b = "아기상어";
		System.out.println("cc : "+cc.g);
		cc.meth_g();
		cc.meth_goGrand();

	}

}
