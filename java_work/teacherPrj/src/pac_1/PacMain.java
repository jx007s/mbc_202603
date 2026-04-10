package pac_1;

import pac_2.HHH;

//import pac_2.iii;  iii 가 public 이 아님

import pac_2.*;  //pac_2 의 public 클래스는 모두 import 가능
import pac_2.PPP;
/*
package : 현재 클래스가 속한 패키지 지정 --> 지정하지 않으면 에러발생
import : 다른 패키지의 클래스를 사용하겠다
         다른 패키지클래스인 경우 public 클래스만 가능

import 우선순위
 
1. 선언 및 생성시 직접명시
    pac.pac_1.CCC p1c = new pac.pac_1.CCC();

2. import 시 클래스 직접 호출
     import pac_2.PPP;

3. 같은 패키지 내 클래스 호출

4. import 시 패키지내 클래스 자동 호출
      import pac_2.*; 


접근제어자
 	 		클래스 내부	 같은패키지	 다른패키지	 전체 
									자손클래스	
 public 	 	O	 		O	 		O	 	O
 protected	 	O	 		O	 		O	 
 default (생략)	O	 		O	 	 
 private 	 	O

 	 	 	 
 	 	 	 
 	 	 	 
 * */


class MMM {
	public String a = "p1m.a";
}



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
/* 
protected class
private class  정의 불가

protected class FFF{
	
}

private class GGG{
	
}
*/


//같은패키지 클래스를 상속받은 자식클래스
//클래스 정의부에서 private 접근불가
class CCCChild extends CCC{
	void meth_5() {
		System.out.println("p1cc.meth_5 시작---------");
		//System.out.println(a+","+b+","+c+","+d); //private 접근불가
		System.out.println(a+","+b+","+c);
		meth_1();
		meth_2();
		meth_3();
		//meth_4(); private 접근불가
		System.out.println("p1cc.meth_5 끝---------");
	}
}

// 다른패키지 클래스를 상속받은 자식클래스
// 클래스 정의부에서 public, protected 접근가능
// default, private 접근불가
class HHHChild extends HHH{
	void meth_5() {
		System.out.println("p1hc.meth_5 시작---------");
		//System.out.println(a+","+b+","+c+","+d);
		System.out.println(a+","+b);  //a: public , b : protected
		meth_1();	//public
		meth_2();	//protected
		//meth_3();
		//meth_4();
		System.out.println("p1hc.meth_5 끝---------");
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
		//System.out.println("p1b : "+p1b.a+","+p1b.b+","+p1b.c+","+p1b.d);
		p1b.meth_1();
		p1b.meth_2();
		p1b.meth_3();
		//p1b.meth_4();
		p1b.meth_tot();
		
		CCC p1c = new CCC(); // 같은 패키지 내 다른 클래스 호출가능
		System.out.println("p1c : "+p1c.a+","+p1c.b+","+p1c.c);
		p1c.meth_1();
		p1c.meth_2();
		p1c.meth_3();
		p1c.meth_tot();
		
		HHH p2h = new HHH();
		// 다른 패키지의 클래스 멤버중 public 만 접근가능
		//System.out.println("p2h : "+p2h.a+","+p2h.b+","+p2h.c);
		System.out.println("p2h : "+p2h.a);
		p2h.meth_1();
		//p2h.meth_2();
		//p2h.meth_3();
		p2h.meth_tot();
		
		HHHChild p1hc = new HHHChild();
		System.out.println("p1hc : "+p1hc.a);
		//System.out.println("p1hc : "+p1hc.a+","+p1hc.b+","+p1hc.c);
		p1hc.meth_1();
		//p1hc.meth_2();
		//p1hc.meth_3();
		p1hc.meth_tot();
		
		JJJ p2j = new JJJ();	//pac_2		import pac_2.*;  	//4
		System.out.println("p2j : "+p2j.a);
		MMM p1m = new MMM();	//pac_1		같은 패키지			//3 
		System.out.println("p1m : "+p1m.a);
		PPP p2p = new PPP();	//pac_2		import pac_2.PPP;	//2
		System.out.println("p2p : "+p2p.a);
		pac_1.PPP p1p = new pac_1.PPP();	//pac_1	패키지 직접명시 //1
		System.out.println("p1p : "+p1p.a);

	}

}
