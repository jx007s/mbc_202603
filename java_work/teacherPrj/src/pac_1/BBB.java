package pac_1;


// public 클래스 : java 파일의 대표클래스만 가능
/// BBB.java 인경우 BBB 클래스만 public 가능
public class BBB {

	public String a = "p1B.pub_a";
	protected String b = "p1B.pro_b";
	String c = "p1B.def_c";
	private String d = "p1B.pri_d";  // 클래스정의부에서만 사용
	
	public void meth_1() {
		System.out.println("p1B.pub_meth_1()");
	}
	protected void meth_2() {
		System.out.println("p1B.pro_meth_2()");
	}
	void meth_3() {
		System.out.println("p1B.def_meth_3()");
	}
	private void meth_4() { 	// 클래스정의부에서만 사용
		System.out.println("p1B.pri_meth_4()");
	}
	
	void meth_tot() {
		System.out.println("p1B.tot 시작---------");
		System.out.println(a+","+b+","+c+","+d);
		meth_1();
		meth_2();
		meth_3();
		meth_4();
		System.out.println("p1B.tot 끝---------");
	}
}


class CCC {

	public String a = "p1C.pub_a";
	protected String b = "p1C.pro_b";
	String c = "p1C.def_c";
	private String d = "p1C.pri_d";  // 클래스정의부에서만 사용
	
	public void meth_1() {
		System.out.println("p1C.pub_meth_1()");
	}
	protected void meth_2() {
		System.out.println("p1C.pro_meth_2()");
	}
	void meth_3() {
		System.out.println("p1C.def_meth_3()");
	}
	private void meth_4() { 	// 클래스정의부에서만 사용
		System.out.println("p1C.pri_meth_4()");
	}
	
	void meth_tot() {
		System.out.println("p1C.tot 시작---------");
		System.out.println(a+","+b+","+c+","+d);
		meth_1();
		meth_2();
		meth_3();
		meth_4();
		System.out.println("p1C.tot 끝---------");
	}
}

