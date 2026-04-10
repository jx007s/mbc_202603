package pac_2;

public class HHH {
	public String a = "p2H.pub_a";
	protected String b = "p2H.pro_b";
	String c = "p2H.def_c";
	private String d = "p2H.pri_d";  // 클래스정의부에서만 사용
	
	public void meth_1() {
		System.out.println("p2H.pub_meth_1()");
	}
	protected void meth_2() {
		System.out.println("p2H.pro_meth_2()");
	}
	void meth_3() {
		System.out.println("p2H.def_meth_3()");
	}
	private void meth_4() { 	// 클래스정의부에서만 사용
		System.out.println("p2H.pri_meth_4()");
	}
	
	public void meth_tot() {
		System.out.println("p2H.tot 시작---------");
		System.out.println(a+","+b+","+c+","+d);
		meth_1();
		meth_2();
		meth_3();
		meth_4();
		System.out.println("p2H.tot 끝---------");
	}
}


class iii {
	public String a = "p2i.pub_a";
	protected String b = "p2i.pro_b";
	String c = "p2i.def_c";
	private String d = "p2i.pri_d";  // 클래스정의부에서만 사용
	
	public void meth_1() {
		System.out.println("p2i.pub_meth_1()");
	}
	protected void meth_2() {
		System.out.println("p2i.pro_meth_2()");
	}
	void meth_3() {
		System.out.println("p2i.def_meth_3()");
	}
	private void meth_4() { 	// 클래스정의부에서만 사용
		System.out.println("p2i.pri_meth_4()");
	}
	
	public void meth_tot() {
		System.out.println("p2i.tot 시작---------");
		System.out.println(a+","+b+","+c+","+d);
		meth_1();
		meth_2();
		meth_3();
		meth_4();
		System.out.println("p2i.tot 끝---------");
	}
}

