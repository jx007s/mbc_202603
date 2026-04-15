package oops_p;

class Outer1{
	String aa = "외부aa",  bb = "외부bb";
	
	void big_1() {
		System.out.println("외부big_1() 시작----------");
		// 메소드내에서 인스턴스내부클래스변수 선언 및 생성하여 사용
		System.out.println("자신 : "+aa+","+bb);
		mm_3();
		Inner1 ins = new Inner1();
		System.out.println("ins : "+ins.ia+","+ins.bb);
		ins.ins_2();
		ins.mm_3();
		System.out.println("외부big_1() 끝----------");
	}
	void big_2() {
		System.out.println("외부big_2()");
	}
	void mm_3() {
		System.out.println("외부mm_3()");
	}
	
	static String sa = "외부 스태틱 sa",  sb = "외부 스태틱 sb";
	static void big_s1() {
		System.out.println("외부 스태틱 big_s1()");
	}
	static void big_s2() {
		System.out.println("외부 스태틱 big_s2()");
	}
	
	Outer1() {
		System.out.println("외부클래스 생성자");
	}
	
	
	//1. 인스턴스 내부 클래스 정의
	class Inner1 {
									//외부클래스 멤버와 중첩
		String ia = "인스턴스내부ia",  bb = "인스턴스내부bb";
		
		Inner1() {
			System.out.println("인스턴스내부클래스 생성자");
		}
		
		void ins_1() {
			System.out.println("인스턴스내부 ins_1() 시작-----");
											//외부멤버접근자 : 외부클래스.this
			System.out.println("외부 : "+aa+","+Outer1.this.bb);
			big_2();
			Outer1.this.mm_3();
			System.out.println("내부 자신: "+ia+","+bb);
			ins_2();
			mm_3();
			System.out.println("인스턴스내부 ins_1() 끝-----");
		}
		void ins_2() {
			System.out.println("인스턴스내부 ins_2()");
		}
		void mm_3() {
			System.out.println("인스턴스내부 mm_3()");
		}
	}
	
	//2. 정적 내부클래스 정의
	static class Inner2{
		String sa = "스태틱내부sa",  sb = "스태틱내부sb";
		
		Inner2() {
			System.out.println("스태틱내부클래스 생성자");
		}
		
		void ins_1() {
			System.out.println("스태틱 내부 ins_1() 시작-----");
			
			//외부인스턴스멤버 접근불가
			/*
			System.out.println("외부 : "+aa+","+Outer1.this.bb);
			big_2();
			Outer1.this.mm_3();
			*/
			// Outer1.this : 불가 this - 인스턴스
			System.out.println("외부 : "+sa+","+Outer1.sb);
			big_s1();
			//Outer1.this.big_s2();
			Outer1.big_s2();
			System.out.println("내부 자신: "+sa+","+sb);
			
			System.out.println("스태틱내부 ins_1() 끝-----");
		}
		void big_s2() {
			System.out.println("스태틱내부 big_s2()");
		}
	}
}

public class InnerMain {

	public static void main(String[] args) {
		Outer1 oo1 = new Outer1();
		oo1.aa = "아기상어";
		System.out.println("oo1 : "+oo1.aa+","+oo1.bb);
		oo1.big_1();
		oo1.big_2();
		
		//Outer1.Inner1 oi1 = new Outer1.Inner1();
		// 내부인스턴스클래스 생성 : 외부인스턴스를 이용하여 내부인스턴스클래스 객체생성 
		
		System.out.println("oi2>>>>>>>>>>>>");
		Outer1.Inner1 oi2 = oo1.new Inner1();
		oi2.ia = "나는무너";
		oi2.ins_1();
		
		System.out.println("oi3>>>>>>>>>>>>");
		Outer1.Inner1 oi3 = oo1.new Inner1();
		oi3.ins_1();
		

	}

}
