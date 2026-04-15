package oops_p;

//익명 클래스로 처리하기 위한 인터페이스 정의
interface AnInter{
	void mmm();
}

class Outer1{
	String aa = "외부aa",  bb = "외부bb";
	
	void big_1() {
		System.out.println("외부big_1() 시작----------");
		// 메소드내에서 인스턴스내부클래스변수 선언 및 생성하여 사용
		System.out.println("자신 : "+aa+","+bb);
		System.out.println("자신 : "+sa+","+sb);
		mm_3();
		big_s1();
		big_s2();
		Inner1 ins = new Inner1();
		System.out.println("ins : "+ins.ia+","+ins.bb);
		ins.ins_2();
		ins.mm_3();
		
		Inner2 in2 = new Inner2();
		System.out.println("in2 : "+in2.isa+","+in2.sb);
		in2.big_s2();
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
	
	void big_4() {
		System.out.println("외부big_4() 시작----------");
		
		//3. 지역 내부클래스(메소드 내부에서 정의)
		//   메소드 내부에서만 생성 및 선언 , 사용가능
		class Inner3{
			String la = "지역내부la",  bb = "인스턴스내부bb";
			
			Inner3() {
				System.out.println("지역내부클래스 생성자");
			}
			
			void lns_1() {
				System.out.println("지역내부 lns_1() 시작-----");
												//외부멤버접근자 : 외부클래스.this
				System.out.println("외부 : "+aa+","+Outer1.this.bb);
				big_2();
				Outer1.this.mm_3();
				System.out.println("지역내부 자신: "+la+","+bb);
				lns_2();
				mm_3();
				System.out.println("지역내부 lns_1() 끝-----");
			}
			void lns_2() {
				System.out.println("지역내부 ins_2()");
			}
			void mm_3() {
				System.out.println("지역내부 mm_3()");
			}
		}
		
		System.out.println("외부 : "+aa+","+bb);
		big_2();
		
		System.out.println("oi2>>>>>>>>>>>>");
		Inner3 l3 = new Inner3();
		//System.out.println("l3 : "+l3.aa);
		System.out.println("l3 : "+l3.la+","+l3.bb);
		l3.lns_1();
		//l3.big_2();
		
		
		
		System.out.println("외부big_4() 끝----------");
	}
	
	
	void big_5(AnInter ait) {//인터페이스가 매개변수
		System.out.println("외부big_5() 시작----------");
		ait.mmm();  // 익명클래스에서 정의된 메소드 호출
		System.out.println("외부big_5() 끝----------");
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
		String isa = "스태틱내부isa",  sb = "스태틱내부sb";
		
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
			System.out.println("내부 자신: "+isa+","+sb);
			
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
		//System.out.println("oo1 : "+oo1.ia);  외부인스턴스변수로 내부멤버요소 접근불가
		oo1.big_1();
		oo1.big_2();
		//oo1.ins_1();
		
		//Outer1.Inner1 oi1 = new Outer1.Inner1();
		// 내부인스턴스클래스 생성 : 외부인스턴스를 이용하여 내부인스턴스클래스 객체생성 
		
		System.out.println("oi2>>>>>>>>>>>>");
		Outer1.Inner1 oi2 = oo1.new Inner1();
		oi2.ia = "나는무너";
		System.out.println("oi2 : "+oi2.ia+","+oi2.bb);
		//System.out.println("oi2 : "+oi2.aa);  내부인스턴스변수로 외부요소 접근 불가
		oi2.ins_1();
		//oi2.big_2();
		
		System.out.println("oi3>>>>>>>>>>>>");
		Outer1.Inner1 oi3 = oo1.new Inner1();
		oi3.ins_1();
		
		System.out.println("os1>>>>>>>>>>>>");
		// oo1.new Inner2();  에러
		Outer1.Inner2 os1 = new Outer1.Inner2();
		//외부 접근 불가
		//System.out.println("os1 : "+os1.aa);
		//System.out.println("os1 : "+os1.sa);
		//os1.big_2();
		//os1.big_s1();
		System.out.println("os1 : "+os1.isa+","+os1.sb);
		os1.big_s2();
		os1.ins_1();
		
		oo1.big_4();
		
		//Outer1.Inner3 oi3;
		
		oo1.big_5(
			//4. 익명 내부 클래스 - 생성시 멤버요소 정의
				// 인터페이스, 추상클래스를 매개변수로 처리하는 메소드 호출시 사용
				// 재사용 금지
				// 람다식에서 주로 사용
			new AnInter() {
			
				@Override
				public void mmm() {
					System.out.println("익명내부클래스생성시정의.mmm() 실행");
					
				}
			}
		);

	}

}
