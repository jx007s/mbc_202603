package extends_p;


//인터페이스 정의
// interface 인터페이스명{}
interface InA{
	String A = "InA.A", B = "InA.B";  // final static public
	
	//void meth_1() {}  메소드정의 불가
	void meth_2();	//public abstract
	void meth_3();
}

interface InB{
	String C = "InB.C", B = "InB.B"; 
	
	void meth_2();
	void meth_4();
}

//interface InToT implements InA, InB{
interface InToT extends InA, InB{  // 인터페이스 다중 상속 가능

	
}

//class InImp extends InA{ 상속 아님

// class 클래스명 implements 인터페이스명{} 인터페이스 구현 클래스
// 인터페이스 메소드 재정의 필수
// 인터페이스 다중 구현 가능
// 다중상속 받은 인터페이스 구현 가능
//class InImp implements InA, InB{
class InImp implements InToT{
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
		
		
		InToT tot = new InToT() {

			@Override
			public void meth_2() {
				System.out.println("tot 생성시 재정의 meth_2()");
			}

			@Override
			public void meth_3() {
				System.out.println("tot 생성시 재정의 meth_3()");
			}

			@Override
			public void meth_4() {
				System.out.println("tot 생성시 재정의 meth_4()");
			}
			
		};
		
		// tot.B ::> InA.B 와 InB.B 가 중첩되어 충돌 발생
		//System.out.println("tot : "+tot.A+","+tot.B+","+tot.C);
		System.out.println("tot : "+tot.A+","+tot.C);
		//System.out.println("InToT : "+InToT.A+","+InToT.B+","+InToT.C);
		System.out.println("InToT : "+InToT.A+","+InToT.C);
		tot.meth_2();
		tot.meth_3();
		tot.meth_4();
		
		InA atot = tot;		// 다형성
		//System.out.println("atot : "+atot.A+","+atot.B+","+atot.C);
		System.out.println("atot : "+atot.A+","+atot.B);
		atot.meth_2();
		atot.meth_3();
		//atot.meth_4();
		
		InB btot = tot;		// 다형성
		//System.out.println("btot : "+btot.A+","+btot.B+","+btot.C);
		System.out.println("btot : "+btot.B+","+btot.C);
		btot.meth_2();
		//btot.meth_3();
		btot.meth_4();
		
		// 클래스로 인스턴스 생성
		InImp iip = new InImp();
		//System.out.println("iip : "+iip.A+","+iip.B+","+iip.C);
		System.out.println("iip : "+iip.A+","+iip.C);
		iip.meth_2();
		iip.meth_3();
		iip.meth_4();
		
		atot = iip;		// 다형성
		System.out.println("atot : "+atot.A+","+atot.B);
		atot.meth_2();
		atot.meth_3();

		btot = iip;			// 다형성
		System.out.println("btot : "+btot.B+","+btot.C);
		btot.meth_2();
		btot.meth_4();
	}

}
