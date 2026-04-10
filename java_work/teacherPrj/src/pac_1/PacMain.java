package pac_1;

/*
접근제어자
 	 		클래스 내부	 같은패키지	 다른패키지	 전체 
									자손클래스	
 public 	 	O	 		O	 		O	 	O
 protected	 	O	 		O	 		O	 
 default (생략)	O	 		O	 	 
 private 	 	O
 	 	 	 
 * */


class AAA{
	public String a = "p1A.pub_a";
	protected String b = "p1A.pro_b";
	String c = "p1A.def_c";
	private String d = "p1A.pri_d";  // 클래스정의부에서만 사용
	
	public void meth_1() {
		System.out.println("p1A.pub_meth_1()");
	}
	protected void meth_2() {
		System.out.println("p1A.pro_meth_2()");
	}
	void meth_3() {
		System.out.println("p1A.def_meth_3()");
	}
	private void meth_4() { 	// 클래스정의부에서만 사용
		System.out.println("p1A.pri_meth_4()");
	}
	
	void meth_tot() {
		System.out.println("p1A.tot 시작---------");
		System.out.println(a+","+b+","+c+","+d);
		meth_1();
		meth_2();
		meth_3();
		meth_4();
		System.out.println("p1A.tot 끝---------");
	}
	
}

public class PacMain {

	public static void main(String[] args) {
		AAA p1a = new AAA();
		//System.out.println("p1a : "+p1a.a+","+p1a.b+","+p1a.c+","+p1a.d);
		System.out.println("p1a : "+p1a.a+","+p1a.b+","+p1a.c);
		p1a.meth_1();
		p1a.meth_2();
		p1a.meth_3();
		//p1a.meth_4();
		p1a.meth_tot();
		
		
		BBB p1b = new BBB(); // 같은 패키지 내 다른 클래스 호출가능
		System.out.println("p1b : "+p1b.a+","+p1b.b+","+p1b.c);
		p1b.meth_1();
		p1b.meth_2();
		p1b.meth_3();
		p1b.meth_tot();
		
		CCC p1c = new CCC(); // 같은 패키지 내 다른 클래스 호출가능
		System.out.println("p1c : "+p1c.a+","+p1c.b+","+p1c.c);
		p1c.meth_1();
		p1c.meth_2();
		p1c.meth_3();
		p1c.meth_tot();

	}

}
