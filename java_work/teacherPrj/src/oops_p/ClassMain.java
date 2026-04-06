package oops_p;

//1. 클래스정의
/*
class 클래스명{  클래스는 대문자로시작
	멤버변수
	
	메소드
} 
 
 * */
class AAA{
	
	int a = 10;				//멤버변수
	String b = "아기상어";
	int [] arr = {11,22,33};
	
	// 메소드
	void meth_1() {
		System.out.println("AAA.meth_1() 실행");
	}
	
	String meth_2(int aa, String bb) {
		System.out.println("AAA.meth_2() 실행 "+aa+" , "+bb);
		return "결과값이지롱";
	}
	
	//System.out.println("실행구문"); 메소드 아닌 정의구간에서 실행구문 불가
}


public class ClassMain {

	public static void main(String[] args) {
		
		//2. 인스턴스 변수선언;
		// 클래스명 변수명;
		AAA a1;	
		
		//System.out.println(a1);
		//3. 인스턴스 생성 및 대입
		//변수 = new 클래스생성자();
		a1 = new AAA();
		System.out.println("a1 : "+a1);
		// oops_p.AAA@5305068a
		// 클래스정의@주소
		
		//4. 인스턴스멤버요소호출
		// 변수.멤버요소
		System.out.println("a1.a : "+a1.a);
		System.out.println("a1.b : "+a1.b);
		a1.meth_1();
		String rr = a1.meth_2(12, "나는무너");
		System.out.println("rr : "+rr);
		a1.a = 20;
		System.out.println("a1.a : "+a1.a);
		
		
		AAA a2 = new AAA();	//같은 클래스로 여러개의 인스턴스 생성 가능
		System.out.println("a1.a : "+a1.a);
		System.out.println("a2.a : "+a2.a);
	}

}
