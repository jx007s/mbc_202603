package oops_p;

class ConAAA{
	
	/*
	 생성자정의 : 
	 1. 리턴이 없다
	 2. 매개변수 가능
	 3. 생성자는 생성 마지막 단계에 실행
	 4. 주로 멤버 초기화에 사용
	 5. 생성자 정의시 기본생성자 필요시 반드시 정의해야 함
	 6. overloading 가능
	 7. 생성자는 인스턴스 생성시 최초 1회 호출만 가능
	 8. 생성자 위임 - 생성자호출시 다른 생성자 호출
	 클래스명(){
	 
	 } 
	 * */
	ConAAA(String a , int b){
		System.out.println("ConAAA 사용자 정의생성자 : "+a+" , "+b);
//		a = "아빠상어";
//		b = 30;
		this.a = a;
		this.b = b;
	}
	
	ConAAA(){
		System.out.println("ConAAA  기본생성자 : "+a+" , "+b);
	}
	
	ConAAA(String aa){
		//ConAAA(aa,5678);
		//System.out.println("위임생성자 이전 실행코드 불가 ");
		this(aa,1234);	//생성자 위임 - this()로 생성자 호출
					// ConAAA(String a , int b)호출
		System.out.println("ConAAA  사용자 생성자2 ");
	}
	
	
	/*   리턴이 존재하면 메소드 정의 -- 하지 말것
	void ConAAA(){
		System.out.println("메소드 ConAAA() 실행");
	}*/
	
	String a = initA();
	int b = initB();
	
	String initA() {
		System.out.println("initA() 실행");
		return "엄마상어";
	}
	
	int initB() {
		System.out.println("initB() 실행");
		return 20;
	}
	
	void ppp() {
		System.out.println("a : "+a+" , b : "+b);
	}
	
}
public class ConstructorMain {

	public static void main(String[] args) {
		ConAAA a1 = new ConAAA("나는무너",111);
		System.out.println("----------");
		ConAAA a2 = new ConAAA();
		System.out.println("----------");
		ConAAA a3 = new ConAAA("나는고래");
		System.out.println("----------");
		a1.ppp();
		a2.ppp();
		// 생성자는 인스턴스 생성시 최초 1회 호출만 가능
		//a1.ConAAA();
		//a1.new ConAAA();

	}

}
