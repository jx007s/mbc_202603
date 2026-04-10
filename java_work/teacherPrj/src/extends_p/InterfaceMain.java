package extends_p;


//인터페이스 정의
// interface 인터페이스명{}
interface InA{
	String A = "InA.A", B = "InA.B";  // final static
	
	//void meth_1() {}  메소드정의 불가
	void meth_2();	//public abstract
	void meth_3();
}

interface InB{
	String C = "InB.C", B = "InB.B"; 
	
	void meth_2();
	void meth_4();
}

//class InImp extends InA{ 상속 아님

// class 클래스명 implements 인터페이스명{} 인터페이스 구현 클래스
// 인터페이스 메소드 재정의 필수
// 인터페이스 다중 구현 가능
class InImp implements InA, InB{
	public void meth_2() {
		System.out.println("InImp.meth_2()");
	}
	public void meth_3() {
		System.out.println("InImp.meth_3()");
	}
	public void meth_4() {
		System.out.println("InImp.meth_4()");
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
		
		System.out.println("InA : "+InA.A+","+InA.B); //static
		//interface 생성시 모든 메소드 재정의 필수
		InA aa = new InA() {
			@Override
			public void meth_2() {
				System.out.println("생성시 재정의 meth_2()");
			}
			public void meth_3() {
				System.out.println("생성시 재정의 meth_3()");
			}
		};

		System.out.println("aa : "+aa.A+","+aa.B);
		//aa.A = "아기상어";  final
		//InA.B="엄마상어";
		aa.meth_2();
		aa.meth_3();
	}

}
